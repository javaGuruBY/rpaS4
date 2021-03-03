package homework.java.PilipenkoAlex.lecture.loginFeature.src.main.java.by.jrr.service;
import homework.java.PilipenkoAlex.lecture.loginFeature.src.main.java.by.jrr.bean.User;

public class LoginService {
    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    public void reduceLoginAttempts(User user) {
        user.setLoginAttempts(user.getLoginAttempts()-1);
    }

    public boolean login(User user, String userInput) {
        if (user.isBlocked()) {
            return false;
        }
        if(user.getLoginAttempts() == 1){
            blockedUser(user);
        }
        reduceLoginAttempts(user);
        boolean result = checkUserPassword(user, userInput);
        if(result){
            restoreAttempts(user);
        }
        return result;
    }

    public void blockedUser(User user) {
        user.setBlocked(true);
    }

    public void restoreAttempts(User user) {
        user.setLoginAttempts(3);
    }
}
