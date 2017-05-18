package com.cssrc.mibo.chap2.instantiated;

/**
 * 通过私有构造器强化不可实例化的能力
 * 只要让该类包含自由的构造器，该类就不能被实例化。因为显示构造器是私有的，所以不可以
 * 在类的外部访问它。这种情况下，子类就没有可以访问的超类构造器了。
 * @author liuyangchao@163.com
 * @create 2017-05-18 8:49
 */
public class UtilityClass {
    private UtilityClass(){
        throw new AssertionError();
    }

}
