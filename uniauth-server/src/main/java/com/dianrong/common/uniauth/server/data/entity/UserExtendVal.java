package com.dianrong.common.uniauth.server.data.entity;

import java.util.Date;

public class UserExtendVal extends ExtendVal {


  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * user_extend_val.user_id
   *
   * @mbggenerated Tue Sep 27 11:53:21 CST 2016
   */
  private Long userId;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * user_extend_val.tenancy_id
   *
   * @mbggenerated Tue Sep 27 11:53:21 CST 2016
   */
  private Long tenancyId;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column user_extend_val.create_date
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  private Date createDate;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column user_extend_val.last_update
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  private Date lastUpdate;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column user_extend_val.user_id
   *
   * @return the value of user_extend_val.user_id
   * @mbggenerated Tue Sep 27 11:53:21 CST 2016
   */
  public Long getUserId() {
    return userId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column user_extend_val.user_id
   *
   * @param userId the value for user_extend_val.user_id
   * @mbggenerated Tue Sep 27 11:53:21 CST 2016
   */
  public void setUserId(Long userId) {
    this.userId = userId;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column user_extend_val.tenancy_id
   *
   * @return the value of user_extend_val.tenancy_id
   * @mbggenerated Tue Sep 27 11:53:21 CST 2016
   */
  public Long getTenancyId() {
    return tenancyId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column user_extend_val.tenancy_id
   *
   * @param tenancyId the value for user_extend_val.tenancy_id
   * @mbggenerated Tue Sep 27 11:53:21 CST 2016
   */
  public void setTenancyId(Long tenancyId) {
    this.tenancyId = tenancyId;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }
}
