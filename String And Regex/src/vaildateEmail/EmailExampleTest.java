package vaildateEmail;
public class EmailExampleTest {
    public static final String[] validEmail=new String[]{"a@gmail.com","ab@yahoo.com","abc1@outlook.com"};
    public static final String[] invalidEmail=new String[]{"@gmail.com","bac@gmail.","@#abc@gmail.com"};

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email:validEmail){
            boolean isvalid= emailExample.validate(email);
            System.out.println("emai is "+ email+" is vaild "+isvalid);
        }
        for (String email:invalidEmail){
            boolean isvalid= emailExample.validate(email);
            System.out.println("email is "+email+ " is vaild "+isvalid);
        }
    }
}
