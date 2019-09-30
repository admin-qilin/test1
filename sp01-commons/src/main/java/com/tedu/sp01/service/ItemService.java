package com.tedu.sp01.service;

import java.util.List;
import com.tedu.sp01.pojo.Item;

public interface ItemService {

	/**
	 * 获取指定订单中的商品
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	/**
	 * 减少商品的库存
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);
}
