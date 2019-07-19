package com.hanma.hanmacommodityserver.item.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Item {
    private Long itemId;

    private Long typeId;

    private Double itemPrice;

    private String itemName;

    private Integer itemCountnum;

    private Double itemMoneyoff;

    private String itemImg;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date itemCreateTime;

    private String createDateTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date itemUpdateTime;

    private String updateDateTime;

    private Integer itemYn;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getItemCountnum() {
        return itemCountnum;
    }

    public void setItemCountnum(Integer itemCountnum) {
        this.itemCountnum = itemCountnum;
    }

    public Double getItemMoneyoff() {
        return itemMoneyoff;
    }

    public void setItemMoneyoff(Double itemMoneyoff) {
        this.itemMoneyoff = itemMoneyoff;
    }

    public String getItemImg() {
        return itemImg;
    }

    public void setItemImg(String itemImg) {
        this.itemImg = itemImg == null ? null : itemImg.trim();
    }

    public Date getItemCreateTime() {
        return itemCreateTime;
    }

    public void setItemCreateTime(Date itemCreateTime) {
        this.itemCreateTime = itemCreateTime;
    }

    public Date getItemUpdateTime() {
        return itemUpdateTime;
    }

    public void setItemUpdateTime(Date itemUpdateTime) {
        this.itemUpdateTime = itemUpdateTime;
    }

    public Integer getItemYn() {
        return itemYn;
    }

    public void setItemYn(Integer itemYn) {
        this.itemYn = itemYn;
    }

    public String getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
    }
}