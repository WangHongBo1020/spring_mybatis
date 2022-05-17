package com.learn.springmybatis.mapper;

import com.learn.springmybatis.entity.changjiu.*;
import com.learn.springmybatis.entity.qiandao.GroupCacheHandler;
import com.learn.springmybatis.entity.test.*;
import com.learn.springmybatis.utils.AmlCustomerNature;
import com.learn.springmybatis.utils.C_Claim;
import com.learn.springmybatis.utils.Collisionpoint;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * com.sunshine.autoclaim.dao.lossdetertorisk
 *
 * @Author wujiyao
 * @create 2021 2021/4/23 21:31
 */
@Mapper
public interface SignMapperDao {


    /**
     * 通过工号查出不包含定损岗位信息的团队代码
     * @author 王九良
     * @param userCode
     * @return
     * 202018年08月07日下午17:32:09
     */
    public List<String> getNotContainDSPostGroupInfoByUserCode(String userCode);

    /**
     * @Description: 查询d_group
     * @author xukang
     * @date 20200913
     * @param paramMap	paramMap
     * @return: java.util.List<java.lang.String>
     */
    List<String> queryGroupCodeList(Map<String, Object> paramMap);

    List<GroupCacheHandler> getGroupCacheHandler(@Param("groupId") String groupId, @Param("userCode") String userCode, @Param("isVideo") String isVideo);

    void addGroupHandlerCache(GroupCacheHandler cacheHandler);

    void addGroupHandlerCacheList(List<GroupCacheHandler> cacheHandlers);

    void delGroupCacheHandler(@Param("groupId") String groupId, @Param("userCode") String userCode,  @Param("isVideo") String isVideo);

    boolean getRedisBeforeStatus();

    void modifyRedisFlagWhenNotCon(@Param("key") String key, @Param("value") String value);

    List<GroupCacheHandler>  getGroupCacheHandlerMap(String isVideo);

    List<String> getGroupCacheHandlerUserCodeList(@Param("groupId") String groupId, @Param("userCode") String userCode,  @Param("isVideo") String isVideo);

    String findSzRePushMsgBySequenceNo(String claimNo);

    String findSzRePushMsgByclaimNo(String claimNo);

    String findSzRePushMsgByclaimcode(String claimNo);

    String findSzRePushMsgBypaysequence(String claimNo);

    Map<String, Object> findSzadjustmentList (@Param("claimNo")String claimNo,@Param("payseQuence")String payseQuence);

    int getClaimFlowByClaimNo(String claimNo);

    String getIdentification(String caseNo);

    Map<String, Object> getC_lossitemList(@Param("caseno")String caseno, @Param("losstype")String losstype);

    Map<String, Object> getJqFVehicleObjList(@Param("caseno")String caseno, @Param("subserialno")Long subserialno);

    Map<String, Object >getFVehicleObjList(@Param("caseno")String caseno,@Param("subserialno")Long subserialno);

    Map<String, Object> getC_surveytask(String caseno);

    C_Claim genC_claimObj(String claimNo);

    Map<String, Object> getUnderWriteEndTime(String claimNo);

    Map<String, Object> getC_estimate(@Param("caseno")String caseno,@Param("lossitemserialno")String lossitemserialno);

    Map<String, Object> getC_estimatelistObjMap(String estimateno);

    Map<String, Object> getC_taskauditCl(@Param("caseNo")String caseNo, @Param("estimateno")String estimateno);

    /**
     * 车辆损失部位代码
     * @param caseNo
     * @param lossitemserialno
     * @return
     */
    List<Collisionpoint> getC_loss_SionPoint(@Param("caseNo")String caseNo, @Param("lossitemserialno")String lossitemserialno);

    List<C_Claim> getclaimNo(String caseno);

    boolean getSwitch(String claimno1);

    AmlCustomerNature getCustomerNatureIdcardNo(String idcardNo);

    List<AccVideoGuideentity> getAcquisitionTime(@Param("VIDEO_PATH") String VIDEO_PATH);

    int upadateTime(@Param("estimateNo")String estimateNo, @Param("createTime")Date createTime,
                    @Param("updateTime")Date updateTime,@Param("sec") long sec,
                    @Param("status")String status,
                    @Param("videoconnectDegree")String videoconnectDegree);


    List<AccVideoGuidVo> getcumulativeTime(String estimateNo);

    List<GibaoanInfo> getgibaoanInfos(String csaeNo);


    String getc_claim(String csaeNo);

    String getreopenReason(String claimNo);


    List<GuangAiInfo> getlicenseno(@Param("caseNo") String caseNo, @Param("engineNo")String engineNo,
                                   @Param("plateNo")String plateNo,
                                   @Param("policyNo")String policyNo, @Param("vin")String vin);

    /**
     * 查询立案时间
     * @param caseNo
     * @return
     */
    Date queryOpenTimeByCaseNo(String caseNo);

    List<Testceshi> queryWeipan(String claimNo);

    List<Testceshic> queryYipan(String claimNo);

    void upadatetime(@Param("ssd")Date date);

    List<WmsGression> queryBrandStockroom(@Param("vin")String vin,
                                          @Param("stockroomName")String stockroomName);

    String getpositionStatus(@Param("list") List<WmsGression> stockroomPartitionId, @Param("s")String s);

    String queryBrandStockrooms();

    int insetStockroomPreserve(@Param("vo")WmsStockroomPreserveDetail preserveDetail,
                               @Param("qian") String preserveDyDataDto,
                               @Param("hou") String preserveTyDataDto);

    WmsStockroomPreserveDetail getweihujihuachaxun(@Param("vo")String preserveCode);

    int insetcharubuwi(@Param("vo") WmsStockroomInsideDetailsDto dto);

    List<WmsStockroomDiscspotDetails> chongfushuju(@Param("kehu") String kehu,
                                                   @Param("pinpai") String pinpai,
                                                   @Param("danhao") String danhao);

    List<WmsStockroomMonthdiscspotFsDto> queryData();

    List<WmsStockroomMonthdiscspotFsDto> querySumAmount(@Param("list")List<WmsStockroomMonthdiscspotFsDto> rmRepetition);

    int upadateyiwei();

}
