package com.cssrc.mibo.chap2.builder.javabeans;

/**
 * 这种模式依赖setter注入参数
 *
 * @author Administrator
 * @create 2017-05-16 16:55
 */
public class NutritionFacts {
    //基础参数
    private int servingSize = -1;
    private int servings = -1;
    //可选参数
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts(){

    }

    public static void main(String[] args){
        NutritionFacts nutritionFacts = new NutritionFacts();
        nutritionFacts.setServingSize(240);
        nutritionFacts.setServings(8);
        nutritionFacts.setCalories(100);
        nutritionFacts.setSodium(35);
        nutritionFacts.setCarbohydrate(27);
    }


    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
