package com.learn.springmybatis.utils;

/**
 * \* KDA IntelliJ IDEA.
 * \* User: hi
 * \* Date: 2021/06/02
 * \* Time: 15:30
 * \* 有梦想的搬砖少年
 * \* 劲夫劲夫，全场欢呼
 * \
 */
public class StringUt {

    public static String formatString(String targetStr,int strLength){
        int curLength = targetStr.getBytes().length;
        if(targetStr!=null && curLength>strLength){
            targetStr = targetStr.substring(0,strLength);
        }
        String newString = "";
        int cutLength = strLength-targetStr.getBytes().length;
        for(int i=0;i<cutLength;i++)
            newString +=" ";
        return targetStr+newString;
    }
}
