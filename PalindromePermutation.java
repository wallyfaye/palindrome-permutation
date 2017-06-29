public class PalindromePermutation{
	public boolean res = true;
	public PalindromePermutation(String str_1, String str_2){
		// check if strings are the same length
			if(str_1.length() != str_2.length()){
				res = false;
			}
		
		// check if the strings have the same characters
			int[] perm_1 = new int[512];
			for(int i = 0; i < str_1.length(); i++){
				perm_1[str_1.charAt(i)]++;
			}

			for(int i = 0; i < str_2.length(); i++){
				perm_1[str_2.charAt(i)]--;
				if(perm_1[str_2.charAt(i)] < 0){
					res = false;
				}
			}

	}	

}
