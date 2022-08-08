package sortComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Ken",30,"huế");
        Student student2=new Student("Khanh",32,"huế");
        Student student3=new Student("Anh",28,"huế");
        Student student4=new Student("Chi",26,"huế");
        List<Student>list=new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for (Student st:list){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator=new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for (Student st :list){
            System.out.println(st.toString());
        }
    }
}
