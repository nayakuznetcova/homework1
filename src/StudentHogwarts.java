public class StudentHogwarts {
    private Hogwarts[] studentHogwarts;
    private int i;
    public StudentHogwarts(int size) {
        studentHogwarts = new Hogwarts[size];
        i=0;
    }

    public void add(Hogwarts student){
        studentHogwarts[i] = student;
        i++;
    }

    public void displayStudents(){
        for (int j = 0; j < i ; j++) {
            System.out.println(studentHogwarts[j]);
        }
    }
}
