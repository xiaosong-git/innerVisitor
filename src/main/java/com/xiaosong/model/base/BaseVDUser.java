package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseVDUser<M extends BaseVDUser<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setCompanyId(java.lang.Long companyId) {
		set("companyId", companyId);
		return (M)this;
	}
	
	public java.lang.Long getCompanyId() {
		return getLong("companyId");
	}

	public M setSectionId(java.lang.Long sectionId) {
		set("sectionId", sectionId);
		return (M)this;
	}
	
	public java.lang.Long getSectionId() {
		return getLong("sectionId");
	}

	public M setUserId(java.lang.Long userId) {
		set("userId", userId);
		return (M)this;
	}
	
	public java.lang.Long getUserId() {
		return getLong("userId");
	}

	public M setUserName(java.lang.String userName) {
		set("userName", userName);
		return (M)this;
	}
	
	public java.lang.String getUserName() {
		return getStr("userName");
	}

	public M setCreateDate(java.lang.String createDate) {
		set("createDate", createDate);
		return (M)this;
	}
	
	public java.lang.String getCreateDate() {
		return getStr("createDate");
	}

	public M setCreateTime(java.lang.String createTime) {
		set("createTime", createTime);
		return (M)this;
	}
	
	public java.lang.String getCreateTime() {
		return getStr("createTime");
	}

	public M setRoleType(java.lang.String roleType) {
		set("roleType", roleType);
		return (M)this;
	}
	
	public java.lang.String getRoleType() {
		return getStr("roleType");
	}

	public M setStatus(java.lang.String status) {
		set("status", status);
		return (M)this;
	}
	
	public java.lang.String getStatus() {
		return getStr("status");
	}

	public M setCurrentStatus(java.lang.String currentStatus) {
		set("currentStatus", currentStatus);
		return (M)this;
	}
	
	public java.lang.String getCurrentStatus() {
		return getStr("currentStatus");
	}

	public M setPostId(java.lang.Long postId) {
		set("postId", postId);
		return (M)this;
	}
	
	public java.lang.Long getPostId() {
		return getLong("postId");
	}

	public M setApplyfailAnsaesn(java.lang.String applyfailAnsaesn) {
		set("applyfailAnsaesn", applyfailAnsaesn);
		return (M)this;
	}
	
	public java.lang.String getApplyfailAnsaesn() {
		return getStr("applyfailAnsaesn");
	}

	public M setSex(java.lang.String sex) {
		set("sex", sex);
		return (M)this;
	}
	
	public java.lang.String getSex() {
		return getStr("sex");
	}

	public M setSecucode(java.lang.String secucode) {
		set("secucode", secucode);
		return (M)this;
	}
	
	public java.lang.String getSecucode() {
		return getStr("secucode");
	}

	public M setAuthtype(java.lang.String authtype) {
		set("authtype", authtype);
		return (M)this;
	}
	
	public java.lang.String getAuthtype() {
		return getStr("authtype");
	}

	public M setExp1(java.lang.String exp1) {
		set("exp1", exp1);
		return (M)this;
	}
	
	public java.lang.String getExp1() {
		return getStr("exp1");
	}

	public M setExp2(java.lang.String exp2) {
		set("exp2", exp2);
		return (M)this;
	}
	
	public java.lang.String getExp2() {
		return getStr("exp2");
	}

	public M setExp3(java.lang.String exp3) {
		set("exp3", exp3);
		return (M)this;
	}
	
	public java.lang.String getExp3() {
		return getStr("exp3");
	}

}
