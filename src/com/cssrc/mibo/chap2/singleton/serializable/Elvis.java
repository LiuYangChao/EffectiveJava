package com.cssrc.mibo.chap2.singleton.serializable;

/**
 * ${DESCRIPTION}
 *
 * @author Administrator
 * @create 2017-05-17 15:22
 */
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis(){}

    public void leaveTheBuilding(){
        System.out.println("Whoa baby, I'm outta here!");
    }

    private Object readResolve(){
        return INSTANCE;
    }

    public static void main(String[] args){
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

}
