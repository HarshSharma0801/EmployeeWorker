public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985",
                "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());


        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020",35000);
        System.out.println(joe);
        System.out.println("joe's paycheck is $"+ joe.collectPay());
        joe.retire();
        System.out.println("joe's pension pay is $"+joe.collectPay());
        HourlyEmployee lina = new HourlyEmployee("lina","05/02/1999","03/03/2021",
                15);
        System.out.println(lina);
        System.out.println("lina's paycheck is $"+lina.collectPay());
        System.out.println("lina's holiday paycheck is $"+lina.getDoublePay());



    }
}