package com.example.entity;

import com.example.entity.TblUser;
import com.example.entity.TblUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblUserDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    long countByExample(TblUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int deleteByExample(TblUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int insert(TblUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int insertSelective(TblUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    List<TblUser> selectByExample(TblUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    TblUser selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int updateByExampleSelective(@Param("record") TblUser record, @Param("example") TblUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int updateByExample(@Param("record") TblUser record, @Param("example") TblUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int updateByPrimaryKeySelective(TblUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int updateByPrimaryKey(TblUser record);
}