/*
 * Very basic program to demonstrate accessing fields in a class
 * From "Java How To Program, 10/e, Early Objects" - Chapter 3
 */


/**
 *
 * @author Taylor
 */
public class Account {

    private String name;
    
    //Sets the name
    public void setName(String newName) {
        this.name = newName;
    }
    
    //Retrieves the name
    public String getName() {
        return this.name;
    }
} //end Account
