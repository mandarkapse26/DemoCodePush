package book;

public class thiskeyword {
    int id;
    String name;
  
    
    public void xyz(int id, String name) {
        this.id = id;      
        this.name = name;
        this.abc();
    }
    public void abc() {
        System.out.println("id is "+id+" my name "+name);

    }
    
    public static void main(String[] args) {
        thiskeyword nn = new thiskeyword();
        nn.xyz(111,"sonu");
    }
}
