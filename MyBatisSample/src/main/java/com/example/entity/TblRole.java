package com.example.entity;

import java.io.Serializable;

public class TblRole implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_role.role_id
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private String roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_role.role_name
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_role
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_role.role_id
     *
     * @return the value of tbl_role.role_id
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_role.role_id
     *
     * @param roleId the value for tbl_role.role_id
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_role.role_name
     *
     * @return the value of tbl_role.role_name
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_role.role_name
     *
     * @param roleName the value for tbl_role.role_name
     *
     * @mbg.generated Fri Mar 24 17:38:11 JST 2017
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}