package com.hanma.hanmacommodityserver.item.service;


import com.hanma.hanmacommodityserver.item.domain.Type;

import java.util.List;

public interface TypeService {
    List<Type> queryType();

    void insertleimu(Type type);

    Type xiugaileimu(Long id);

    void shanchuleimu(Long id);
}
