public class Main{

	public static void main(String args[]){
		Subscriber1 sub1 = new Subscriber1();
		Current_data cur_data = new Current_data();
		cur_data.registerObserver(sub1);
	
		cur_data.setRun(100);
		cur_data.setScore(1000);
		cur_data.changed_score(1000,1000);
		System.out.println("--------------------------------");
		Subscriber2 sub2 = new Subscriber2();
		cur_data.registerObserver(sub2);
		cur_data.changed_score(103300,1022200);

		System.out.println("sucess");
		

		
		
	}
}