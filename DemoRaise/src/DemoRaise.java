public class DemoRaise {
    public static void main(String[] args) {
        double salary = 200.00;
        double startingWage = 800.00;
        double myNewSalary;
        System.out.println("Demonstrating some raises ");
        myNewSalary = predictRaise(400.00);
        myNewSalary = predictRaise(salary);
        myNewSalary = predictRaise(startingWage);
        System.out.println("Current salary: "+ salary + " After raise: "+ myNewSalary );
    }

    public static double predictRaise(double salary){
        double newSalary;
        final double raiseRate = 1.65;
        newSalary = salary * raiseRate;
        return newSalary;
    }
}
