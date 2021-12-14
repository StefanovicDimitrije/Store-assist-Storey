package ris;

public class Admin extends User {
    
    public Admin(){
        
    }

    public Admin(String username, String mail, String phone, String password) {
        super(username,mail,phone,password);
    }

    @Override
    public String toString() {
        return "Admin '" + super.getUsername() + "' is logged in ";
    }
}
