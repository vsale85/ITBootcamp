package domaci18122020;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		  int datum;
		    String mesec = "";
		    String astroloskiZnak = "";
		   
		    Scanner sc = new Scanner(System.in);
		 
		 
		    System.out.println("Unesite mesec rodjenja: " );
		    mesec = sc.next();
		  
		    System.out.println("Unesite datum rodjenja: " );
		    datum = sc.nextInt();
		   
		     
		   
			if (mesec.equals("decembar")){
		         
		        if (datum < 22)
		        	astroloskiZnak = "strelac";
			
		        else
		       
		        	astroloskiZnak = "jarac";
		       
			}
		   
		   
		    else if (mesec.equals("januar")){
		        if (datum < 20)
		        	astroloskiZnak = "jarac";
		        else
		        	astroloskiZnak = "vodolija";
		     
		    }
		         
		    else if (mesec.equals("feburar")){
		        if (datum < 19)
		        	astroloskiZnak = "vodolija";
		        else
		        	astroloskiZnak = "ribe";
		       
		    }
		         
		    else if(mesec.equals("mart")){
		        if (datum < 21)
		        	astroloskiZnak = "ribe";
		        else
		        	astroloskiZnak = "ovan";
		       
		    }
		    else if (mesec.equals("april")){
		        if (datum < 20)
		        	astroloskiZnak = "ovan";
		        else
		        	astroloskiZnak = "bik";
		      
		    }
		         
		    else if (mesec.equals("maj")){
		        if (datum < 21)
		        	astroloskiZnak = "bik";
		        else
		        	astroloskiZnak = "blizanci";
		       
		    }
		         
		    else if(mesec.equals("jun")){
		        if (datum < 21)
		        	astroloskiZnak = "blizanci";
		        else
		        	astroloskiZnak = "rak";
		       
		    }
		         
		    else if (mesec.equals("jul")){
		        if (datum < 23)
		        	astroloskiZnak = "rak";
		        else
		        	astroloskiZnak = "lav";
		       
		    }
		         
		    else if(mesec.equals("avgust")){
		        if (datum < 23)
		        	astroloskiZnak = "lav";
		        else
		        	astroloskiZnak = "devica";
		       
		    }
		         
		    else if (mesec.equals("septembar")){
		        if (datum < 23)
		        	astroloskiZnak = "devica";
		        else
		        	astroloskiZnak = "vaga";
		       
		    }
		         
		    else if (mesec.equals("oktobar")){
		        if (datum < 23)
		        	astroloskiZnak = "vaga";
		        else
		        	astroloskiZnak = "skorpija";
		       
		    }
		         
		    else if(mesec.equals("novembar")){
		        if (datum < 22)
		        	astroloskiZnak = "skorpija";
		        else
		        	astroloskiZnak = "strelac";
		    
		    }
			if (datum <=0 || datum >31 ) {
		     	   System.out.println("Znak nije moguce odrediti.");
				
		    }
			{
				System.out.println(astroloskiZnak);
			}

	}

}
