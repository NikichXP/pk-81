import java.util.Comparator;

class Student{
    String firstName;
    String secondName;
    Integer yearsOld;
    String university;
    Integer course;

    public Student(final String firstName, final String secondName, final Integer yearsOld, final String university,
            final Integer course) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearsOld = yearsOld;
        this.university = university;
        this.course = course;
    }
    public void getInfo() {
        System.out.print(firstName);
        System.out.print(", " + secondName);
        System.out.print(", " + yearsOld);
        System.out.print(", " + university);
        System.out.print(", " + course);
    }

}


//Comparators

class sortByFirstName implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.firstName.compareTo(o2.firstName);
    }
}

class sortBySecondName implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.secondName.compareTo(o2.secondName);
    }
}

class sortByYearsOld implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.yearsOld - o2.yearsOld;
    }
}

class sortByUniversity implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.university.compareTo(o2.university);
    }
}

class sortByCourse implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.course - o2.course;
    }
}