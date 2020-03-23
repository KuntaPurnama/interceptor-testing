package com.interceptop.interceptordemo.inteceptor;

import com.interceptop.interceptordemo.exception.InvalidHeaderException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class RequestHandlerInterceptor extends HandlerInterceptorAdapter {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {

    if(StringUtils.isEmpty(request.getHeader("user-auth-key"))){
      throw new InvalidHeaderException().builder().message("Headernya salah").build();
    }
    return super.preHandle(request, response, handler);
  }

}
