public class Dog
{
   private String name;
   private String breed;
   private int age;
   
   public Dog( String n, String b, int a )
   {
      name = n;
      breed = b;
      age = a;
      
   }
   
   public String getName(){ return name; }
   public String getBreed() { return breed; }
   public int getAge() { return age; }
   
   public void eat()
   {
      System.out.println( name + " is eating " );
   }
   
   public void sleep()
   {
      System.out.println( name + " is sleeping " );
   }
   
   public void bark()
   {
      System.out.println( name + " is barking " );
   }
   
   public void birthday()
   {
      age = age + 1;
   }
}