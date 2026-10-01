class Student {
    private int rollno;
    private String name;

    public void setData(int r, String n) {
        rollno = r;
        name = n;
    }

    public void display() {
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
    }
}

class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData(101, "Rahul");
        s.display();
    }
}