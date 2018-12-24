package com.baizhi;

import com.baizhi.entity.Poetry;
import com.baizhi.service.PoetryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

    @Autowired
    private PoetryService poetryService;

    @Test
    public void test1(){
        List<Poetry> poetries = poetryService.queryAll();
        poetries.forEach(poetry -> {
            System.out.println(poetry);
        });
    }
    @Test
    public void m1(){

    }
}
