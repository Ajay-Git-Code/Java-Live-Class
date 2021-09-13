package licencedemo;

class AgeNotValidException extends RuntimeException {

    AgeNotValidException() {
        super("Age is not Eligible");
    }
}

class Licence {

    String name;
    String DOB;

    Licence(String name, String DOB) {
        this.name = name;
        this.DOB = DOB;
    }

    void canDrive() {
        int year = Integer.parseInt(DOB.substring(DOB.length()-4, DOB.length()));
        int age = 2021-year;
        //System.out.println(age);
        
        if(age<18){
            throw new AgeNotValidException();
        }
    }

}

public class LicenceDemo {

    public static void main(String[] args) {
        //System.out.println("Hello World");
        Licence obj = new Licence("ajay","26 6 2005");
        
        try{
        obj.canDrive();
            System.out.println("Age is Eligible");
        }
        catch(AgeNotValidException e)
        {
            System.out.println(e.getMessage());
        }
        
       // System.out.println(obj.DOB.substring(obj.DOB.length()-4, obj.DOB.length()));
        
    }
}
