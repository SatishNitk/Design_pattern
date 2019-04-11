public class Subscriber2 implements Observer{
	private int run,score;

	public void display(){

System.out.println("run=" + run + "   "+ "score" + "   "+score);
	}
	public void update(int run, int score){
		this.run = run;
		this.score = score;
	}
}