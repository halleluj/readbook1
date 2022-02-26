package com.test.pojo;

public class User {
    private int id;
    private String username;
    private String UID;
    private int I_like;
    private int I_focus;
    private int I_fans;
    private String sex;
    private String birthday;
    private String address;
    private String I_sign;
    private String headpicture;
    private int money;

    public User(int id, String username, String UID, int i_like, int i_focus, int i_fans, String sex, String birthday, String address, String i_sign, String headpicture, int money) {
        this.id = id;
        this.username = username;
        this.UID = UID;
        I_like = i_like;
        I_focus = i_focus;
        I_fans = i_fans;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        I_sign = i_sign;
        this.headpicture = headpicture;
        this.money = money;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", UID='" + UID + '\'' +
                ", I_like=" + I_like +
                ", I_focus=" + I_focus +
                ", I_fans=" + I_fans +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", I_sign='" + I_sign + '\'' +
                ", headpicture='" + headpicture + '\'' +
                ", money=" + money +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public int getI_like() {
        return I_like;
    }

    public void setI_like(int i_like) {
        I_like = i_like;
    }

    public int getI_focus() {
        return I_focus;
    }

    public void setI_focus(int i_focus) {
        I_focus = i_focus;
    }

    public int getI_fans() {
        return I_fans;
    }

    public void setI_fans(int i_fans) {
        I_fans = i_fans;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getI_sign() {
        return I_sign;
    }

    public void setI_sign(String i_sign) {
        I_sign = i_sign;
    }

    public String getHeadpicture() {
        return headpicture;
    }

    public void setHeadpicture(String headpicture) {
        this.headpicture = headpicture;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

