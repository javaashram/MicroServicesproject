package com.sks.java.ashram.currencyconversionservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.sks.java.ashram.currencyconversionservice.bean.CurrencyConversionBean;

/*@FeignClient(name="exchange-service", url = "localhost:8001")*/

//@FeignClient(name="exchange-service")
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="exchange-service")

public interface CurrencyExchangeServiceProxy {

	
	@GetMapping("/exchange-service/currency-service/from/{from}/to/{to}")
	public CurrencyConversionBean getCurrencyExcgangeRate
	(@PathVariable String from, @PathVariable String to);
	
}
