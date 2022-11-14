package vvashkolup;

import vvashkolup.sameClass1.SameClass;

public class Main {
    public static void main(String[] args) {
        //Class #1
        vvashkolup.sameClass1.SameClass sameClass1=new vvashkolup.sameClass1.SameClass();
        sameClass1.start();

        //Class #2
        vvashkolup.sameClass2.SameClass sameClass=new vvashkolup.sameClass2.SameClass();
        sameClass.start();


        Employee employee=new Employee("Volodymyr","Vashkolup",
                "Romanovych","Junior Java Developer",
                "vovavashkolup@gmail.com","+3801234567",
                22);

        System.out.println("\nWelcome our new team member!\nFrom now on " +employee.getName()
        +" "+employee.getSurname()+" "+employee.getFathersName()+
                " will occupy the position of " +employee.getPosition()+" \n\nContact information:\n"+employee.getEmail()+"\n"+
                employee.getTelephone());

        Car car=new Car("Audi A3","Black",2016,true,true);
        car.start();
    }
}
