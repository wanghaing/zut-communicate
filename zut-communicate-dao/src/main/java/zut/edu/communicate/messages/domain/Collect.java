package zut.edu.communicate.messages.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import zut.edu.communicate.admin.domain.User;
import zut.edu.communicate.base.domain.BaseEntity;
import zut.edu.communicate.dao.utils.Constants;

import javax.persistence.*;
import java.util.Date;


@Table(name="T_COLLECT")
@Entity

public class Collect extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    //与帖子关联的关系：立即加载
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable=false,name="posts_id")
    private Posts posts;

    //与用户的关联关系：立即加载
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(nullable=false,name="user_id")
    private User user;

    //收藏时间
    @JsonFormat(pattern = Constants.DATETIME_FORMAT)
    private Date initTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getInitTime() {
        return initTime;
    }

    public void setInitTime(Date initTime) {
        this.initTime = initTime;
    }
}
