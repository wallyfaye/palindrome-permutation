public class PalindromePermutation{
	public boolean res = false;
	public PalindromePermutation(String str_1){
		int[] char_int = new int[512];
		int debt = 0;

		for(int i = 0; i < str_1.length(); i++){
			if(char_int[str_1.charAt(i)] <= 0){
				char_int[str_1.charAt(i)]++;
				debt++;
			} else {
				char_int[str_1.charAt(i)]--;
				debt--;
			}
		}

		if( (debt == 0) && (str_1.length()%2 == 0) ){
			res = true;
		} else if( (debt == 1) && (str_1.length()%2 == 1) ){
			res = true;
		}

	}	

}
