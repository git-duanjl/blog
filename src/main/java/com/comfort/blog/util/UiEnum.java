package com.comfort.blog.util;

public enum UiEnum {
	INDEX_PAGE("index"),
	LOGIN_PAGE("login"),
	REGISTER_PAGE("register") 
	;
	
	UiEnum(String ui){
		this.ui = ui;
	}
	private final String ui;
	
	public final String getUi() {
		return ui;
	}
}
