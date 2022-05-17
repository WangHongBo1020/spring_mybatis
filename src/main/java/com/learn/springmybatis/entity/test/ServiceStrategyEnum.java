package com.learn.springmybatis.entity.test;


import com.learn.springmybatis.service.impl.ActivityStrategy;
import com.learn.springmybatis.service.impl.OrganizationStrategy;

/**
 * @author lvz
 * @date 2021/6/21
 */
public enum ServiceStrategyEnum {

    /**
     *
     */
    ORG("OrganizationEntity", OrganizationStrategy.class),

    /**
     *
     */
    ACTIVITY("ActivityEntity", ActivityStrategy.class),

    ;

    private String serviceId;
    private Class serviceClass;

    ServiceStrategyEnum(String serviceId, Class serviceClass) {
        this.serviceId = serviceId;
        this.serviceClass = serviceClass;
    }

    public Class getServiceClass() {
        return serviceClass;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public void setServiceClass(Class serviceClass) {
        this.serviceClass = serviceClass;
    }

    public static Class getServiceClassByServiceId(String serviceId){
        ServiceStrategyEnum[] items = ServiceStrategyEnum.values();
        for(ServiceStrategyEnum item:items){
            if(item.getServiceId().equals(serviceId)){
                return item.serviceClass;
            }
        }
        return null;
    }
}
