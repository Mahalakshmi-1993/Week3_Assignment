package week3.assignment;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
			String test="changeme";
			char[] charArray = test.toCharArray();
			for(int i=0;i<charArray.length;i++) {
				if(i%2!=0) {
					char upperCase = Character.toUpperCase(charArray[i]);			
					System.out.print(upperCase);
				}
				else {
					System.out.print(charArray[i]);
				}
			}
	}

}
