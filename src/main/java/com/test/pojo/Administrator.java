package com.test.pojo;


import com.test.utils.Md;
import sun.security.provider.MD2;

public class Administrator {

  private int id;
  private String username;
  private String password;
  private String sex;

  public Administrator() {
  }

  public Administrator(int id, String username, String password, String sex) {
    this.id = id;
    this.username = username;
    this.password = Md.Encrypted_MD5(password);
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "Administrator{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", sex='" + sex + '\'' +
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


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = Md.Encrypted_MD5(password);
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

}
