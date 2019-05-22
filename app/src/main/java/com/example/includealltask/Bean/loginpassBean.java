package com.example.includealltask.Bean;

public class loginpassBean {
    private String loginId;
    private String password;

    public loginpassBean() {
    }

    public loginpassBean(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginId() {
        return loginId;
    }

}
