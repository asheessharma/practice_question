  //Question 1
class shape {
    public void draw() {
        System.out.println("Drawing shape");
    }

    public void erase() {
        System.out.println("Erasing shape");
    }
}
//Question 2
class patient{
    String name;
    double height;
    double weight;
    public double compute_bmi(){
        return (weight/height)*height;

    }
}





public class practice_que{
    public static void main(String[] args) {

        // Question 1
        shape first= new shape();
        first.draw();
        first.erase();


        //Question 2
        patient ashish=new patient();

        ashish.height=Integer.parseInt(args[0]);
        ashish.weight = Integer.parseInt(args[1]);
        System.out.println("BMI of ashish is  "+ ashish.compute_bmi());







    }

}
