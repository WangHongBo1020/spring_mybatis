package com.learn.springmybatis.entity.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.BeanValidationPostProcessor;

/**
 * @author lvz
 * @date 2021/6/21
 */
@Component
public class SpringUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        SpringUtils.applicationContext = applicationContext;
    }


    /**
     * 获取 ApplicationContext
     *
     * @return ApplicationContext
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 根据class 获取spring容器中的bean
     *
     * @param clazz clazz
     * @return Object
     */
    public static Object getBean(Class<?> clazz) {
        return getApplicationContext().getBean(clazz);
    }
}
