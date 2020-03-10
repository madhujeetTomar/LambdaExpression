import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Examplejava8 {



    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Madhujeet", "Tomar", 1));
        personList.add(new Person("Suyash", "Panday", 2));
        personList.add(new Person("Puneet", "Ahuja", 3));

      //Use Lambda Expression
        Collections.sort(personList,(person, t1) -> person.getLastName().compareTo(t1.getLastName()));

        printConditionally(personList, p -> true);

printConditionally(personList, p -> p.getLastName().startsWith("P"));
        printConditionally(personList, p -> p.getFirstName().startsWith("P"));

        predicateDemo();

    }
    private static void predicateDemo() {
    int[] a={1,2,3,4,5,6,7,8,9,10};
        Predicate<Integer> i=j->j%2==0;
        for(int k : a) {
            if (i.test(k)) {
                System.out.println(k);
            }
        }
    }

    private static void printConditionally(List<Person> personList, Condition condition) {
        for(Person p: personList)
        {
            if(condition.test(p))
            {
                System.out.println(p);
            }
        }
    }

    interface Condition
    {
        boolean test(Person p);
    }
}
