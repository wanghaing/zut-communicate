package zut.edu.communicate.messages.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import zut.edu.communicate.admin.domain.User;
import zut.edu.communicate.base.domain.BaseEntity;
import zut.edu.communicate.dao.utils.Constants;

import javax.persistence.*;
import java.util.Date;

public class Reply extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    //回复的内容
    @Column(columnDefinition = "text", nullable = false)
    private String content;

    //回复时间
    @JsonFormat(pattern = Constants.DATETIME_FORMAT, timezone = "GMT+8")
    private Date initTime;

    //点赞个数
    private Integer up = 0;

    //与话题的关联关系
    @ManyToOne
    @JoinColumn(nullable = false, name = "posts_id")
    @JsonIgnore
    private Posts posts;

    //与用户的关联关系
    @ManyToOne
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getInitTime() {
        return initTime;
    }

    public void setInitTime(Date initTime) {
        this.initTime = initTime;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
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

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", initTime=" + initTime +
                ", up=" + up +
                ", user=" + user +
                '}';
    }
}