package Maven.task2;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class NewYearGiftImpl {
	public static void main(String[] args) {
		NewYearGift[] ob=new NewYearGift[5];
		ob[0]=new Chocolate("Diary Milk",30);
		ob[1]=new Sweet("Barfi",10);
		ob[2]=new Chocolate("Barbone",20);
		ob[3]=new Sweet("Rasmalai",5);
		ob[4]=new Chocolate("5tar",15);
		
		System.out.print("New year gifts are");
		for(int i=0;i<5;i++)
			System.out.println(ob[i].getName());
		Scanner s=new Scanner(System.in);
		int a=1;
		System.out.println("Enter your choice");
		System.out.println("Enter1 to vie chocolates and sweets under quantity range");
		System.out.println("Enter 0 to exit");
		while(a!=0) {
			System.out.println("Please choose option");
			a=s.nextInt();
			switch(a) {
			case 1:
				System.out.println("Enter quantity range: ");
				int l=s.nextInt();
				int r=s.nextInt();
				int c=0;
				System.out.println("Gifts available in the given quantities");
				for(int i=0 ; i<5; i++) {
					if(ob[i].getQuantity()>=l && ob[i].getQuantity()<=r) {
						System.out.println(ob[i].getName());
						c++;
						
					}
				}
				if(c==0) {
					System.out.println("No Gifts found sorry");
					
				}
				break;
				
				default:
					System.out.println("Invalid Choice");
			}
		}
		
		
		
	}

}