package HW_9;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {

    public static List<Student> getStudentsList() {
        // Список курсов
        Course course1 = new Course("Kylinariya");
        Course course2 = new Course("Risovanie");
        Course course3 = new Course("Programmirovanie");
        Course course4 = new Course("Psihologiya");
        Course course5 = new Course("Avtomatizatiya testirovaniya na Java");
        Course course6 = new Course("Testirovanie backend na Java");
        Course course7 = new Course("Testirovanie veb-prilijeniy");
        Course course8 = new Course("Bazu dannuh");
        Course course9 = new Course("Linux sistemnyi administrator");
        Course course10 = new Course("Osnovy rychnogo testirovaniya");
        Course course11 = new Course("Osnovy test-fnalitiki");
        Course course12 = new Course("Git. Bazovui kurs");

        // Список студентов
        Student student1 = new Student("Student_1", Arrays.asList(course1, course3, course5));
        Student student2 = new Student("Student_2", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("Student_3", Arrays.asList(course1, course7, course11));
        Student student4 = new Student("Student_4", Arrays.asList(course2, course4, course8, course1, course3, course5));
        Student student5 = new Student("Student_5", Arrays.asList(course3, course7, course9));
        Student student6 = new Student("Student_6", Arrays.asList(course1, course3, course5, course9));
        Student student7 = new Student("Student_7", Arrays.asList(course2, course6, course7, course5, course9));
        Student student8 = new Student("Student_8", Arrays.asList(course3, course2, course4));
        Student student9 = new Student("Student_9", Arrays.asList(course4, course8, course5));
        Student student10 = new Student("Student_10", Arrays.asList(course5, course1, course9));
        Student student11 = new Student("Student_11", Arrays.asList(course6, course9, course5));
        Student student12 = new Student("Student_12", Arrays.asList(course7, course6, course5));
        Student student13 = new Student("Student_13", Arrays.asList(course8, course1, course5));
        Student student14 = new Student("Student_14", Arrays.asList(course9, course2, course5));
        Student student15 = new Student("Student_15", Arrays.asList(course10, course3, course1));
        Student student16 = new Student("Student_16", Arrays.asList(course11, course9, course2));
        Student student17 = new Student("Student_17", Arrays.asList(course12, course8, course3));
        Student student18 = new Student("Student_18", Arrays.asList(course11, course7, course4));
        Student student19 = new Student("Student_19", Arrays.asList(course10, course6, course5));
        Student student20 = new Student("Student_20", Arrays.asList(course9, course5, course3));
        Student student21 = new Student("Student_21", Arrays.asList(course8, course6, course5));
        Student student22 = new Student("Student_22", Arrays.asList(course7, course2, course11));
        Student student23 = new Student("Student_23", Arrays.asList(course6, course1, course5));
        Student student24 = new Student("Student_24", Arrays.asList(course5, course11, course12));
        Student student25 = new Student("Student_25", Arrays.asList(course4, course12, course5));
        Student student26 = new Student("Student_26", Arrays.asList(course3, course9, course5));
        Student student27 = new Student("Student_27", Arrays.asList(course2, course6, course3));
        Student student28 = new Student("Student_28", Arrays.asList(course1, course9, course5));


        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
                student8, student9, student10, student11, student12, student13, student14,
                student15, student16, student17, student18, student19, student20, student21,
                student22, student23, student24, student25, student26, student27, student28);
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<Course> courses = getListCourses();
        return courses.get(random.nextInt(courses.size()));
    }

    private static List<Course> getListCourses() {
        return Arrays.asList(new Course("Kylinariya"),
                new Course("Risovanie"),
                new Course("Programmirovanie"),
                new Course("Psihologiya"),
                new Course("Avtomatizatiya testirovaniya na Java"),
                new Course("Testirovanie backend na Java"),
                new Course("Testirovanie veb-prilijeniy"),
                new Course("Bazu dannuh"),
                new Course("Linux sistemnyi administrator"),
                new Course("Osnovy rychnogo testirovaniya"),
                new Course("Osnovy test-fnalitiki"),
                new Course("Git. Bazovui kurs"));
    }
}
