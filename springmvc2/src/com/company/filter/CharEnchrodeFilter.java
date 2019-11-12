package com.company.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @category 过滤器
 */
@WebFilter("/*")
public class CharEnchrodeFilter implements Filter {

    public CharEnchrodeFilter() {
        
    }

	public void destroy() {
		System.out.println("字符集过滤器的销毁");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("进入字符集的过滤器");
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		chain.doFilter(req, res);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("字符集过滤器的创建");
	}

}
