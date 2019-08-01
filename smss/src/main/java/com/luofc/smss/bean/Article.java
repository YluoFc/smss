package com.luofc.smss.bean;

public class Article {
    private Integer id;

    private Integer typeid;

    private Integer hotid;

    private String title;

    private String description;

    private String images;

    private String date;

    private String keywords;

    private String zhaiyao;

    private String zuozhe;

    private String content;    

    public Article() {
		super();
	}

	public Article(Integer id, Integer typeid, Integer hotid, String title, String description, String images,
			String date, String keywords, String zhaiyao, String zuozhe, String content) {
		super();
		this.id = id;
		this.typeid = typeid;
		this.hotid = hotid;
		this.title = title;
		this.description = description;
		this.images = images;
		this.date = date;
		this.keywords = keywords;
		this.zhaiyao = zhaiyao;
		this.zuozhe = zuozhe;
		this.content = content;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getHotid() {
        return hotid;
    }

    public void setHotid(Integer hotid) {
        this.hotid = hotid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getZhaiyao() {
        return zhaiyao;
    }

    public void setZhaiyao(String zhaiyao) {
        this.zhaiyao = zhaiyao == null ? null : zhaiyao.trim();
    }

    public String getZuozhe() {
        return zuozhe;
    }

    public void setZuozhe(String zuozhe) {
        this.zuozhe = zuozhe == null ? null : zuozhe.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}