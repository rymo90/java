import java.util.Scanner;

public class classVsInstance {
    private int age;
    String ans = "";

	public classVsInstance(int initialAge) {
  		// Add some more code to run some checks on initialAge
       if (initialAge < 0){
           System.out.println("Age is not valid, setting age to 0.");
           this.age = 0;
       }
       else{
           this.age = initialAge;
       }


	}

	public void amIOld() {
  		if (age < 13 ){
            ans ="You are young.";
        }
        else if (age >= 13 && age < 18){
            ans = "You are a teenager.";
        }
        else{
            ans ="You are old.";
        }

        System.out.println(ans);
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age  ++;
	}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			classVsInstance p = new classVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
  }

}
