/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clovece;

import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class Hrac {
String meno;
boolean hra;
String riadi;
int[] figurky;
int start;
    public Hrac(String meno, boolean hra, String riadi, int start) {
        this.meno=meno;
        this.hra=hra;
        this.riadi= riadi;
        this.figurky=new int[4];
        Arrays.fill(figurky, -1);
        this.start=start;
    }
    
    
}
