package zut.edu.communicate.customer.domain;


import zut.edu.communicate.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "T_FEEDBACK")
public class FeedBack extends BaseEntity {

	/**
	 * @Wangxiaoer
	 *
	 */
	private static final long serialVersionUID = 7041174588598351596L;

	@Column
	String content;

	@Column
	protected Date time;

	public String getContent() {
		return content;
	}

	public Date getTime() {
		return time;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
