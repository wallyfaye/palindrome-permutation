class _Demo {
	public static void main(String[] args){
		if (args.length < 2){
			System.out.println("Please specify one string to test");
			System.exit(0);
		}
		PalindromePermutation pal_perm = new PalindromePermutation(args[0], args[1]);
		System.out.println("The result of \"" + args[0] + "\"  and \"" + args[1] + "\" is: " + pal_perm.res);
	}
}
