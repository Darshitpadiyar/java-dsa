package _3conditon;

public class elseif {
    public static void main(String[] args) {
        int number = 96;
        if (number>100) {
            System.out.println("Enter correct marks");
        }
        else if(number>=80&&number<=100) {
            System.out.println("A");
        }
        else if(number>=60&&number<80){
            System.out.println("B");
        }
        else if(number>=50&&number<60){
            System.out.println("C");
        }
        else if(number>=33&&number<50){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
