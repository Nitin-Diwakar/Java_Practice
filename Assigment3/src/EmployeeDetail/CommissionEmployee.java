package EmployeeDetail;
public class CommissionEmployee extends Employee{
    public double sales;
    public double commission;

    public void salary(){

    }

    public String toString(){
        return "Name:"+name+"; "+ "Sales:"+sales + "; " + "Commission:" + commission;
    }
}