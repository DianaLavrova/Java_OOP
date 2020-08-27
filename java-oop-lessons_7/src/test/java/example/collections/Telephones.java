package example.collections;

import java.util.*;

public class Telephones {
    Map<String, Set<String>> telephones = new HashMap<>();

    public void add(String sirName, String number) {
        Set<String> numbers = telephones.get(sirName);

        if(numbers == null) {
            numbers = new HashSet<>();
            telephones.put(sirName, numbers);
        }

        numbers.add(number);
    }

    public Set<String> get(String sirName) {
        return  telephones.get(sirName);
    }

    public void printTelephones(String sirname) {
        Set<String> telephones = get(sirname);
        if(telephones == null) {
            System.out.println("No telephones found for sirname " + sirname);
            return;
        }
        for(String tel : telephones) {
            System.out.println("For sirname " + sirname + " telephone is " + tel);
        }
    }
}
