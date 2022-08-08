package validateAccount;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validAccount=new String[]{"123abc_","_abc123","_______","1234567","sdfgttrfh"};
    public static final String[] invalidAccout=new String[]{".@","12345","1234_","edfgh"};

    public static void main(String[] args) {
        accountExample=new AccountExample();
        for (String account:validAccount){
            boolean isvalid= accountExample.validate(account);
            System.out.println("Account is "+account+" is valid: "+isvalid);
        }
        for (String account: invalidAccout){
            boolean isvalid= accountExample.validate(account);
            System.out.println("Account is "+account+" is valid: "+isvalid);
        }
    }
}
