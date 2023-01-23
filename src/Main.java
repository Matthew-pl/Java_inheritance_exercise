public class Main {
    public static void main(String[] args) {

/*
        Create 3 classes: Human, Programmer, JavaDeveloper.
                a) Bind the classes:
                - Human is the parent
                - Programmer inherits from Human
                - JavaDeveloper inherits from Programmer
        b) For each class, create a constructor that calls the parent constructor (if it
        exists) and prints information about its call, e.g. for the class Human
        we should get the message "Calling the constructor Human".
        c) Create an object of class JavaDeveloper
        d) *Through the JavaDeveloper object, call any method created
        in the class Human, which will take one parameter. What should it have
        access modifier?
        e) ** Overload a method from the Man class inside the JavaDeveloper class so that it can
        accept additional parameters.

        Additional comment for github purposes
*/

        Human mark = new Human("Mark", 20, HumanSex.MALE);
        JavaDeveloper programmerMatthew = new JavaDeveloper("Matthew", 30, HumanSex.MALE);

        // this method will work because it is protected method, would also work with public or not modifier
        System.out.println(programmerMatthew.getName());

        /*
        below method will not work, as getSex is private method of Human
        System.out.println(programmerMatthew.getSex();
        */
        mark.getOccupation("Carpenter");
        programmerMatthew.getOccupation("Firefighter", 500000);
    }
}