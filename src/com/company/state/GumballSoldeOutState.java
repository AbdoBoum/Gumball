package com.company.state;

import com.company.MachineGumball;

public class GumballSoldeOutState implements GumballState{
    @Override
    public void insertQuarter(MachineGumball machineGumball) {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter(MachineGumball machineGumball) {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank(MachineGumball machineGumball) {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void refill(MachineGumball wrapper, int numGumBalls) {
        wrapper.setCount(wrapper.getCount() + numGumBalls);
        wrapper.setState(new GumballNoQuarterState());
    }

    @Override
    public void dispense(MachineGumball wrapper) {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "sold out\n";
    }
}
