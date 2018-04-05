package com.jpmorgan.stocks.simple.arch;

import com.jpmorgan.stocks.simple.arch.impl.SimpleStockServicesFactoryImpl;
import com.jpmorgan.stocks.simple.services.SimpleStockService;


public interface SimpleStockServicesFactory {

	public SimpleStockServicesFactory INSTANCE = SimpleStockServicesFactoryImpl.getInstance();

	public SimpleStockService getSimpleStockService();

}
