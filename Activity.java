public class Activity {
    public static void main(String[] args) {
        Student student = new Student("Kim Eduard Saludes", "Balayan", "Information Technology", 2);

        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Program: " + student.getProgram());
        System.out.println("Year: " + student.getYear());
        System.out.println(student.toString());

        Staff staff = new Staff("Bobby Diosanta", "Dilaw", "Computer Engineering Technology", 10.0);

        System.out.println("\nStaff Details:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Address: " + staff.getAddress());
        System.out.println("School: " + staff.getSchool());
        System.out.println("Salary: " + staff.getSalary());
        System.out.println(staff.toString());
    }
}