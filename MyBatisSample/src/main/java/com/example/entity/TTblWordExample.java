package com.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TTblWordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public TTblWordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
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

        public Criteria andWordIdIsNull() {
            addCriterion("word_id is null");
            return (Criteria) this;
        }

        public Criteria andWordIdIsNotNull() {
            addCriterion("word_id is not null");
            return (Criteria) this;
        }

        public Criteria andWordIdEqualTo(String value) {
            addCriterion("word_id =", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotEqualTo(String value) {
            addCriterion("word_id <>", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdGreaterThan(String value) {
            addCriterion("word_id >", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdGreaterThanOrEqualTo(String value) {
            addCriterion("word_id >=", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdLessThan(String value) {
            addCriterion("word_id <", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdLessThanOrEqualTo(String value) {
            addCriterion("word_id <=", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdLike(String value) {
            addCriterion("word_id like", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotLike(String value) {
            addCriterion("word_id not like", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdIn(List<String> values) {
            addCriterion("word_id in", values, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotIn(List<String> values) {
            addCriterion("word_id not in", values, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdBetween(String value1, String value2) {
            addCriterion("word_id between", value1, value2, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotBetween(String value1, String value2) {
            addCriterion("word_id not between", value1, value2, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordNameIsNull() {
            addCriterion("word_name is null");
            return (Criteria) this;
        }

        public Criteria andWordNameIsNotNull() {
            addCriterion("word_name is not null");
            return (Criteria) this;
        }

        public Criteria andWordNameEqualTo(String value) {
            addCriterion("word_name =", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameNotEqualTo(String value) {
            addCriterion("word_name <>", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameGreaterThan(String value) {
            addCriterion("word_name >", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameGreaterThanOrEqualTo(String value) {
            addCriterion("word_name >=", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameLessThan(String value) {
            addCriterion("word_name <", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameLessThanOrEqualTo(String value) {
            addCriterion("word_name <=", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameLike(String value) {
            addCriterion("word_name like", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameNotLike(String value) {
            addCriterion("word_name not like", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameIn(List<String> values) {
            addCriterion("word_name in", values, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameNotIn(List<String> values) {
            addCriterion("word_name not in", values, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameBetween(String value1, String value2) {
            addCriterion("word_name between", value1, value2, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameNotBetween(String value1, String value2) {
            addCriterion("word_name not between", value1, value2, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningIsNull() {
            addCriterion("word_china_meaning is null");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningIsNotNull() {
            addCriterion("word_china_meaning is not null");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningEqualTo(String value) {
            addCriterion("word_china_meaning =", value, "wordChinaMeaning");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningNotEqualTo(String value) {
            addCriterion("word_china_meaning <>", value, "wordChinaMeaning");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningGreaterThan(String value) {
            addCriterion("word_china_meaning >", value, "wordChinaMeaning");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningGreaterThanOrEqualTo(String value) {
            addCriterion("word_china_meaning >=", value, "wordChinaMeaning");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningLessThan(String value) {
            addCriterion("word_china_meaning <", value, "wordChinaMeaning");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningLessThanOrEqualTo(String value) {
            addCriterion("word_china_meaning <=", value, "wordChinaMeaning");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningLike(String value) {
            addCriterion("word_china_meaning like", value, "wordChinaMeaning");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningNotLike(String value) {
            addCriterion("word_china_meaning not like", value, "wordChinaMeaning");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningIn(List<String> values) {
            addCriterion("word_china_meaning in", values, "wordChinaMeaning");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningNotIn(List<String> values) {
            addCriterion("word_china_meaning not in", values, "wordChinaMeaning");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningBetween(String value1, String value2) {
            addCriterion("word_china_meaning between", value1, value2, "wordChinaMeaning");
            return (Criteria) this;
        }

        public Criteria andWordChinaMeaningNotBetween(String value1, String value2) {
            addCriterion("word_china_meaning not between", value1, value2, "wordChinaMeaning");
            return (Criteria) this;
        }

        public Criteria andWordKanaIsNull() {
            addCriterion("word_kana is null");
            return (Criteria) this;
        }

        public Criteria andWordKanaIsNotNull() {
            addCriterion("word_kana is not null");
            return (Criteria) this;
        }

        public Criteria andWordKanaEqualTo(String value) {
            addCriterion("word_kana =", value, "wordKana");
            return (Criteria) this;
        }

        public Criteria andWordKanaNotEqualTo(String value) {
            addCriterion("word_kana <>", value, "wordKana");
            return (Criteria) this;
        }

        public Criteria andWordKanaGreaterThan(String value) {
            addCriterion("word_kana >", value, "wordKana");
            return (Criteria) this;
        }

        public Criteria andWordKanaGreaterThanOrEqualTo(String value) {
            addCriterion("word_kana >=", value, "wordKana");
            return (Criteria) this;
        }

        public Criteria andWordKanaLessThan(String value) {
            addCriterion("word_kana <", value, "wordKana");
            return (Criteria) this;
        }

        public Criteria andWordKanaLessThanOrEqualTo(String value) {
            addCriterion("word_kana <=", value, "wordKana");
            return (Criteria) this;
        }

        public Criteria andWordKanaLike(String value) {
            addCriterion("word_kana like", value, "wordKana");
            return (Criteria) this;
        }

        public Criteria andWordKanaNotLike(String value) {
            addCriterion("word_kana not like", value, "wordKana");
            return (Criteria) this;
        }

        public Criteria andWordKanaIn(List<String> values) {
            addCriterion("word_kana in", values, "wordKana");
            return (Criteria) this;
        }

        public Criteria andWordKanaNotIn(List<String> values) {
            addCriterion("word_kana not in", values, "wordKana");
            return (Criteria) this;
        }

        public Criteria andWordKanaBetween(String value1, String value2) {
            addCriterion("word_kana between", value1, value2, "wordKana");
            return (Criteria) this;
        }

        public Criteria andWordKanaNotBetween(String value1, String value2) {
            addCriterion("word_kana not between", value1, value2, "wordKana");
            return (Criteria) this;
        }

        public Criteria andWordKindIdIsNull() {
            addCriterion("word_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andWordKindIdIsNotNull() {
            addCriterion("word_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andWordKindIdEqualTo(String value) {
            addCriterion("word_kind_id =", value, "wordKindId");
            return (Criteria) this;
        }

        public Criteria andWordKindIdNotEqualTo(String value) {
            addCriterion("word_kind_id <>", value, "wordKindId");
            return (Criteria) this;
        }

        public Criteria andWordKindIdGreaterThan(String value) {
            addCriterion("word_kind_id >", value, "wordKindId");
            return (Criteria) this;
        }

        public Criteria andWordKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("word_kind_id >=", value, "wordKindId");
            return (Criteria) this;
        }

        public Criteria andWordKindIdLessThan(String value) {
            addCriterion("word_kind_id <", value, "wordKindId");
            return (Criteria) this;
        }

        public Criteria andWordKindIdLessThanOrEqualTo(String value) {
            addCriterion("word_kind_id <=", value, "wordKindId");
            return (Criteria) this;
        }

        public Criteria andWordKindIdLike(String value) {
            addCriterion("word_kind_id like", value, "wordKindId");
            return (Criteria) this;
        }

        public Criteria andWordKindIdNotLike(String value) {
            addCriterion("word_kind_id not like", value, "wordKindId");
            return (Criteria) this;
        }

        public Criteria andWordKindIdIn(List<String> values) {
            addCriterion("word_kind_id in", values, "wordKindId");
            return (Criteria) this;
        }

        public Criteria andWordKindIdNotIn(List<String> values) {
            addCriterion("word_kind_id not in", values, "wordKindId");
            return (Criteria) this;
        }

        public Criteria andWordKindIdBetween(String value1, String value2) {
            addCriterion("word_kind_id between", value1, value2, "wordKindId");
            return (Criteria) this;
        }

        public Criteria andWordKindIdNotBetween(String value1, String value2) {
            addCriterion("word_kind_id not between", value1, value2, "wordKindId");
            return (Criteria) this;
        }

        public Criteria andWordRemarksIsNull() {
            addCriterion("word_remarks is null");
            return (Criteria) this;
        }

        public Criteria andWordRemarksIsNotNull() {
            addCriterion("word_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andWordRemarksEqualTo(String value) {
            addCriterion("word_remarks =", value, "wordRemarks");
            return (Criteria) this;
        }

        public Criteria andWordRemarksNotEqualTo(String value) {
            addCriterion("word_remarks <>", value, "wordRemarks");
            return (Criteria) this;
        }

        public Criteria andWordRemarksGreaterThan(String value) {
            addCriterion("word_remarks >", value, "wordRemarks");
            return (Criteria) this;
        }

        public Criteria andWordRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("word_remarks >=", value, "wordRemarks");
            return (Criteria) this;
        }

        public Criteria andWordRemarksLessThan(String value) {
            addCriterion("word_remarks <", value, "wordRemarks");
            return (Criteria) this;
        }

        public Criteria andWordRemarksLessThanOrEqualTo(String value) {
            addCriterion("word_remarks <=", value, "wordRemarks");
            return (Criteria) this;
        }

        public Criteria andWordRemarksLike(String value) {
            addCriterion("word_remarks like", value, "wordRemarks");
            return (Criteria) this;
        }

        public Criteria andWordRemarksNotLike(String value) {
            addCriterion("word_remarks not like", value, "wordRemarks");
            return (Criteria) this;
        }

        public Criteria andWordRemarksIn(List<String> values) {
            addCriterion("word_remarks in", values, "wordRemarks");
            return (Criteria) this;
        }

        public Criteria andWordRemarksNotIn(List<String> values) {
            addCriterion("word_remarks not in", values, "wordRemarks");
            return (Criteria) this;
        }

        public Criteria andWordRemarksBetween(String value1, String value2) {
            addCriterion("word_remarks between", value1, value2, "wordRemarks");
            return (Criteria) this;
        }

        public Criteria andWordRemarksNotBetween(String value1, String value2) {
            addCriterion("word_remarks not between", value1, value2, "wordRemarks");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgIsNull() {
            addCriterion("word_del_flg is null");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgIsNotNull() {
            addCriterion("word_del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgEqualTo(String value) {
            addCriterion("word_del_flg =", value, "wordDelFlg");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgNotEqualTo(String value) {
            addCriterion("word_del_flg <>", value, "wordDelFlg");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgGreaterThan(String value) {
            addCriterion("word_del_flg >", value, "wordDelFlg");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("word_del_flg >=", value, "wordDelFlg");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgLessThan(String value) {
            addCriterion("word_del_flg <", value, "wordDelFlg");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgLessThanOrEqualTo(String value) {
            addCriterion("word_del_flg <=", value, "wordDelFlg");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgLike(String value) {
            addCriterion("word_del_flg like", value, "wordDelFlg");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgNotLike(String value) {
            addCriterion("word_del_flg not like", value, "wordDelFlg");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgIn(List<String> values) {
            addCriterion("word_del_flg in", values, "wordDelFlg");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgNotIn(List<String> values) {
            addCriterion("word_del_flg not in", values, "wordDelFlg");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgBetween(String value1, String value2) {
            addCriterion("word_del_flg between", value1, value2, "wordDelFlg");
            return (Criteria) this;
        }

        public Criteria andWordDelFlgNotBetween(String value1, String value2) {
            addCriterion("word_del_flg not between", value1, value2, "wordDelFlg");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdIsNull() {
            addCriterion("upd_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdIsNotNull() {
            addCriterion("upd_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdEqualTo(String value) {
            addCriterion("upd_user_id =", value, "updUserId");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdNotEqualTo(String value) {
            addCriterion("upd_user_id <>", value, "updUserId");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdGreaterThan(String value) {
            addCriterion("upd_user_id >", value, "updUserId");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("upd_user_id >=", value, "updUserId");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdLessThan(String value) {
            addCriterion("upd_user_id <", value, "updUserId");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdLessThanOrEqualTo(String value) {
            addCriterion("upd_user_id <=", value, "updUserId");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdLike(String value) {
            addCriterion("upd_user_id like", value, "updUserId");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdNotLike(String value) {
            addCriterion("upd_user_id not like", value, "updUserId");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdIn(List<String> values) {
            addCriterion("upd_user_id in", values, "updUserId");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdNotIn(List<String> values) {
            addCriterion("upd_user_id not in", values, "updUserId");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdBetween(String value1, String value2) {
            addCriterion("upd_user_id between", value1, value2, "updUserId");
            return (Criteria) this;
        }

        public Criteria andUpdUserIdNotBetween(String value1, String value2) {
            addCriterion("upd_user_id not between", value1, value2, "updUserId");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("upd_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("upd_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Date value) {
            addCriterion("upd_time =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Date value) {
            addCriterion("upd_time <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Date value) {
            addCriterion("upd_time >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_time >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Date value) {
            addCriterion("upd_time <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("upd_time <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Date> values) {
            addCriterion("upd_time in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Date> values) {
            addCriterion("upd_time not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Date value1, Date value2) {
            addCriterion("upd_time between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("upd_time not between", value1, value2, "updTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_tbl_word
     *
     * @mbg.generated do_not_delete_during_merge Fri Mar 24 17:38:11 JST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
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