package com.learn.springmybatis.controller;

import com.learn.springmybatis.entity.test.TestUser;
import org.apache.poi.ss.formula.functions.T;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class StreamControllerTest {

    @Test
    public  void shuzu () {
        // 1、数组
        String[] arr = new String[]{"ab", "cd", "ef"};
        Stream<String> arrStream = Arrays.stream(arr);
        System.out.println(arrStream);

        // 2、集合
        List<String> list = Arrays.asList("ab", "cd", "ef");
        Stream<String> colStream = list.stream();
        System.out.println(arrStream);

        // 3、值
        Stream<String> stream = Stream.of("ab", "cd", "ef");
        System.out.println(arrStream);

    }


    /**
     * forEach 迭代输出每条数据.
     */
    @Test
    public void testForEach(){

        List<TestUser> list = new ArrayList<>();

        TestUser testUser = new TestUser();
        testUser.setName("张三");
        testUser.setAge(11);

        TestUser testUser1 = new TestUser();
        testUser1.setName("王五");
        testUser1.setAge(20);

        TestUser testUser2 = new TestUser();
        testUser2.setName("王五");
        testUser2.setAge(91);

        TestUser testUser3 = new TestUser();
        testUser3.setName("张三");
        testUser3.setAge(8);

        TestUser testUser4 = new TestUser();
        testUser4.setName("李四");
        testUser4.setAge(44);

        TestUser testUser5 = new TestUser();
        testUser5.setName("李四");
        testUser5.setAge(44);

        TestUser testUser6 = new TestUser();
        testUser6.setName("李四");
        testUser6.setAge(44);

        list.add(testUser);
        list.add(testUser1);
        list.add(testUser2);
        list.add(testUser3);
        list.add(testUser4);
        list.add(testUser5);
        list.add(testUser6);

        // java 8 前
        System.out.println("java 8 前");
        for(TestUser user: list){
            System.out.println(user);
        }
        // java 8 lambda
        System.out.println("java 8 lambda");
        list.forEach(user -> System.out.println(user));
        List<TestUser> list1 = new ArrayList<>();
        // java 8 stream lambda
        System.out.println("java 8 stream lambda");
        list.stream().forEach(user -> {
            user.setData(new Date());
            list1.add(user);
        });

        System.out.println(list1);
    }

    /**
     * sort 排序.
     */
    @Test
    public void testSort() {
        List<TestUser> list = new ArrayList<>();

        TestUser testUser = new TestUser();
        testUser.setName("张三");
        testUser.setAge(11);

        TestUser testUser1 = new TestUser();
        testUser1.setName("王五");
        testUser1.setAge(20);

        TestUser testUser2 = new TestUser();
        testUser2.setName("王五");
        testUser2.setAge(91);

        TestUser testUser3 = new TestUser();
        testUser3.setName("张三");
        testUser3.setAge(8);

        TestUser testUser4 = new TestUser();
        testUser4.setName("李四");
        testUser4.setAge(44);

        TestUser testUser5 = new TestUser();
        testUser5.setName("李四");
        testUser5.setAge(44);

        TestUser testUser6 = new TestUser();
        testUser6.setName("李四");
        testUser6.setAge(44);

        list.add(testUser);
        list.add(testUser1);
        list.add(testUser2);
        list.add(testUser3);
        list.add(testUser4);
        list.add(testUser5);
        list.add(testUser6);

        List<TestUser> lists = new ArrayList<>();

        System.out.println("-----排序前-----");
        list.forEach(user -> System.out.println(user));
        System.out.println("-----排序后-----");

        // java 8 stream 方法引用
        System.out.println("java 8 stream 方法引用");
        list.stream().sorted(Comparator.comparing(TestUser::getAge)).forEach(user -> System.out.println(user));
    }

    /**
     * filter 过滤.
     */
    @Test
    public void testFilter() {

        List<TestUser> list = new ArrayList<>();

        TestUser testUser = new TestUser();
        testUser.setName("张三");
        testUser.setAge(11);

        TestUser testUser1 = new TestUser();
        testUser1.setName("王五");
        testUser1.setAge(20);

        TestUser testUser2 = new TestUser();
        testUser2.setName("王五");
        testUser2.setAge(91);

        TestUser testUser3 = new TestUser();
        testUser3.setName("张三");
        testUser3.setAge(8);

        TestUser testUser4 = new TestUser();
        testUser4.setName("李四");
        testUser4.setAge(44);

        TestUser testUser5 = new TestUser();
        testUser5.setName("李四");
        testUser5.setAge(44);

        TestUser testUser6 = new TestUser();
        testUser6.setName("李四");
        testUser6.setAge(44);

        list.add(testUser);
        list.add(testUser1);
        list.add(testUser2);
        list.add(testUser3);
        list.add(testUser4);
        list.add(testUser5);
        list.add(testUser6);

        TestUser testUser7 = new TestUser();

        // 输出年龄大于50的人
        System.out.println("-----过滤前-----");
        list.forEach(user -> System.out.println(user));
        System.out.println("-----过滤后-----");

        // java 8 前
        System.out.println("java 8 前");
        for(TestUser user: list){
            if (user.getAge() > 50) {
                System.out.println(user);
            }
        }
        List<TestUser> userList = new ArrayList<>();

        // java 8 stream
        System.out.println("java 8 stream");
        list.stream().filter((TestUser user) -> user.getAge() > 50 ).forEach(user -> {
            userList.add(user);
        });

        System.out.println(userList);


    }


}