package Generics;

//Generic class example
public class Box<T> {

  private T t;

  public void add(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }
  
//Generic method example
  public <U> void inspect(U u){
      System.out.println("T: " + t.getClass().getName());
      System.out.println("U: " + u.getClass().getName());
  }
//Generic method with constraint example
  public <Z extends String> void inspect(Z z){
      System.out.println("T: " + t.getClass().getName());
      System.out.println("Z: " + z.getClass().getName());
  }

  public static void main(String[] args) {
	  
     Box<Integer> integerBox = new Box<Integer>();
     Box<String> stringBox = new Box<String>();
    
     integerBox.add(new Integer(10));
     stringBox.add(new String("Hello"));
   
     integerBox.inspect("Two");
     
     System.out.println();
     
     stringBox.inspect("Hello");
     
     System.out.println();
     
     System.out.println("Integer Value :" + integerBox.get()  );
     System.out.println("String Value :" + stringBox.get()  );
  }
}