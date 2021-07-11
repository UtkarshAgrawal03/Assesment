package Assesment;
import java.util.*;
public class BusPurpose {
	void menu(){
		busFunctions o1=new busFunctions();
		Scanner sc =new Scanner(System.in);
		int a=1,b=1;
		while(a>0)
		{
			System.out.println("Press 1 to-Retreive file name in Ascending order");
			System.out.println("Press 2 to-Do Business-level operations:");
			System.out.println("Press 3 to-Option to close the application");
			System.out.println("Choose one of the given opetrations to continue");
			int ch=sc.nextInt();
			switch(ch){
				case 1:o1.display();
				       break;
				case 2:while(b>0) {
					System.out.println("Bussiness level Operations");
					System.out.println("\tPress 1 to-Add a user specified file to the application");
					System.out.println("\tPress 2 to-Delete a user specified file from the application");
					System.out.println("\tPress 3 to-Search a user specified file from the application");
					System.out.println("\tPress 4 to-Return back to main menu");
					int ch2=sc.nextInt();
					switch(ch2) {
							case 1:o1.Add();
							break;
							case 2:o1.delete();
							break;
							case 3:o1.search();
							break;
							case 4:b=-1;
							break;
							default :System.out.println("INVALID INPUT ,PLEASE CHOOSE FROM GIVEN OPTIONS ");
							break;
							}
					}
				break;
				case 3:a=-1;
				break;
				default:System.out.println("INVALID INPUT ,PLEASE CHOOSE FROM GIVEN OPTIONS ");
				break;
			}
		}
		
		
	}

}