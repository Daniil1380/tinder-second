package de.telran.tindersecond;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
    public class MyFirstAspect {

        //@Pointcut("execution(* de.telran.tindersecond..* (..) )")
        @Pointcut("@annotation(org.springframework.transaction.annotation.Transactional)")
        public void method() {}

        @Before("method()")
        public void doSomething() {
            System.out.println("Now you are using old method");
            //тут может создаваться транзакция
        }

        //@After("method()")
        //public void doSomethingSecond() {
        //    System.out.println("Transaction is closed");
        //    //тут она может закрываться
        //}

}
