package com.example.Service;


import com.example.Model.Currency;
import com.example.Model.Root;
import com.example.Repository.CurrencyRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyService {
        private static final String NBP_API = "http://api.nbp.pl/api/exchangerates/rates/{table}/{code}/{startDate}/{endDate}/?format=json";

        public RestTemplate restTemplate;
        public CurrencyRepository currencyRepository;

        public CurrencyService(RestTemplate restTemplate,CurrencyRepository currencyRepository){
            this.restTemplate = restTemplate;
            this.currencyRepository = currencyRepository;
        }

        public Root getCurrency(String currency, String start_Date, String end_Date){
            return restTemplate.getForObject("https://api.nbp.pl/api/exchangerates/rates/a/{currency}/{startDate}/{endDate}/?format=json", Root.class, currency, start_Date, end_Date);
        }

        public void addCurrency(Currency currency){
            currencyRepository.save(currency);
        }
}
