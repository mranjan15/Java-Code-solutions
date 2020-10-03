import java.util.*;
class BMI {
    private double weight;
    private double height;
    private double bmi;

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getHeight(){
        return this.height;
    }
    public double bmiValue(){
        return getWeight()/Math.pow(getHeight(),2);
    }

}
public class BmiCalculator {
    public static void main(String[] args){
        BMI sample1=new BMI();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Height(In meters) : ");
        double height=sc.nextDouble();
        sample1.setHeight(height);
        System.out.print("Enter the Weight(In Kilograms) : ");
        double weight=sc.nextDouble();
        sample1.setWeight(weight);
        System.out.println("The BMI Value is "+ sample1.bmiValue());
    }
}

