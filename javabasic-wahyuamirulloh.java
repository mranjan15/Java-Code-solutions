// Hello, in this code, we will learn together about java

public class MyClass {
    public static void main(String[] args) {
        // Variable
        String name = "Wahyu Amirulloh"; // Make a string variable name and store my name as value
        String github = "https://github.com/wahyuamirulloh";
        System.out.println("Hello, My name is " + name + ", you can check my github account here " + github );
        int circle = 7;
        final float pi = 3.14285714286f; // final value can't be changed
        float area = pi * ( circle * circle ); // Circle area math formula
        System.out.println("I was counted that " + circle + "cm radius has " + area + "cm area");

        // If Else
        int score = (int)(Math.random()*101); // 0 - 100
        if (score > 80){
            System.out.println(name + " got A on this exam, perfect score");
        } else if (score > 60) {
            System.out.println(name + " got B on this exam, good score");
        } else if (score > 40) {
            System.out.println(name + " got C on this exam, need to study harder again");
        } else if (score > 20) {
            System.out.println(name + " got D on this exam, sorry you must join remedial class");
        } else {
            System.out.println(name + " doesn't doing exam well, try again");
        }
        System.out.println(name + " got " + score + " in this exam");

        // Looping - Foreach
        String[] subject = {"Math", "Science", "Social", "English"};
        for (String i : subject){
            int scoresubject = (int)(Math.random()*101);
            System.out.println(i + " = " + scoresubject);
        }
    }
}