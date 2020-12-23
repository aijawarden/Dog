public class DogTest
{
   public static void main( String[] args )
   {
      Dog dog1 = new Dog("Bob", "mixed", 3 );
      
      dog1.sleep();
      dog1.eat();
      dog1.bark();
      
      System.out.println( "age = " + dog1.getAge() );
      dog1.birthday();
      System.out.println( "age = " + dog1.getAge() );
      
   }
   
}