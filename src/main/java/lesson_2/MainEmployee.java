package lesson_2;

public class MainEmployee {
    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Oleg", "Mironov", "" + "QA manual", "mironov@bk.ru", "9198247653", 100, 20);
        employeesArray[1] = new Employee("Oleg", "Mironov", "" + "QA manual", "mironov@bk.ru", "9198247653", 100, 20);
        employeesArray[2] = new Employee("Oleg", "Mironov", "" + "QA manual", "mironov@bk.ru", "9198247653", 100, 20);
        employeesArray[3] = new Employee("Oleg", "Mironov", "" + "QA manual", "mironov@bk.ru", "9198247653", 100, 20);
        employeesArray[4] = new Employee("Oleg", "Mironov", "" + "QA manual", "mironov@bk.ru", "9198247653", 100, 20);

        for (Employee employee : employeesArray) {
            employee.printEmployee();
        }
Park.Attraction attraction1 = new Park("Sokolniku","Moscow", "RUS").new Attraction("AmericanRoll",10,22,500);
        System.out.println(attraction1);

    }
}
