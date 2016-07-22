/**
 * Created by vidya.priyadarshini on 22/07/16.
 * Refer resources/Inheritance.pdf
 */

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        if(firstName.length()<4 || firstName.length()>10) System.exit(0);
        if(lastName.length()<4 || lastName.length()>10) System.exit(0);
        checkValidId(identification);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

    private static void checkValidId(int id){
        int res = id;
        int cnt=0;
        while(res!=0){
            cnt++;
            res=res/10;
        }
        if(cnt!=7) System.exit(0);
    }

}
