import java.util.Random;

public class DiceRoller {
	
	//GLOBAL
	/*
	Random random;
	int number;
	
	public DiceRoller() {
		random = new Random();
		roll();
	}
	void roll() {
		number = random.nextInt(6)+1;
		System.out.println(number);
}
	*/
	
	
	//LOCAL
	
	//Two ways to fix 
	// pass the variables as arguments = > roll(arguments)/// also in method void roll ( arguments / parameters ) 
	// OR pass them as global
	public DiceRoller() {
		Random random = new Random();
		int number = 0;
		roll(random,number);
	}
	
	void roll(Random random, int number) {
		number = random.nextInt(6)+1;
		System.out.println(number);
}
	


}

