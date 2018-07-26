package zut.edu.communicate.admin.dao;


import org.springframework.stereotype.Repository;
import zut.edu.communicate.base.dao.GenericDao;
import zut.edu.communicate.admin.domain.User;


@Repository
public interface UserDao  extends GenericDao<User,Long> {
}
