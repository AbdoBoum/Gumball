package com.company.state;

import com.company.MachineGumball;

public interface GumballState {
    void insertQuarter(MachineGumball wrapper);
    void ejectQuarter(MachineGumball wrapper);
    void turnCrank(MachineGumball wrapper);
    void refill(MachineGumball wrapper, int numGumBalls);
    String toString();

    void dispense(MachineGumball wrapper);

}
