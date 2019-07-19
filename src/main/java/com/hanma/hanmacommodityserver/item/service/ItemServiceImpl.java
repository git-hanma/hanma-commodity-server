package com.hanma.hanmacommodityserver.item.service;

import com.hanma.hanmacommodityserver.item.domain.Item;
import com.hanma.hanmacommodityserver.item.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> queryItem(Long id) {
        return itemMapper.queryItem(id);
    }

    @Override
    public List<Item> queryAllItem() {
        return itemMapper.queryAllItem();
    }
    //新增商品+修改商品（商家权限）
    @Override
    public void itemService(Item item) {
        if(item.getItemId()!=null){
            SimpleDateFormat format = new SimpleDateFormat();
            Date parse1 = new Date();
            item.setItemUpdateTime(parse1);
            itemMapper.updateByPrimaryKeySelective(item);
        }else {
            Date date = new Date();
            item.setItemCreateTime(date);
            item.setItemUpdateTime(date);
            itemMapper.insertSelective(item);
        }
    }

    @Override
    public Item updateItem(Long id) {
        return itemMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteItem(Long id) {
        itemMapper.deleteItem(id);
    }
}
