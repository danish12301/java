package ex09_2_exercise;

public class Customer {
    private String name;
    private String ssn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return ssn;
    }

    public Customer(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
