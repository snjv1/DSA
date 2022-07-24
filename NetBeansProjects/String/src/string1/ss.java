/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string1;

/**
 *
 * @author sanje
 */


public class ss {
    public static void main(String[] args){
        
    }
}
 class fan
{

    public fan() {      //6
    }
     
    static final int SLOW =1;     //1
    static final int MEDIUM =2;  
    static final int FAST =3;        
    
    private int speed = SLOW;    //2
    
    private boolean x =false;       //3
    
    private double radius =5;       //4
    
    private String color ="red";        //5

   
    
   // 7
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isX() {
        return x;
    }

    public void setX(boolean x) {
        this.x = x;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //8
     @Override
    public String toString() {
        return "fan{" + "speed=" + speed + ", x=" + x + ", radius=" + radius + ", color=" + color + '}';
    }

}
