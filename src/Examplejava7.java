import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Examplejava7 {



    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Madhujeet", "Tomar", 1));
        personList.add(new Person("Suyash", "Panday", 2));
        personList.add(new Person("Puneet", "Ahuja", 3));

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {

                return person.getLastName().compareTo(t1.getLastName());
            }
        });
System.out.println(personList);

        printFirstNameStartWithP(personList, new Examplejava8.Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("P");
            }
        });

    }

    private static void printFirstNameStartWithP(List<Person> personList, Examplejava8.Condition condition) {
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
