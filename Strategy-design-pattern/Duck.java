public class Duck{
	private Flybehaviour behaviour = null;

    String name = null;
	public Duck(){
		System.out.println("Duck 0-param constructor--calling....");
	}
	public void display(){
		System.out.println("Duck is displaying");
	}
	public void setName(String name){
        this.name = name;
    }
    public void setFlywith(Flybehaviour behaviour){
    	this.behaviour = behaviour;
    }

    public void fly(){
      this.behaviour.fly();
    }

}