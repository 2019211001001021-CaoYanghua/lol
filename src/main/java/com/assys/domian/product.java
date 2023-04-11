package com.assys.domian;

import java.sql.Date;

public class product {
    private int id;
    private int user_id;//名称
    private double price;//单价
    private String introduction;//描述
    private int img;//图片
    private int stocks;//库存
    private int sales;//已出售数量
    private Date create_time;//创造时间
    private int status;//状态
    private int del;//删除标志

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", price=" + price +
                ", introduction='" + introduction + '\'' +
                ", img=" + img +
                ", stocks=" + stocks +
                ", sales=" + sales +
                ", create_time=" + create_time +
                ", status=" + status +
                ", del=" + del +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }
}
