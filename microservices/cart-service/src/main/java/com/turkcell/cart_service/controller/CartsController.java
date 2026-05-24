package com.turkcell.cart_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/carts")
@RestController
public class CartsController {
  @GetMapping
    public String get() {
        System.out.println("Hello from CartsController");
        return "CartsController";
    }
}
