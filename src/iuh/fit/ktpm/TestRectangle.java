/*
 * @ (#) TestRectangle.java     1.0     25/08/2024
 *
 *Copyright (c) 2024 IUH. All rights reserved.
 */
package iuh.fit.ktpm;


/*
 * @description: This class represents a bank with many bank accounts
 * @author: Anh, Le The Anh
 * @date: 25/08/2024
 * @version: 1.0
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle re1 = new Rectangle();

        re1.setWidth(2.0);
        re1.setLength(3.0);
        System.out.println("Rectangle 1: "+re1.getWidth()+" "+re1.getLength());
        System.out.println("ARea: "+re1.getArea());
        System.out.println("Perimeter: "+re1.getPerimeter());
    }
}