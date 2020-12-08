package day9.Task1;

/**
 * Created by Vadim Khublarian on 12/8/20.
 */
public class Student extends Human {

    String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + this.name);
    }
}
