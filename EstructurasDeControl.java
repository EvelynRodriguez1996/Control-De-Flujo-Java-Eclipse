package flujoControl;

public class EstructurasDeControl {//Debe coincidir la clase con el nombre de nuestro documento	

	public static void main(String[] args) {//Todo dentro del metodo main
		
		//Recordar que para que ao¿lgo se ejecute, siempre debe de ir dentro del metodo principal 
		
		
		//Primero vamos a definir una variable del tipo String donde almaceno un dato
		String citaProgramada = null; //Dejamos en Null y despues lo cambiamos a una fecha "28-09-23"
		//La variable declarada se inicia en Null a proposito para tener un espacio de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		
		if (citaProgramada != null) {
			System.out.println("Ya hay una cita programada una disculpita.");// Porque la variable ya esta ocupada o llena
		}else {
			System.out.println("Puede registrar su cita.");// Podemos registrar otra cita o una cita
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Seleccionando una opcion y almacenando la variable opcion 
		
		int opcion = 1;
		
		//Creamos un menu
		System.out.println("Menú del Diente Feliz Consultorio Dental ");
		System.out.println("1. Desea Programar una cita ?");
		System.out.println("2. Verificar Cita Programada");
		System.out.println("3. Cancelar Cita");
		System.out.println("4. Salir del Menú");
		System.out.println("Seleccione una opcion del Menú (1-4): ");
		
		switch (opcion) {
		case 1: 
			System.out.println("Usted ha seleccionado la opcion programar cita."); //Agrega la logica para programar una cita
			break;
		case 2: System.out.println("Usted ha seleccionado la opcion verificar cita");
		break;
		case 3: System.out.println("Usted ha seleccionado la opcion de cancelar cita : (");
		break;
		case 4: 
			System.out.println("Usted ha seleccionado la opcion salir del menú");
			break;
			default:
				System.out.println("La opcion que usted selecciono no es valida. Por favor, seleccione una opcion de nuestro menu(1-4).");
				break;
		}//switch cierre
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
//- Verificar  si la edad del paciente es apta para cierto tratamiento
//- Investigar operador ternario ?:
//- Ejemplo de consultorio

//Ingresando una edad del paciente
int edadPaciente = 20;

System.out.println("Evaluando si el paciente es apto para medicamento...");

//Condicion if
if (edadPaciente >= 18){
System.out.println("Podemos otorgar su medicamento respectivo :)");
} else {
System.out.println("Lo sentimos, no podemos otorgarle un medicamento :(");
} 

//- Operador ternario ejercicio

String estado = (edadPaciente >= 60) ? "es de la tercera edad, requiere atencion especial" : "no es de la tercera edad, no requiere atencion especial";

System.out.println("El paciente " + estado);	
		
		}//metodo

}//clase
