public class employee {
     private int salary;
     private int workHours;

    public int getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public employee(int salary, int workHours) {
        this.salary = salary;
        this.workHours = workHours;
    }
    public String getInfo(int salary, int workHours){
        return "salary:"+this.salary+" work hours "+this.workHours;

    }
    public String addsalary(){
        if (this.salary<500){
            this.salary=salary+10;
        }return "first salary:"+this.salary;

    }
    public String addworkinhours(){
        if (this.workHours>6){
            int extra=this.workHours-6;
            this.salary=salary+extra*5;
        }return "last salary: "+this.salary;
    }
}
