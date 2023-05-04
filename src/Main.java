public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри", "Поттер", 75, 7, 9, 7);
        Gryffindor ronWeasley = new Gryffindor("Рон", "Уизли", 50, 5, 6, 8);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", 90, 7, 8, 7);

        System.out.println(harryPotter);
        System.out.println(ronWeasley);
        System.out.println(hermioneGranger);

        harryPotter.betterStudent(hermioneGranger);



        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", 70, 7, 6, 8, 7, 9);
        Slytherin grahamMontegrew = new Slytherin("Грэхэм", "Монтегрю", 50, 6, 5, 4, 7, 4);
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", 55, 7, 4, 3, 6, 4);

        System.out.println(dracoMalfoy);
        System.out.println(grahamMontegrew);
        System.out.println(gregoryGoyle);

        dracoMalfoy.betterStudent(grahamMontegrew);



        Ravenclaw zhouChang = new Ravenclaw("Чжоу", "Чанг", 65, 6, 7, 9, 6);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 70, 7, 5, 6,8);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби", 90, 5, 7, 6, 9);

        System.out.println(zhouChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);

        padmaPatil.betterStudent(marcusBelby);



        Hufflepuff zachariahSmith = new Hufflepuff("Захария", "Смит", 75, 7, 9, 6);
        Hufflepuff sedricDiggory = new Hufflepuff("Седрик", "Диггори", 80, 6, 7, 9);
        Hufflepuff justinFinchFletchi = new Hufflepuff("Джастин", "Финч-Флетчи", 65, 8, 6, 7);

        System.out.println(zachariahSmith);
        System.out.println(sedricDiggory);
        System.out.println(justinFinchFletchi);

        justinFinchFletchi.betterStudent(zachariahSmith);



        sedricDiggory.bestStudent(harryPotter);



        StudentHogwarts students = new StudentHogwarts(100);
        students.add(harryPotter);
        students.add(dracoMalfoy);
        students.add(sedricDiggory);
        System.out.println("----------------");
        students.displayStudents();
    }
}