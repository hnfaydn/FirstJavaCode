import java.util.Scanner;
public class Cavat
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String[] ID={"150715047", "150715024", "150716055", "150714020", "150715004", "150716002"};
		String[] name={"Mehmet Akif", "Muhammed Emre", "Orhan", "Mehmet Hanifi", "Free Bus Doctor", "Mr.Physic"};
		String[] password={"a1.2", "qaaq", "slm0", "cava", "fbd2", "6139"};
		System.out.println("Welcome to the CAVAT TEST PROGRAM (CTP)");
		System.out.println("(produced by cavats)");
		System.out.print("Please enter your pre-defined Student ID: ");
		String x=s.next();
		for(int i=0; i<ID.length; i++)
		{
			if(x.equals(ID[i]))
			{
				System.out.print(hello(i, name));
				String pw=s.next();
				if(pw.equals(password[i]))
				{
					welcome(i, name);
					break;
				}
				else
				{
					System.err.print("Undefined user!!! Powershell is activated!!! System will be "
							+ "shutted down...");
					System.exit(0);
				}
			}
		}
		System.out.println(unwelcome(x));
		System.err.print("Undefined user!!! Powershell is activated!!! System will be shutted down...");
	}

	private static String hello(int i, String[] name)
	{
		String x="Welcome "+name[i]+". Please enter your password: ";
		return x;
	}

	private static String unwelcome(String op)
	{
		String x=op+" ID isn't pre-defined for any users.";
		return x;	
	}

	private static void welcome(int i, String[] name)
	{
		Scanner s=new Scanner(System.in);
		boolean b=true;
		String user=name[i];
		System.out.println("Welcome " +user+". This program is for you. ");
		do
		{
		System.out.println("There are two options: Science and Entertainment. Which is better for you? (Exit for exit)");
		String ans=s.next();
		if(ans.equals("Science")||ans.equals("science")||ans.equals("SCIENCE"))
		{
			System.out.println("There are news from ISS. They had a message from Tatooine two days ago. Message is: "
					+ "'lýfh aýuh uabofýlah oau þfysiegggt ytlinþ ofwiðoaaþ onaziah assw pereisw qwtg "
					+ "pa oqýwe hyo!!!");
			System.out.println("hsgsuömhüloðolýhjeh oqhwottttfbd!!!!!!!!'"
					+ " Scientists couldn't understand the message.");
			System.out.println("");
		}
		else if(ans.equals("Entertainment")||ans.equals("entertainment")||ans.equals("ENTERTAINMENT"))
		{
			ent();
			System.out.println("");
		}
		else if(ans.equals("Exit")||ans.equals("exit")||ans.equals("EXIT"))
		{
			System.out.println("Thanks for using. Good bye...");
			System.exit(1);
		}
		else
		{
			System.out.println("Your input isn't pre-defined. Please input a pre-defined answer: ");
			System.out.println("");
		}
		}while(b);
	}

	private static void ent()
	{
		Scanner s=new Scanner(System.in);
		String ans, inp;
		System.out.println("This is a special game for all cavats; heads or tails!");
		do
		{
		double x1=Math.random();
		double x2=Math.random();
		int i=(int) (x1/x2);
		if(i==0)
			ans="head";
		else
			ans="tail";
		System.out.println("Heads or tails? (Inputs must be lower case) (Exit for exit)");
		inp=s.next();
		if(inp.equals("Exit")||inp.equals("exit")||inp.equals("EXIT"))
		{
			System.out.println("Thanks for using. Good bye...");
			System.exit(2);
		}
		boolean b=inp.equals(ans);
		if(b)
			System.out.println("You are a real gambler!");
		else
			System.out.println("You are really bad at gambling!");
		}while(true);
	}
}