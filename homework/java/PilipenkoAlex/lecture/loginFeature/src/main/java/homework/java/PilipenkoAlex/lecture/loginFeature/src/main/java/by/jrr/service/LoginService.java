package homework.java.PilipenkoAlex.lecture.loginFeature.src.main.java.by.jrr.service;
import homework.java.PilipenkoAlex.lecture.loginFeature.src.main.java.by.jrr.bean.User;

public class LoginService {

    public boolean login(User user, String userInput) {
        if (!user.isBlocked()) {
            boolean result = checkUserPassword(user, userInput);
            updateUserStatus(user, result);
            return result;
        }
        return  false;
    }

    private void updateUserStatus(User user, boolean result) {
        if (result) {
            restoreAttempts(user);
        } else {
            reduceLoginAttempts(user);
            ifLoginAttemptsExeeded(user);
        }
    }

    private void ifLoginAttemptsExeeded(User user) {
        if(user.getLoginAttempts() == 0){
            blockedUser(user);
        }
    }

    private boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    private void reduceLoginAttempts(User user) {
        user.setLoginAttempts(user.getLoginAttempts()-1);
    }

    private void blockedUser(User user) {
        user.setBlocked(true);
    }

    private void restoreAttempts(User user) {
        user.setLoginAttempts(3);
    }
}
