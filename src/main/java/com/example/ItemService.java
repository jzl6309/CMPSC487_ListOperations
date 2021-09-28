package com.example;

import java.util.ArrayList;
import java.util.List;

public class ItemService {

    private static ItemService instance;
    private static ArrayList<Item> items;
    private static int itemCnt = 1;

    public ItemService(){
        items = new ArrayList<>();
        items.add(new Item(itemCnt++,"ZCat","Cool Pets"));
        items.add(new Item(itemCnt++,"Dog","Dumb Pets"));
        items.add(new Item(itemCnt++,"BFish","Wet Pets"));
    }

    public static synchronized ItemService getInstance(){
        if (instance == null){
            instance = new ItemService();
        }
        return instance;
    }

    public List getItemList() {
        return items;
    }
    public void addItem(String name,String desc){
        items.add(new Item(itemCnt++,name,desc));
    }
    public void removeItem(int ID){
        int i = 0;
        while (i< items.size() && items.get(i).getID() != ID){
            i++;
        }
        if (items.get(i).getID() == ID) items.remove(items.get(i));
    }
}
