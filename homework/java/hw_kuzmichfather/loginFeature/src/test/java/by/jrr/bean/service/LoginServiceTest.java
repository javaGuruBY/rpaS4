package by.jrr.bean.service;

import by.jrr.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LoginServiceTest {

    LoginService loginService;
    User user;

    @Before
    public void setUp() {
        this.loginService = new LoginService();
        this.user = getUser();
        Assert.assertEquals(3, user.getLoginAttemps());
    }

    @Test
    public void checkUserPassword_positive() {
        String userInput = "password";

        boolean actualResult = loginService.checkUserPassword(user, userInput);
        Assert.assertTrue(actualResult);
    }


    @Test
    public void checkUserPassword_negative() {
        String userInput = "wrong_password";

        boolean actualResult = loginService.checkUserPassword(user, userInput);
        Assert.assertFalse(actualResult);
    }



    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }
}

