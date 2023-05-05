package com.devprobelms.controller;

import com.devprobelms.entity.Customer;
import com.devprobelms.repository.CustomerRepository;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
public class MsOneController {

    private final RestTemplate restTemplate;
    private final CustomerRepository customerRepository;

    public MsOneController(RestTemplate restTemplate, CustomerRepository customerRepository) {
        this.restTemplate = restTemplate;
        this.customerRepository = customerRepository;
    }

    @PostMapping("/customer")
    public ResponseEntity<Customer> post(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerRepository.save(customer));
    }

    @GetMapping("/getCustomer")
    public String getCustomer(@RequestParam Integer id) {
        return customerRepository.findById(id).toString();
    }

    @GetMapping("/sayHello")
    public String sayhello() {
        return "Hello";
    }

    @GetMapping("/helloFromMS2")
    public ResponseEntity<String> sayHello() {
        return restTemplate.getForEntity("http://ms-two:8081/", String.class);
    }

}
