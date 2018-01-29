package com.comfort.blog.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.comfort.blog.Entity.index.IndexE;


@Component
@WebFilter(filterName = "VerifyFilter", urlPatterns = "*")
@SessionAttributes(value="index", types = IndexE.class)
public class VerifyFilter implements Filter{

	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
