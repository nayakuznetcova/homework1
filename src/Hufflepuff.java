public class Hufflepuff extends Hogwarts{
    private int indusriousness;
    private int loyalty;
    private int honor;

    public Hufflepuff (String name, String surname, int transgression, int powerMagic, int indusriousness, int loyalty, int honor){
        super(name, surname, indusriousness + loyalty + honor, transgression, powerMagic);
        this.indusriousness = indusriousness;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    public void betterStudent(Hufflepuff person2){
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
        return "Пуффендуй " +
                super.toString()+
                ", трудолюбие = " + indusriousness +
                ", верность = " + loyalty +
                ", честь = " + honor;
    }
}
