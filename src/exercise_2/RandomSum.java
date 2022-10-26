package exercise_2;


public class RandomSum extends Thread{
	RandomGen randomGen;
	
	public RandomSum(RandomGen randomGen) {
		this.randomGen = randomGen;
	}
	
	public void run() {
		int r = randomGen.randomized();	
		System.out.println(r);
	}
	
	public static void main(String args[]){
		
		System.out.println("The 1 random number generated is:");
		
		RandomGen randomGen = new RandomGen();
		Thread a = new RandomSum(randomGen);
		a.start();
		
		
	}	
}


