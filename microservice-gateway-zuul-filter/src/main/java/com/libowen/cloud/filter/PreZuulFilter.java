package com.libowen.cloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * zuul 过滤器
 *
 * @author Bowen.Li@onerway.com
 * @date 2019/7/29
 * 说明：
 */
@Slf4j
public class PreZuulFilter extends ZuulFilter {

    /**
     * 过滤器类型
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 执行顺序   数字越大越靠后
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否使用过滤器  true为确认
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * filter具体逻辑
     *
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();

        String remoteHost = request.getRemoteHost();

        log.info("请求的host:{}", remoteHost);
        return null;
    }
}
