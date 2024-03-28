package com.corejava;

public class InheritanceExample {
    public static void main(String [] args) {
        SalesEmployee salesEmployee = new SalesEmployee(10,30000,5000);
        System.out.println("Id : "+salesEmployee.id+", Sal : "+salesEmployee.sal+", Sales Incentive : "+salesEmployee.saleIncentive);
    }
}

class Employee {
    int id, sal;

    Employee(int id, int sal) {
        this.id = id;
        this.sal = sal;
    }
}

class SalesEmployee extends Employee {
    int saleIncentive;
    SalesEmployee(int id, int sal, int saleIncentive) {
        super(id,sal);
        this.saleIncentive = saleIncentive;
    }
}
