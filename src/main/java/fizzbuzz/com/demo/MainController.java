package fizzbuzz.com.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
@RestController

public class MainController{
    @RequestMapping("/")
    public String fizzbuzz() {
String fzString="";
int i=1;
        for (; i <= 100; i++) {
            boolean fizzOrBuzz = false;
            if(i%3!=0 && i%5!=0){
                System.out.println(i);
                fzString+=i;
            }
            if (i % 3 == 0) {
                System.out.print("Fizz");
               // fizzOrBuzz = true;
                fzString+="Fizz";

            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                fizzOrBuzz = true;
               fzString+="Buzz";
               return "Buzz";

            }

            if (fizzOrBuzz) {
                System.out.print("fizzbuzz");
                fzString+="fizzbuzz";
              // return "fizzbuzz";

            }
        }
    return fzString; }}