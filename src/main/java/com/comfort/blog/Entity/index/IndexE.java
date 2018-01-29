package com.comfort.blog.Entity.index;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "index")
public class IndexE {
	
	@Id
	private String id;
	private String name;
	private String pwd;
	private String operator;
	private String operatorId;
	private Date cdt;
	private Date udt;
	
	public final String getId() {
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getPwd() {
		return pwd;
	}
	public final void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public final String getOperator() {
		return operator;
	}
	public final void setOperator(String operator) {
		this.operator = operator;
	}
	public final String getOperatorId() {
		return operatorId;
	}
	public final void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public final Date getCdt() {
		return cdt;
	}
	public final void setCdt(Date cdt) {
		this.cdt = cdt;
	}
	public final Date getUdt() {
		return udt;
	}
	public final void setUdt(Date udt) {
		this.udt = udt;
	}
}
