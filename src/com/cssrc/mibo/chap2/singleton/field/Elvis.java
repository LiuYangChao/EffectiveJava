package com.cssrc.mibo.chap2.singleton.field;

/**
 * public定义的对象实例可以直接调用方法
 *
 * @author Administrator
 * @create 2017-05-17 15:13
 */
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis(){

    }

    public void leaveTheBuilding(){
        System.out.println("Whoa baby, I'm outta here!");
    }

    private void testBuilding(){
        System.out.println("Whoa baby, I'm outta here!(test)");
    }

    public static void main(String[] args){
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
        elvis.testBuilding();
    }

}
