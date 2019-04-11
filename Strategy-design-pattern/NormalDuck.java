public class NormalDuck{

	public static void main(String args[]){
         Duck obj  = new Duck();
         obj.setName("duck1");
         obj.setFlywith(new FlywithWings());
         obj.display();
         obj.fly();
        System.out.println("\n\nSecond duck...............................details\n");
         Duck obj1  = new Duck();
         obj1.setName("duck2");
         obj1.setFlywith(new FlyNoWings());
         obj1.display();
         obj1.fly();

	}
}