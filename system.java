package sw_sem7;

import java.util.Scanner;

public class system {
	librarian lib;
	book bk;
	bookCategory bc;
	student st;	
	
	public system() {
		lib = new librarian("Tsetseg", "lib_001","212");
		st = new student("15b1seas1232", "Ganbold", "Hulan","SHD-16khoroo-32-14", 99080706);
		bc = new bookCategory("001", "Gadaad nom");
		bc = new bookCategory("002", "Bailgaliin uhaanii nom");
		bk= new book("bk001","magadlal statistic","Nomin",2012, 50);
		Menu();		
	}
	
void inputPin() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an account : ");
		String acc = input.next();
		if(!lib.accCheck(acc)){
			inputPin();
		}
		
		System.out.print("Enter a pin : ");
		String pin = input.next();
		
		if(!lib.passCheck(pin)){
			inputPin();
		}
	}

    public void Menu() {
		int choice;
		boolean boo=true;
		inputPin();
		Scanner in = new Scanner(System.in);
		
		while(boo) {
			System.out.println("\t-----------------------------------------------------");
			System.out.println("\t\t\t Main menu");
			System.out.println("\t1. Book issue\t2. book remove\t3. Search  4. Add book\t 5. Exit");
			System.out.println("\t-----------------------------------------------------");
			
			System.out.print("Enter an choice : ");
			choice=in.nextInt();
			System.out.println(" ");
			
			switch(choice) {
			
			default:
				System.out.println("Your choice is wrong! Please try again. ");
				break;
				
			}			
		}
    }

	public static void main(String[] args) {
	new system();

	}

}
