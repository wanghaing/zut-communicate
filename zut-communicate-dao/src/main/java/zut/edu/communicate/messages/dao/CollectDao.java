package zut.edu.communicate.messages.dao;


import org.springframework.stereotype.Repository;
import zut.edu.communicate.base.dao.GenericDao;
import zut.edu.communicate.messages.domain.Collect;

@Repository
public interface CollectDao extends GenericDao<Collect,Long> {
}
