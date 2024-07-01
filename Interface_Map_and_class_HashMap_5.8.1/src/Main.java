import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        String first = states.get(2);
        System.out.println(first); // Spain

        Set<Integer> keys = states.keySet();
        Collection<String> values = states.values();
        states.replace(1, "Poland");
        states.remove(2);
        
        for(Map.Entry<Integer, String> item : states.entrySet()){
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        System.out.println();
        Map<String, Person> people = new HashMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for(Map.Entry<String, Person> item : people.entrySet()){
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}

class Person{
    private String name;
    public Person(String value){
        name=value;
    }

    String getName(){
        return name;
    }
}