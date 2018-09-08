package zut.edu.communicate.messages.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import zut.edu.communicate.admin.domain.User;
import zut.edu.communicate.base.domain.BaseEntity;
import zut.edu.communicate.dao.utils.Constants;

import javax.persistence.*;
import javax.xml.crypto.Data;

@Entity
@Table(name = "T_NOTIFICATION")
public class Notification extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    //通知是否已读
    @Column(name = "is_read")
    private boolean isRead=false;

    //要通知的用户：立即加载
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable=false,name="touser_id")
    private User touser;

    //发起通知的用户
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false,name = "fromuser_id")
    private User fromuser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false,name = "posts_id")
    private Posts posts;

    //发布时间
    @Column(nullable = false)
    @JsonFormat(pattern = Constants.DATETIME_FORMAT, timezone = "GMT+8")
    private Data initTime;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public User getTouser() {
        return touser;
    }

    public void setTouser(User touser) {
        this.touser = touser;
    }

    public User getFromuser() {
        return fromuser;
    }

    public void setFromuser(User fromuser) {
        this.fromuser = fromuser;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public Data getInitTime() {
        return initTime;
    }

    public void setInitTime(Data initTime) {
        this.initTime = initTime;
    }
}
