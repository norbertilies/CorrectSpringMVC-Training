package co.uk.endava.model;

/**
 * Created by nilies on 7/14/2016.
 */
public class UserValidation {
    private User u;
    public UserValidation(User u){
        this.u=u;
    }

    public boolean validate(){
        if (u.getUsername().length()<3)
            return false;
        if (u.getUsername().contains(" "))
            return false;
        if (u.getAge()<12)
            return false;
        if (u.getPassword().length()<6)
            return false;
        return true;
    }
}
