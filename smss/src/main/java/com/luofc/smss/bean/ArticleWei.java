package com.luofc.smss.bean;

import java.util.Date;

public class ArticleWei {
    private Integer wid;

    private Integer wtypeid;

    private Integer whotid;

    private String wtitle;

    private String wdescription;

    private String wimages;

    private Date wdate;

    private String wkeywords;

    private String wzhaiyao;

    private String wzuozhe;

    private String wcontent;

    public ArticleWei() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArticleWei(Integer wid, Integer wtypeid, Integer whotid, String wtitle, String wdescription, String wimages,
			Date wdate, String wkeywords, String wzhaiyao, String wzuozhe, String wcontent) {
		super();
		this.wid = wid;
		this.wtypeid = wtypeid;
		this.whotid = whotid;
		this.wtitle = wtitle;
		this.wdescription = wdescription;
		this.wimages = wimages;
		this.wdate = wdate;
		this.wkeywords = wkeywords;
		this.wzhaiyao = wzhaiyao;
		this.wzuozhe = wzuozhe;
		this.wcontent = wcontent;
	}

	public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getWtypeid() {
        return wtypeid;
    }

    public void setWtypeid(Integer wtypeid) {
        this.wtypeid = wtypeid;
    }

    public Integer getWhotid() {
        return whotid;
    }

    public void setWhotid(Integer whotid) {
        this.whotid = whotid;
    }

    public String getWtitle() {
        return wtitle;
    }

    public void setWtitle(String wtitle) {
        this.wtitle = wtitle == null ? null : wtitle.trim();
    }

    public String getWdescription() {
        return wdescription;
    }

    public void setWdescription(String wdescription) {
        this.wdescription = wdescription == null ? null : wdescription.trim();
    }

    public String getWimages() {
        return wimages;
    }

    public void setWimages(String wimages) {
        this.wimages = wimages == null ? null : wimages.trim();
    }

    public Date getWdate() {
        return wdate;
    }

    public void setWdate(Date wdate) {
        this.wdate = wdate;
    }

    public String getWkeywords() {
        return wkeywords;
    }

    public void setWkeywords(String wkeywords) {
        this.wkeywords = wkeywords == null ? null : wkeywords.trim();
    }

    public String getWzhaiyao() {
        return wzhaiyao;
    }

    public void setWzhaiyao(String wzhaiyao) {
        this.wzhaiyao = wzhaiyao == null ? null : wzhaiyao.trim();
    }

    public String getWzuozhe() {
        return wzuozhe;
    }

    public void setWzuozhe(String wzuozhe) {
        this.wzuozhe = wzuozhe == null ? null : wzuozhe.trim();
    }

    public String getWcontent() {
        return wcontent;
    }

    public void setWcontent(String wcontent) {
        this.wcontent = wcontent == null ? null : wcontent.trim();
    }
}