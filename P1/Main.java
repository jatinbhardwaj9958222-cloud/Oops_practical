class Student{
  int roll_No;
  String name;
  int m1;
  int m2;
  int m3;
  Student(int roll_No,String name,int m1,int m2,int m3){
    this.roll_No=roll_No;
    this.name=name;
    this.m1=m1;
    this.m2=m2;
    this.m3=m3;
  }
  int total(){
    return m1+m2+m3;
  }
  int average(){
    return (m1+m2+m3)/3;
  }
  void display(){
    System.out.println("Roll No : "+this.roll_No);
    System.out.println("Name : "+this.name);
    System.out.println("Marks1 : "+this.m1);
    System.out.println("Marks2 : "+this.m2);
    System.out.println("Marks3 : "+this.m3);
    System.out.println("Total : "+this.total());
    System.out.println("Average : "+this.average()+"\n");
  }
}
public class Main{
  public static void main(String[] args){
    Student s1=new Student(101,"jatin",80,85,81);
    Student s2=new Student(102,"harsh",60,65,64);
    Student s3=new Student(103,"karan",70,75,74);
    s1.display();
    s2.display();
    s3.display();
  }
}
