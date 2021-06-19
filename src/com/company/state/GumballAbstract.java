package com.company.state;

import com.company.MachineGumball;

public abstract class GumballAbstract {

    public abstract void insertQuarter(MachineGumball wrapper);
    public abstract void ejectQuarter(MachineGumball wrapper);
    public abstract void turnCrank(MachineGumball wrapper);
    public abstract void refill(MachineGumball wrapper, int numGumBalls);


    protected abstract void dispense(MachineGumball wrapper);

}
