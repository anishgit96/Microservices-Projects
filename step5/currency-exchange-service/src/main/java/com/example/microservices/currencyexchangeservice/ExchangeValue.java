package com.example.microservices.currencyexchangeservice;

import java.math.BigDecimal;

public class ExchangeValue {
	
	private Long id;
	private String from;
	private String to;
	
	private int port;

	private BigDecimal conversionMultiple;
	
	public ExchangeValue() {
		
	}
	 
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}
	
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
