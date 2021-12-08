package ris;

public abstract class User {
    private String username;
    private String mail;
    private String phone;
    private String password;
    private boolean logged;
    
    public User(){
        
    }

    public User(String username, String mail, String phone, String password) {
        this.username = username;
        this.mail = mail;
        this.phone = phone;
        this.password = password;
        this.logged = true;
    }
    
    public User(boolean logged){
        this.logged = logged;
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
    
    public void logOut(){
        this.logged = false;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", mail=" + mail + ", phone=" + phone + ", password=" + password + ", logged=" + logged + '}';
    }
    
    public void logIn(String username, String mail, String phone, String password){
        this.username = username;
        this.mail = mail;
        this.phone = phone;
        this.password = password;
        this.logged = true;
    }
}