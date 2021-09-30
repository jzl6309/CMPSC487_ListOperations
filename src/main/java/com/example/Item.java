package com.example;

import java.awt.*;

public class Item{

    private int itemID;
    private String itemName;
    private String itemDesc;
    private Image img;

    public Item(int id, String name, String desc) {
        itemID = id;
        itemName = name;
        itemDesc = desc;
    }

    public Item(int id, String name, String desc, Image image) {
        itemID = id;
        itemName = name;
        itemDesc = desc;
        img = image;
    }

    public int getID(){
        return itemID;
    }

    public String getName(){
        return itemName;
    }

    public String getDesc(){
        return itemDesc;
    }

    public String toString(){
        return (getID() + " " + getName() + " " +
                getDesc());
    }

    public void setItemName(String name){ itemName = name; }
    public void setItemDesc(String desc){ itemDesc = desc; }

}
