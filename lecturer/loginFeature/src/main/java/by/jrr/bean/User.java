package by.jrr.bean;

import java.util.Objects;

//POJO - plain old java object
public class User {
    private String logon;
    private String password;
    private int loginAttempts;
    private boolean blocked;

    public User() {
    }

    public String getLogon() {
        return logon;
    }

    public void setLogon(String logon) {
        this.logon = logon;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "User{" +
                "logon='" + logon + '\'' +
                ", password='" + password + '\'' +
                ", loginAttempts=" + loginAttempts +
                ", blocked=" + blocked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return loginAttempts == user.loginAttempts && blocked == user.blocked && Objects.equals(logon, user.logon) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logon, password, loginAttempts, blocked);
    }
}
