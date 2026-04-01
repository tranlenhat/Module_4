package com.example.bai9.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LibraryLogger {
    private static int visitCount = 0;

    @Around("execution(* com.example.bai9.controller.*.*(..))")
    public Object countVisit(ProceedingJoinPoint joinPoint) {
        visitCount++;
        log.info("=== [VISIT] ===");
        log.info("Method: {}", joinPoint.getSignature().getName());
        log.info("Total visit: {}", visitCount);

        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return result;
    }
    @Around("execution(* com.example.bai9.Service.LibraryService.borrowBook(..)) || " +
            "execution(* com.example.bai9.Service.LibraryService.returnBook(..))")
    public Object logBookAction(ProceedingJoinPoint joinPoint) {
        log.info("----------------START-----------------");
        log.info("Action: {}", joinPoint.getSignature().getName());
        Object result = null;
        try {
            result = joinPoint.proceed();

            log.info("----------- SUCCESS -----------------");

            if (result instanceof String) {
                log.info("Borrow Code: {}", result);
            }
        } catch (Throwable e) {
            log.error("----------ACTION ERROR---------");
            log.error("Lỗi: {}", e.getMessage());
            throw new RuntimeException(e);
        }

        return result;
    }
}