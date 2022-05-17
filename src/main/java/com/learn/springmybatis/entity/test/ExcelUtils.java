package com.learn.springmybatis.entity.test;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.util.DateUtils;
import com.alibaba.excel.write.metadata.WriteSheet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Date;

/**
 * @author lvz
 * @date 2021/4/30
 */
public class ExcelUtils {

    private static String WIN_EXCEL_TEMPLATE_PATH = "D:/var/datas/excel/template/";
    private static String LINUX_EXCEL_TEMPLATE_PATH = "/var/datas/excel/template/";
    private static String WIN_EXCEL_UPLOAD_PATH = "D://var/datas/excel/";
    private static String LINUX_EXCEL_UPLOAD_PATH = "/var/datas/excel/";


    /**
     * 模板数据填充方法
     *
     * @param response     HttpServletResponse
     * @param templateName 模板名称
     * @param sheetData    填充的数据
     */
    public static void excelFilled(HttpServletResponse response, String templateName, SheetData<?> sheetData) throws IOException {
        // 模板注意 用{} 来表示你要用的变量 如果本来就有"{","}" 特殊字符 用"\{","\}"代替
        // {} 代表普通变量 {.} 代表是list的变量
        String templateFileName;
        String fileName = "";

        String osName = System.getProperty("os.name");
        //如果是windows 系统
        if (osName.startsWith("Win")) {
            templateFileName = WIN_EXCEL_TEMPLATE_PATH + templateName;
            fileName = WIN_EXCEL_UPLOAD_PATH + templateName + System.currentTimeMillis() + ".xlsx";
        } else {
            templateFileName = LINUX_EXCEL_TEMPLATE_PATH + templateName;
            fileName = LINUX_EXCEL_UPLOAD_PATH + templateName + System.currentTimeMillis() + ".xlsx";
        }

        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        response.setHeader("Content-disposition", "attachment;filename*=" + URLEncoder.encode(templateName.substring(0, templateName.indexOf("."))
                + DateUtils.format(new Date(),"yyyyMMddHHmm"), "UTF-8") + ".xlsx");

        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).withTemplate(templateFileName).build();
        WriteSheet writeSheet = EasyExcel.writerSheet().build();

        //开始填充{} 字段
        if(sheetData.titleMap != null){
            excelWriter.fill(sheetData.titleMap, writeSheet);
        }

        //开始填充{.} 字段
        excelWriter.fill(sheetData.dataList, writeSheet);

        // 关闭流
        excelWriter.finish();
    }
}
