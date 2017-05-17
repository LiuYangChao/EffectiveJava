package com.cssrc.mibo.chap2.singleton.enumoration;

/**
 * 枚举单例
 *
 * @author Administrator
 * @create 2017-05-17 15:07
 */
public enum Elvis {

    INSTANCE;

    public void leaveTheBuilding(){
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args){
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

}
