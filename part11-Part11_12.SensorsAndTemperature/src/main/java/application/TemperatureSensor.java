/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author alexe
 */
public class TemperatureSensor implements Sensor {

    private int temp;
    private boolean onOf;

    public TemperatureSensor() {
        this.onOf = false;
        Random random = new Random();

    }

    @Override
    public boolean isOn() {
        return onOf;
    }

    @Override
    public void setOn() {
        this.onOf = true;
    }

    @Override
    public void setOff() {
        this.onOf = false;
    }

    @Override
    public int read() {
        if (onOf) {
            this.temp=new Random().nextInt(61) - 30;
            return temp;
        } else {
            throw new IllegalStateException("Illegal state!");
        }
    }
}


