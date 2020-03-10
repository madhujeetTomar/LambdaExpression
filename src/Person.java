public class Person {


    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    private String firstName;
    private String lastName;
    private int id;
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
