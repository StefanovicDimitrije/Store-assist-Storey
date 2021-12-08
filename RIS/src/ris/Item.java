package ris;

public class Item {

    private int id;
    private String name;
    private int price;
    private String desc;
    private boolean availiable;

    public Item() {
    
    }
    
    public Item(int id, String name, int price, String desc, boolean availiable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.availiable = availiable;
    }

    public Item(String name, int price, String desc, boolean availiable) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.availiable = availiable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isAvailiable() {
        return availiable;
    }

    public void setAvailiable(boolean availiable) {
        this.availiable = availiable;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Item{" + "id= " + id + ", name= " + name + ", price= " + price + ", desc= " + desc + ", availiable= " + availiable + '}';
    }
    
}
