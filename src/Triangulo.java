
public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte cont1=0;
		byte cont2=0;
		String cadena="";
		
		while(cont1<5){
			cont1++;
			cont2=cont1;
			while(cont2>0)
			{
				cadena=cadena+"*";
				cont2--;
			}
			cadena=cadena+"\n";
			
		}
		System.out.println(cadena);
		

	}

}
