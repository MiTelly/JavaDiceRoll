import java.util.Random;

public class DiceRoll {
	public static void main(String[] args) {

		int roll1 = 0;
		int roll2 = 0;
		int roll3 = 0;
		int roll4 = 0;
		int roll5 = 0;
		int roll6 = 0;

		Random rand = new Random();

		for (int j=0;j < 1000000;j++)
		{
			int diceRoll = rand.nextInt((6) + 1);

			if (diceRoll == 1)
			{
				roll1++;
			}
			else if (diceRoll == 2)
			{
				roll2++;
			}
			else if (diceRoll == 3)
			{
				roll3++;
			}
			else if (diceRoll == 4)
			{
				roll4++;
			}
			else if (diceRoll == 5)
			{
				roll5++;
			}
			else if (diceRoll == 6)
			{
				roll6++;
			}
		}

		System.out.println("The dice landed on one " +
		roll1 + " times.");
		System.out.println("The dice landed on two " +
		roll2 + " times.");
		System.out.println("The dice landed on three " +
		roll3 + " times.");
		System.out.println("The dice landed on four " +
		roll4 + " times.");
		System.out.println("The dice landed on five " +
		roll5 + " times.");
		System.out.println("The dice landed on six " +
		roll6 + " times.");
	}
}
