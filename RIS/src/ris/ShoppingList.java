package ris;

import java.util.*;

public class ShoppingList {
    private int id;
    private String name;
    private ArrayList<Item> items;

    public ShoppingList() {
    }

    public ShoppingList(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void addItem(Item item){
       this.items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
    
    public ArrayList<Item> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " - " + name + ", items=" + '{' + items + '}';
    }
}
