package co.uk.endava.model;

import javax.persistence.*;


/**
 * Created by nilies on 7/14/2016.
 */
@Entity
@Table(name = "usr")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private String id;

    @Column(name = "username", length = 50, nullable = false)
    private String username;

    @Column(name = "password", length = 50, nullable = false)
    private String password;

    @Column(name = "age", length = 3)
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

    public String getId() { return this.id; }

    public void setId(String id){ this.id = id; }

}
