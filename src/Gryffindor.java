public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor (String name, String surname, int transgression, int powerMagic, int nobility, int honor, int bravery){
        super(name, surname, nobility + honor + bravery, transgression, powerMagic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void betterStudent(Gryffindor person2){
        if(getSumPoints() > person2.getSumPoints()){
            System.out.println(getName() + " лучше, чем " + person2.getName());
        } else if (getSumPoints() < person2.getSumPoints()) {
            System.out.println(getName() + " слабее, чем " + person2.getName());
        }else{
            System.out.println("Cилы равны");
        }
    }

    @Override
    public String toString() {
        return "Гриффиндор " +
                super.toString()+
                ", благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery;
    }
}
