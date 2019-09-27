import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Maintest
{
    public static void main(String[] args) {
        Student obj1 = new Student(1,"Arman",43);
        Student obj2 = new Student(2,"Ramesh",68);
        Student obj3 = new Student(3,"Mahesh",65);
        Student obj4 = new Student(4,"Ramesh",68);
        Student obj5 = new Student(5,"Raju",46);

        List<Student> Stud = new ArrayList<>();
        Stud.add(obj1);
        Stud.add(obj2);
        Stud.add(obj3);
        Stud.add(obj4);
        Stud.add(obj5);

        Collections.sort(Stud,new Sorter());
        Collections.reverse(Stud);
        for(Student s:Stud)
        {
            System.out.println(s.toString());
        }

    }

}

class Sorter implements Comparator<Student>
{

    @Override
    public int compare(Student student, Student t1) {
        if(student.getAge()==t1.getAge())
        {   if(student.getName().equals(t1.getName()))
        {
            return student.getId()-student.getId();
        }
            return student.getName().compareToIgnoreCase(t1.getName());

        }

        return student.getAge()-t1.getAge();
    }
}

