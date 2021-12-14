
package ris;

public class Registered_user extends User {
    
    public Registered_user(){
        
    }

    public Registered_user(String username, String mail, String phone, String password) {
        super(username,mail,phone,password);
    }

    @Override
    public String toString() {
        return "User '" + super.getUsername() + "' is logged in with the email " + super.getMail() + " and phone " + super.getPhone();
    }
    
}
