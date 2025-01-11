package models;

public abstract class Person implements Payable, Comparable<Person>{
    private static int count = 0;
    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = ++count;
        this.name = "Unknown";
        this.surname = "Unknown";
    }

    public Person(String name, String surname){
        this.id = ++count;
        setName(name);
        setSurname(surname);
    }

    public int getId(){ return this.id; }
    public String getName(){ return this.name; }
    public String getSurname(){ return this.surname; }

    public void setName(String name){ this.name = name; }
    public void setSurname(String surname){ this.surname = surname; }

    public String toString(){
        return id + ". " + name + " " + surname + "\"";
    }

    public String getPosition(){
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}