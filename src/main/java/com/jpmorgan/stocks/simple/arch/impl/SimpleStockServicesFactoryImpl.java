package com.jpmorgan.stocks.simple.arch.impl;

import com.jpmorgan.stocks.simple.arch.SimpleStockServicesFactory;
import com.jpmorgan.stocks.simple.arch.SpringService;
import com.jpmorgan.stocks.simple.services.SimpleStockService;


public class SimpleStockServicesFactoryImpl implements SimpleStockServicesFactory {

	
	private SimpleStockServicesFactoryImpl(){
		/**
		 * 1. Load the spring context for the engine
		 */
		SpringService.INSTANCE.getClass();
	}

	/**
	 * Holder class for the singleton factory instance. {@link SimpleStockServicesFactoryHolder} is 
	 * loaded on the first execution of {@link SimpleStockServicesFactoryImpl#getInstance()} or the first 
	 * access to {@link SimpleStockServicesFactoryHolder#INSTANCE}, not before.
	 * 
	 * 
	 */
	private static class SimpleStockServicesFactoryHolder{
		private static final SimpleStockServicesFactory INSTANCE = new SimpleStockServicesFactoryImpl();
	}

	/**
	 * Gets the singleton instance of the factory of the services in the Super Simple Stock application. 
	 * 
	 * @return An object of the SimpleStockServicesFactory, which represents the factory to access to all 
	 * services in the Super Simple Stock application. 
	 */
	public static SimpleStockServicesFactory getInstance(){
		return SimpleStockServicesFactoryHolder.INSTANCE;
	}


	/*
	 * (non-Javadoc)
	 * @see com.jpmorgan.stocks.simple.arch.SimpleStockServicesFactory#getSimpleStockService()
	 */
	public SimpleStockService getSimpleStockService(){
		return SpringService.INSTANCE.getBean("simpleStocksService", SimpleStockService.class);
	}


}
