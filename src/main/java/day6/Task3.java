package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher bestTeacher = new Teacher("Цыферкин Александр Эникеевич", "Информатика");
        Student studentVasya = new Student("Пупкин Василий");

        bestTeacher.evaluate(studentVasya);
    }
}
