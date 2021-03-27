package com.vanguard.zuulFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PreFilter extends ZuulFilter{

	private Logger logger = LoggerFactory.getLogger(PreFilter.class);
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		HttpServletRequest req=RequestContext.getCurrentContext().getRequest();
		logger.info("abc");
		logger.info("request -> {} request uri -> {} request url -> {}",req, req.getRequestURI(),req.getRequestURL());
		return null;
	}

	@Override
	public String filterType() {
		return "filter";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
