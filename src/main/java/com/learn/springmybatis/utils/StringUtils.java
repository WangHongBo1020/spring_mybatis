package com.learn.springmybatis.utils;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @ClassName: StringUtils
 * @Description: String工具类
 * @author: limiao
 * @date: 2017年3月10日 上午10:29:10
 */
public class StringUtils {
	private static Pattern p_str = Pattern.compile("[\\u4e00-\\u9fa5]+");
	public static String parseUtilDate(String str_date) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = df.parse(str_date);
		String parseUtilDate = parseUtilDate(parse);
		return parseUtilDate;
	}
	public static String parseUtilDate(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return df.format(date);
	}
	
	public static String parseUtilDate(Object date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		if(date!=null){
		   return df.format(date);
		}
		return null;
	}
	
	public static String notNullToString(Object str){
		if(str!=null){
			return str.toString();
		}
		return null;
	}
	public static String nullToString(Object str){
		if(str!=null){
			return str.toString();
		}
		return "";
	}
	
	//获取金额的值进行转换，若为null或为空则为0
	public static String toAmount(Object str){
			if(str==null || "".equals(str))
				return "0";
			else return str.toString();
	}
	
	public static Number parseNumberFromString(String s) {
		Number num = null;
		try {
			if("".equals(procString(s))){
				return new Integer(0);
			}
			num = new Integer(Integer.parseInt(procString(s)));
		} catch (NumberFormatException e) {
			try {
				num = new Double(Double.parseDouble(s));
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
				return null;
			}
		}
		return num;
	}
	

	
	public static String parseUtilData(Date date) {
		if (date == null) {
			return "";
		}

		String pattern = "yyyy-MM-dd HH:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}
	
	final public static String procString(String value) {
		
		if (value == null) {
			value = " ";
		}
		
		return value.trim();
	}
	
	final public static String procNumber(String value){
		
		if(value.trim().equals("null")){
			return "0";
		}else{
			return value;
		}
	}
	
	
	final public static boolean nullOrBlank(String arg){
		if(arg == null){
			return true;
		}else if(arg.trim().equals("")){
			return true;
		}else if("null".equals(arg)) {
			return true;
		}else{
			return false;
		}
	}
	
	public static final boolean longgerThan(String src,int length){
		if(nullOrBlank(src)||src.length()<length){
			return false;
		}else {
			return true;
		}
	}
	 /**
     * 功能：字符串去右空格函数
     *
     * @param	AsOrgStr-源串
     * @return	返回去右空格后的字符串
     */    
	public static String rTrim(String AsOrgStr) {
	    int off = 0;
	    if ((AsOrgStr== null) || (AsOrgStr.trim().equals("")))
	        return "";
	    char[] val = AsOrgStr.toCharArray();
	    int count =AsOrgStr.length();
	    int len =count;
	    while ((len>0) && (val[off + len - 1] <= ' ')) {
	        len--;
	    }
	    return (len < count) ? AsOrgStr.substring(0,len) : AsOrgStr;
	}
	/**
     * 功能：字符串去右空格函数
     *
     * @param	AsOrgStr-源串
     * @return	返回去右空格后的字符串
     */    
	public static String rTrim(Object AsOrgStr) {
		return rTrim(notNullToString(AsOrgStr));
	}
	
	 /**
     * 字符串替换函数(全程替换)
     *
     * @param	AsOrgStr 源串
     * @param	AsOrgSubStr 需替换的串
     * @param	AsRepSubStr 替换的串
     * @return	返回替换后的串
     */
	public static String replaceString(String AsOrgStr,String AsOrgSubStr, 
				String AsRepSubStr) {
		StringBuffer tmpStr = new StringBuffer();
		int spos = 0;
		int epos = 0;
		//错误参数判断
		if ((AsOrgStr== null)|| (AsRepSubStr == null ) || AsRepSubStr == null) {
		  return "";
		}		
		while( ( epos= AsOrgStr.indexOf(AsOrgSubStr, spos) ) !=-1 ){
			tmpStr.append(AsOrgStr.substring(spos, epos));
			tmpStr.append(AsRepSubStr);
			spos= epos + AsOrgSubStr.length();
		}

		if( spos< AsOrgStr.length() ){	
			tmpStr.append(AsOrgStr.substring(spos));
		}
		return new String(tmpStr);
	}
	
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
	
	public static String strTrim(String str) {
		return str==null?"":str.trim();
	}
	
	public static Date stringToDate(String str) {
		str = strTrim(str);
		if (str.equals("")) {
			return null;
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	    Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		} 	                                          
	    return date;  
	}  
	/**
	 * 字符串右补空格
	 * @param str
	 * @param length 补空格后，字符串最终长度
	 * @return
	 */

	/**
     * 数字金额大写转换，思想先写个完整的然后将如零拾替换成零
     */
	public static String digitUppercase(double n) {
		String digit[] = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
		String unit[][] = { { "元", "万", "亿" }, { "", "拾", "佰", "仟" } };
		String head = n < 0 ? "负" : "";
		n = Math.abs(n);
		String s = "";
		if (s.length() < 1) {
			s = "整";
		}
		int integerPart = (int) Math.floor(n);

		for (int i = 0; i < unit[0].length && integerPart > 0; i++) {
			String p = "";

			for (int j = 0; j < unit[1].length && n > 0; j++) {

				p = digit[integerPart % 10] + unit[1][j] + p;

				integerPart = integerPart / 10;

			}

			s = p.replaceAll("(零.)*零$", "").replaceAll("^$", "零") + unit[0][i]
					+ s;

		}

		return head
				+ s.replaceAll("(零.)*零元", "元").replaceFirst("(零.)+", "")
						.replaceAll("(零.)+", "零").replaceAll("^整$", "零元整");

	}
	
	/**
	 * 验证电话号码的正确性
	 * @param
	 * @return
	 */

	public static GregorianCalendar StringToGregorianCalendar(String strDate) {
		Date date = stringToDate(strDate);
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(date);
		return c;
	}
	
	public static long intervalDay(GregorianCalendar startDate,
			GregorianCalendar endDate) {

		long diffTime = endDate.getTime().getTime()
				- startDate.getTime().getTime();
		long diffDay = (long) (diffTime / 86400000);
		return diffDay;
	}
	public static String nullStrTrim(Object str) {
		return str==null?"":str.toString().trim();
   }
	public static String nullStrTrim(String str) {
		return str==null?"":str.trim();
   }
	 /**
	  * 查询char型字段时会用到该方法，将长度不到指定长度的字符串后添加空格。
	  * @param str
	  * @param length
	  * @return
	  */
	public static String addBlank(String str,int length){
		 int oldLength=0;
		 StringBuffer sbstr=new StringBuffer(str);
		 for(oldLength=str.length();oldLength<length;oldLength++){
			 sbstr.append(" ");
		 };
		 return sbstr.toString();
	 }
	
	public static boolean stringNotEqualZero(String str) {
		return str != null && !"".equals(str.trim()) && Double.valueOf(str).floatValue() > 0;
	}
	/**
	 * 支付宝格式要求时间格式
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
		return df.format(date);
	}
	
	/**
	 * 对报文进行Base64加密
	 * @return
	 */

	/**
	 * 加签方法
	 * @return
	 */

	
	public static boolean isEmpty(String str){
		if(str == null){
			return true;
		}else if("".equals(str.trim())){
			return  true;
		}else {
			return false;
		}
	}
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-","");
	}
	/**
	 * 用于从MAP取值并判空做处理
	 * @param map Map对象
	 * @param Key Key值
	 * @return value值
	 * add by sunsaike 20171108
	 */
	public static String getValueFromMap(Map map,String Key){
		if(null == map.get(Key)){
			return "";
		}else{
			return map.get(Key).toString();
		}
	}
	/**
	 * 按照集团要求,对车牌号进行脱敏 (一键赔)by liuxiaokang
	 * @param licenseNo
	 * @return
	 */
	public static String licenseNoReplace(String licenseNo) {

		if (licenseNo == null || "".equals(licenseNo.trim())) {

			return licenseNo;
		}

		licenseNo = licenseNo.trim();

		if (licenseNo.length() > 2) {
			String replaceStartLicenseNo = licenseNo.substring(0, 2);
			String replaceEndLicenseNo = licenseNo.substring(licenseNo.length() - 1, licenseNo.length());
			String replaceLicenseNo = replaceStartLicenseNo + "***" + replaceEndLicenseNo;
			return replaceLicenseNo;

		}

		return licenseNo;
	}
	
	/**按照集团要求,对姓名进行脱敏处理(一键赔) by liuxiaokang
	 * @param name
	 * @return
	 */
	public static String NameReplace(String name) {

		if (name == null || "".equals(name.trim())) {

			return name;
		}
		name = name.trim();
		String replaceName = name.substring(0, 1);
		String endName = name.substring(1, name.length());
		if (endName != null && !"".equals(endName)) {
			int size = endName.length();
			for (int i = 0; i < size; i++) {
				replaceName = replaceName + "*";

			}

			return replaceName;

		}

		return replaceName;
	}
	 /**
	  * 按照集团要求,对车牌号进行脱敏(一键赔) by liuxiaokang
	  * 截取字符串。
	  *  1.str长度小于count，全部替换
	  *  2.startIndex小于零表示从尾部向前截取替换count个字符，大于零时从startIndex开始，替换count个字符
	  * @param	startIndex
	  * @param	 count 替换内容数量
	  * @param	 replacementCount 替换内容“*”数量
	  * @param	 str 
	  * @return
	  */
	public static String PhoneReplace(int startIndex, int count, int replacementCount, String str) {

		if (str == null || "".equals(str.trim())) {

			return str;
		}
		int length = str.length();

		if (count <= 0) {
			return str;
		}

		String replacement = "*";
		int i = 1;
		while (i < replacementCount) {
			replacement += "*";
			i++;
		}
		String startStr = "";
		String endStr = "";
		try {
			
			// 字符串长度大于替换内容数量，小于时，全部替换
			if (length > count) {
				// 开始下标小于零，截取替换尾部
				if (startIndex < 0) {
					startStr = str.substring(0, length - count);
				} else {
					startStr = str.substring(0, startIndex);
					endStr = str.substring(startIndex + count, length);
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
			return str;
		}

		return startStr + replacement + endStr;
	}
	/**
	 * 判断字符串包含几个汉字
	 * @param str
	 * @return
	 */

	/**
	 * 
	 * @Title: getEncoding   
	 * @Description: 获取字符串编码格式  
	 * @author youguoliang
	 * @date 2018年11月6日
	 * @param:  str
	 * @return: String      
	 * @throws
	 */
	public static String getEncoding(String str) {      
	       String encode = "GB2312";      
	      try {      
	          if (str.equals(new String(str.getBytes(encode), encode))) {      //判断是不是GB2312
	               String s = encode;      
	              return s;      //是的话，返回“GB2312“，以下代码同理
	           }      
	       } catch (Exception exception) {      
	       }      
	       encode = "ISO-8859-1";      
	      try {      
	          if (str.equals(new String(str.getBytes(encode), encode))) {      //判断是不是ISO-8859-1
	               String s1 = encode;      
	              return s1;      
	           }      
	       } catch (Exception exception1) {      
	       }      
	       encode = "UTF-8";      
	      try {      
	          if (str.equals(new String(str.getBytes(encode), encode))) {   //判断是不是UTF-8
	               String s2 = encode;      
	              return s2;      
	           }      
	       } catch (Exception exception2) {      
	       }      
	       encode = "GBK";      
	      try {      
	          if (str.equals(new String(str.getBytes(encode), encode))) {      //判断是不是GBK
	               String s3 = encode;      
	              return s3;      
	           }      
	       } catch (Exception exception3) {      
	       }      
	      return "";        //如果都不是，说明输入的内容不属于常见的编码格式。
	}
	
	/**
	 * 判断字符串是否为null或空
	 * @return
	 */
	public static boolean isNullOrEmpty(String str) {
		if(str==null){
			return true;
		}else if("".equals(str.trim())){
			return true;
		}
		return false;
	}
}
