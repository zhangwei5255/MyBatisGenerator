package com.example.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class TblUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.user_id
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.password
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.user_name
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.katakana
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private String katakana;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.email
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.tel_phone
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private String telPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.birthDay
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private Calendar birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.sex
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.addresse
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private String addresse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.post_no
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private String postNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.reg_time
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private Calendar regTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.last_upd_time
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private Calendar lastUpdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_user
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.user_id
     *
     * @return the value of tbl_user.user_id
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.user_id
     *
     * @param userId the value for tbl_user.user_id
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.password
     *
     * @return the value of tbl_user.password
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.password
     *
     * @param password the value for tbl_user.password
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.user_name
     *
     * @return the value of tbl_user.user_name
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.user_name
     *
     * @param userName the value for tbl_user.user_name
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.katakana
     *
     * @return the value of tbl_user.katakana
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public String getKatakana() {
        return katakana;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.katakana
     *
     * @param katakana the value for tbl_user.katakana
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setKatakana(String katakana) {
        this.katakana = katakana;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.email
     *
     * @return the value of tbl_user.email
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.email
     *
     * @param email the value for tbl_user.email
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.tel_phone
     *
     * @return the value of tbl_user.tel_phone
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public String getTelPhone() {
        return telPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.tel_phone
     *
     * @param telPhone the value for tbl_user.tel_phone
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.birthDay
     *
     * @return the value of tbl_user.birthDay
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public Calendar getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.birthDay
     *
     * @param birthday the value for tbl_user.birthDay
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.sex
     *
     * @return the value of tbl_user.sex
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.sex
     *
     * @param sex the value for tbl_user.sex
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.addresse
     *
     * @return the value of tbl_user.addresse
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public String getAddresse() {
        return addresse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.addresse
     *
     * @param addresse the value for tbl_user.addresse
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.post_no
     *
     * @return the value of tbl_user.post_no
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public String getPostNo() {
        return postNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.post_no
     *
     * @param postNo the value for tbl_user.post_no
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setPostNo(String postNo) {
        this.postNo = postNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.reg_time
     *
     * @return the value of tbl_user.reg_time
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public Calendar getRegTime() {
        return regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.reg_time
     *
     * @param regTime the value for tbl_user.reg_time
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setRegTime(Calendar regTime) {
        this.regTime = regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.last_upd_time
     *
     * @return the value of tbl_user.last_upd_time
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public Calendar getLastUpdTime() {
        return lastUpdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.last_upd_time
     *
     * @param lastUpdTime the value for tbl_user.last_upd_time
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setLastUpdTime(Calendar lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }
}