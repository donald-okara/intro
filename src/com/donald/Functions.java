package com.donald;

public class Functions {
    //access modifiers

    private double volumeSphere(double radius){
        double volume = 22/7.0 * Math.pow(radius,3) * 4/3.0;
        return volume;
    }

    public static double areaCircle(double radius){
        double area = 22/7.0 * radius * radius;
        System.out.println(area);
        return area;
    }

    public static void main(String[] args) {
     //objects == variables
        Functions f = new Functions(); //create object
        System.out.println((f.volumeSphere(5)));
        double v = f.volumeSphere(11);
        Functions.areaCircle(7);



      /*  areaCircle(7);
        areaCircle(9.1);
        areaCircle(413.202);

        double result = areaCircle(11.25544654);
        System.out.println(Math.round(result));
        System.out.println(result*54);
*/



    }
}
