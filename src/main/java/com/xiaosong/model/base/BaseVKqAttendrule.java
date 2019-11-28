package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseVKqAttendrule<M extends BaseVKqAttendrule<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setCompanyID(java.lang.Long companyID) {
		set("companyID", companyID);
		return (M)this;
	}
	
	public java.lang.Long getCompanyID() {
		return getLong("companyID");
	}

	public M setOrgCode(java.lang.String orgCode) {
		set("orgCode", orgCode);
		return (M)this;
	}
	
	public java.lang.String getOrgCode() {
		return getStr("orgCode");
	}

	public M setPunchCount(java.lang.Integer punchCount) {
		set("punchCount", punchCount);
		return (M)this;
	}
	
	public java.lang.Integer getPunchCount() {
		return getInt("punchCount");
	}

	public M setMornTime(java.lang.String mornTime) {
		set("mornTime", mornTime);
		return (M)this;
	}
	
	public java.lang.String getMornTime() {
		return getStr("mornTime");
	}

	public M setMornOffTime(java.lang.String mornOffTime) {
		set("mornOffTime", mornOffTime);
		return (M)this;
	}
	
	public java.lang.String getMornOffTime() {
		return getStr("mornOffTime");
	}

	public M setAfterTime(java.lang.String afterTime) {
		set("afterTime", afterTime);
		return (M)this;
	}
	
	public java.lang.String getAfterTime() {
		return getStr("afterTime");
	}

	public M setAfterOffTime(java.lang.String afterOffTime) {
		set("afterOffTime", afterOffTime);
		return (M)this;
	}
	
	public java.lang.String getAfterOffTime() {
		return getStr("afterOffTime");
	}

	public M setMiniOverTime(java.lang.String miniOverTime) {
		set("miniOverTime", miniOverTime);
		return (M)this;
	}
	
	public java.lang.String getMiniOverTime() {
		return getStr("miniOverTime");
	}

	public M setLateTime(java.lang.String lateTime) {
		set("lateTime", lateTime);
		return (M)this;
	}
	
	public java.lang.String getLateTime() {
		return getStr("lateTime");
	}

	public M setAttendNote(java.lang.String attendNote) {
		set("attendNote", attendNote);
		return (M)this;
	}
	
	public java.lang.String getAttendNote() {
		return getStr("attendNote");
	}

	public M setOperTime(java.lang.String operTime) {
		set("operTime", operTime);
		return (M)this;
	}
	
	public java.lang.String getOperTime() {
		return getStr("operTime");
	}

	public M setWorkHours(java.lang.String workHours) {
		set("workHours", workHours);
		return (M)this;
	}
	
	public java.lang.String getWorkHours() {
		return getStr("workHours");
	}

	public M setWorkOverTime(java.lang.String workOverTime) {
		set("workOverTime", workOverTime);
		return (M)this;
	}
	
	public java.lang.String getWorkOverTime() {
		return getStr("workOverTime");
	}

	public M setHolidayHours(java.lang.String holidayHours) {
		set("holidayHours", holidayHours);
		return (M)this;
	}
	
	public java.lang.String getHolidayHours() {
		return getStr("holidayHours");
	}

	public M setHolidayOverTime(java.lang.String holidayOverTime) {
		set("holidayOverTime", holidayOverTime);
		return (M)this;
	}
	
	public java.lang.String getHolidayOverTime() {
		return getStr("holidayOverTime");
	}

	public M setExt1(java.lang.String ext1) {
		set("ext1", ext1);
		return (M)this;
	}
	
	public java.lang.String getExt1() {
		return getStr("ext1");
	}

	public M setExt2(java.lang.String ext2) {
		set("ext2", ext2);
		return (M)this;
	}
	
	public java.lang.String getExt2() {
		return getStr("ext2");
	}

	public M setExt3(java.lang.String ext3) {
		set("ext3", ext3);
		return (M)this;
	}
	
	public java.lang.String getExt3() {
		return getStr("ext3");
	}

	public M setAttendType(java.lang.String attendType) {
		set("attendType", attendType);
		return (M)this;
	}
	
	public java.lang.String getAttendType() {
		return getStr("attendType");
	}

	public M setMornCloseTime(java.lang.String mornCloseTime) {
		set("mornCloseTime", mornCloseTime);
		return (M)this;
	}
	
	public java.lang.String getMornCloseTime() {
		return getStr("mornCloseTime");
	}

	public M setAfternoonCloseTime(java.lang.String afternoonCloseTime) {
		set("afternoonCloseTime", afternoonCloseTime);
		return (M)this;
	}
	
	public java.lang.String getAfternoonCloseTime() {
		return getStr("afternoonCloseTime");
	}

}
