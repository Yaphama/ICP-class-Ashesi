package labs;
public class PartC_2 {
	public static String reverse(String string) {
		String newString = "";
		
		for(int x = string.length()-1; x>=0; x--) {
			char character = string.charAt(x); 
				newString = newString + character;
			}
		String[] myList = newString.split(" ");
		newString = "";
		for(int x = myList.length - 1; x>=0; x--) {
			newString = newString +" "+ myList[x];
		}		
		return newString;
		}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Pride = "SGNIHt era gnitseretni";
		String newish = reverse(Pride);
		System.out.println(newish);
	}

}