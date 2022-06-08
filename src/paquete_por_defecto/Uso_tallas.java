//En este video se explicara lo que se hiso en el video 48 que es la creacion de tipos 
// enumerados que pertenecen a la clase ENUM de la API de java


package paquete_por_defecto;

import java.util.Scanner;

public class Uso_tallas {
	
	
	//Estas es la manera mas sensilla de ingresar valores enum 
	
	//enum Talla {MINI,MEDIANO,GRANDE, MUY_GRANDE}
	
	//Estos valores solo se agregaran en el
	//objeto talla si queremos usar otro tipo de dato diferente o mas datos ya no nos lo 
	//permitiara ya que los objetos enum solo permiten datos definidos u no mas
     
	//la declaracion de un objeto enum se tiene que hacer afuera del metodo main 
	
	
	//Ahora se vera a continuacion el uso de contructores y el uso de getters y setters
	//con enum 
      enum  Talla{
    	  
    	  //Delracion del tipo numerado enum Talla
    	  MINI("S"),MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
    	  
    	  private Talla (String abreviatura) {//Los constructores en este caso son
    		  //private por que no se pueden instanciar estos
    		  this.abreviatura=abreviatura;//Aqui esta haciendo la abreviatura por que el
    		  //constructor esta funcionando a modo de setter y le esta dando la abreviatura 
    	  }
    	  
    public String dameAbreviatura() {  
    	return abreviatura;
    }
    	  
    	  private String abreviatura;
    	  
      }
      
      
     
	
	
	public static void main(String[] args) {
		
		
		//Esta es la manera de usarlos  
		/*
        //ahora lo que se tiene que hacer objetos de tipo talla
		//que solo acepatara los valores que se le dieron al objeto de clase Talla de 
		//la clase perteneciente enum 
		
		Talla s = Talla.MINI;
		Talla m = Talla.MEDIANO;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.MUY_GRANDE;/*/
		
		
		//Ahora se vera a continuacion el uso de contructores y el uso de getters y setters
		//con enum 
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla : MINI, MEDIANO,GRANDE,MUY_GRANDE");
		
		String entrada_datos=entrada.next().toUpperCase(); //toUpperCase convierte de minuscula a minuscula 
		
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);//En esta line lo que 
		//estamos haciendo es alamacenar en la variable la_talla el valor que devuelve
		//el metodo valuoff que es obtener que lo que ingreso el usuario devuelva 
		//si es S, M, L, XL
		
		System.out.println("Talla= " + la_talla);//aqui nos da lo que el usuario ingreso
		
		System.out.println("Abreviatura= " + la_talla.dameAbreviatura());//y aqui la 
		//abreviatura que le corresponde
		
		
		
		
	}

}
