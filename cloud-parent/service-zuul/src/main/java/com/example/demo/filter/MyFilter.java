package com.example.demo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
/**
 * zuul不仅只是路由，并且还能过滤，做一些安全验证
 * @author Lenovo
 *
 *filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下： 
	pre：路由之前
	routing：路由之时
	post： 路由之后
	error：发送错误调用
	filterOrder：过滤的顺序
	shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
	run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
 */
@Component
public class MyFilter extends ZuulFilter{

	private static Logger log = LoggerFactory.getLogger(MyFilter.class);
	/**
	 * run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
	 */
	@Override
	public Object run() {
		System.out.println("=========run============");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		System.out.println("=========shouldFilter============");
		return true;
	}

	@Override
	public int filterOrder() {
		System.out.println("=========filterOrder============");
		return 0;
	}

	@Override
	public String filterType() {
		System.out.println("=========filterType============");
		return null;
	}
}
