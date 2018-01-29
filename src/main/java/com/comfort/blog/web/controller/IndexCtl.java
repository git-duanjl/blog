package com.comfort.blog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.comfort.blog.Entity.index.IndexE;
import com.comfort.blog.service.index.IndexS;
import com.comfort.blog.util.IndexSession;
import com.comfort.blog.util.UiEnum;

@Controller
@RequestMapping("/")
@SessionAttributes(value="index", types = IndexE.class)
public class IndexCtl {
	
	@Autowired
	private IndexSession indexSession;
	@Autowired
	private IndexS indexs;
	
	@RequestMapping("")
	public String index(ModelMap model) {
		model.addAttribute("hi", "Welcome to the family program.");
		return UiEnum.LOGIN_PAGE.getUi();
	}
	
	@RequestMapping("/login")
	public String login(ModelMap model, IndexE entity) {
		boolean result=indexs.login(entity);
		if(result) {
			indexSession.setSession(entity, model);
			model.addAttribute("message","Login success.");
			return UiEnum.INDEX_PAGE.getUi();
		}else {
			model.addAttribute("message", "Login failure");
			return UiEnum.LOGIN_PAGE.getUi();
		}
	}
	
	@RequestMapping("/register")
	public String register(ModelMap model, IndexE entity) {
		boolean result =indexs.register(entity);
		if(result) {
			model.addAttribute("message", "Register success");
			return UiEnum.LOGIN_PAGE.getUi();
		}else {
			model.addAttribute("message", "Login failure");
			return UiEnum.LOGIN_PAGE.getUi();
		}
	}
	
}
