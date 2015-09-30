package com.nearsoft.workshops.springmvc.web.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// NOTE: HandlerInterceptorAdapter implements HandlerInterceptor at some point
public class TestInterceptor extends HandlerInterceptorAdapter {
   private static final Logger LOGGER = LoggerFactory.getLogger(TestInterceptor.class);

   @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      LOGGER.debug("### -> preHandle ###");
      return super.preHandle(request, response, handler);
   }

   @Override
   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
      LOGGER.debug("### -> postHandle ###");
      super.postHandle(request, response, handler, modelAndView);
   }

   @Override
   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
      LOGGER.debug("### -> afterCompletion ###");
      super.afterCompletion(request, response, handler, ex);
   }

   @Override
   public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      LOGGER.debug("### -> afterConcurrentHandlingStarted ###");
      super.afterConcurrentHandlingStarted(request, response, handler);
   }
}
