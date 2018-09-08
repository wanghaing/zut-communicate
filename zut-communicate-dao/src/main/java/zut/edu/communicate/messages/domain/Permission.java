package zut.edu.communicate.messages.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import zut.edu.communicate.admin.domain.Role;
import zut.edu.communicate.base.domain.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "T_PERMISSION")

public class Permission extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String perurl;

    //资源类型　　1：菜单　2：按钮
    private Integer type;

    //父权限
    @Column(nullable = false)
    private Integer parentid;

    //排序
    private Integer sort;

    //是否选中
    @Transient
    private String checked;

    @JsonIgnore
    @ManyToMany(mappedBy = "permissions")
    private Set<Role> roles = new HashSet<>();

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

    public String getPerurl() {
        return perurl;
    }

    public void setPerurl(String perurl) {
        this.perurl = perurl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }
}
