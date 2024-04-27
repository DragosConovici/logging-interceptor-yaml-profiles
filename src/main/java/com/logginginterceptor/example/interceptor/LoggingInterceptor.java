package com.logginginterceptor.example.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoggingInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);

        // Log request info
        logger.info("Request Method: {}", request.getMethod());
        logger.info("Request URI: {}", request.getRequestURI());

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        long startTime = (Long) request.getAttribute("startTime");
        logger.info("Time taken to process request: {} ms", (System.currentTimeMillis() - startTime));

        // Log response info
        logger.info("Response Status: {}", response.getStatus());
        logger.info("------------------------------------------");
    }
}