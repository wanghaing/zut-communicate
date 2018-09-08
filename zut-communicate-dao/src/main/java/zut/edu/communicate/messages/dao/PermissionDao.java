package zut.edu.communicate.messages.dao;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import zut.edu.communicate.base.dao.GenericDao;
import zut.edu.communicate.messages.domain.Permission;

import java.util.List;


@Repository
@CacheConfig(cacheNames = "permissions")
public interface PermissionDao extends GenericDao<Permission,Long> {
    Permission findOne(Integer integer);

    @Cacheable
    List<Permission> findAll();
}
