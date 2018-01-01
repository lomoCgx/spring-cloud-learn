package com.cloudentity.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 功能：user表的映射类<br/>
 * 说明：用户信息表
 * @author 陈光兴
 * @version 创建时间：2018-1-1 14:44:24
 */
public class User implements Serializable{
		/**
		 * 序列号serialVersionUID
		 */
		private static final long serialVersionUID = -6735686514450247670L;
	
		/**
		 * 主键
		 * ID
		 **/
		private Long id;
		/**
		 * version
		 **/
		private Long version;
		/**
		 * 创建时间
		 **/
		private Date createTime;
		/**
		 * 用户帐号
		 **/
		private String userNo;
		/**
		 * 用户类型（1:超级管理员，2:普通管理员，3:用户主帐号，4:用户子帐号）
		 **/
		private String userType;
		/**
		 * 主帐号ID
		 **/
		private Long mainUserId;
		/**
		 * 登录密码
		 **/
		private String userPwd;
		/**
		 * 姓名
		 **/
		private String userName;
		/**
		 * 手机号
		 **/
		private String mobileNo;
		/**
		 * 邮箱
		 **/
		private String email;
		/**
		 * 状态(100:可用，101:不可用)
		 **/
		private Long status;
		/**
		 * 最后登录时间
		 **/
		private Date lastLoginTime;
		/**
		 * 是否更改过密码
		 **/
		private Long isChangedPwd;
		/**
		 * 连续输错密码次数
		 **/
		private Long pwdErrorCount;
		/**
		 * 最后输错密码时间
		 **/
		private Date pwdErrorTime;
		/**
		 * 备注
		 **/
		private String remark;
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public Long getId() {
			return id;
		}
		public Long getVersion() {
			return version;
		}
		public Date getCreateTime() {
			return createTime;
		}
		public String getUserNo() {
			return userNo;
		}
		public String getUserType() {
			return userType;
		}
		public Long getMainUserId() {
			return mainUserId;
		}
		public String getUserPwd() {
			return userPwd;
		}
		public String getUserName() {
			return userName;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public String getEmail() {
			return email;
		}
		public Long getStatus() {
			return status;
		}
		public Date getLastLoginTime() {
			return lastLoginTime;
		}
		public Long getIsChangedPwd() {
			return isChangedPwd;
		}
		public Long getPwdErrorCount() {
			return pwdErrorCount;
		}
		public Date getPwdErrorTime() {
			return pwdErrorTime;
		}
		public String getRemark() {
			return remark;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public void setVersion(Long version) {
			this.version = version;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public void setUserNo(String userNo) {
			this.userNo = userNo;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		public void setMainUserId(Long mainUserId) {
			this.mainUserId = mainUserId;
		}
		public void setUserPwd(String userPwd) {
			this.userPwd = userPwd;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public void setLastLoginTime(Date lastLoginTime) {
			this.lastLoginTime = lastLoginTime;
		}
		public void setIsChangedPwd(Long isChangedPwd) {
			this.isChangedPwd = isChangedPwd;
		}
		public void setPwdErrorCount(Long pwdErrorCount) {
			this.pwdErrorCount = pwdErrorCount;
		}
		public void setPwdErrorTime(Date pwdErrorTime) {
			this.pwdErrorTime = pwdErrorTime;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
	
}