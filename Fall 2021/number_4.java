/**

 Construct a class named Member. The Member class has five private instance variables namely, name (String), age (int),
 number (String), salary (double), experience (double). The Member class must have the followings:
 i.  A constructor that initializes all five instance variables.
 ii. Write appropriate setter-getter methods for each instance variables.

 Construct a new class named Employee that inherits Member class. The Employee class has its own attributes named designation (String). The Employee class must have the followings:

 iii. A constructor that gets all the Member class variables using super constructor and initializes the designation variable.
 iv. A changedesignation() method that changes the designation of an employee if the experience is greater than five. If the change is not possible then print a simple message stating that designation change is not possible.
 v. A getdesignation() method that returns the designation of the employee.

 Construct a Mainclass. Inside the Mainclass, create an object of Employee with proper constructor call. Provide a call to changedesignation() method to check if the designation is changed or not.

 */



class Member {

private String name;
    private int age;
    private String number;
    private double salary;
    private double experience;

    public Member(String name, int age, String number, double salary, double experience) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }

    public double getSalary() {
        return salary;
    }

    public double getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }


}

class Employee extends Member {
    private String designation;

    public Employee(String name, int age, String number, double salary, double experience, String designation) {
        super(name, age, number, salary, experience);
        this.designation = designation;
    }

    public void changeDesignation() {
        if (getExperience() > 5) {
            designation = "Senior " + designation;
        } else {
            System.out.println("Designation change is not possible");
        }
    }

    public String getDesignation() {
        return designation;
    }
}

class MainClass {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, "1234567890", 50000, 5, "Developer");
        employee.changeDesignation();
        System.out.println(employee.getDesignation());
    }
}