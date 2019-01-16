package com.lq.s1.jdbc1;

public class User {

    private String username;
    private String password;
    private String pub_topic;
    private String sub_topic;

    public User() {
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

    public String getPub_topic() {
        return pub_topic;
    }

    public void setPub_topic(String pub_topic) {
        this.pub_topic = pub_topic;
    }

    public String getSub_topic() {
        return sub_topic;
    }

    public void setSub_topic(String sub_topic) {
        this.sub_topic = sub_topic;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", pub_topic='" + pub_topic + '\'' +
                ", sub_topic='" + sub_topic + '\'' +
                '}';
    }
}
