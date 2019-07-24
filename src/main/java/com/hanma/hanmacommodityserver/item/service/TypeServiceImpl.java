package com.hanma.hanmacommodityserver.item.service;

import com.hanma.hanmacommodityserver.item.domain.Type;
import com.hanma.hanmacommodityserver.item.mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> queryType() {
        return typeMapper.queryType();
    }

    @Override
    public void insertleimu(Type type) {
        if(type.getTypeId()!=null){
            Date date = new Date();
            type.setTypeUpdateTime(date);
            typeMapper.updateByPrimaryKeySelective(type);
        }else {
            Date date = new Date();
            type.setTypeCreateTime(date);
            type.setTypeUpdateTime(date);
            typeMapper.insertSelective(type);
        }
    }

    @Override
    public Type xiugaileimu(Long id) {
        return typeMapper.xiugaileimu(id);
    }

    @Override
    public void shanchuleimu(Long id) {
        typeMapper.shanchuleimu(id);
    }

    @Override
    public List<Type> queryTypeById(Long id) {
        List<Type> list=typeMapper.queryTypeById(id);
        return list;
    }
}
