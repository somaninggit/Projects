package Projects;
import java.util.*;
class Guesser
{
	
	 int guessNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Guess Number");
		int guessnum=sc.nextInt();
		return guessnum;
	}
	 
}
class Player
{
	 int guessNum()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Guess Number from player");
			int guessnum=sc.nextInt();
			return guessnum;
		}
	 
}
class Umpire
{
	 int numGuesser;
	 int numPlayer1;
	 int numPlayer2;
	 int numPlayer3;
	 void fromGuesser() 
	 {
		 Guesser g=new Guesser();
		 numGuesser=g.guessNum();
	 }
	 void fromPlayer()
	 {
		 Player p1=new Player();
		 Player p2=new Player();
		 Player p3=new Player();
		 numPlayer1=p1.guessNum();
		 numPlayer2=p2.guessNum();
		 numPlayer3=p3.guessNum();
		 
		 
	 }
	 void compare()
	 {
		 if(numGuesser==numPlayer1)
		 {
			 System.out.println("Player 1 one the game");
		 }
		 else if(numGuesser==numPlayer2)
		 {
			 System.out.println("Player 2 one the game");
		 }
		 else if(numGuesser==numPlayer3)
		 {
			 System.out.println("Player 3 one the game");
		 }
		 else
		 {
			 System.out.println("Lost the game");
		 }
		 
	 }
	 
}
public class GuessingGame 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Umpire u=new Umpire();
		u.fromGuesser();
		u.fromPlayer();
		u.compare();

	}

}
