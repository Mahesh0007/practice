/**
 * Created by vidya.priyadarshini on 22/07/16.
 */

class MyBook extends Book {

    int price;
    MyBook(String t, String a, int p) {
        super(t,a);
        this.price=p;
    }

    void display() {

        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);

    }
}
