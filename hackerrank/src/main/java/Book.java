/**
 * Created by vidya.priyadarshini on 22/07/16.
 */
abstract class Book
{
    String title;
    String author;

    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}