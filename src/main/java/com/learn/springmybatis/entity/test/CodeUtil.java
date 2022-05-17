package com.learn.springmybatis.entity.test;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import org.apache.commons.lang3.StringUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author : lvz
 * @date : 2020/11/4 10:01
 */
public class CodeUtil {

    /**
     * 生成编号
     * @return
     */
    public static String getActivityCode() {

        String prefix = "AC";

        Date date = new Date();
        StringBuilder stringBuilder = new StringBuilder();
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyMMdd");
        String s = sdf3.format(date);
        String s1 = RandomUtil.randomString(4).toUpperCase();
        String uuid = UUID.randomUUID().toString().replaceAll("-","").toUpperCase().substring(0,5);
                stringBuilder
                .append(prefix)
                .append("-")
                .append(s)
                .append(uuid)
                .append(s1);

        return stringBuilder.toString();
    }

//    /**
//     * 自动生成档案名称
//     * @param creditProducts
//     * @param creditCustomerName
//     * @return
//     */
//    public static String getFileName(String creditProducts,String creditCustomerName){
//        Date date = new Date();
//        StringBuilder stringBuilder = new StringBuilder();
//        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMdd");
//        String s = sdf3.format(date);
//        stringBuilder.append(creditProducts).append("-").append(creditCustomerName).append("-").append(s).append(RandomUtil.randomNumbers(3));
//        return stringBuilder.toString();
//    }
//
//    public static String rfIdCodeBuild(String creditCustomerName){
//        StringBuffer stringBuffer = new StringBuffer();
//        String nameSub = creditCustomerName.substring(0,2);
//        stringBuffer.append(nameSub).append(RandomUtil.randomString(6));
//        return HexUtil.encodeHexStr(stringBuffer.toString(), CharsetUtil.CHARSET_UTF_8);
//    }
//
//    public static Object codeToInstance(String fileRootCode) throws IllegalAccessException, InstantiationException {
//        Class classInstance = FileTypeMappingEnum.getByCode(fileRootCode).getClassName();
//        //根据fileType 反射出具体类的实例
//        if (classInstance == null){
//            throw new ServiceException(ServiceExceptionEnum.REFLECT_1002001001);
//        }
//        return classInstance.newInstance();
//    }




    public static String space2Horizontal(String str){
        String string = str;
        if(StringUtils.isBlank(string)){
            string = "-";
        }
        return string;
    }

    /**
     *  1.可以是中文
     *  2.可以是英文，允许输入点（英文名字中的那种点）， 允许输入空格
     *  3.中文和英文不能同时出现
     *  4.长度在20个字符以内
     * @param name name
     * @return  Boolean
     */
    public static Boolean validateName(String name) {
        return name.matches("^([\\u4e00-\\u9fa5]{1,20}|[a-zA-Z\\.\\s]{1,20})$");
    }

    /**
     * 当前日期年月日减去年数
     * @param beforeDate beforeDate
     * @param years years
     * @return Date
     */
    public static Date dateSubYears(Date beforeDate,int years){
        // - 向历史偏移年数  HH:mm:ss  不需要时分秒
        return DateUtil.offset(beforeDate, DateField.YEAR,-years);
    }
}

