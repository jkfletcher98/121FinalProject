import java.util.*;

class Search implements hasMenu {
	public String menu(){
		Scanner input = new Scanner(System.in);

		System.out.println("Search");
		System.out.println("0) Quit");
		System.out.println("1) By title");
		System.out.println("2) By Author");
		System.out.println("3) By genre");

		System.out.println("What would you like to do? ");
		String response = input.nextLine();

		return response;
	} // end menu

	public void start(){
		boolean keepGoing = true;
		while (keepGoing){
			String response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				this.byTitle();
			} else if (response.equals("2")){
				this.byAuthor();
			} else if (reponse.equals("3")){
				this.byGenre();
			} else {
				System.out.println("Please enter 0-3");
			} // end if
		} // end while
	} // end start

	public void byTitle(){
		Scanner input = new Scanner(System.in);

		System.out.println("What book are you looking for? ");
		String response = input.nextLine();

		// figure out how to search for title in csv
	}
