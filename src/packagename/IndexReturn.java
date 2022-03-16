package packagename;

public class IndexReturn {
	public static void main(String[] args) {
		String str = "I am Arch Archana";
		char[] str1 = str.toCharArray();
		int n = str.length();
		String str2 = "Arch";
		char[] str3 = str2.toCharArray();
		int n1 = str2.length();
		for (int i = 0; i < n-n1; i++) { //I
			for (int j = 0; j < n1; j++) { //A
				if (str1[i + j] == str3[j] && (j==n1-1)) { //I == A
					System.out.println("Index of the element is " + (i+1));
				}
				else if(str1[i + j] != str3[j])
					break;
			}
		}
	}
}



