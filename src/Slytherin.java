public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;


    public Slytherin (String name, String surname, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower){
        super(name, surname, cunning + determination + ambition + resourcefulness + lustForPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;

    }
    public void betterStudent(Slytherin person2){
        if(getPowerMagic() > person2.getPowerMagic()){
            System.out.println(getName() + " лучше, чем " + person2.getName());
        } else if (getPowerMagic() < person2.getPowerMagic()) {
            System.out.println(getName() + " слабее, чем " + person2.getName());
        }else{
            System.out.println("Cилы равны");
        }
    }

    @Override
    public String toString() {
        return "Слизерин " +
                super.toString()+
                ", хитрость = " + cunning +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + lustForPower;
    }
}
