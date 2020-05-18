package com.sk.concurrency;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConcurrencyApplicationTests {

    @Test
    public void contextLoads() {
        /*int i=1;
        int j=i++;
        if((j>++j)&&(i++==j)){
            j+=i;}
        System.out.print(j);*/

        int a = 0;
        int b = 0;

        for (int i = 0; i < 99; i++) {
           a = a ++;
            b= a++;
            a=b;
        }
        System.out.println(a);
    }

}
