package org.example;

public class employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public employee(String name, double salary,int workHours, int hireYear) {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary > 1000.0){
            return  salary*0.03;
        }
        return 0;
    }

    double bonus(){
        if(this.workHours > 40){
            return (this.workHours-40)*30;
        }
        return 0;
    }

    double raiseSalary(){
        double extra;
        int year = 2021;
        if (year - this.hireYear <= 10){
            extra = salary*0.05;
        }else if(year- this.hireYear > 10 && year- this.hireYear <= 19){
            extra = salary*0.10;
        }else if(year- this.hireYear > 19){
            extra = salary*0.15;
        }else {
            extra = 0;
        }
        return extra;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", Tax=" + tax() +
                ", Bonus=" + bonus() +
                ", Increase in salary=" + raiseSalary() +
                ", Salary with Taxes and Bonuses=" + (salary + bonus() - tax()) +
                ", Increased Salary=" + (raiseSalary() + salary) +
                '}';
    }
}
