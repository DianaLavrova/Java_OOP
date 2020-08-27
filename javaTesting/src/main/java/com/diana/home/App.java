package com.diana.home;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        appleBox.put(new Apple());
        appleBox.put(new Apple());
        appleBox1.put(new Apple());
        orangeBox.put(new Orange());
        orangeBox1.put(new Orange());

        System.out.println(appleBox.getWeight());
        System.out.println(appleBox.compareWeight(appleBox1));
        appleBox.moveFruits(appleBox1);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());

        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox.compareWeight(orangeBox1));
        orangeBox.moveFruits(orangeBox1);
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox1.getWeight());
    }
}
