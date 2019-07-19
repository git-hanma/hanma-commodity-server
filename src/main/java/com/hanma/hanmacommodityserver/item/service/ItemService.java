package com.hanma.hanmacommodityserver.item.service;

import com.hanma.hanmacommodityserver.item.domain.Item;

import java.util.List;

public interface ItemService {
    List<Item> queryItem(Long id);

    List<Item> queryAllItem();

    void itemService(Item item);

    Item updateItem(Long id);

    void deleteItem(Long id);
}
