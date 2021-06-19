package com.company.state;

import com.company.MachineGumball;

public class GumballSoldeState implements GumballState{
    @Override
    public void insertQuarter(MachineGumball machineGumball) {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter(MachineGumball machineGumball) {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank(MachineGumball machineGumball) {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void refill(MachineGumball wrapper, int numGumBalls) {
        wrapper.setCount(wrapper.getCount() + numGumBalls);
        wrapper.setState(new GumballNoQuarterState());
    }

    @Override
    public void dispense(MachineGumball wrapper) {
        System.out.println("A gumball comes rolling out the slot");
        wrapper.setCount(wrapper.getCount() - 1);
        wrapper.setState(wrapper.getCount() == 0 ? new GumballSoldeOutState() : new GumballNoQuarterState());
    }

    @Override
    public String toString() {
        return "delivering a gumball\n";
    }
}
