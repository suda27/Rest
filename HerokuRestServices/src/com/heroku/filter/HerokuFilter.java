package com.heroku.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class HerokuFilter
 */
public class HerokuFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public HerokuFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		HttpServletResponse response1 = (HttpServletResponse) response;

		HttpServletRequest request1 = (HttpServletRequest) request;

		response1.setHeader("Access-Control-Allow-Origin", "*");

		response1.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");

		response1.setHeader("Access-Control-Allow-Headers", "x-requested-with");

		response1.setHeader("Access-Control-Expose-Headers", "x-requested-with");
		chain.doFilter(request, response1);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
