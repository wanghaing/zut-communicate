package zut.edu.communicate.messages.dao;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import zut.edu.communicate.admin.domain.User;
import zut.edu.communicate.base.dao.GenericDao;
import zut.edu.communicate.messages.domain.Label;
import zut.edu.communicate.messages.domain.Posts;

import java.util.List;

@CacheConfig(cacheNames = "postses")
@Repository
public interface PostsDao extends GenericDao<Posts,Long> {
    @Cacheable
    @Override
    List<Posts> findAll();

    @Query(value = "select p.id, p.title , p.reply_count from T_POSTS p where DATE_SUB(CURDATE(), INTERVAL 30 DAY) <=DATE(p.init_time) ORDER by reply_count desc limit 10" ,nativeQuery = true)
    List<Object> findHot();

    Page<Posts> findByUser(User user, Pageable pageable);

    Page<Posts> findByLabel(Label label, Pageable pageable);
}

