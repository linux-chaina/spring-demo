package com.example.demo.domain;

/**
 * @author zhangjianwei
 * @date 2019/1/10
 */
public class Dog {
    private String weight;
    private String color;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
