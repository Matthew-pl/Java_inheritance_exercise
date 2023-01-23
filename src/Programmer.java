public class Programmer extends Human{

    String codeLanguage;
    Programmer(String name, int age, HumanSex sex) {
        super(name, age, sex);
        System.out.printf("We have created new Programmer, who's name is %s%n", this.name);
    }

    void setCodeLanguage (String codeLanguage) {
        this.codeLanguage = codeLanguage;
    }

}
