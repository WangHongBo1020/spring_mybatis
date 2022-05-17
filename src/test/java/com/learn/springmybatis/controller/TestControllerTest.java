package com.learn.springmybatis.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.learn.springmybatis.entity.changjiu.PreserveDetailsVo;
import com.learn.springmybatis.entity.changjiu.SingleDog;
import com.learn.springmybatis.entity.changjiu.WmsStockroomPreserveDetail;
import com.learn.springmybatis.entity.test.TestUser;
import com.learn.springmybatis.entity.test.WmsmasslossPosition;
import com.learn.springmybatis.service.TestServiceTest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.awt.*;
import java.awt.event.InputEvent;
import java.lang.reflect.Field;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RunWith(SpringRunner.class)
@SpringBootTest
class TestControllerTest {


    @Resource
    private TestServiceTest testServiceTest;

    /**
     * 鼠标连点
     * @param args
     * @throws AWTException
     */
    @Test
    public static void main(String[] args) throws AWTException {
        try {
            int i=0;
            while(i<100000) {
                Robot robot = new Robot();
                robot.delay(100);
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.delay(100);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                ++i;            }

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * list去重
     */
    @Test
    public void mainsss () {

        /*List<String> list2 = new ArrayList<>();
        list2.add("E");

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("E");
        list1.add("E");
        list1.add("E");
        List<String> list = quchong(list1);*/

        List<TestUser> list = new ArrayList<>();

        TestUser testUser = new TestUser();
        testUser.setName("张三");
        testUser.setAge(11);

        TestUser testUser1 = new TestUser();
        testUser1.setName("王五");
        testUser1.setAge(20);

        TestUser testUser2 = new TestUser();
        testUser2.setName("王五");
        testUser2.setAge(20);

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
        testUser6.setAge(43);

        list.add(testUser);
        list.add(testUser1);
        list.add(testUser2);
        list.add(testUser3);
        list.add(testUser4);
        list.add(testUser5);
        list.add(testUser6);

        List<TestUser> list1 = quchongs(list);

        System.out.println(JSONObject.toJSONString(list1));

        List<TestUser> list2 = new ArrayList<>();;
        TestUser testUser7 = new TestUser();
        TestUser testUser8 = new TestUser();
        testUser7.setName("李四");
        testUser8.setName("张三");

        list2.add(testUser7);
        list2.add(testUser8);
        List<TestUser> error = new ArrayList<>();

        List<String> codeerrorList = new ArrayList<>();

        List<String> gressionList = new ArrayList<>();

        List<String> tempList = new ArrayList<>();

        for (TestUser s : list1) {
            String str = s.getName();
            codeerrorList.add(str);
        }

        for (TestUser s1 : list2) {
            String str = s1.getName();
            gressionList.add(str);
        }

        //将list1里的所有元素添加到tempList里
        tempList.addAll(codeerrorList);
        //从list1中移除掉同时在list2中存在的元素（去重）
        codeerrorList.removeAll(gressionList);
        //从list2中移除掉同时在list1中存在的元素（去重）
        gressionList.removeAll(tempList);

        System.out.println(JSONObject.toJSONString(tempList));
        System.out.println(JSONObject.toJSONString(codeerrorList));
        System.out.println(JSONObject.toJSONString(gressionList));
    }

    private List<TestUser> quchongs(List<TestUser> list) {
        List<TestUser> newList = list.stream().distinct().collect(Collectors.toList());
        return newList;
    }

    @Test
    public void weihujihua() {

        String str = "A,B,C";
        String str1 = "A,B,C";
        String str2 = "A,B,C";
        String str3 = "A,B,C";
        String str4 = "A,B,C,D";
        String str5 = "A,B,C,D";
        String str6 = "A,B,C,D,f";
        WmsStockroomPreserveDetail wms = new WmsStockroomPreserveDetail();
        wms.setPreserveCode("123");
        wms.setVin("456");
        wms.setVoltageStatus1("是");

        WmsStockroomPreserveDetail wms1 = new WmsStockroomPreserveDetail();
        wms1.setPreserveCode("123");
        wms1.setVin("456");
        wms1.setVoltageStatus1("是");

        WmsStockroomPreserveDetail wms2 = new WmsStockroomPreserveDetail();
        wms2.setPreserveCode("123");
        wms2.setVin("456");
        wms2.setVoltageStatus1("否");

        WmsStockroomPreserveDetail wms3 = new WmsStockroomPreserveDetail();
        wms3.setPreserveCode("456");
        wms3.setVin("789");
        wms3.setVoltageStatus1("是");

        List<WmsStockroomPreserveDetail> list1 = new ArrayList<>();
        list1.add(wms);
        list1.add(wms1);
        list1.add(wms2);
        list1.add(wms3);

        List<WmsStockroomPreserveDetail> codeerrorList = new ArrayList<>();

        List<WmsStockroomPreserveDetail> gressionList = new ArrayList<>();

        List<WmsStockroomPreserveDetail> tempList = new ArrayList<>();

        tempList.addAll(list1);
        codeerrorList.addAll(list1);
        codeerrorList.removeAll(tempList);
        System.out.println("111111111-----" + JSONObject.toJSONString(codeerrorList));
        /*//将list1里的所有元素添加到tempList里
        tempList.addAll(codeerrorList);
        //从list1中移除掉同时在list2中存在的元素（去重）
        codeerrorList.removeAll(gressionList);
        //从list2中移除掉同时在list1中存在的元素（去重）
        gressionList.removeAll(tempList);*/



        List<WmsStockroomPreserveDetail> list = testServiceTest.quchongs(list1);

        System.out.println(JSONObject.toJSONString(list));

    }

    @Test
    public void  error (){
        PreserveDetailsVo vo = new PreserveDetailsVo();
        PreserveDetailsVo vo1 = new PreserveDetailsVo();
        PreserveDetailsVo vo2 = new PreserveDetailsVo();
        PreserveDetailsVo vo3 = new PreserveDetailsVo();

        List<PreserveDetailsVo> list = new ArrayList<>();

        List<String> list1 = new ArrayList<>();

        String str = "ABC";
        String str1 = "ABC";
        String str2 = "ABC";

        String str3 = "ABCD";
        String str4 = "ABCD";
        String str5 = "ABCD";

        String str6 = "ABCDf";
        String str7 = "ABCDf";

        vo1.setVin("ABC");
        vo2.setVin("11");
        vo3.setVin("112");

        list1.add(str);
        list1.add(str1);
        list1.add(str2);
        list1.add(str3);
        list1.add(str4);
        list1.add(str5);
        list1.add(str6);
        list1.add(str7);

        vo.setError(list1);



        list.add(vo1);
        list.add(vo2);
        list.add(vo3);

        for (PreserveDetailsVo detailsVo : list) {

            if (detailsVo.getError() != null && !detailsVo.getError().isEmpty()){
                String result = detailsVo.getError().stream().map(String::valueOf).collect(Collectors.joining(","));
                System.out.println("结果集222--------------------"+JSONObject.toJSONString(detailsVo.getError()));
                System.out.println("结果集333--------------------"+result);
                String code = "aaaa";
                System.out.println("结果集4444--------------------"+code);
            }
        }
        System.out.println("结果集--------------------"+list);

    }

    private List<String> quchong(List<String> list) {

        List<String> newList = list.stream().distinct().collect(Collectors.toList());


        return newList;
    }

    /**
     * list fro双重循环去重
     */
    @Test
    public void  forquchong (){
        List<SingleDog> lists = new ArrayList<>();
        SingleDog a = new SingleDog();
        a.setAge(18);
        a.setName("张三");
        a.setSex("男");
        lists.add(a);
        SingleDog b = new SingleDog();
        b.setAge(23);
        b.setName("李四");
        b.setSex("男");
        lists.add(b);
        SingleDog c = new SingleDog();
        c.setAge(23);
        c.setName("李四");
        c.setSex("男");
        lists.add(c);

        SingleDog d = new SingleDog();
        d.setAge(33);
        d.setName("王五");
        d.setSex("男");
        lists.add(d);
        System.out.println("去重前----------------------");
        for (SingleDog sd : lists) {
            System.out.println(sd.toString());
        }
        List<SingleDog> newList2 =  getSingleDogs(lists);
        System.out.println("去重后----------------------");
        for (SingleDog sd : newList2) {
            System.out.println(sd.toString());
        }

    }

    public static List<SingleDog> getSingleDogs(List<SingleDog> list) {
        // 创建一个新的list对象
        List<SingleDog> newList = new ArrayList<SingleDog>();
        boolean flag = false;
        for (SingleDog oldSD : list) {
            for (SingleDog newSD : newList) {
                if (newSD.getName().equals(oldSD.getName())) {
                    flag = true;
                }else {
                    flag =false;
                }
            }
            if (!flag) {
                newList.add(oldSD);
            }
        }

        return newList;

    }


    /**
     * java遍历实体类的属性和值

     * @throws Exception
     */
    @Test
    public void  forlist() throws Exception {
        List<String> list = new ArrayList<>();

        WmsmasslossPosition wmsmasslossPosition =new WmsmasslossPosition();

        Class cls = wmsmasslossPosition.getClass();

        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            Field f = field;
            f.setAccessible(true);
            list.add(String.valueOf(f.get(wmsmasslossPosition)));
        }

        System.out.println(list);





    }

    @Test
    public void  JSONparseArray() throws Exception {
        List<String> list = new ArrayList<>();
        PreserveDetailsVo list1 = new PreserveDetailsVo();

        System.out.println(list1);

    }

    @Test
    public void  TestArrayList() throws Exception {
        List<PreserveDetailsVo> list = new ArrayList<>();
        List<PreserveDetailsVo> list1 = new ArrayList<>();

        PreserveDetailsVo vo = new PreserveDetailsVo();

        PreserveDetailsVo vo1 = new PreserveDetailsVo();

        PreserveDetailsVo vo2 = new PreserveDetailsVo();

        vo.setVin("000000");
        list.add(vo);
        vo1.setVin("111111");
        list.add(vo1);
        vo2.setVin("22222");
        list.add(vo2);

        System.out.println(JSONObject.toJSONString(list));


        PreserveDetailsVo vo3 = new PreserveDetailsVo();

        for (PreserveDetailsVo s : list) {

            vo3.setVin(s.getVin());

            list1.add(vo3);

            System.out.println(JSONObject.toJSONString(vo3));

            System.out.println(JSONObject.toJSONString(list1));

        }

    }

    @Test
    public void chongdieList(){

        List<String> stringList = new ArrayList<>();
        String str = "ABC";
        String str1 = "ABC";
        String str2 = "ABC";

        stringList.add(str);
        stringList.add(str1);
        stringList.add(str2);

        String str6 = "ABC";
        String str7 = "ABC";
        String str8 = "ABC";

        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        list1.add(str6);
        list1.add(str7);
        list1.add(str8);

        list.add(stringList.stream().map(String::valueOf).collect(Collectors.joining(",")));

        for (String s : list1) {

            list.add(s);
        }

        String error =list.stream().map(String::valueOf).collect(Collectors.joining(","));
        String error1 =stringList.stream().map(String::valueOf).collect(Collectors.joining(","));

        System.out.println(list);
        System.out.println(error);
        System.out.println(error1);
    }


    @Test
    public void jisuan(){

        double count = 2.712406422 ;

        System.out.println(stringformat(count));
    }

    /**
     * 保留小数点后三位
     * @param value
     * @return
     */
    public static String stringformat(double value) {
        DecimalFormat df = new DecimalFormat("0.000");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(value);
    }


}