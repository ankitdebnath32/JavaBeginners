package JavaFiles.Java8Full.lambda.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomObj {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Sima");
        Student s2 = new Student(3, "Ankit");
        Student s3 = new Student(8, "Golu");

        List<Student> stu = new ArrayList<>();

        stu.add(s1);
        stu.add(s2);
        stu.add(s3);

        Collections.sort(stu, (a,b) -> b.id - a.id);
        System.out.println(stu);
    }


    static class Student {
        public Integer id;

        public String name;

        public Student(Integer id, String name){
            this.id = id;
            this.name = name;
        }

//        public String toString(){
//            return this.id + ": " + this.name;
//        }

    }
}