// import java.util.Scanner;
// class Person
// {
//     String name;
//     int age,id;
//     Person()
//     {
//     }
//     Person(String name,int age,int id)
//     {
//         this.name=name;
// this.age=age;
//         this.id=id;
//     }
// }
// class Teacher extends Person
// {
//     Teacher()
//     {
//     }
//     Teacher(String name,int age,int id)
//     {
//         super(name,age,id);
//     }
//     public String toString()
//     {
//         return("Teacher's Name"+" "+this.name+" "+"Teacher's Age"+" "+this.age+" "+"Teacher's Id"+" "+this.id);
//     }
// }
// class Student extends Person
// {
//     Student()
//     {
//     }
//     Student(String name,int age,int id)
//     {
//         super(name,age,id);
//     }
//     public String toString()
//     {
//         return("Student's Name"+" "+this.name+" "+"Student's Age"+" "+this.age+" "+"Student's Id"+" "+this.id);
//     }
// }
// class data
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n,age,id,ch;
//         String name;
// System.out.println("How many people's info do you want to store?");
//         n=sc.nextInt();
//         Person info[] = new Person[n];
//         for(int i = 0; i<n; i++)
//         {
// System.out.println("Want to store teacher's info or student's info? [Press 1 for student and Press 2 for teacher]");
// ch=sc.nextInt();
//             if(ch==1)
//             {
// System.out.println("enter name");
//                 name=sc.next();
// System.out.println("enter age");
//                 age=sc.nextInt();
// System.out.println("enter id");
//                 id=sc.nextInt();
//                 info[i]=new Student(name,age,id);
//             }
//             else if(ch==2)
//             {
// System.out.println("enter name");
//                 name=sc.next();
// System.out.println("enter age");
//                 age=sc.nextInt();
// System.out.println("enter id");
//                 id=sc.nextInt();
//                 info[i]=new Teacher(name,age,id);
//             }
//         }
//         for(int i = 0; i<n; i++)
//         {
// System.out.println(info[i]);
//         }
//     }
// }
