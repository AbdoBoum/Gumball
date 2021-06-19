package com.company.state;

import com.company.MachineGumball;

public class GumballNoQuarterState implements GumballState{
    @Override
    public void insertQuarter(MachineGumball wrapper) {
        System.out.println("You inserted a quarter");
        wrapper.setState(new GumballHasQuarterState());
    }

    @Override
    public void ejectQuarter(MachineGumball wrapper) {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank(MachineGumball wrapper) {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void refill(MachineGumball wrapper, int numGumBalls) {
        wrapper.setCount(wrapper.getCount() + numGumBalls);
        wrapper.setState(new GumballHasQuarterState());
    }

    @Override
    public void dispense(MachineGumball wrapper) {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "waiting for quarter\n";
    }
}
