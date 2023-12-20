package de.telran.tindersecond;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyFirstAspect {

    @Pointcut("execution(public void de.telran.tindersecond.service.impl.RatingServiceImpl.shareRating(Long, Long, Integer))")
    public void method() {}

    @Before("method()")
    public void doSomething() {
        System.out.println("Aspect is working, this is method shareRating");
    }

}
