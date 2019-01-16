package com.lq.s1.thing;

public interface BookShopService {

	/**
	 * 买书---一个人买一本书
	 * @param username
	 * @param isbn 书号
	 */
	void purchase(String username, int isbn);
	
}
