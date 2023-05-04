public abstract class Hogwarts {
    private String name;
    private String surname;
    private int powerMagic;
    private int transgression;

    public Hogwarts(String name, String surname, int powerMagic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.powerMagic = powerMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void bestStudent(Hogwarts person2){
        if(getTransgression() > person2.getTransgression()){
            System.out.println(getName() + " лучше, чем " + person2.getName());
        } else if (getTransgression() < person2.getTransgression()) {
            System.out.println(getName() + " слабее, чем " + person2.getName());
        }else{
            System.out.println("Cилы равны");
        }
    }

    @Override
    public String toString() {
        return "Хогвартс " +
                "имя - " + name +
                ", фамилия - " + surname +
                ", сила магии = " + powerMagic +
                ", трансгрессия = " + transgression;
    }
}
