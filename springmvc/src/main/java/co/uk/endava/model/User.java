package co.uk.endava.model;

/**
 * Created by nilies on 7/14/2016.
 */
public class User {
    private String username;
    private String password;
    private Integer age;

    public User(){
        username = "No name";
        password = "";
        age = -1;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String username, String password, int age){
        this.username=username;
        this.password=password;
        this.age=age;
    }

}
