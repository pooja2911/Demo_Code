package com.jpmorgan.stocks.simple.arch;

import com.jpmorgan.stocks.simple.arch.impl.SpringServiceImpl;


public interface SpringService {
	
	public SpringService INSTANCE = SpringServiceImpl.getInstance();	

	
	public <T extends Object> T getBean(String beanName, Class<T> objectClass);

	/**
	 * Gets an object of the bean configured in the Spring context for the class <i>objectClass</i>.
	 * 
	 * @param objectClass The class of the bean configured in the Spring context.
	 * 
	 * @return Return an object corresponding to the bean configured in the Spring context represented for the class <i>objectClass</i>.
	 */
	public <T extends Object> T getBean(Class<T> objectClass);

}
