package com.hanma.hanmacommodityserver.item.controller;

import com.google.gson.Gson;
import com.hanma.hanmacommodityserver.item.domain.Type;
import com.hanma.hanmacommodityserver.item.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    //查询类目
    @ResponseBody
    @RequestMapping(value = "queryType",method = RequestMethod.GET)
    public List<Type> queryType(){
        return typeService.queryType();
    }
    //新增类目
    @ResponseBody
    @RequestMapping("insertleimu")
    public void insertleimu(String json){
        Type type = new Gson().fromJson(json, Type.class);
        typeService.insertleimu(type);
    }
    //修改类目（通过id查询对象）
    @ResponseBody
    @RequestMapping(value = "xiugaileimu",method = RequestMethod.GET)
    public Type xiugaileimu(Long id){
        return typeService.xiugaileimu(id);
    }
    //删除类目
    @RequestMapping(value = "shanchuleimu",method = RequestMethod.GET)
    public void shanchuleimu(Long id){
        typeService.shanchuleimu(id);
    }
}
