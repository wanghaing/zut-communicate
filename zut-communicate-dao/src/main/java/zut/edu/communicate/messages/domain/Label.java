package zut.edu.communicate.messages.domain;

import zut.edu.communicate.base.domain.BaseEntity;

import javax.persistence.*;


@Table(name = "T_LABLE")
@Entity

public class Label extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    //标签名称
    @Column(nullable = false,unique=true)
    private  String name;

    //主体数量
    @Column(name = "posts_count")
    private Integer postsCount=0;

    //详情
    private  String details;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(Integer postsCount) {
        this.postsCount = postsCount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
