package com.luofc.smss.bean;

public class User {
    private Integer uid;

    private String username;

    private String userpwd;

    private Integer usermark;

    

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer uid, String username, String userpwd, Integer usermark) {
		super();
		this.uid = uid;
		this.username = username;
		this.userpwd = userpwd;
		this.usermark = usermark;
	}

	public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public Integer getUsermark() {
        return usermark;
    }

    public void setUsermark(Integer usermark) {
        this.usermark = usermark;
    }
}