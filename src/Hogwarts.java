public abstract class Hogwarts {
    private String name;
    private String surname;
    private int powerMagic;
    private int transgression;
    private int sumPoints;

    public Hogwarts(String name, String surname, int sumPoints, int transgression, int powerMagic) {
        this.name = name;
        this.surname = surname;
        this.powerMagic = powerMagic;
        this.transgression = transgression;
        this.sumPoints = sumPoints;
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

    public int getSumPoints() {
        return sumPoints;
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

    public void setSumPoints(int sumPoints) {
        this.sumPoints = sumPoints;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void bestStudent(Hogwarts person2){
        if(getTransgression()+getPowerMagic() > person2.getTransgression()+getPowerMagic()){
            System.out.println(getName() + " лучше, чем " + person2.getName());
        } else if (getTransgression()+getPowerMagic() < person2.getTransgression()+getPowerMagic()) {
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
