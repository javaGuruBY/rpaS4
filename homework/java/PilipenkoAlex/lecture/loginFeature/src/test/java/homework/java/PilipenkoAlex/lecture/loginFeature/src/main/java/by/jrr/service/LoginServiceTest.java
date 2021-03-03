package homework.java.PilipenkoAlex.lecture.loginFeature.src.main.java.by.jrr.service;

import homework.java.PilipenkoAlex.lecture.loginFeature.src.main.java.by.jrr.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {
    LoginService loginService;
    User user;
    String positiveUserInputPassword = "password";
    String negativeUserInputPassword = "wrong";
    @Before
    public void setUp(){
        this.loginService = new LoginService();
        this.user = getUser();
        Assert.assertEquals(3, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());
    }
    @Test
    public void checkUserPassword_positive(){
        boolean actualResult = loginService.checkUserPassword(user, positiveUserInputPassword);
        Assert.assertTrue(actualResult);
    }
    @Test
    public void checkUserPassword_negative(){
        boolean actualResult = loginService.checkUserPassword(user, negativeUserInputPassword);
        Assert.assertFalse(actualResult);
    }
    @Test
    public void reduceLoginAttempts(){
        loginService.reduceLoginAttempts(user);
        Assert.assertEquals(2, user.getLoginAttempts());
    }
    @Test
    public void login_positive(){
        boolean actualResult = loginService.login(user, positiveUserInputPassword);
        Assert.assertTrue(actualResult);
    }
    @Test
    public void login_negative(){
        boolean actualResult = loginService.login(user, negativeUserInputPassword);
        Assert.assertFalse(actualResult);
        Assert.assertEquals(2, user.getLoginAttempts());
    }
    @Test
    public void blockedUser(){
        loginService.blockedUser(user);
        Assert.assertTrue(user.isBlocked());
    }
    @Test
    public void after3WrongPasswords_ShouldBlockedUser(){
        loginService.login(user, negativeUserInputPassword);
        Assert.assertEquals(2, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negativeUserInputPassword);
        Assert.assertEquals(1, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negativeUserInputPassword);
        Assert.assertEquals(0, user.getLoginAttempts());
        Assert.assertTrue(user.isBlocked());
    }
    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }
}