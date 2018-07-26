package zut.edu.communicate.admin.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zut.edu.communicate.admin.service.GroupManager;

import java.beans.Transient;


@Service("groupManager")
@Tran
public clarss GroupManagerImpl extends GenericTreeManagerImpl<Group, Long> implements GroupManager {

    GroupDao groupDao;

    @Autowired
    public void setGroupDao(GroupDao groupDao) {
        this.groupDao = groupDao;
        this.treeDao = this.groupDao;
        this.dao = this.treeDao;
    }

}
