package com.cssrc.mibo.chap2.static_factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * main:考虑用静态工厂方法代替构造器
 * 先注册，才能根据注册的名称找出Service
 * @author liuyangchao@163.com
 * @create 2017-05-15 16:33
 */
public class Services {

    private Services(){}

    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    //默认注册方法
    public static void registerDefaultProvider(Provider provider){
        registerProvider(DEFAULT_PROVIDER_NAME, provider);
    }
    //普通注册方法
    public static void registerProvider(String name, Provider provider){
        providers.put(name, provider);
    }
    //重载方法1
    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
    //重载方法2
    public static Service newInstance(String name){
        Provider provider = providers.get(name);
        if(provider == null){
            throw new IllegalArgumentException("No provider registered with name: "+name);
        }
        return provider.newService();
    }

}
