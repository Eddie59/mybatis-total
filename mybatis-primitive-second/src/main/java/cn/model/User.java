package cn.model;

import java.util.Date;

/**
 * User class
 *
 * @author Administrator
 * @date
 */
public class User {
    private int id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }

    public String getUsername() {
        return username;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
