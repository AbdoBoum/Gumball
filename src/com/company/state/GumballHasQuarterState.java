package com.company.state;

import com.company.MachineGumball;

public class GumballHasQuarterState implements GumballState {
    @Override
    public void insertQuarter(MachineGumball wrapper) {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter(MachineGumball wrapper) {
        System.out.println("Quarter returned");
        wrapper.setState(new GumballNoQuarterState());
    }

    @Override
    public void turnCrank(MachineGumball wrapper) {
        System.out.println("You turned...");
        wrapper.setState(new GumballSoldeState());
        wrapper.dispense();
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
        return "waiting for turn of crank\n";
    }
}
