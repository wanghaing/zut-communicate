package zut.edu.communicate.admin.service;


import org.apache.catalina.User;

import java.util.List;

public interface UserManager extends G{

    List<User> findAll();

    User findbyUsername(String username);
}
//GenericManager<User,Long>