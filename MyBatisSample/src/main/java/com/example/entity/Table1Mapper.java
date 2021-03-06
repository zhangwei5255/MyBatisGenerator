package com.example.entity;

import com.example.entity.Table1;
import com.example.entity.Table1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Table1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    long countByExample(Table1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int deleteByExample(Table1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int deleteByPrimaryKey(Integer field1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int insert(Table1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int insertSelective(Table1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    List<Table1> selectByExample(Table1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    Table1 selectByPrimaryKey(Integer field1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int updateByExampleSelective(@Param("record") Table1 record, @Param("example") Table1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int updateByExample(@Param("record") Table1 record, @Param("example") Table1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int updateByPrimaryKeySelective(Table1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table1
     *
     * @mbg.generated Fri Mar 24 17:36:23 JST 2017
     */
    int updateByPrimaryKey(Table1 record);
}