package com.example.entity;

import com.example.entity.TblLession;
import com.example.entity.TblLessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblLessionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lession
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    long countByExample(TblLessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lession
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int deleteByExample(TblLessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lession
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int deleteByPrimaryKey(String lessionNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lession
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int insert(TblLession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lession
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int insertSelective(TblLession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lession
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    List<TblLession> selectByExample(TblLessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lession
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    TblLession selectByPrimaryKey(String lessionNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lession
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int updateByExampleSelective(@Param("record") TblLession record, @Param("example") TblLessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lession
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int updateByExample(@Param("record") TblLession record, @Param("example") TblLessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lession
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int updateByPrimaryKeySelective(TblLession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lession
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int updateByPrimaryKey(TblLession record);
}