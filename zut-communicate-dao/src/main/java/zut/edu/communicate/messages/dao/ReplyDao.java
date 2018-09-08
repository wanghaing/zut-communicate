package zut.edu.communicate.messages.dao;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import zut.edu.communicate.base.dao.GenericDao;
import zut.edu.communicate.messages.domain.Reply;

import java.util.List;

@CacheConfig(cacheNames = "replies")
@Repository
public interface ReplyDao extends GenericDao<Reply,Long> {
    @Cacheable
    @Override
    List<Reply> findAll();

}
