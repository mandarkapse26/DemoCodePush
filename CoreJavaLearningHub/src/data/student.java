package data;

public class student {

    private int id;
    private int mark;
    private String name;

  
    void setmethod(int id, int mark, String name) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

   
    void getmethod() {
        System.out.println("Show me : " + id + " " + name + " " + mark);
    }

    public static void main(String[] args) {

      
        student obj1 = new student();
        obj1.setmethod(1, 90, "Mandar");
        obj1.getmethod();

      
        student obj2 = new student();
        obj2.setmethod(2, 89, "Aditya");
        obj2.getmethod();
    }
}
