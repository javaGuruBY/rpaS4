package homework.java.PilipenkoAlex.lecture.loginFeature.src.main.java.by.jrr.service;

import homework.java.PilipenkoAlex.lecture.loginFeature.src.main.java.by.jrr.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {
    LoginService loginService;
    User user;
    User blockedUser;
    String positiveUserInputPassword = "password";
    String negativeUserInputPassword = "wrong";
    @Before
    public void setUp(){
        this.loginService = new LoginService();
        this.user = getUser();
        this.blockedUser = getBlockedUser();
        Assert.assertEquals(3, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());
        Assert.assertEquals(0, blockedUser.getLoginAttempts());
        Assert.assertTrue(blockedUser.isBlocked());
    }
    @Test
    public void checkUserPassword_positive(){
        boolean actualResult = loginService.login(user, positiveUserInputPassword);
        Assert.assertTrue(actualResult);
    }
    @Test
    public void checkUserPassword_negative(){
        boolean actualResult = loginService.login(user, negativeUserInputPassword);
        Assert.assertFalse(actualResult);
    }
    @Test
    public void reduceLoginAttempts(){
        loginService.login(user, negativeUserInputPassword);
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
        user.setLoginAttempts(1);
        loginService.login(user, negativeUserInputPassword);
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
    @Test
    public void blockedUserLogin_ShouldReturnFalse(){
        boolean actualResult = loginService.login(blockedUser, positiveUserInputPassword);
        Assert.assertFalse(actualResult);
    }
    @Test
    public void restoreAttempts(){
        user.setLoginAttempts(1);
        loginService.login(user, positiveUserInputPassword);
        Assert.assertEquals(3, user.getLoginAttempts());
    }
    @Test
    public void afterOneIncorrect_ShouldRestoreAttempts(){
        loginService.login(user, negativeUserInputPassword);
        loginService.login(user, positiveUserInputPassword);
        Assert.assertEquals(3, user.getLoginAttempts());
    }
    @Test
    public void afterTwoIncorrect_ShouldRestoreAttempts(){
        loginService.login(user, negativeUserInputPassword);
        loginService.login(user, negativeUserInputPassword);
        loginService.login(user, positiveUserInputPassword);
        Assert.assertEquals(3, user.getLoginAttempts());
    }
    @Test
    public void afterThreeIncorrect_ShouldRestoreAttempts(){
        loginService.login(user, negativeUserInputPassword);
        loginService.login(user, negativeUserInputPassword);
        loginService.login(user, negativeUserInputPassword);
        boolean actualResult = loginService.login(user, positiveUserInputPassword);
        Assert.assertEquals(0, user.getLoginAttempts());
        Assert.assertTrue(user.isBlocked());
        Assert.assertFalse(actualResult);

    }
    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }
    private User getBlockedUser() {
        User user = new User();
        user.setPassword("password");
        user.setLoginAttempts(0);
        user.setBlocked(true);
        return user;
    }
}