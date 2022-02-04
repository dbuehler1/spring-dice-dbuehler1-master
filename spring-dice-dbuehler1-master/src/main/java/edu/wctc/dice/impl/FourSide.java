package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRoller;
import org.springframework.stereotype.Component;

import java.util.Random;

public class FourSide implements DieRoller {
    @Override
    public int rollDie(){
        Random random = new Random();
        return random.nextInt(4) + 1;
    }
}
