class Operator{
	public static void main(String[] args){
		int i = 1;
		int j = 2;
		int k = 1;
		// System.out.println(i++); 
		// System.out.println(++k);
		// System.out.println("i after postfix: "+ i);
		// System.out.println(--j);
		// System.out.print("j after prefix decrement: "+ j);
	  if(++i > 1 && j-- < 4){
        System.out.println("i: "+i);
        System.out.println("j: "+j);
	  }else{
        System.out.println("i: "+i);
        System.out.println("j: "+j);
	  }
	   	
	}
}