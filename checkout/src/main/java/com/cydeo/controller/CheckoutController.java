package com.cydeo.controller;


import com.cydeo.dto.CheckoutDTO;
import com.cydeo.service.ProducerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {
    private final ProducerService producerService;

    public CheckoutController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public String checkout(@RequestBody CheckoutDTO checkoutDTO) throws JsonProcessingException {
        producerService.sendMessage(checkoutDTO);
        return "message sent";
    }
}