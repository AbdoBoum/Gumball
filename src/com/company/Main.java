package com.company;

public class Main {

    public static void main(String[] args) {

            int count = 10;
            MachineGumball gumballMachine = new MachineGumball(count);


            System.out.println(gumballMachine);
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();

            System.out.println(gumballMachine);

            gumballMachine.insertQuarter();
            gumballMachine.ejectQuarter();
            gumballMachine.turnCrank();

            System.out.println(gumballMachine);

            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            gumballMachine.ejectQuarter();

            System.out.println(gumballMachine);

            gumballMachine.insertQuarter();
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();

            System.out.println(gumballMachine);

    }
}




