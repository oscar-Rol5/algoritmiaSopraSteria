import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		System.out.println("Ejercicio 1");
		System.out.println();
		leerNumero(8);
		System.out.println("-------------------------");
		System.out.println("Ejercicio 2");
		System.out.println();
		leerPersonas();
		System.out.println("-------------------------");
		System.out.println("Ejercicio 3");
		System.out.println();
		leerSalario(9.80, 45);
	}
	
	public static void leerNumero(int num) {
		
		if (num % 2 == 0) {
	        System.out.println("El numero es par");
	        for(int i = num; i >= 0; i = i- 2) {
	        	System.out.println(i);
	        }
	    } else {
	    	System.out.println("El numero es impar");
	    	for(int i = num; i >= 0; i = i- 2) {
	        	System.out.println(i);
	        }
	    }
	}
	
	public static void leerPersonas() {
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		String sexo[] = new String[3];
		sexo[1] = "Masculino";
		sexo[2] = "Femenino";
		
		for(int i = 0; i < 50; i++) {
			
			int edadAleatoria = (int)(Math.random()*65+1);
			int sexoAleatorio = (int)(Math.random()*2+1);
			
			personas.add(new Persona(edadAleatoria, sexo[sexoAleatorio]));
			
		}
		
		//Contadores
		int cmayores = 0;
		int cmenores = 0;
		int cmasc = 0;
		int cfem = 0;
		int tfem = 0; //Total de mujeres
		
		for(int h = 0; h < personas.size(); h++) {
			
			if(personas.get(h).edad > 18) {
				cmayores++;
				if(personas.get(h).sexo.equals("Masculino")) {
					cmasc++;
				}
			}else {
				cmenores++;
				if(personas.get(h).sexo.equals("Femenino")) {
					cfem++;
				}
			}
			
			if(personas.get(h).sexo.equals("Femenino")) {
				tfem++;
			}
			
		}
		
		System.out.println("Número de personas mayores de 18 años: " + cmayores);
		System.out.println("Número de personas menores de 18 años: " + cmenores);
		System.out.println("Número de personas mayores masculinas: " + cmasc);
		System.out.println("Número de personas menores femeninas: " + cfem);
		System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de personas: " + (cmayores * 100)/50 + "%");
		System.out.println("Porcentaje que representa el género femenino: " + (tfem * 100)/50 + "%");
		
	}
	
	public static void leerSalario(double tarifa, double horas) {
		
		double salario = 0;
		
		if(horas > 40) {
			
			salario = tarifa * 40 + ((horas - 40) * (tarifa * 1.5));	
			
		}else {
			
			salario = tarifa * horas;
			
		}
		
		System.out.println("El salario del trabajador es de: " + salario);
		
	}

}
