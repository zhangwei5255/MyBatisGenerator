package com.example.entity;

import java.io.Serializable;

public class Table1 implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table1.field1
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private Integer field1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table1.field2
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private Integer field2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table table1
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table1.field1
     *
     * @return the value of table1.field1
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public Integer getField1() {
        return field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table1.field1
     *
     * @param field1 the value for table1.field1
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setField1(Integer field1) {
        this.field1 = field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table1.field2
     *
     * @return the value of table1.field2
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public Integer getField2() {
        return field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table1.field2
     *
     * @param field2 the value for table1.field2
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setField2(Integer field2) {
        this.field2 = field2;
    }
}