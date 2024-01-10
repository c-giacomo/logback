package com.logbakk.audit;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j(topic = "test-topic")
@Component
public class TestAudit {
	
	@AfterReturning(pointcut="execution(* com.logbakk.resources.HelloResource.print(..))", returning="retVal")
	public Object log(JoinPoint joinPoint, Object retVal) throws Throwable {
		log.info("mi piace la pucchiacca");
		return null;
	}

}
