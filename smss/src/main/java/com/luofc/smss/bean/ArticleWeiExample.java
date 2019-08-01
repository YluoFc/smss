package com.luofc.smss.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleWeiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleWeiExample() {
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

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Integer value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Integer value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Integer value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Integer value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Integer value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Integer> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Integer> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Integer value1, Integer value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Integer value1, Integer value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWtypeidIsNull() {
            addCriterion("wtypeid is null");
            return (Criteria) this;
        }

        public Criteria andWtypeidIsNotNull() {
            addCriterion("wtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andWtypeidEqualTo(Integer value) {
            addCriterion("wtypeid =", value, "wtypeid");
            return (Criteria) this;
        }

        public Criteria andWtypeidNotEqualTo(Integer value) {
            addCriterion("wtypeid <>", value, "wtypeid");
            return (Criteria) this;
        }

        public Criteria andWtypeidGreaterThan(Integer value) {
            addCriterion("wtypeid >", value, "wtypeid");
            return (Criteria) this;
        }

        public Criteria andWtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wtypeid >=", value, "wtypeid");
            return (Criteria) this;
        }

        public Criteria andWtypeidLessThan(Integer value) {
            addCriterion("wtypeid <", value, "wtypeid");
            return (Criteria) this;
        }

        public Criteria andWtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("wtypeid <=", value, "wtypeid");
            return (Criteria) this;
        }

        public Criteria andWtypeidIn(List<Integer> values) {
            addCriterion("wtypeid in", values, "wtypeid");
            return (Criteria) this;
        }

        public Criteria andWtypeidNotIn(List<Integer> values) {
            addCriterion("wtypeid not in", values, "wtypeid");
            return (Criteria) this;
        }

        public Criteria andWtypeidBetween(Integer value1, Integer value2) {
            addCriterion("wtypeid between", value1, value2, "wtypeid");
            return (Criteria) this;
        }

        public Criteria andWtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("wtypeid not between", value1, value2, "wtypeid");
            return (Criteria) this;
        }

        public Criteria andWhotidIsNull() {
            addCriterion("whotid is null");
            return (Criteria) this;
        }

        public Criteria andWhotidIsNotNull() {
            addCriterion("whotid is not null");
            return (Criteria) this;
        }

        public Criteria andWhotidEqualTo(Integer value) {
            addCriterion("whotid =", value, "whotid");
            return (Criteria) this;
        }

        public Criteria andWhotidNotEqualTo(Integer value) {
            addCriterion("whotid <>", value, "whotid");
            return (Criteria) this;
        }

        public Criteria andWhotidGreaterThan(Integer value) {
            addCriterion("whotid >", value, "whotid");
            return (Criteria) this;
        }

        public Criteria andWhotidGreaterThanOrEqualTo(Integer value) {
            addCriterion("whotid >=", value, "whotid");
            return (Criteria) this;
        }

        public Criteria andWhotidLessThan(Integer value) {
            addCriterion("whotid <", value, "whotid");
            return (Criteria) this;
        }

        public Criteria andWhotidLessThanOrEqualTo(Integer value) {
            addCriterion("whotid <=", value, "whotid");
            return (Criteria) this;
        }

        public Criteria andWhotidIn(List<Integer> values) {
            addCriterion("whotid in", values, "whotid");
            return (Criteria) this;
        }

        public Criteria andWhotidNotIn(List<Integer> values) {
            addCriterion("whotid not in", values, "whotid");
            return (Criteria) this;
        }

        public Criteria andWhotidBetween(Integer value1, Integer value2) {
            addCriterion("whotid between", value1, value2, "whotid");
            return (Criteria) this;
        }

        public Criteria andWhotidNotBetween(Integer value1, Integer value2) {
            addCriterion("whotid not between", value1, value2, "whotid");
            return (Criteria) this;
        }

        public Criteria andWtitleIsNull() {
            addCriterion("wtitle is null");
            return (Criteria) this;
        }

        public Criteria andWtitleIsNotNull() {
            addCriterion("wtitle is not null");
            return (Criteria) this;
        }

        public Criteria andWtitleEqualTo(String value) {
            addCriterion("wtitle =", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleNotEqualTo(String value) {
            addCriterion("wtitle <>", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleGreaterThan(String value) {
            addCriterion("wtitle >", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleGreaterThanOrEqualTo(String value) {
            addCriterion("wtitle >=", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleLessThan(String value) {
            addCriterion("wtitle <", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleLessThanOrEqualTo(String value) {
            addCriterion("wtitle <=", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleLike(String value) {
            addCriterion("wtitle like", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleNotLike(String value) {
            addCriterion("wtitle not like", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleIn(List<String> values) {
            addCriterion("wtitle in", values, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleNotIn(List<String> values) {
            addCriterion("wtitle not in", values, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleBetween(String value1, String value2) {
            addCriterion("wtitle between", value1, value2, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleNotBetween(String value1, String value2) {
            addCriterion("wtitle not between", value1, value2, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWdescriptionIsNull() {
            addCriterion("wdescription is null");
            return (Criteria) this;
        }

        public Criteria andWdescriptionIsNotNull() {
            addCriterion("wdescription is not null");
            return (Criteria) this;
        }

        public Criteria andWdescriptionEqualTo(String value) {
            addCriterion("wdescription =", value, "wdescription");
            return (Criteria) this;
        }

        public Criteria andWdescriptionNotEqualTo(String value) {
            addCriterion("wdescription <>", value, "wdescription");
            return (Criteria) this;
        }

        public Criteria andWdescriptionGreaterThan(String value) {
            addCriterion("wdescription >", value, "wdescription");
            return (Criteria) this;
        }

        public Criteria andWdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("wdescription >=", value, "wdescription");
            return (Criteria) this;
        }

        public Criteria andWdescriptionLessThan(String value) {
            addCriterion("wdescription <", value, "wdescription");
            return (Criteria) this;
        }

        public Criteria andWdescriptionLessThanOrEqualTo(String value) {
            addCriterion("wdescription <=", value, "wdescription");
            return (Criteria) this;
        }

        public Criteria andWdescriptionLike(String value) {
            addCriterion("wdescription like", value, "wdescription");
            return (Criteria) this;
        }

        public Criteria andWdescriptionNotLike(String value) {
            addCriterion("wdescription not like", value, "wdescription");
            return (Criteria) this;
        }

        public Criteria andWdescriptionIn(List<String> values) {
            addCriterion("wdescription in", values, "wdescription");
            return (Criteria) this;
        }

        public Criteria andWdescriptionNotIn(List<String> values) {
            addCriterion("wdescription not in", values, "wdescription");
            return (Criteria) this;
        }

        public Criteria andWdescriptionBetween(String value1, String value2) {
            addCriterion("wdescription between", value1, value2, "wdescription");
            return (Criteria) this;
        }

        public Criteria andWdescriptionNotBetween(String value1, String value2) {
            addCriterion("wdescription not between", value1, value2, "wdescription");
            return (Criteria) this;
        }

        public Criteria andWimagesIsNull() {
            addCriterion("wimages is null");
            return (Criteria) this;
        }

        public Criteria andWimagesIsNotNull() {
            addCriterion("wimages is not null");
            return (Criteria) this;
        }

        public Criteria andWimagesEqualTo(String value) {
            addCriterion("wimages =", value, "wimages");
            return (Criteria) this;
        }

        public Criteria andWimagesNotEqualTo(String value) {
            addCriterion("wimages <>", value, "wimages");
            return (Criteria) this;
        }

        public Criteria andWimagesGreaterThan(String value) {
            addCriterion("wimages >", value, "wimages");
            return (Criteria) this;
        }

        public Criteria andWimagesGreaterThanOrEqualTo(String value) {
            addCriterion("wimages >=", value, "wimages");
            return (Criteria) this;
        }

        public Criteria andWimagesLessThan(String value) {
            addCriterion("wimages <", value, "wimages");
            return (Criteria) this;
        }

        public Criteria andWimagesLessThanOrEqualTo(String value) {
            addCriterion("wimages <=", value, "wimages");
            return (Criteria) this;
        }

        public Criteria andWimagesLike(String value) {
            addCriterion("wimages like", value, "wimages");
            return (Criteria) this;
        }

        public Criteria andWimagesNotLike(String value) {
            addCriterion("wimages not like", value, "wimages");
            return (Criteria) this;
        }

        public Criteria andWimagesIn(List<String> values) {
            addCriterion("wimages in", values, "wimages");
            return (Criteria) this;
        }

        public Criteria andWimagesNotIn(List<String> values) {
            addCriterion("wimages not in", values, "wimages");
            return (Criteria) this;
        }

        public Criteria andWimagesBetween(String value1, String value2) {
            addCriterion("wimages between", value1, value2, "wimages");
            return (Criteria) this;
        }

        public Criteria andWimagesNotBetween(String value1, String value2) {
            addCriterion("wimages not between", value1, value2, "wimages");
            return (Criteria) this;
        }

        public Criteria andWdateIsNull() {
            addCriterion("wdate is null");
            return (Criteria) this;
        }

        public Criteria andWdateIsNotNull() {
            addCriterion("wdate is not null");
            return (Criteria) this;
        }

        public Criteria andWdateEqualTo(Date value) {
            addCriterion("wdate =", value, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateNotEqualTo(Date value) {
            addCriterion("wdate <>", value, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateGreaterThan(Date value) {
            addCriterion("wdate >", value, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateGreaterThanOrEqualTo(Date value) {
            addCriterion("wdate >=", value, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateLessThan(Date value) {
            addCriterion("wdate <", value, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateLessThanOrEqualTo(Date value) {
            addCriterion("wdate <=", value, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateIn(List<Date> values) {
            addCriterion("wdate in", values, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateNotIn(List<Date> values) {
            addCriterion("wdate not in", values, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateBetween(Date value1, Date value2) {
            addCriterion("wdate between", value1, value2, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateNotBetween(Date value1, Date value2) {
            addCriterion("wdate not between", value1, value2, "wdate");
            return (Criteria) this;
        }

        public Criteria andWkeywordsIsNull() {
            addCriterion("wkeywords is null");
            return (Criteria) this;
        }

        public Criteria andWkeywordsIsNotNull() {
            addCriterion("wkeywords is not null");
            return (Criteria) this;
        }

        public Criteria andWkeywordsEqualTo(String value) {
            addCriterion("wkeywords =", value, "wkeywords");
            return (Criteria) this;
        }

        public Criteria andWkeywordsNotEqualTo(String value) {
            addCriterion("wkeywords <>", value, "wkeywords");
            return (Criteria) this;
        }

        public Criteria andWkeywordsGreaterThan(String value) {
            addCriterion("wkeywords >", value, "wkeywords");
            return (Criteria) this;
        }

        public Criteria andWkeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("wkeywords >=", value, "wkeywords");
            return (Criteria) this;
        }

        public Criteria andWkeywordsLessThan(String value) {
            addCriterion("wkeywords <", value, "wkeywords");
            return (Criteria) this;
        }

        public Criteria andWkeywordsLessThanOrEqualTo(String value) {
            addCriterion("wkeywords <=", value, "wkeywords");
            return (Criteria) this;
        }

        public Criteria andWkeywordsLike(String value) {
            addCriterion("wkeywords like", value, "wkeywords");
            return (Criteria) this;
        }

        public Criteria andWkeywordsNotLike(String value) {
            addCriterion("wkeywords not like", value, "wkeywords");
            return (Criteria) this;
        }

        public Criteria andWkeywordsIn(List<String> values) {
            addCriterion("wkeywords in", values, "wkeywords");
            return (Criteria) this;
        }

        public Criteria andWkeywordsNotIn(List<String> values) {
            addCriterion("wkeywords not in", values, "wkeywords");
            return (Criteria) this;
        }

        public Criteria andWkeywordsBetween(String value1, String value2) {
            addCriterion("wkeywords between", value1, value2, "wkeywords");
            return (Criteria) this;
        }

        public Criteria andWkeywordsNotBetween(String value1, String value2) {
            addCriterion("wkeywords not between", value1, value2, "wkeywords");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoIsNull() {
            addCriterion("wzhaiyao is null");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoIsNotNull() {
            addCriterion("wzhaiyao is not null");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoEqualTo(String value) {
            addCriterion("wzhaiyao =", value, "wzhaiyao");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoNotEqualTo(String value) {
            addCriterion("wzhaiyao <>", value, "wzhaiyao");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoGreaterThan(String value) {
            addCriterion("wzhaiyao >", value, "wzhaiyao");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoGreaterThanOrEqualTo(String value) {
            addCriterion("wzhaiyao >=", value, "wzhaiyao");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoLessThan(String value) {
            addCriterion("wzhaiyao <", value, "wzhaiyao");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoLessThanOrEqualTo(String value) {
            addCriterion("wzhaiyao <=", value, "wzhaiyao");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoLike(String value) {
            addCriterion("wzhaiyao like", value, "wzhaiyao");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoNotLike(String value) {
            addCriterion("wzhaiyao not like", value, "wzhaiyao");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoIn(List<String> values) {
            addCriterion("wzhaiyao in", values, "wzhaiyao");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoNotIn(List<String> values) {
            addCriterion("wzhaiyao not in", values, "wzhaiyao");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoBetween(String value1, String value2) {
            addCriterion("wzhaiyao between", value1, value2, "wzhaiyao");
            return (Criteria) this;
        }

        public Criteria andWzhaiyaoNotBetween(String value1, String value2) {
            addCriterion("wzhaiyao not between", value1, value2, "wzhaiyao");
            return (Criteria) this;
        }

        public Criteria andWzuozheIsNull() {
            addCriterion("wzuozhe is null");
            return (Criteria) this;
        }

        public Criteria andWzuozheIsNotNull() {
            addCriterion("wzuozhe is not null");
            return (Criteria) this;
        }

        public Criteria andWzuozheEqualTo(String value) {
            addCriterion("wzuozhe =", value, "wzuozhe");
            return (Criteria) this;
        }

        public Criteria andWzuozheNotEqualTo(String value) {
            addCriterion("wzuozhe <>", value, "wzuozhe");
            return (Criteria) this;
        }

        public Criteria andWzuozheGreaterThan(String value) {
            addCriterion("wzuozhe >", value, "wzuozhe");
            return (Criteria) this;
        }

        public Criteria andWzuozheGreaterThanOrEqualTo(String value) {
            addCriterion("wzuozhe >=", value, "wzuozhe");
            return (Criteria) this;
        }

        public Criteria andWzuozheLessThan(String value) {
            addCriterion("wzuozhe <", value, "wzuozhe");
            return (Criteria) this;
        }

        public Criteria andWzuozheLessThanOrEqualTo(String value) {
            addCriterion("wzuozhe <=", value, "wzuozhe");
            return (Criteria) this;
        }

        public Criteria andWzuozheLike(String value) {
            addCriterion("wzuozhe like", value, "wzuozhe");
            return (Criteria) this;
        }

        public Criteria andWzuozheNotLike(String value) {
            addCriterion("wzuozhe not like", value, "wzuozhe");
            return (Criteria) this;
        }

        public Criteria andWzuozheIn(List<String> values) {
            addCriterion("wzuozhe in", values, "wzuozhe");
            return (Criteria) this;
        }

        public Criteria andWzuozheNotIn(List<String> values) {
            addCriterion("wzuozhe not in", values, "wzuozhe");
            return (Criteria) this;
        }

        public Criteria andWzuozheBetween(String value1, String value2) {
            addCriterion("wzuozhe between", value1, value2, "wzuozhe");
            return (Criteria) this;
        }

        public Criteria andWzuozheNotBetween(String value1, String value2) {
            addCriterion("wzuozhe not between", value1, value2, "wzuozhe");
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