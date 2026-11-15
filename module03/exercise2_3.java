package module03;

public class exercise2_3 {
    public static void main(String[] args) {
        String titleName = "Name";
        String titleAge = "Age";
        String titleGrade = "Grade";

        String firstStudent = "Vikram";
        int firstAge = 16;
        char firstGrade = 'A';

        String secondStudent = "Neha";
        int secondAge = 15;
        char secondGrade = 'B';

        System.out.printf("%s\t%s\t%s\n%s\t%d\t%c\n%s\t%d\t%c\n", 
            titleName, titleAge, titleGrade, 
            firstStudent, firstAge, firstGrade, 
            secondStudent, secondAge, secondGrade);
    }
}
