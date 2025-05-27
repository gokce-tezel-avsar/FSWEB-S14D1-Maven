package com.workintech.developers;

import java.util.ArrayList;
import java.util.List;

public class HRManager extends Employee {
    List<String> juniorDevelopers;
    List<String> midDevelopers;
    List<String> seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new ArrayList<>();
        this.midDevelopers = new ArrayList<>();
        this.seniorDevelopers = new ArrayList<>();
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
    }

    public void addEmployee(String juniorDeveloper1, String midDeveloper1,String seniorDeveloper1){
        juniorDevelopers.add(juniorDeveloper1);
        midDevelopers.add(midDeveloper1);
        seniorDevelopers.add(seniorDeveloper1);
    }

}
