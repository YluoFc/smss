package com.luofc.smss.bean;

import java.util.Date;

public class ArticleFa {
    private Integer fid;

    private Integer ftypeid;

    private Integer fhotid;

    private String ftitle;

    private String fdescription;

    private String fimages;

    private Date fdate;

    private String fkeywords;

    private String fzhaiyao;

    private String fzuozhe;

    private String fcontent;
    
    public ArticleFa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArticleFa(Integer fid, Integer ftypeid, Integer fhotid, String ftitle, String fdescription, String fimages,
			Date fdate, String fkeywords, String fzhaiyao, String fzuozhe, String fcontent) {
		super();
		this.fid = fid;
		this.ftypeid = ftypeid;
		this.fhotid = fhotid;
		this.ftitle = ftitle;
		this.fdescription = fdescription;
		this.fimages = fimages;
		this.fdate = fdate;
		this.fkeywords = fkeywords;
		this.fzhaiyao = fzhaiyao;
		this.fzuozhe = fzuozhe;
		this.fcontent = fcontent;
	}

	public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFtypeid() {
        return ftypeid;
    }

    public void setFtypeid(Integer ftypeid) {
        this.ftypeid = ftypeid;
    }

    public Integer getFhotid() {
        return fhotid;
    }

    public void setFhotid(Integer fhotid) {
        this.fhotid = fhotid;
    }

    public String getFtitle() {
        return ftitle;
    }

    public void setFtitle(String ftitle) {
        this.ftitle = ftitle == null ? null : ftitle.trim();
    }

    public String getFdescription() {
        return fdescription;
    }

    public void setFdescription(String fdescription) {
        this.fdescription = fdescription == null ? null : fdescription.trim();
    }

    public String getFimages() {
        return fimages;
    }

    public void setFimages(String fimages) {
        this.fimages = fimages == null ? null : fimages.trim();
    }

    public Date getFdate() {
        return fdate;
    }

    public void setFdate(Date fdate) {
        this.fdate = fdate;
    }

    public String getFkeywords() {
        return fkeywords;
    }

    public void setFkeywords(String fkeywords) {
        this.fkeywords = fkeywords == null ? null : fkeywords.trim();
    }

    public String getFzhaiyao() {
        return fzhaiyao;
    }

    public void setFzhaiyao(String fzhaiyao) {
        this.fzhaiyao = fzhaiyao == null ? null : fzhaiyao.trim();
    }

    public String getFzuozhe() {
        return fzuozhe;
    }

    public void setFzuozhe(String fzuozhe) {
        this.fzuozhe = fzuozhe == null ? null : fzuozhe.trim();
    }

    public String getFcontent() {
        return fcontent;
    }

    public void setFcontent(String fcontent) {
        this.fcontent = fcontent == null ? null : fcontent.trim();
    }
}