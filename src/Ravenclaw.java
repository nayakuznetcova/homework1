public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw (String name, String surname, int transgression, int mind, int wisdom, int wit, int creation){
        super(name, surname, mind + wisdom + wit + creation, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }
    public void betterStudent(Ravenclaw person2){
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
        return "Когтевран " +
                super.toString()+
                ", ум = " + mind +
                ", мудрость = " + wisdom +
                ", остроумие = " + wit +
                ", творчество = " + creation;
    }
}
