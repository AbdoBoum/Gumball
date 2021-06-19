package com.company;

import com.company.state.GumballAbstract;
import com.company.state.GumballNoQuarterState;
import com.company.state.GumballSoldeOutState;
import com.company.state.GumballState;

public class MachineGumball {

    private GumballState state;
    private int count = 0;

    public MachineGumball(int count) {
        this.count = count;
        state = count > 0 ? state = new GumballNoQuarterState() : new GumballSoldeOutState();
    }

    public void insertQuarter() {
        state.insertQuarter(this);
    }
    public void ejectQuarter() {
        state.ejectQuarter(this);
    }
    public void turnCrank() {
        state.turnCrank(this);
    }
    public void dispense() { state.dispense(this); }
    public void refill(int numGumBalls) {
        state.refill(this, count);
    }

    public GumballState getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setState(GumballState newState) {
        this.state = newState;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        result.append(count != 1 ? "s" : "");
        result.append(state.toString());
        return result.toString();
    }
}
