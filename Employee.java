//Alenna - alenna.castaneda@oneidaihla.org
//for CTE software development 1
//instructor Mr Gross

public class Employee {
    //creating attributes
    private String fname;
    private String lname;

    //constructor
    public Employee(String fname,String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    //putting attributes into a string
    public String toString() {
        return (fname+", "+lname);
    }

    //dividing two integars
    public static void divide(int numerater,int denomerator) {
        //trying to divide x by y
        try {
            System.out.println(numerater % denomerator);
            //"catching" failed method
        } catch(ArithmeticException a) {
            System.out.println("Error message");
            //printing error message
            System.out.println(a);
            System.out.println("Attempted equation: "+numerater+" / "+denomerator);
        }
    }

    //running above code
    public static void main(String[] args) {
        //creating 5 employees
        Employee p1 = new Employee("Robert", "Bilence");
        Employee p2 = new Employee("Bethany", "Miller");
        Employee p3 = new Employee("Alex", "Kelser");
        Employee p4 = new Employee("Brian", "Makenzie");
        Employee p5 = new Employee("Rachel", "Willows");

        //creating "allEmployees" array for 4 variables
        Employee[] allEmployees = new Employee[4];

        
        //trying to add all employees to array
        try {
            //adding employees to array
            allEmployees[0] = p1;
            allEmployees[1] = p2;
            allEmployees[2] = p3;
            allEmployees[3] = p4;
            allEmployees[4] = p5;
            //"catching" array error
        } catch(ArrayIndexOutOfBoundsException r) {
            System.out.println("Error message");
            //printing error message
            System.out.println(r);
        }

        System.out.println(); //adding a space
        System.out.println("First four employees");
        //printing employees
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i]);
        }

        System.out.println(); //adding a space
        //dividing numbers
        divide(172,0);
    }
}