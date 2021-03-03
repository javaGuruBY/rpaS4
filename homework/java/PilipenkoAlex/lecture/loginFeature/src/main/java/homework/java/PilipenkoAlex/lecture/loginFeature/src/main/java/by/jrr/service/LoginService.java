package homework.java.PilipenkoAlex.lecture.loginFeature.src.main.java.by.jrr.service;

import homework.java.PilipenkoAlex.lecture.loginFeature.src.main.java.by.jrr.bean.User;

public class LoginService {
    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }
}
