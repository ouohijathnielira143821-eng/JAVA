// Java doesn't support multiple inheritance with classes,
// but a class CAN implement multiple interfaces

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing the document...");
    }

    public void show() {
        System.out.println("Showing the document on screen...");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}