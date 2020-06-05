import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String s[]){
        List<String> names = Arrays.asList("Ramesh","Suresh","Rajesh","Mallikarjun");
        names.stream().forEach(System.out :: println);
    }
}
