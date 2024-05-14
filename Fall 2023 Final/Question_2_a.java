import java.io.*;
import java.util.*;

class Question_2_a {

    public static final List<Character> VOEWLS = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

     public static void main(String[] args) throws IOException {

         FileReader r = new FileReader("input.txt");
         FileWriter w = new FileWriter("output.txt");

         // or

         PrintWriter w1 = new PrintWriter("output1.txt");

         int countConsonants = 0;
         int i ;
         while((i = r.read()) != -1){
             char c = (char) i;
             if(VOEWLS.contains(c) == false){
                    countConsonants++;
             }
         }
         w.write(countConsonants + "");
         w1.println(countConsonants);

            r.close();
            w.close();
            w1.close();

     }

}
