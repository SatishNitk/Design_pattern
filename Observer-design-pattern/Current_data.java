import java.util.*;
public class Current_data implements Subject{

	private List<Observer> observer;
    private int run,score;
	public Current_data(){
		observer = new ArrayList<Observer>();
	}

	public void registerObserver(Observer obj){
		this.observer.add(obj);
	}

	public void unregisterObserver(Observer obj){
		this.observer.remove(obj);
	}
	public int getRun(){
		return score;
	}
	public int getScore(){
		return run;
	}
	public void setRun(int run){
		this.run = run;
	}
	public void setScore(int score){
		this.score = score;
	}

	public void changed_score(int run, int score){
		setRun(run);
		setScore(score);
		getNotifyall();
	}

	public void getNotifyall(){
		for(int i = 0;i<observer.size();i++){
            observer.get(i).update(getRun(), getScore());
            observer.get(i).display();
		}

	}


}
