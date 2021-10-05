package lambdademo;

interface Display{
    public void display ();
}

class Output{
    public void output(Display obj){
        obj.display();
       
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        System.out.println("hello");
        //Display obj = ()-> System.out.println("hello world");
          // Display obj2 = ()-> System.out.println("dsafdasf world");
         new Output().output(()-> System.out.println("dsafdasf world"));
       // obj1.output(obj);
    }

}
