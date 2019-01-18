package labs;
public class PartC_2 {
	//Method that reverses any phrase sentence given to it.
	public static String reverse(String string) { 
		String newString = "";
		
		for(int x = string.length()-1; x>=0; x--) {
			char character = string.charAt(x); 
				newString = newString + character;
			} 
		//For loop that flips the the whole  sentence to 
		
		String[] myList = newString.split(" ");
		newString = "";
		for(int x = myList.length - 1; x>=0; x--) {
			newString = newString +" "+ myList[x];
		}		
		return newString;
		}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "sgniHt era gnitseretni";
		String newish = reverse(word);
		System.out.println(newish);
	}

}
