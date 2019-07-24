package com.hanma.hanmacommodityserver.item.mapper;

import com.hanma.hanmacommodityserver.item.domain.Type;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TypeMapper {
    int deleteByPrimaryKey(Long typeId);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Long typeId);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    List<Type> queryType();

    Type xiugaileimu(Long id);

    void shanchuleimu(Long id);

    List<Type> queryTypeById(Long id);
}