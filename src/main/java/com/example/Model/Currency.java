package com.example.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Currency {

    //ID zapytania
    @Id
    private Long id;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private String currency;
    private BigDecimal exchange_rate;
    private LocalDateTime date;
    public Long getId() {
        return id;
    }


    public Currency(){

    }

    public Currency(String currency, BigDecimal exchange_rate, LocalDateTime start_date, LocalDateTime end_date, LocalDateTime date){
        this.currency = currency;
        this.exchange_rate = exchange_rate;
        this.start_date = start_date;
        this.end_date = end_date;
        this.date = date;

    }
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDateTime start_date) {
        this.start_date = start_date;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getExchange_rate() {
        return exchange_rate;
    }

    public void setExchange_rate(BigDecimal exchange_rate) {
        this.exchange_rate = exchange_rate;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }


}
