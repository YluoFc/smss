package com.luofc.smss.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleFaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleFaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFtypeidIsNull() {
            addCriterion("ftypeid is null");
            return (Criteria) this;
        }

        public Criteria andFtypeidIsNotNull() {
            addCriterion("ftypeid is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeidEqualTo(Integer value) {
            addCriterion("ftypeid =", value, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidNotEqualTo(Integer value) {
            addCriterion("ftypeid <>", value, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidGreaterThan(Integer value) {
            addCriterion("ftypeid >", value, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ftypeid >=", value, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidLessThan(Integer value) {
            addCriterion("ftypeid <", value, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("ftypeid <=", value, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidIn(List<Integer> values) {
            addCriterion("ftypeid in", values, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidNotIn(List<Integer> values) {
            addCriterion("ftypeid not in", values, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidBetween(Integer value1, Integer value2) {
            addCriterion("ftypeid between", value1, value2, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("ftypeid not between", value1, value2, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFhotidIsNull() {
            addCriterion("fhotid is null");
            return (Criteria) this;
        }

        public Criteria andFhotidIsNotNull() {
            addCriterion("fhotid is not null");
            return (Criteria) this;
        }

        public Criteria andFhotidEqualTo(Integer value) {
            addCriterion("fhotid =", value, "fhotid");
            return (Criteria) this;
        }

        public Criteria andFhotidNotEqualTo(Integer value) {
            addCriterion("fhotid <>", value, "fhotid");
            return (Criteria) this;
        }

        public Criteria andFhotidGreaterThan(Integer value) {
            addCriterion("fhotid >", value, "fhotid");
            return (Criteria) this;
        }

        public Criteria andFhotidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fhotid >=", value, "fhotid");
            return (Criteria) this;
        }

        public Criteria andFhotidLessThan(Integer value) {
            addCriterion("fhotid <", value, "fhotid");
            return (Criteria) this;
        }

        public Criteria andFhotidLessThanOrEqualTo(Integer value) {
            addCriterion("fhotid <=", value, "fhotid");
            return (Criteria) this;
        }

        public Criteria andFhotidIn(List<Integer> values) {
            addCriterion("fhotid in", values, "fhotid");
            return (Criteria) this;
        }

        public Criteria andFhotidNotIn(List<Integer> values) {
            addCriterion("fhotid not in", values, "fhotid");
            return (Criteria) this;
        }

        public Criteria andFhotidBetween(Integer value1, Integer value2) {
            addCriterion("fhotid between", value1, value2, "fhotid");
            return (Criteria) this;
        }

        public Criteria andFhotidNotBetween(Integer value1, Integer value2) {
            addCriterion("fhotid not between", value1, value2, "fhotid");
            return (Criteria) this;
        }

        public Criteria andFtitleIsNull() {
            addCriterion("ftitle is null");
            return (Criteria) this;
        }

        public Criteria andFtitleIsNotNull() {
            addCriterion("ftitle is not null");
            return (Criteria) this;
        }

        public Criteria andFtitleEqualTo(String value) {
            addCriterion("ftitle =", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotEqualTo(String value) {
            addCriterion("ftitle <>", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleGreaterThan(String value) {
            addCriterion("ftitle >", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleGreaterThanOrEqualTo(String value) {
            addCriterion("ftitle >=", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLessThan(String value) {
            addCriterion("ftitle <", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLessThanOrEqualTo(String value) {
            addCriterion("ftitle <=", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLike(String value) {
            addCriterion("ftitle like", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotLike(String value) {
            addCriterion("ftitle not like", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleIn(List<String> values) {
            addCriterion("ftitle in", values, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotIn(List<String> values) {
            addCriterion("ftitle not in", values, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleBetween(String value1, String value2) {
            addCriterion("ftitle between", value1, value2, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotBetween(String value1, String value2) {
            addCriterion("ftitle not between", value1, value2, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFdescriptionIsNull() {
            addCriterion("fdescription is null");
            return (Criteria) this;
        }

        public Criteria andFdescriptionIsNotNull() {
            addCriterion("fdescription is not null");
            return (Criteria) this;
        }

        public Criteria andFdescriptionEqualTo(String value) {
            addCriterion("fdescription =", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionNotEqualTo(String value) {
            addCriterion("fdescription <>", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionGreaterThan(String value) {
            addCriterion("fdescription >", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("fdescription >=", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionLessThan(String value) {
            addCriterion("fdescription <", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionLessThanOrEqualTo(String value) {
            addCriterion("fdescription <=", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionLike(String value) {
            addCriterion("fdescription like", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionNotLike(String value) {
            addCriterion("fdescription not like", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionIn(List<String> values) {
            addCriterion("fdescription in", values, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionNotIn(List<String> values) {
            addCriterion("fdescription not in", values, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionBetween(String value1, String value2) {
            addCriterion("fdescription between", value1, value2, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionNotBetween(String value1, String value2) {
            addCriterion("fdescription not between", value1, value2, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFimagesIsNull() {
            addCriterion("fimages is null");
            return (Criteria) this;
        }

        public Criteria andFimagesIsNotNull() {
            addCriterion("fimages is not null");
            return (Criteria) this;
        }

        public Criteria andFimagesEqualTo(String value) {
            addCriterion("fimages =", value, "fimages");
            return (Criteria) this;
        }

        public Criteria andFimagesNotEqualTo(String value) {
            addCriterion("fimages <>", value, "fimages");
            return (Criteria) this;
        }

        public Criteria andFimagesGreaterThan(String value) {
            addCriterion("fimages >", value, "fimages");
            return (Criteria) this;
        }

        public Criteria andFimagesGreaterThanOrEqualTo(String value) {
            addCriterion("fimages >=", value, "fimages");
            return (Criteria) this;
        }

        public Criteria andFimagesLessThan(String value) {
            addCriterion("fimages <", value, "fimages");
            return (Criteria) this;
        }

        public Criteria andFimagesLessThanOrEqualTo(String value) {
            addCriterion("fimages <=", value, "fimages");
            return (Criteria) this;
        }

        public Criteria andFimagesLike(String value) {
            addCriterion("fimages like", value, "fimages");
            return (Criteria) this;
        }

        public Criteria andFimagesNotLike(String value) {
            addCriterion("fimages not like", value, "fimages");
            return (Criteria) this;
        }

        public Criteria andFimagesIn(List<String> values) {
            addCriterion("fimages in", values, "fimages");
            return (Criteria) this;
        }

        public Criteria andFimagesNotIn(List<String> values) {
            addCriterion("fimages not in", values, "fimages");
            return (Criteria) this;
        }

        public Criteria andFimagesBetween(String value1, String value2) {
            addCriterion("fimages between", value1, value2, "fimages");
            return (Criteria) this;
        }

        public Criteria andFimagesNotBetween(String value1, String value2) {
            addCriterion("fimages not between", value1, value2, "fimages");
            return (Criteria) this;
        }

        public Criteria andFdateIsNull() {
            addCriterion("fdate is null");
            return (Criteria) this;
        }

        public Criteria andFdateIsNotNull() {
            addCriterion("fdate is not null");
            return (Criteria) this;
        }

        public Criteria andFdateEqualTo(Date value) {
            addCriterion("fdate =", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateNotEqualTo(Date value) {
            addCriterion("fdate <>", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateGreaterThan(Date value) {
            addCriterion("fdate >", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateGreaterThanOrEqualTo(Date value) {
            addCriterion("fdate >=", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateLessThan(Date value) {
            addCriterion("fdate <", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateLessThanOrEqualTo(Date value) {
            addCriterion("fdate <=", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateIn(List<Date> values) {
            addCriterion("fdate in", values, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateNotIn(List<Date> values) {
            addCriterion("fdate not in", values, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateBetween(Date value1, Date value2) {
            addCriterion("fdate between", value1, value2, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateNotBetween(Date value1, Date value2) {
            addCriterion("fdate not between", value1, value2, "fdate");
            return (Criteria) this;
        }

        public Criteria andFkeywordsIsNull() {
            addCriterion("fkeywords is null");
            return (Criteria) this;
        }

        public Criteria andFkeywordsIsNotNull() {
            addCriterion("fkeywords is not null");
            return (Criteria) this;
        }

        public Criteria andFkeywordsEqualTo(String value) {
            addCriterion("fkeywords =", value, "fkeywords");
            return (Criteria) this;
        }

        public Criteria andFkeywordsNotEqualTo(String value) {
            addCriterion("fkeywords <>", value, "fkeywords");
            return (Criteria) this;
        }

        public Criteria andFkeywordsGreaterThan(String value) {
            addCriterion("fkeywords >", value, "fkeywords");
            return (Criteria) this;
        }

        public Criteria andFkeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("fkeywords >=", value, "fkeywords");
            return (Criteria) this;
        }

        public Criteria andFkeywordsLessThan(String value) {
            addCriterion("fkeywords <", value, "fkeywords");
            return (Criteria) this;
        }

        public Criteria andFkeywordsLessThanOrEqualTo(String value) {
            addCriterion("fkeywords <=", value, "fkeywords");
            return (Criteria) this;
        }

        public Criteria andFkeywordsLike(String value) {
            addCriterion("fkeywords like", value, "fkeywords");
            return (Criteria) this;
        }

        public Criteria andFkeywordsNotLike(String value) {
            addCriterion("fkeywords not like", value, "fkeywords");
            return (Criteria) this;
        }

        public Criteria andFkeywordsIn(List<String> values) {
            addCriterion("fkeywords in", values, "fkeywords");
            return (Criteria) this;
        }

        public Criteria andFkeywordsNotIn(List<String> values) {
            addCriterion("fkeywords not in", values, "fkeywords");
            return (Criteria) this;
        }

        public Criteria andFkeywordsBetween(String value1, String value2) {
            addCriterion("fkeywords between", value1, value2, "fkeywords");
            return (Criteria) this;
        }

        public Criteria andFkeywordsNotBetween(String value1, String value2) {
            addCriterion("fkeywords not between", value1, value2, "fkeywords");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoIsNull() {
            addCriterion("fzhaiyao is null");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoIsNotNull() {
            addCriterion("fzhaiyao is not null");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoEqualTo(String value) {
            addCriterion("fzhaiyao =", value, "fzhaiyao");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoNotEqualTo(String value) {
            addCriterion("fzhaiyao <>", value, "fzhaiyao");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoGreaterThan(String value) {
            addCriterion("fzhaiyao >", value, "fzhaiyao");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoGreaterThanOrEqualTo(String value) {
            addCriterion("fzhaiyao >=", value, "fzhaiyao");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoLessThan(String value) {
            addCriterion("fzhaiyao <", value, "fzhaiyao");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoLessThanOrEqualTo(String value) {
            addCriterion("fzhaiyao <=", value, "fzhaiyao");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoLike(String value) {
            addCriterion("fzhaiyao like", value, "fzhaiyao");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoNotLike(String value) {
            addCriterion("fzhaiyao not like", value, "fzhaiyao");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoIn(List<String> values) {
            addCriterion("fzhaiyao in", values, "fzhaiyao");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoNotIn(List<String> values) {
            addCriterion("fzhaiyao not in", values, "fzhaiyao");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoBetween(String value1, String value2) {
            addCriterion("fzhaiyao between", value1, value2, "fzhaiyao");
            return (Criteria) this;
        }

        public Criteria andFzhaiyaoNotBetween(String value1, String value2) {
            addCriterion("fzhaiyao not between", value1, value2, "fzhaiyao");
            return (Criteria) this;
        }

        public Criteria andFzuozheIsNull() {
            addCriterion("fzuozhe is null");
            return (Criteria) this;
        }

        public Criteria andFzuozheIsNotNull() {
            addCriterion("fzuozhe is not null");
            return (Criteria) this;
        }

        public Criteria andFzuozheEqualTo(String value) {
            addCriterion("fzuozhe =", value, "fzuozhe");
            return (Criteria) this;
        }

        public Criteria andFzuozheNotEqualTo(String value) {
            addCriterion("fzuozhe <>", value, "fzuozhe");
            return (Criteria) this;
        }

        public Criteria andFzuozheGreaterThan(String value) {
            addCriterion("fzuozhe >", value, "fzuozhe");
            return (Criteria) this;
        }

        public Criteria andFzuozheGreaterThanOrEqualTo(String value) {
            addCriterion("fzuozhe >=", value, "fzuozhe");
            return (Criteria) this;
        }

        public Criteria andFzuozheLessThan(String value) {
            addCriterion("fzuozhe <", value, "fzuozhe");
            return (Criteria) this;
        }

        public Criteria andFzuozheLessThanOrEqualTo(String value) {
            addCriterion("fzuozhe <=", value, "fzuozhe");
            return (Criteria) this;
        }

        public Criteria andFzuozheLike(String value) {
            addCriterion("fzuozhe like", value, "fzuozhe");
            return (Criteria) this;
        }

        public Criteria andFzuozheNotLike(String value) {
            addCriterion("fzuozhe not like", value, "fzuozhe");
            return (Criteria) this;
        }

        public Criteria andFzuozheIn(List<String> values) {
            addCriterion("fzuozhe in", values, "fzuozhe");
            return (Criteria) this;
        }

        public Criteria andFzuozheNotIn(List<String> values) {
            addCriterion("fzuozhe not in", values, "fzuozhe");
            return (Criteria) this;
        }

        public Criteria andFzuozheBetween(String value1, String value2) {
            addCriterion("fzuozhe between", value1, value2, "fzuozhe");
            return (Criteria) this;
        }

        public Criteria andFzuozheNotBetween(String value1, String value2) {
            addCriterion("fzuozhe not between", value1, value2, "fzuozhe");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}