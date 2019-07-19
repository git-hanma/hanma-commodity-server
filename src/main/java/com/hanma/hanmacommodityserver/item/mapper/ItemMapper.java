package com.hanma.hanmacommodityserver.item.mapper;


import com.hanma.hanmacommodityserver.item.domain.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

    List<Item> queryItem(Long id);

    List<Item> queryAllItem();

    void deleteItem(Long id);
}