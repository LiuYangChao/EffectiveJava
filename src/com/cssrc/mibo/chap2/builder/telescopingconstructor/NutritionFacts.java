package com.cssrc.mibo.chap2.builder.telescopingconstructor;

/**
 * 这是一种常规重叠构造器模式，参数越多，构造器越多，很有可能因为参数次序
 * 或者调用有误发生错误。（不推荐）4个参数以下可以使用
 * @author liuyangchao@163.com
 * @create 2017-05-15 20:01
 */
public class NutritionFacts {

    private final int servingSize;                //基础参数
    private final int servings;                     //基础参数

    private final int calories;                  // 可选参数
    private final int fat;                          // 可选参数
    private final int sodium;                 // 可选参数
    private final int carbohydrate;         // 可选参数

    public NutritionFacts(int servingSize, int servings){
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories){
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat){
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat,
                          int sodium){
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat,
                          int sodium, int carbohydrate){
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

}
