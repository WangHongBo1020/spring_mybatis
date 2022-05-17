package com.learn.springmybatis.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.learn.springmybatis.entity.changjiu.*;
import com.learn.springmybatis.entity.changjiu.weihu.Dianya;
import com.learn.springmybatis.entity.changjiu.weihu.Gdianya;
import com.learn.springmybatis.entity.test.*;

import com.learn.springmybatis.mapper.SignMapperDao;
import com.learn.springmybatis.service.AccVideoGuideService;

import com.learn.springmybatis.utils.StringUt;

import net.sf.json.JSONArray;
import org.apache.commons.lang3.StringUtils;



import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.text.ParseException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class AccVideoGuideServiceImpl implements AccVideoGuideService {


    @Resource
    SignMapperDao signMapperDao;
    @Override
    public String getgetAcquisitionTime(String VIDEO_PATH) {
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String estimateNo = "10202985";
        List<AccVideoGuideentity> accVideoGuideentityList = signMapperDao.getAcquisitionTime(VIDEO_PATH);
        List<AccVideoGuidVo> seconds = signMapperDao.getcumulativeTime(estimateNo);
        Date createTime = accVideoGuideentityList.get(0).getCreateTime();
        Date updateTime = accVideoGuideentityList.get(0).getUpdateTime();
        long between = updateTime.getTime() - createTime.getTime();
        *//*long day = between / (24 * 60 * 60 * 1000);
        long hour = (between / (60 * 60 * 1000) - day * 24);
        long min = ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);

        System.out.println(day + "天" + hour + "小时" + min + "分" + s + "秒");*//*
        long sec = (between / 1000 );

        if (!seconds.isEmpty()){
            if (!"".equals(seconds.get(0).getCumulativeTime())){
                sec = (between / 1000 + Integer.parseInt(seconds.get(0).getCumulativeTime()));
            }
            System.out.println(seconds.get(0).getStatus());
            int upadteTime = signMapperDao.upadateTime(estimateNo,createTime,updateTime,sec,

                    seconds.get(0).getStatus(),
                    seconds.get(0).getVideoconnectDegree());
            System.out.println(upadteTime);
        }



        System.out.println(createTime  + "---"+ "--" +updateTime);
        System.out.println(JSONObject.toJSON(accVideoGuideentityList));
        System.out.println("------------");*/
        return null;
    }

    @Override
    public String getgibaoanInfos(String csaeNo) {
        GibaoanInfo gibaoanInfo = new GibaoanInfo();
        List<GibaoanInfo> seconds = signMapperDao.getgibaoanInfos(csaeNo);
        if (seconds != null && !seconds.isEmpty()){
            System.out.println(seconds.get(0).getManLossType());
            String str = seconds.stream().map(GibaoanInfo::getManLossType).collect(Collectors.joining());
            if(str.contains("0") && str.contains("1") && str.contains("2") ) {
                gibaoanInfo.setManLossType("4");
                System.out.println("---------------:" + gibaoanInfo.getManLossType());
            }
            if (str.contains("0") && (!str.contains("1")&& !str.contains("2"))){
                gibaoanInfo.setManLossType("2");
                System.out.println("---------------:" + gibaoanInfo.getManLossType());
            }
            if ((str.contains("1") && str.contains("2")) && !str.contains("0")){
                gibaoanInfo.setManLossType("1");
                System.out.println("---------------:" + gibaoanInfo.getManLossType());
            }
        } else {
            gibaoanInfo.setManLossType("3");
            System.out.println("---------------4" + gibaoanInfo.getManLossType());
        }


        return null;
    }

    @Override
    public String getzhuanma(String claimNo) {
        GuangAiReqyestVo vo = new GuangAiReqyestVo();
        vo.setCaseNo(claimNo);
        List<GuangAiInfo> guangAiInfoList = this.getGuangaiData(vo);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("claimList", guangAiInfoList);
        System.out.println("whb" + jsonObject.toString());
        return jsonObject.toString();
    }

    @Override
    public void saveBatch(List<OrganizationEntity> lists) {
        System.out.println(JSONObject.toJSONString(lists));

    }

    @Override
    public Page<Testceshivo> zhuanmas(Testccc ccc) {
        Page<Testceshivo> page = new Page<>(0, -1);
        if (ccc.getCurrentPage() != null && ccc.getPageSize() != null) {
            page = new Page<>(ccc.getCurrentPage(), ccc.getPageSize());
        }
        List<Testceshivo> list = new ArrayList<>();

        Testceshivo testceshivo = new Testceshivo();
        //根据盘点单号查询未盘的数量
        List<Testceshi> weimessages = signMapperDao.queryWeipan(ccc.getCode());
        testceshivo.setCesList1(weimessages);

        List<Testceshic> yimessgae = signMapperDao.queryYipan(ccc.getCode());
        testceshivo.setCesList2(yimessgae);

        signMapperDao.upadatetime(new Date());
        list.add(testceshivo);
        page.setRecords(list);
        System.out.println(list);

        return page;
    }

    @Override
    public int insertwmsgression() throws ParseException {


        String vin = "111";
        String stockroomName = "string";
        List<WmsGression> wmsGressionList = signMapperDao.queryBrandStockroom(vin,stockroomName);
        String sss = signMapperDao.queryBrandStockrooms();
        System.out.println("Integer sss" + sss);
        System.out.println("getbrandData--wmsGressionList:{}" + JSONObject.toJSONString(wmsGressionList));
        String positionCodes = "";
        if (wmsGressionList != null && !wmsGressionList.isEmpty()){
            for (WmsGression wmsGression : wmsGressionList) {

                String positionCode = signMapperDao.getpositionStatus(wmsGressionList,
                        "333");
                if (StringUtils.isNotBlank(positionCode)){
                    System.out.println("dddd" + positionCode);
                }


            }
        }
        return 3333;
    }

    @Override
    public int weigh() {

        WmsStockroomPreserveDetail preserveDetail = new WmsStockroomPreserveDetail();
        preserveDetail.setStockroom_preserveDetailId("666666666");
        preserveDetail.setPreserveCode("WH46545646");
        preserveDetail.setVin("LXS888888888");

        WmsStockroomPreserveDyDataDto preserveDyDataDto = new WmsStockroomPreserveDyDataDto();


        preserveDyDataDto.setQianelectricity("1");
        preserveDyDataDto.setQiangaoVoltage("2");


        preserveDyDataDto.setQianhighVoltage("3");

        preserveDyDataDto.setQianvoltage("4");
        List<String> list = new ArrayList<>();
        list.add("https://www.baidu.com/?tn=88093251_62_hao_pg");
        list.add("https://www.baidu.com/?tn=88093251_62_hao_pgssssss");
        preserveDyDataDto.setQianvoltageUrl(list);


        preserveDyDataDto.setQianleftagolunbar("5");

        preserveDyDataDto.setQianleftlaterlunbar("6");

        preserveDyDataDto.setQianleftlaterlunbar("7");

        preserveDyDataDto.setQianrightagolunbar("7");
        preserveDyDataDto.setQianbarUrl(list);


        WmsStockroomPreserveTyDataDto preserveTyDataDto = new WmsStockroomPreserveTyDataDto();


        preserveTyDataDto.setHouleftlaterlunbar("10");

        preserveTyDataDto.setHouleftagolunbar("11");

        preserveTyDataDto.setHouhighVoltage("12");

        preserveTyDataDto.setHouvoltage("14");
        preserveTyDataDto.setHouvoltageUrl(list);



        preserveTyDataDto.setHouleftagolunbar("15");

        preserveTyDataDto.setHouleftlaterlunbar("16");

        preserveTyDataDto.setHourightagolunbar("17");

        preserveTyDataDto.setHourightlaterlunbar("15");
        preserveTyDataDto.setHoubarUrl(list);




        String qian = JSONObject.toJSONString(preserveDyDataDto);


        String hou = JSONObject.toJSONString(preserveTyDataDto);


        int count = signMapperDao.insetStockroomPreserve(preserveDetail,qian,hou);

        return 0;
    }

    @Override
    public WmsStockroomPreserveDetail weihujihuachaxun() {

        WmsMaintainItemVo wmsMaintainItemVo = new WmsMaintainItemVo();
        WmsStockroomPreserveDetail wms = new WmsStockroomPreserveDetail();
        String preserveCode = "WH46545646";

        WmsStockroomPreserveDetail preserveDetail = signMapperDao.getweihujihuachaxun(preserveCode);
        wms.setPreserveCode(preserveCode);
        wms.setVin(preserveDetail.getVin());


        JSONObject jsonObject = JSONObject.parseObject(preserveDetail.getPreserveagoData());

        List<WmsStockroomPreserveDyDataDto> dataDtoList = new ArrayList<>();

        List<PreserveDyDataDto> ps = new ArrayList<>();
        PreserveDyDataDto dto = new PreserveDyDataDto();
        List<Dianya> dianya = new ArrayList<>();
        Gdianya gdianya = new Gdianya();

        List<Map<String, Object>> mapList = new ArrayList<>();

        List<Map<String, Object>> taiyamapList = new ArrayList<>();

        WmsStockroomPreserveDyDataDto preserveDyDataDto = new WmsStockroomPreserveDyDataDto();
        /*preserveDyDataDto.setAgoelectricity(jsonObject.getString("agoelectricity"));
        preserveDyDataDto.setAgogaoVoltage(jsonObject.getString("agogaoVoltage"));*/

        /*dianya.setName("电压");
        dianya.setAgovoltage(jsonObject.getString("agoelectricity"));
        dianya.setLatervoltage(jsonObject.getString("agogaoVoltage"));
        dto.setDianya(dianya);*/
        HashMap<String, Object> map = new HashMap<>();
        if (StringUtils.isNotBlank(jsonObject.getString("agoelectricity"))){
            map.put("name","电压");
            map.put("before",jsonObject.getString("agoelectricity"));
            map.put("after",jsonObject.getString("agogaoVoltage"));
            mapList.add(map);
        }








        System.out.println("测试电压结构----------------" + JSONObject.toJSONString(ps));


        /*preserveDyDataDto.setAgohighVoltage(jsonObject.getString("agohighVoltage"));
        preserveDyDataDto.setAgovoltage(jsonObject.getString("agovoltage"));*/

        gdianya.setName("高电压");
        gdianya.setAgogaoVoltage(jsonObject.getString("agohighVoltage"));
        gdianya.setLatergaoVoltage(jsonObject.getString("agovoltage"));

        HashMap<String, Object> gyanmap = new HashMap<>();
        gyanmap.put("name","高电压");
        gyanmap.put("before",jsonObject.getString("agohighVoltage"));
        gyanmap.put("after",jsonObject.getString("agovoltage"));
        mapList.add(gyanmap);

        List<String> list = new ArrayList<>();
        /*preserveDyDataDto.setAgovoltageUrls(jsonObject.getString("agovoltageUrl"));

        preserveDyDataDto.setAgoleftagolunbar(jsonObject.getString("agoleftagolunbar"));
        preserveDyDataDto.setAgoleftlaterlunbar(jsonObject.getString("agoleftlaterlunbar"));
        preserveDyDataDto.setAgorightlaterlunbar(jsonObject.getString("agorightlaterlunbar"));
        preserveDyDataDto.setAgorightagolunbar(jsonObject.getString("agorightagolunbar"));*/
        list.add(jsonObject.getString("agobarUrl"));

        HashMap<String, Object> qiyamap = new HashMap<>();
        qiyamap.put("name","左前轮气压");
        qiyamap.put("before",jsonObject.getString("agoleftagolunbar"));
        qiyamap.put("after",jsonObject.getString("agorightlaterlunbar"));
        taiyamapList.add(qiyamap);

        HashMap<String, Object> houyamap = new HashMap<>();
        houyamap.put("name","左后轮气压");
        houyamap.put("before",jsonObject.getString("agoleftagolunbar"));
        houyamap.put("after",jsonObject.getString("agorightlaterlunbar"));
        taiyamapList.add(houyamap);



        JSONArray json = JSONArray.fromObject(jsonObject.getString("agobarUrl"));

        wms.setDyimageBeforeList(json);

        wms.setTyimageBeforeList(json);

        wms.setDyimageAfterList(json);

        wms.setTyimageAfterList(json);


        wms.setDyDataList(mapList);
        wms.setTyDataList(taiyamapList);

        /*preserveDyDataDto.setAgobarUrl(list);*/
        dataDtoList.add(preserveDyDataDto);

        wms.setDataList(ps);

        System.out.println(wms);

        return wms;
    }

    @Override
    public int charu(String buwei, int count) {
        WmsStockroomInsideDetailsDto dto = new WmsStockroomInsideDetailsDto();
        dto.setStockroomInsideDetailsId("1114442222");
        dto.setCheckcarCode("YC202111050001");
        dto.setMasslossPosition(buwei);
        dto.setMasslossPositionCount(count);

        int vo = signMapperDao.insetcharubuwi(dto);
        return 0;
    }

    @Override
    public WmsStockroomMonthdiscspotFsDto chongfushuju() {
        String kehu = "北京现代汽车有限公司";
        String pinpai = "奔驰";
        String danhao = "PD202112150029";
        List<WmsStockroomDiscspotDetails> details = new ArrayList<>();

        //获取盘点单主表信息,明细表信息
        List<WmsStockroomMonthdiscspotFsDto> discspotDto = signMapperDao.queryData();
        System.out.println("获取盘点单主表信息--discspotDto:{},size:{}"+JSONObject.toJSONString(discspotDto)+discspotDto.size());
        List<WmsStockroomMonthdiscspotFsDto> fsDto = signMapperDao.querySumAmount(discspotDto);
        System.out.println("data数据-------" + JSONObject.toJSONString(fsDto));

        for (WmsStockroomMonthdiscspotFsDto dto : discspotDto) {



        }

        /*Map<String, WmsStockroomMonthdiscspotFsDto> appleMap = discspotDto.stream()
                .collect(Collectors.toMap(WmsStockroomMonthdiscspotFsDto::getCustomerName, x -> x));

        System.out.println(JSONObject.toJSONString(appleMap));*/

        /*System.out.println(JSONObject.toJSONString(discspotDto));*/

        return null;
    }

    @Override
    public List<TestUser> stream() {

        int count = signMapperDao.upadateyiwei();

        return null;
    }


    private List<GuangAiInfo> getGuangaiData(GuangAiReqyestVo vo) {
        //交强
        GuangAiInfo guangAiInfojq = new GuangAiInfo();
        //商业
        GuangAiInfo guangAiInfoG = new GuangAiInfo();
        List<GuangAiInfo> guangAiInfoList = new ArrayList<>();

        //查询案件信息
        String ebbbe = StringUtils.isBlank(vo.getEngineNo())? "": StringUt.formatString(vo.getEngineNo(),40);
        String sss = StringUtils.isBlank(vo.getPlateNo())? "": StringUt.formatString(vo.getPlateNo(),20);
        System.out.println(ebbbe);
        List<GuangAiInfo> licenseno = signMapperDao.getlicenseno(vo.getCaseNo(), ebbbe, sss,
                vo.getPolicyNo(), vo.getVin());

        if (licenseno != null && !licenseno.isEmpty()) {
            for (GuangAiInfo guangAiInfo : licenseno) {
                if ("1".equals(guangAiInfo.getClaimtype())) {
                    guangAiInfojq.setBzPayAmount(guangAiInfo.getBzPayAmount());
                    guangAiInfojq.setBzStatus(guangAiInfo.getBzStatus());
                    guangAiInfojq.setCaseNo(guangAiInfo.getCaseNo());
                    guangAiInfojq.setCloseTime(guangAiInfo.getCloseTime());
                    guangAiInfojq.setDamageDate(guangAiInfo.getDamageDate());
                    guangAiInfojq.setLicenseNo(guangAiInfo.getLicenseNo());
                    guangAiInfojq.setNotifyMan(guangAiInfo.getNotifyMan());
                    guangAiInfojq.setLicenseType(guangAiInfo.getLicenseType());
                    guangAiInfojq.setNotifyTime(guangAiInfo.getNotifyTime());
                    guangAiInfojq.setClaimNo(guangAiInfo.getClaimNo());
                    Date openTime = signMapperDao.queryOpenTimeByCaseNo(guangAiInfojq.getCaseNo());

                    guangAiInfojq.setOpenTime(openTime);
                    guangAiInfoList.add(guangAiInfojq);
                }
                if ("2".equals(guangAiInfo.getClaimtype())){
                    guangAiInfoG.setBsPayAmount(guangAiInfo.getBzPayAmount());
                    guangAiInfoG.setBsStatus(guangAiInfo.getBzStatus());
                    guangAiInfoG.setCaseNo(guangAiInfo.getCaseNo());
                    guangAiInfoG.setCloseTime(guangAiInfo.getCloseTime());
                    guangAiInfoG.setDamageDate(guangAiInfo.getDamageDate());
                    guangAiInfoG.setLicenseNo(guangAiInfo.getLicenseNo());
                    guangAiInfoG.setNotifyMan(guangAiInfo.getNotifyMan());
                    guangAiInfoG.setLicenseType(guangAiInfo.getLicenseType());
                    guangAiInfoG.setNotifyTime(guangAiInfo.getNotifyTime());
                    Date openTime = signMapperDao.queryOpenTimeByCaseNo(guangAiInfoG.getCaseNo());

                    guangAiInfoG.setOpenTime(openTime);
                    guangAiInfoList.add(guangAiInfoG);
                }
            }
        }

        return guangAiInfoList;
    }


    /*public static void main(String[] args) throws Exception {
        String path = "C:/Users/Administrator/Desktop/main/test/XLSX.xlsx";
        //创建Excel，读取文件内容
        File file=new File("C:/Users/Administrator/Desktop/main/test/XLSX.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        //两种方式读取工作表
        // Sheet sheet=workbook.getSheet("Sheet0");
        XSSFSheet sheet= workbook.getSheetAt(0);

        //获取sheet中最后一行行号
        int lastRowNum= sheet.getLastRowNum();
        int cout = 14;
        List<String> list = new ArrayList<>();
        String kucun;
        for (int i=0;i<=lastRowNum;i++){
            Row row=sheet.getRow(i);
            //获取当前行最后单元格列号
            int lastCellNum=row.getLastCellNum();

            for (int j=0;j<lastCellNum;j++){
                Cell cell=row.getCell(j);
                String value=cell.getStringCellValue();
                if (!"vin".equals(value)){

                    list.add(value);
                }
            }

        }
        if (list.size() > cout){
            System.out.println("长度超出14");
        }

    }*/

    /**
     * java遍历实体类的属性和值
     * @param args
     * @throws Exception
     */
   /* public static void main(String[] args) throws Exception{
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

    }*/

    /**
     * 判断日期是否在当月
     * @param args
     */
    /*public static void main(String[] args) {
        LocalDate now = LocalDate.now();//yyyy-MM-dd HH:mm:ss
        Date dates = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        LocalDate date = LocalDate.parse(format.format(dates), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(Period.between(now, date).getMonths());
        System.out.println(now.getMonth().getValue() == date.getMonth().getValue());
    }*/
   /* public static void main(String[] args) {
        List<AccVideoGuidVo> list1 = new ArrayList<>();

        List<AccVideoGuidVo> list = new ArrayList<>();
        AccVideoGuidVo accVideoGuidVo = new AccVideoGuidVo();
        accVideoGuidVo.setCumulativeTime("1");
        accVideoGuidVo.setCumulativeTime("12");
        list.add(accVideoGuidVo);
        System.out.println("111111" + list);

        for (AccVideoGuidVo videoGuidVo : list) {
            AccVideoGuidVo sd = new AccVideoGuidVo();
            sd.setCumulativeTime(videoGuidVo.getCumulativeTime());
            list1.add(sd);
        }

        List<AccVideoGuidVo> list2 = new ArrayList<>();
        AccVideoGuidVo accVideoGuidVosss = new AccVideoGuidVo();
        accVideoGuidVosss.setCumulativeTime("2");
        accVideoGuidVosss.setCumulativeTime("22");
        list2.add(accVideoGuidVosss);
        for (AccVideoGuidVo videoGuidVo : list2) {
            AccVideoGuidVo wei = new AccVideoGuidVo();
            wei.setCumulativeTime(videoGuidVo.getCumulativeTime());
            list1.add(wei);
        }



        List<AccVideoGuidVo> list3 = new ArrayList<>();
        AccVideoGuidVo accVideoGuidVoccc = new AccVideoGuidVo();
        accVideoGuidVoccc.setCumulativeTime("3");
        accVideoGuidVoccc.setCumulativeTime("33");
        list3.add(accVideoGuidVoccc);
        for (AccVideoGuidVo videoGuidVo : list3) {
            AccVideoGuidVo cha = new AccVideoGuidVo();
            cha.setCumulativeTime(videoGuidVo.getCumulativeTime());
            list1.add(cha);
        }

        System.out.println("ssssssss" + list1);

    }*/
   /* public static void main(String[] args) throws ParseException {
        *//*SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startTime = format.parse("2019-06-05 03:26:54");
        Date endTime = format.parse("2019-06-09 03:26:54");
        Date nowTime = new Date();
        boolean effectiveDate = isEffectiveDate(nowTime, startTime, endTime);
        if (effectiveDate) {
            System.out.println("当前时间在范围内");
        }else {
            System.out.println("当前时间在不在范围内");
        }
        System.out.println(new Date());*//*

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date endTime  = sdf.parse("2022-01-18");

        String starTimes = sdf.format(new Date());
        Date starTime  = sdf.parse(starTimes);

        long day = 60*1000*60*24; // 1天
        System.out.println("endTime：" + JSONObject.toJSONString(endTime.getTime()));
        System.out.println("ay * 31：" + JSONObject.toJSONString(day * 31));
        System.out.println("endTime.getTime() - (day * 31)：" + JSONObject.toJSONString(endTime.getTime() - (day * 31)));
        System.out.println("starTime .getTime()：" + starTime .getTime());

        if (endTime.getTime() - (day * 31) > starTime .getTime()) {
            System.out.println("超期");
        } else {
            System.out.println("期限内");
        }

       *//* if (endTime.getTime() + starTime.getTime() > day * 31 ){
            System.out.println("ssssss:  " + endTime.getTime() + starTime.getTime());
            System.out.println("超时");
        } else {
            System.out.println("期限内");
        }*//*

    }*/

    /**
     *
     * @param nowTime   当前时间
     * @param startTime	开始时间
     * @param endTime   结束时间
     * @return
     * @author sunran   判断当前时间在时间区间内
     */
   /* public static boolean isEffectiveDate(Date nowTime, Date startTime, Date endTime) {
        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return true;
        }

        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }*/

}




