
import java.util.*;

public class CompareStrings {

    public static final String name = "Carmen";
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String nameInput;

        System.out.print("Enter your name > ");
        nameInput = kb.nextLine();

        compareNames(nameInput, name);

       
    }

    public static void compareNames(String nameInput, String name) {
        if (nameInput.equals(name)){
             System.out.print(name + " equals " + nameInput);
        }
        else{
             System.out.print(name + " does not equal " + nameInput);
        }
    }
}
