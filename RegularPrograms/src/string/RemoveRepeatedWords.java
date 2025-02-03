package string;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepeatedWords {

    public static void main(String[] args) {
        String name = "Java is a Good language, Java is an efficient language";
        String[] words=name.split("\\W+");
        
        Set<String> unique=new LinkedHashSet<>();
        for(String word:words)
        {
        	unique.add(word);
        }
        StringBuilder result=new StringBuilder();
        for(String word:unique)
        {
        	result.append(word).append(" ");
        	
        }
        System.out.println("The sentence without repeated words is: "+result.toString());
        
    }
}
