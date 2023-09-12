package constructor;


/*
So for this challenge, you'll want to:
1-Create a new class, called Customer, with three fields:
name
credit limit
email address.
2-Create the getter methods only, for each field.  You don't need to create the setters.
3-Create three constructors for this class:
* First, create a constructor for all three fields which should assign the arguments directly to the instance fields.
* Second, create a no args constructor that calls another constructor, passing some literal values for each argument.
* And lastly, create a constructor with just the name and email parameters, which also calls another constructor.

*/
public class Customer {
    private String name;
    private double creditLimit;
    private String eposta;
    public Customer() {
        this("Nobody", "nobody@nowhere.com");
        /*
        "Why are we passing two parameters?
        This is calling a constructor that takes two parameters and sets the default credit limit to a thousand.
        In other words, we are chaining two constructors."
         */
    }

    public Customer(String name, String eposta) {
        this(name, 1000, eposta);
    }

    public Customer(String name, double creditLimit, String eposta) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.eposta = eposta;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEposta() {
        return eposta;
    }
}

