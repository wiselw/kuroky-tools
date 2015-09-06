package com.kuroky.entity;

import java.text.DecimalFormat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( Integer.valueOf("1.0"));
        //System.out.println( Integer.parseInt("1.0"));
        DecimalFormat df1 = new DecimalFormat("0.0");   
        DecimalFormat df2 = new DecimalFormat("#.#");   
        DecimalFormat df3 = new DecimalFormat("000.000");   
        DecimalFormat df4 = new DecimalFormat("###.###");  
        DecimalFormat df5 = new DecimalFormat("0"); 
        System.out.println(df1.format(12.34));   
        System.out.println(df2.format(12.34));   
        System.out.println(df3.format(12.34));   
        System.out.println(df4.format(12.34));
        System.out.println(df5.format(12.34)); 
    }

}
