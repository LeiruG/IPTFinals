package com.example.demo.entity;

import javax.persistence.*;

/**
 * Created by Lucem on 27/05/2018.
 */

@Entity
@Table(name = "shop")
public class Shop {

    //PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemid")
    private int itemid;

    @Column(name = "itemname")
    private String itemname;

    @Column(name = "itemprice")
    private int itemprice;

    public Shop(){}

    public Shop(int itemid, String itemname, int itemprice) {
        this.itemid = itemid;
        this.itemname = itemname;
        this.itemprice = itemprice;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getItemprice() {
        return itemprice;
    }

    public void setItemprice(int itemprice) {
        this.itemprice = itemprice;
    }
}
