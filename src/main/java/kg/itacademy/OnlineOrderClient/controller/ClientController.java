package kg.itacademy.OnlineOrderClient.controller;

import kg.itacademy.OnlineOrderClient.model.ClientModel;
import kg.itacademy.OnlineOrderClient.model.OrderModel;
import kg.itacademy.OnlineOrderClient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ClientController {

//    @Autowired
//    private ClientService clientService;
//
//    @PostMapping
//    public ResponseEntity<?> createOrder(@RequestBody ClientModel clientModel){
//
//        return ResponseEntity
//                .status(HttpStatus.CREATED)
//                .body(clientService.createOrder(OrderModel.builder().build()));
//    }
}
