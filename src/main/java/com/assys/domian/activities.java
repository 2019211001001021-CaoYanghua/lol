package com.assys.domian;

import java.sql.Date;

public class activities {
    private int id;
    private String name;//活动名称
    Date app_time;//申请时间
    Date start_time;//开始时间
    Date end_time;//结束时间
    int people_number;
    int farmer_id;
    String address;
    String description;
    int admin_id;
    int status;//状态

    @Override
    public String toString() {
        return "activities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", app_time=" + app_time +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", people_number=" + people_number +
                ", farmer_id=" + farmer_id +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", admin_id=" + admin_id +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getApp_time() {
        return app_time;
    }

    public void setApp_time(Date app_time) {
        this.app_time = app_time;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public int getPeople_number() {
        return people_number;
    }

    public void setPeople_number(int people_number) {
        this.people_number = people_number;
    }

    public int getFarmer_id() {
        return farmer_id;
    }

    public void setFarmer_id(int farmer_id) {
        this.farmer_id = farmer_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
