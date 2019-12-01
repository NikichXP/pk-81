import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int number = 8117;
        int c11 = number % 11;
        System.out.println("--------------");
        System.out.println("Number = " + number);
        System.out.println("C11 = " + c11);
        System.out.println("--------------");
        
        Student[] students = new Student[3];
        students[0] = new Student("Vlad", "Slupko", 19, "KPI", 2);
        students[1] = new Student("Dima", "Ivanov", 18, "Mogilyanka", 1);
        students[2] = new Student("Garen", "Walker", 21, "NAU", 4);

        System.out.println("\nSorting by Year. From younger to older");
        Arrays.sort(students, new sortByYearsOld());
        for(Student a : students){
            a.getInfo();
            System.out.println();
        }
        
        System.out.println("\nSorting by Course. From bigger to smaller");
        Arrays.sort(students, new sortByCourse().reversed());
        for(Student a : students){
            a.getInfo();
            System.out.println();
        }

        System.out.println("\nSorting by First Name. Alphabetical");
        Arrays.sort(students, new sortByFirstName());
        for(Student a : students){
            a.getInfo();
            System.out.println();
        }

        System.out.println("\nSorting by Second Name. Alphabetical reversed");
        Arrays.sort(students, new sortBySecondName().reversed());
        for(Student a : students){
            a.getInfo();
            System.out.println();
        }
    }   
}