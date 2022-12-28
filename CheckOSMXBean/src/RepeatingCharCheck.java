import java.util.Map;
import java.util.stream.Collectors;

public class RepeatingCharCheck {


    private static String str1;

    static {
        str1 = """
                Puneet: Java Java EEE""";
    }

    public static String getStr1() {
        return str1;
    }

    public static void main(String[] args){
        Map<Character,Long> result= getStr1().chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,Collectors.counting() ));
        result.forEach((k,v) ->{
            if(v>1)
                System.out.println(k);
        });
    }

}
