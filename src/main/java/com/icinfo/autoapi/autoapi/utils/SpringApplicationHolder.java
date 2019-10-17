/** created by leihong.pan at 2019/10/17 14:27 */
package com.icinfo.autoapi.autoapi.utils;


import org.springframework.context.ApplicationContext;

public class SpringApplicationHolder {
    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext applicationContext){
        SpringApplicationHolder.applicationContext = applicationContext;
    }

    <T> T getBean(Class<T> tClass){
        return applicationContext.getBean(tClass);
    }

}
