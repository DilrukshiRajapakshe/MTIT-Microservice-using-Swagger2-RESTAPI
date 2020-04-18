package com.mtit.assignment.paymentservice.controller.impl;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.mtit.assignment.paymentservice.entity.*;
import com.mtit.assignment.paymentservice.Service.impl.PaymentServiceImpl;
import com.mtit.assignment.paymentservice.Service.impl.massageImpl;
import com.mtit.assignment.paymentservice.controller.paymentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("api/v1/payment")
public class PaymentControllerImpl implements paymentController {

    @Autowired
    private PaymentServiceImpl sellerService;

    @Autowired
    RestTemplate restTemplate;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    @Override
    public List<CreateReturnValue> Create(@RequestBody ConnectionEntity conE) throws MismatchedInputException {

        massageImpl ms = new massageImpl();
        List returnList = new ArrayList();

        ResponseEntity<Stock> t = restTemplate.postForEntity("http://localhost:8000/stockService/api/v1/stock", new Stock(conE.getStockId(),conE.getPrice(),conE.getAvailable()), Stock.class );
        ResponseEntity<Buyer> s = restTemplate.postForEntity("http://localhost:8000/buyerService/api/v1/buyer",  new Buyer(conE.getBuyerId(),conE.getBuyerName(),conE.getBuyerPhone()), Buyer.class );
        ResponseEntity<Seller> b = restTemplate.postForEntity("http://localhost:8000/sellerService/api/v1/seller", new Seller(conE.getSellerId(),conE.getSellerName(),conE.getSellerPhone()), Seller.class );

        Payment payment = new Payment(conE.getId(),s.getBody().getId(),
                b.getBody().getId(),t.getBody().getId(),t.getBody().getPrice(),t.getBody().getAvailable() );
        sellerService.create(payment);

        returnList.add(new CreateReturnValue(UUID.randomUUID().toString(),ms.successfulGeneratedMessage("Create"),payment,conE));

        return returnList;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<ReturnValue>> findAll() {
        massageImpl ms = new massageImpl();
        List list = sellerService.findAll();
        System.out.println(list.size());
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-Count",list.size() + "");
        List returnList = new ArrayList();
        returnList.add(new ReturnValue(UUID.randomUUID().toString(),ms.successfulGeneratedMessage("FindAll"),list));
        return new ResponseEntity<List<ReturnValue>>(returnList, httpHeaders, HttpStatus.OK);
    }


    @Override
    @PutMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<ReturnValue> update(@PathVariable("id") String id, @RequestBody Payment payment) {
        System.out.println(id);
        massageImpl ms = new massageImpl();
        List returnList = new ArrayList();
        List list = new ArrayList();
        if(payment.getId().equals(id)){
            sellerService.update(payment);
            list.add(payment);
            returnList.add(new ReturnValue(UUID.randomUUID().toString(),ms.successfulGeneratedMessage("Update"),list));
        }else{
            returnList.add(new ReturnValue(UUID.randomUUID().toString(),ms.successfulGeneratedMessage("Error")));
        }
        return returnList;
    }

    @Override
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<ReturnValue> delete(@PathVariable("id") String id) {
        System.out.println(id);
        massageImpl ms = new massageImpl();
        sellerService.delete(id);
        List returnList = new ArrayList();
        returnList.add(new ReturnValue(UUID.randomUUID().toString(),ms.successfulGeneratedMessage("Delete")));
        return returnList;
    }

    @Override
    @GetMapping("/{id}")
    public List<ReturnValue> find(@PathVariable("id") String id) {
        massageImpl ms = new massageImpl();
        System.out.println(id);
        List list = sellerService.find(id);
        List returnList = new ArrayList();
        returnList.add(new ReturnValue(UUID.randomUUID().toString(),ms.successfulGeneratedMessage("Find"),list));
        return returnList;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
