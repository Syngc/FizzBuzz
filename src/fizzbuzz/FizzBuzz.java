package fizzbuzz;
import java.lang.StringBuffer;

/**
 * @author cyn
 */
public class FizzBuzz {
    
    public static void main(String args[]){
        fizzBuzz();
    }

    public static String fizzBuzz(){
        StringBuffer str;
        StringBuffer res = new StringBuffer();
        for (int i = 1; i <= 100; i++) {
            str = new StringBuffer();
            if(i%3 == 0)str.append("Fizz");
            if(i%5 == 0)str.append("Buzz");
            if(str.length() == 0)
                res.append(String.valueOf(i) + " ");
            else
                res.append(str+" ");
            
        }
        return res.toString();
    }
}
