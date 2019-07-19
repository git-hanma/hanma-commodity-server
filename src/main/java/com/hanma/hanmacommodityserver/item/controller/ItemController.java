package com.hanma.hanmacommodityserver.item.controller;

import com.google.gson.Gson;
import com.hanma.hanmacommodityserver.item.domain.Item;
import com.hanma.hanmacommodityserver.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    //查询商品
    @ResponseBody
    @RequestMapping("queryItem")
    public List<Item> queryItem(Long id){
        return itemService.queryItem(id);
    }
    //查询商品（商家权限）
    @ResponseBody
    @RequestMapping("queryAllItem")
    public List<Item> queryAllItem(){
        return itemService.queryAllItem();
    }
    //新增商品（商家权限）+修改商品（商家权限）
    @ResponseBody
    @RequestMapping(value = "insertItem",method = RequestMethod.GET)
    public void insertItem(String jsonItem){
        Item item = new Gson().fromJson(jsonItem, Item.class);
        itemService.itemService(item);
    }
    @ResponseBody
    @RequestMapping(value = "updateItem",method = RequestMethod.GET)
    public Item updateItem(Long id){
        return itemService.updateItem(id);
    }
    //删除商品
    @ResponseBody
    @RequestMapping("deleteItem")
    public void deleteItem(Long id){
        itemService.deleteItem(id);
    }
}
