import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String string = "My name is Sergiy. I study profession developer Java IND";

        String [] sort = string.split(" ");

        System.out.println(Arrays.toString(sort));

        String [] sortTwo = string.split(" ", 4);

        System.out.println(Arrays.toString(sortTwo));
    }
}