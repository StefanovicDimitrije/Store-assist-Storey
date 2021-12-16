package ris;

import java.util.*;

public abstract class User {
    private int id;
    private String username;
    private String mail;
    private String phone;
    private String password;
    private boolean logged;
    private ArrayList<ShoppingList> lists; // I am not sure if this is needed in the program
            // You could of course work with only SQL statements but I am not sure if that is optimal for future implementation
    
    public User(){
        this.lists = new ArrayList<ShoppingList>();
    }

    public User(String username, String mail, String phone, String password) {
        this.username = username;
        this.mail = mail;
        this.phone = phone;
        this.password = password;
        this.logged = true;
        this.lists = new ArrayList<ShoppingList>(); 
    }

    public User(int id, String username, String mail, String phone, String password) {
        this.id = id;
        this.username = username;
        this.mail = mail;
        this.phone = phone;
        this.password = password;
        this.lists = new ArrayList<ShoppingList>();
    }
    
    public User(int id,boolean logged){
        this.id = id;
        this.logged = logged;
        this.lists = new ArrayList<ShoppingList>();
    }

    public String getUsername() {
        return username;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void logOut(){
        this.logged = false;
    }

    public ArrayList<ShoppingList> getLists() {
        return lists;
    }

    public void setLists(ArrayList<ShoppingList> lists) {
        this.lists = lists;
    }
    
    public ArrayList<Item> getList(int index) {
        return lists.get(index).getItems();
    }
    
    @Override
    public String toString() {
        return "User{" + "username=" + username + ", mail=" + mail + ", phone=" + phone + ", password=" + password + ", logged=" + logged + '}';
    }
    
    public void addItemtoList(int index,Item item){
        this.lists.get(index).addItem(item);
    }
    
    public void removeItemfromList(int index,Item item){
        this.lists.get(index).removeItem(item);
    }
    
    public void logIn(int id,String username, String mail, String phone, String password){
        this.id = id;
        this.username = username;
        this.mail = mail;
        this.phone = phone;
        this.password = password;
        this.logged = true;
    }
}
