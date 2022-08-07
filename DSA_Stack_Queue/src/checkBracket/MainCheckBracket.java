package checkBracket;

public class MainCheckBracket {
    public static void main(String[] args) {
        Bracket bracket=new Bracket();
        String expression="(a*b)+(c-g+h)";
        if(bracket.checkBracket(expression)){
            System.out.println("Well");
        }else {
            System.out.println("Bad");
        }
    }
}
