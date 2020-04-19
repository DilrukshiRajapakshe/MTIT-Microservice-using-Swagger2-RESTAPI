package com.mtit.assignment.stockservice.controller.impl;
import com.mtit.assignment.stockservice.Service.impl.StockServiceImpl;
import com.mtit.assignment.stockservice.Service.impl.massageImpl;
import com.mtit.assignment.stockservice.controller.stockController;
import com.mtit.assignment.stockservice.entity.ReturnValue;
import com.mtit.assignment.stockservice.entity.Stock;
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
@RequestMapping("api/v1/stock")
public class StockControllerImpl implements stockController {

    @Autowired
    private StockServiceImpl sellerService;


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
    public Stock Create(@RequestBody Stock stock) {
        sellerService.create(stock);
        return stock;
    }

    @Override
    @PutMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<ReturnValue> update(@PathVariable("id") String id, @RequestBody Stock stock) {
        System.out.println(id);
        massageImpl ms = new massageImpl();
        List returnList = new ArrayList();
        List list = new ArrayList();
        if(stock.getId().equals(id)){
            sellerService.update(stock);
            list.add(stock);
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
