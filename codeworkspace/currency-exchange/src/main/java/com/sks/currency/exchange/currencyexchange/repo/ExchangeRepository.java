package com.sks.currency.exchange.currencyexchange.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sks.currency.exchange.currencyexchange.entity.CurrencyExchangeRate;

public interface ExchangeRepository extends JpaRepository<CurrencyExchangeRate, Long>{
	
	//Query method
	CurrencyExchangeRate findByFromAndTo(String from, String to);

}
