public class JavaDeveloper extends Programmer{

    JavaDeveloper (String name, int age, HumanSex sex) {
        super(name, age, sex);
        this.codeLanguage = "Java";
    }

    protected void getOccupation (String occupation, int payment) {
        System.out.printf("%s will not do this for %s, he earns more as a Programmer in %s %n", this.getName(), payment, this.codeLanguage);
    }

}
