 class Animal 
{ 
    private String name; 
    private int age; 
    public Animal(String name, int age) 
    { 
        this.name = name; 
        this.age = age; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getAge() 
    { 
        return age; 
    
    } 
    public void makeSound() 
    { 
        System.out.println("The animal makes a sound"); 
    }
 } 
  class Dog extends Animal 
 { 
    private String breed;
   public Dog(String name, int age, String breed) 
    { 
        super(name, age); 
        this.breed = breed; 
    } 
    public String getBreed() 
    { 
        return breed; 
    
    }
     public void makeSound() 
     { 
        System.out.println("The dog barks"); 
     
    } 
} 
 class Cat extends Animal 
{ 
    private boolean isIndoor; 
    public Cat(String name, int age, boolean isIndoor) 
    { 
        super(name, age); 
        this.isIndoor = isIndoor; 
    } 
    public boolean getIsIndoor() 
    {
         return isIndoor; 
    
    } 
    public void makeSound() 
    { 
        System.out.println("The cat meows");
     }
 }
  public class Main
 {
    public static void main(String[]args)
    {
        
         
               Animal obj1= new Animal("Lion",5);
               Dog obj2= new Dog("oreo",1, "poodle");
               Cat obj3= new Cat("Tom",2,true);
               
              obj1.makeSound();
              System.out.println("The dog name is"+obj2.getName()+"The dog's age is"+obj2.getAge()+"The dogs breed is"+obj2.getBreed());
              obj2.makeSound();
              System.out.println("The cat name is"+obj3.getName()+"The cat's age is"+obj3.getAge()+" Does the cat lives indoors?"+
              obj3.getIsIndoor());
              obj3.makeSound();
              
              
            }
        
    }
 