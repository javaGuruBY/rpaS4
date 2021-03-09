package by.jrr.bean;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private int loginAttemps;
    private boolean blocked;

    public User() {
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginAttemps() {
        return loginAttemps;
    }

    public void setLoginAttemps(int loginAttemps) {
        this.loginAttemps = loginAttemps;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return loginAttemps == user.loginAttemps && blocked == user.blocked && Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, loginAttemps, blocked);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", loginAttemps=" + loginAttemps +
                ", blocked=" + blocked +
                '}';
    }



}
