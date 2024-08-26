/*
 * @ (#) Rectangle.java     1.0     25/08/2024
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

/**
 * Đây là lớp Rectangle để mô tả hình chữ nhật.
 * Nó có các thuộc tính chiều dài và chiều rộng,
 * và các phương thức để tính diện tích và chu vi.
 */
public class Rectangle {
    private double width;
    private double length;

    /**
     * Tạo một hình chữ nhật mặc định (1.0 x 1.0).
     */
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    /**
     * Tạo một hình chữ nhật với chiều dài và chiều rộng cụ thể.
     *
     * @param width Chiều rộng (> 0).
     * @param length Chiều dài (> 0).
     */
    public Rectangle(double width, double length) {
        if(width <= 0 || length <= 0) {
            System.out.println("Width and length must be greater than 0");
            return;
        }
        this.width = width;
        this.length = length;
    }

    /**
     * @return Diện tích hình chữ nhật.
     */
    public double getArea() {
        return this.width * this.length;
    }

    /**
     * @return Chu vi hình chữ nhật.
     */
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    /**
     * @return Chiều rộng hiện tại.
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Thiết lập chiều rộng mới.
     *
     * @param newVal Chiều rộng mới (> 0).
     */
    public void setWidth(double newVal) {
        if (newVal <= 0) {
            System.out.println("Width must be greater than 0");
            return;
        }
        this.width = newVal;
    }

    /**
     * @return Chiều dài hiện tại.
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Thiết lập chiều dài mới.
     *
     * @param length Chiều dài mới (> 0).
     */
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be greater than 0");
        }
    }

    /**
     * Tính diện tích với chiều dài và chiều rộng được chỉ định.
     *
     * @param width Chiều rộng.
     * @param length Chiều dài.
     * @return Diện tích hình chữ nhật.
     */
    public double getArea(double width, double length) {
        return width * length;
    }

    /**
     * Tính chu vi với chiều dài và chiều rộng được chỉ định.
     *
     * @param width Chiều rộng.
     * @param length Chiều dài.
     * @return Chu vi hình chữ nhật.
     */
    public double getPerimeter(double width, double length) {
        return 2 * (width + length);
    }
}