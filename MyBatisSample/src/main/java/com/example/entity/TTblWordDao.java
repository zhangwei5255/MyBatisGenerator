package com.example.entity;

import com.example.entity.TTblWord;
import com.example.entity.TTblWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTblWordDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    long countByExample(TTblWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int deleteByExample(TTblWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int deleteByPrimaryKey(String wordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int insert(TTblWord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int insertSelective(TTblWord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    List<TTblWord> selectByExample(TTblWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    TTblWord selectByPrimaryKey(String wordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int updateByExampleSelective(@Param("record") TTblWord record, @Param("example") TTblWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int updateByExample(@Param("record") TTblWord record, @Param("example") TTblWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int updateByPrimaryKeySelective(TTblWord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tbl_word
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    int updateByPrimaryKey(TTblWord record);
}