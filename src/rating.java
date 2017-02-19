import java.util.Scanner;
public class rating {

	public static void main(String[] args) {
		 Scanner sc0 = new Scanner(System.in);
	     int touchdowns = sc0.nextInt();
	     Scanner sc1 = new Scanner(System.in);
	     int totalYards = sc1.nextInt();
	     Scanner sc2 = new Scanner(System.in);
	     int interceptions = sc2.nextInt();
	     Scanner sc3 = new Scanner(System.in);
	     int completions = sc3.nextInt();
	     Scanner sc4 = new Scanner(System.in);
	     int attemptedPasses = sc4.nextInt();
	     
	     double a= ((completions/attemptedPasses)-.3)*5;
	     double b= ((totalYards/attemptedPasses)-3)*.25;
	     double c= ((touchdowns/attemptedPasses)*20);
	     double d= 2.375- ((interceptions/attemptedPasses)*25);
	     
	     double passerRating = ((a+b+c+d)/6)*100;
	     System.out.print(passerRating);
	    	 

	}

}
