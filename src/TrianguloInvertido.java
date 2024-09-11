
public class TrianguloInvertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte cont1=6;
		byte cont2=6;
		String cad="";
		do {
			do {
				
				cad=cad+"*";
				
				cont2--;
				
			}while(cont2>0);
			
			cad=cad+"\n";
			cont1--;
			cont2=cont1;
			
		} while (cont1 > 0);
		
		System.out.println(cad);

	}

}
