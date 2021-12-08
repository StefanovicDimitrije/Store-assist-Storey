package ris;

import java.util.ArrayList;

public class Favorites {
    
    private ArrayList<Item> items;
    private int userId;

    public Favorites() {
        items = new ArrayList<Item>();
    }

    public Favorites(int userId) {
        items = new ArrayList<Item>();
        this.userId = userId;
    }
    
    public void addItem(Item item){
        this.items.add(item);
    }
    
    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Favorites{" + "items=" + items + ", userId=" + userId + '}';
    }
    
}
