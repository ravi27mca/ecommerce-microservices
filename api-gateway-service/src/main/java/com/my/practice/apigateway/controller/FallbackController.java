package com.my.practice.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/products")
    public Map<String, String> productServiceFallback() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Product service is currently unavailable. Please try again later.");
        response.put("status", "503");
        return response;
    }
}