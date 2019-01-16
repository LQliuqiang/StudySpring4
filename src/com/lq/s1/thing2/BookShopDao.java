package com.lq.s1.thing2;

public interface BookShopDao {

	  int findBookPriceByIsbn(int isbn);
	
	  void updateBookStock(int isbn);
	
	  void updateUserAccount(String username, int price);
}
