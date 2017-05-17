package com.cssrc.mibo.chap2.singleton.method;

/**
 * 私有单例对象，暴露一个public方法提供单例
 *
 * @author Administrator
 * @create 2017-05-17 15:21
 */
public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis(){}

    public static Elvis getInstance(){
        return INSTANCE;
    }

    public void leaveTheBuilding(){
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args){
        Elvis elvis =  Elvis.getInstance();
        elvis.leaveTheBuilding();
    }

}
