package com.example.entity;

import com.example.entity.TblBook;
import com.example.entity.TblBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblBookDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    long countByExample(TblBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int deleteByExample(TblBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int insert(TblBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int insertSelective(TblBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    List<TblBook> selectByExample(TblBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int updateByExampleSelective(@Param("record") TblBook record, @Param("example") TblBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int updateByExample(@Param("record") TblBook record, @Param("example") TblBookExample example);
}