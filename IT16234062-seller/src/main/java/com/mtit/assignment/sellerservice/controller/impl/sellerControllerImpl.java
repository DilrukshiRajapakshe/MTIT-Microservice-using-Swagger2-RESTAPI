package com.mtit.assignment.sellerservice.controller.impl;
import com.mtit.assignment.sellerservice.Service.impl.SellerServiceImpl;
import com.mtit.assignment.sellerservice.Service.impl.massageImpl;
import com.mtit.assignment.sellerservice.controller.sellerController;
import com.mtit.assignment.sellerservice.entity.ReturnValue;
import com.mtit.assignment.sellerservice.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("api/v1/seller")
public class sellerControllerImpl implements sellerController {

    @Autowired
    private SellerServiceImpl sellerService;


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

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    @Override
    public Seller Create(@RequestBody Seller seller) {
        sellerService.create(seller);
        return seller;
    }

    @Override
    @PutMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<ReturnValue> update(@PathVariable("id") String id, @RequestBody Seller seller) {
        System.out.println(id);
        massageImpl ms = new massageImpl();
        List returnList = new ArrayList();
        List list = new ArrayList();
        if(seller.getId().equals(id)){
            sellerService.update(seller);
            list.add(seller);
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

}
