public class main {
    public static void main(String[] args) {
        employee employee1=new employee(300,10);
        employee employee2=new employee(600,5);
        System.out.println(employee1.getInfo(employee1.getSalary(),employee1.getWorkHours()));
        System.out.println(employee2.getInfo(employee2.getSalary(),employee2.getWorkHours()));
        System.out.println(employee1.addsalary());
        System.out.println(employee1.addworkinhours());
        System.out.println(employee2.addsalary());
        System.out.println(employee2.addworkinhours());

    }
}
