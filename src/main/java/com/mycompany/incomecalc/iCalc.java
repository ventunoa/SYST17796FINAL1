/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.incomecalc;

/**
 *
 * @author Noah
 */
public class iCalc {
    public int calculateNet(int hours,int rate, int tax){
        int gross=hours*rate;
        int net=gross - tax;
        return net;
    }
    
}
