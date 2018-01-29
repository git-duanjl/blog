package com.comfort.blog.util;



import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.comfort.blog.Entity.index.IndexE;

@Component
@SessionAttributes(value= "{index}", types=IndexE.class)
public class IndexSession {
	

	public void setSession(IndexE entity, ModelMap model) {
		model.put("index", entity);
	}
	
	public IndexE getSession(@ModelAttribute("index") IndexE entity) {
		return entity;
	}
	
	
}
