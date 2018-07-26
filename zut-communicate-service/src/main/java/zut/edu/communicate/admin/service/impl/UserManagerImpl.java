package zut.edu.communicate.admin.service.impl;


import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zut.edu.communicate.admin.service.UserManager;



@Component
@Transactional
public class UserManagerImpl extends GenericManagerImpl<User, Long> implements UserManager {

    UserDao userDao;

    @Override
    public User findbyUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        this.dao = this.userDao;
    }

}
