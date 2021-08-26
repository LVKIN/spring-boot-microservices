package com.microservices.credit.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/credit")
public class CreditController {
    private final CreditService creditService;

    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }

    @GetMapping
    public List<Credit> list() throws UnknownHostException {
        System.out.println("Hostname: " + InetAddress.getLocalHost().getHostName());
        List<Credit> creditList = creditService.list();
        return creditList;
    }
}
