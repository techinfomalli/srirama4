package com.example.demo;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter{
	
	//private java.util.logging.Logger logger LoggerFactory.getLogger(this.getClass());


	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		
//		HttpServletRequest request =RequestContext.getCurrentContext().getRequest();
//		System.out.println("ram   ram       ............)))))))))))))");
		
		//logger.info("request-->{} uri-->{}",request,request.getRequestURI());
		//logger.info("request-->{} uri-->{}");
		
		for(int i =0;i<25;i++)
			System.out.println(i);
		Date d = new Date();
		System.out.println(d);
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1 ;
	}

}
