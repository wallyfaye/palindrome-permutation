class _Demo {
	public static void main(String[] args){
		if (args.length < 1){
			System.out.println("Please specify one string to test");
			System.exit(0);
		}
		PalindromePermutation pal_perm = new PalindromePermutation(args[0]);
		System.out.println("The result of \"" + args[0] + "\" is: " + pal_perm.res);
	}
}
