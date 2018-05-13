package com.dong.model;

import java.util.Date;

public class Test {
	
	private Integer id;
	
	private String name;
	
	private String telphone;
	
	private String email;
	
	private Date createdate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", telphone=" + telphone + ", email=" + email + ", createdate="
				+ createdate + "]";
	}
	
}
