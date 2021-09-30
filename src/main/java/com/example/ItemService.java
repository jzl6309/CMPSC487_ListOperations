package com.example;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ItemService {

    private static ItemService instance;
    private static ArrayList<Item> items;
    private static int itemCnt = 1;

    public ItemService(){
        /* BufferedImage image = null;
        File f = null;
         try {
             image = new BufferedImage(150, 150, BufferedImage.TYPE_INT_ARGB);
             f = new File("/home/nughufer/Downloads/myCat.jpg");
             image = ImageIO.read(f);
         }
         catch (IOException e){};
        */
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
        itemCnt--;
    }

    public List searchByID(int ID) {
        ArrayList<Item> list = new ArrayList<>();
        int i = 0;

        while (i < items.size() && items.get(i).getID() != ID){
            i++;
        }
        if (items.get(i).getID() == ID) list.add(items.get(i));

        return list;
    }

    public List searchByKeyword(String keyword) {
        ArrayList<Item> list = new ArrayList<>();
        int i = 0;

        while (i < items.size()){
            if (items.get(i).getName().compareTo(keyword) == 0) list.add(items.get(i));
            else if (items.get(i).getDesc().contains(keyword)) list.add(items.get(i));
            i++;
        }

        return list;
    }

    public List editItem(int ID, String name, String desc) {
        int i = 0;
        while (i < items.size() && items.get(i).getID() != ID) {
            i++;
        }
        if (items.get(i).getID() == ID) {
            items.get(i).setItemName(name);
            items.get(i).setItemDesc(desc);
        }
        return items;
    }
 }
