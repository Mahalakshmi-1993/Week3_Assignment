package week3.assignment;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test ="I am a software tester"; 
		String[] testSplit = test.split(" ");
		//System.out.println(testSplit[2]);
		for(int i=0;i<testSplit.length;i++) {
			if(i%2==1) {
				String outputString="";
				for(int j=testSplit[i].length()-1;j>=0;j--) {
					outputString=outputString+testSplit[i].charAt(j);
				}
				System.out.print(" "+outputString);
			}
			else {
				System.out.print(" "+testSplit[i]);
			}
		}
	}

}
