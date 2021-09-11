class que_4{
    String s1;
    String s2;
    public void print(){
        if(s2.length()==7){
            System.out.println(s1+" University "+s2);
        }
        else{
            if(s2.length()==5){
                System.out.println(s1+" Technologies "+s2);
            }
        }
    }

}
//Question 5
public class string {
    String s;

    public static void main(String[] args) {
        string st=new string();
        st.s=args[0];
        System.out.println("Welcome "+st.s);
        //question 4
        que_4 solution=new que_4();
        solution.s1=args[0];
        solution.s2=args[1];
        solution.print();


    }
}
