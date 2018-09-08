package zut.edu.communicate.messages.dao;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import zut.edu.communicate.admin.domain.User;
import zut.edu.communicate.base.dao.GenericDao;
import zut.edu.communicate.messages.domain.Notification;

import java.util.List;

@Repository
public interface NotificationDao extends GenericDao<Notification,Long> {
    @Query(value = "SELECT count(id) FROM T_NOTIFICATION WHERE n.touser_id = ?1 AND n.is_read = 0", nativeQuery = true)
    long getNotificationCount(Integer id);

    List<Notification> getByTouserOrderByInitTimeDesc(User user);

    @Modifying
    @Query("update Notification n set n.isRead = true where n.touser = ?1")
    void updateByIsRead(User user);

}
