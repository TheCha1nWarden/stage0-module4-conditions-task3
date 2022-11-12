package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary > 0) {
            double taxes;
            if (salary <= 10000) {
                taxes = 0.15;
            } else {
                if (salary <= 20000) {
                    taxes = 0.18;
                } else {
                    taxes = 0.2;
                }
            }
            System.out.println(Math.round(salary * (1 - taxes) * 10 )/ 10.0);
        } else {
            System.out.println("wrong input!");
        }
    }
}
