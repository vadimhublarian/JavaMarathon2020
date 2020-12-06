package day6;

import java.util.Random;

/**
 * Created by Vadim Khublarian on 12/5/20.
 */
public class Teacher {
    String name;
    String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student student) {
        Random random = new Random();
        int mark = random.ints(2, 6).findFirst().getAsInt();
        String textMark = "";

        switch (mark) {
            case 2:
                textMark = "неудовлетворительно";
                break;
            case 3:
                textMark = "удовлетворительно";
                break;
            case 4:
                textMark = "хорошо";
                break;
            case 5:
                textMark = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.name + " по предмету "
                + this.subject + " на оценку " + textMark);
    }
}
