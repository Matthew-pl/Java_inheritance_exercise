public class Human {
    String name;
    int age;
    HumanSex sex;

    Human (String name, int age, HumanSex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.printf("We have created new human named %s%n", this.name);

    }

    protected String getName () {
        return this.name;
    }

    protected void getOccupation (String occupation) {
        System.out.printf("%s occupation is %s%n", this.name, occupation);
    }

    private HumanSex getSex () {
        return this.sex;
    }



}
