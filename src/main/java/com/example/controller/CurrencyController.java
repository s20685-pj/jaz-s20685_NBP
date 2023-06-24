package com.example.controller;


import com.example.Service.CurrencyService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
        private final CurrencyService currencyService;

        public CurrencyController(CurrencyService currencyService) {
                this.currencyService = currencyService;
        }

};




