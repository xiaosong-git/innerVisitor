package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseVAppUser<M extends BaseVAppUser<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setOrgId(java.lang.Long orgId) {
		set("orgId", orgId);
		return (M)this;
	}
	
	public java.lang.Long getOrgId() {
		return getLong("orgId");
	}

	public M setRelationNo(java.lang.String relationNo) {
		set("relationNo", relationNo);
		return (M)this;
	}
	
	public java.lang.String getRelationNo() {
		return getStr("relationNo");
	}

	public M setRealName(java.lang.String realName) {
		set("realName", realName);
		return (M)this;
	}
	
	public java.lang.String getRealName() {
		return getStr("realName");
	}

	public M setNiceName(java.lang.String niceName) {
		set("niceName", niceName);
		return (M)this;
	}
	
	public java.lang.String getNiceName() {
		return getStr("niceName");
	}

	public M setLoginName(java.lang.String loginName) {
		set("loginName", loginName);
		return (M)this;
	}
	
	public java.lang.String getLoginName() {
		return getStr("loginName");
	}

	public M setIdType(java.lang.String idType) {
		set("idType", idType);
		return (M)this;
	}
	
	public java.lang.String getIdType() {
		return getStr("idType");
	}

	public M setIdNO(java.lang.String idNO) {
		set("idNO", idNO);
		return (M)this;
	}
	
	public java.lang.String getIdNO() {
		return getStr("idNO");
	}

	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
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

	public M setProvince(java.lang.String province) {
		set("province", province);
		return (M)this;
	}
	
	public java.lang.String getProvince() {
		return getStr("province");
	}

	public M setCity(java.lang.String city) {
		set("city", city);
		return (M)this;
	}
	
	public java.lang.String getCity() {
		return getStr("city");
	}

	public M setArea(java.lang.String area) {
		set("area", area);
		return (M)this;
	}
	
	public java.lang.String getArea() {
		return getStr("area");
	}

	public M setAddr(java.lang.String addr) {
		set("addr", addr);
		return (M)this;
	}
	
	public java.lang.String getAddr() {
		return getStr("addr");
	}

	public M setIsAuth(java.lang.String isAuth) {
		set("isAuth", isAuth);
		return (M)this;
	}
	
	public java.lang.String getIsAuth() {
		return getStr("isAuth");
	}

	public M setAuthDate(java.lang.String authDate) {
		set("authDate", authDate);
		return (M)this;
	}
	
	public java.lang.String getAuthDate() {
		return getStr("authDate");
	}

	public M setAuthTime(java.lang.String authTime) {
		set("authTime", authTime);
		return (M)this;
	}
	
	public java.lang.String getAuthTime() {
		return getStr("authTime");
	}

	public M setIdFrontImgUrl(java.lang.String idFrontImgUrl) {
		set("idFrontImgUrl", idFrontImgUrl);
		return (M)this;
	}
	
	public java.lang.String getIdFrontImgUrl() {
		return getStr("idFrontImgUrl");
	}

	public M setIdOppositeImgUrl(java.lang.String idOppositeImgUrl) {
		set("idOppositeImgUrl", idOppositeImgUrl);
		return (M)this;
	}
	
	public java.lang.String getIdOppositeImgUrl() {
		return getStr("idOppositeImgUrl");
	}

	public M setIdHandleImgUrl(java.lang.String idHandleImgUrl) {
		set("idHandleImgUrl", idHandleImgUrl);
		return (M)this;
	}
	
	public java.lang.String getIdHandleImgUrl() {
		return getStr("idHandleImgUrl");
	}

	public M setBankCardImgUrl(java.lang.String bankCardImgUrl) {
		set("bankCardImgUrl", bankCardImgUrl);
		return (M)this;
	}
	
	public java.lang.String getBankCardImgUrl() {
		return getStr("bankCardImgUrl");
	}

	public M setHeadImgUrl(java.lang.String headImgUrl) {
		set("headImgUrl", headImgUrl);
		return (M)this;
	}
	
	public java.lang.String getHeadImgUrl() {
		return getStr("headImgUrl");
	}

	public M setToken(java.lang.String token) {
		set("token", token);
		return (M)this;
	}
	
	public java.lang.String getToken() {
		return getStr("token");
	}

	public M setIsSetTransPwd(java.lang.String isSetTransPwd) {
		set("isSetTransPwd", isSetTransPwd);
		return (M)this;
	}
	
	public java.lang.String getIsSetTransPwd() {
		return getStr("isSetTransPwd");
	}

	public M setQrcodeUrl(java.lang.String qrcodeUrl) {
		set("qrcodeUrl", qrcodeUrl);
		return (M)this;
	}
	
	public java.lang.String getQrcodeUrl() {
		return getStr("qrcodeUrl");
	}

	public M setCompanyId(java.lang.Long companyId) {
		set("companyId", companyId);
		return (M)this;
	}
	
	public java.lang.Long getCompanyId() {
		return getLong("companyId");
	}

	public M setRole(java.lang.String role) {
		set("role", role);
		return (M)this;
	}
	
	public java.lang.String getRole() {
		return getStr("role");
	}

	public M setWorkKey(java.lang.String workKey) {
		set("workKey", workKey);
		return (M)this;
	}
	
	public java.lang.String getWorkKey() {
		return getStr("workKey");
	}

	public M setFailReason(java.lang.String failReason) {
		set("failReason", failReason);
		return (M)this;
	}
	
	public java.lang.String getFailReason() {
		return getStr("failReason");
	}

	public M setSoleCode(java.lang.String soleCode) {
		set("soleCode", soleCode);
		return (M)this;
	}
	
	public java.lang.String getSoleCode() {
		return getStr("soleCode");
	}

	public M setValidityDate(java.lang.String validityDate) {
		set("validityDate", validityDate);
		return (M)this;
	}
	
	public java.lang.String getValidityDate() {
		return getStr("validityDate");
	}

	public M setSex(java.lang.String sex) {
		set("sex", sex);
		return (M)this;
	}
	
	public java.lang.String getSex() {
		return getStr("sex");
	}

	public M setDeviceToken(java.lang.String deviceToken) {
		set("deviceToken", deviceToken);
		return (M)this;
	}
	
	public java.lang.String getDeviceToken() {
		return getStr("deviceToken");
	}

	public M setDeviceType(java.lang.String deviceType) {
		set("deviceType", deviceType);
		return (M)this;
	}
	
	public java.lang.String getDeviceType() {
		return getStr("deviceType");
	}

	public M setIsOnlineApp(java.lang.String isOnlineApp) {
		set("isOnlineApp", isOnlineApp);
		return (M)this;
	}
	
	public java.lang.String getIsOnlineApp() {
		return getStr("isOnlineApp");
	}

	public M setWxOpenId(java.lang.String wxOpenId) {
		set("wx_open_id", wxOpenId);
		return (M)this;
	}
	
	public java.lang.String getWxOpenId() {
		return getStr("wx_open_id");
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

}
