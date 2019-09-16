package com.itdai.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * @Auther: com.itdai
 * @Date: 2019/9/16
 * @Description: com.itdai.entity
 * @Version: 1.0
 */
@Entity
@DynamicUpdate  //自动更新
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        this.password = password;
    }







}
