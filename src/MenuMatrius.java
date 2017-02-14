import java.util.Scanner;

public class MenuMatrius {

	public static void main(String[] args) {
	
		//Declaramos las matrices que vamos a utilizar
		int matrizA [][];
		int matrizB [][];
		
		//Creamos dos variables que seran el tamaño de las filas y las columnas y las igualas al metodo pideTam
		int tamFiles = pideTam("fila") ;
		int tamColum = pideTam("columna");
		
		//Aquí creamos las matrices con el tamaño introducido por el usuario
		System.out.println("\nMatriz A:");
		matrizA = new int [tamFiles][tamColum];
		
		//Pedimos al usuario que introduzca un numero para cada posicion de la matriz
		pideNumMatriz(matrizA);
		//Este metodo muestra el contenido de la matriz una vaz esta llena
		muestraUnaMatriz(matrizA);
		
		System.out.println("\nMatriz B:");
		matrizB = new int [tamFiles][tamColum];
		
		pideNumMatriz(matrizB);
		muestraUnaMatriz(matrizB);
		
		//Aquí creamos las variables para los metodos de las operaciones con las matrices
		int[][] matrizSuma = sumaMatrices(tamFiles, tamColum, matrizA, matrizB);
		int[][] matrizResta = restaMatrices(tamFiles, tamColum, matrizA, matrizB);
		int[][] matrizDivision = divisionMatrices(tamFiles, tamColum, matrizA, matrizB);
		int[][] matrizMulti = multiMatrices(tamFiles, tamColum, matrizA, matrizB);
		
		//Aquí creamos el switch que va a ir enlazado a nuestro menu y el cual nos dara las diferentes opciones
		int eleccion;
		do{
		eleccion = menuMatriz();
		
		
		switch(eleccion){
		case 1: sumaMatrices(tamFiles, tamColum, matrizA, matrizB);
					for (int i=0;i<matrizSuma.length;i++){
						for (int x=0;x<matrizSuma[0].length;x++){
							System.out.print(matrizSuma[i][x]+" ");
						}
						System.out.println();
					}
				break;
		case 2: restaMatrices(tamFiles, tamColum, matrizA, matrizB);
					for (int i=0;i<matrizResta.length;i++){
						for (int x=0;x<matrizResta[0].length;x++){
							System.out.print(matrizResta[i][x]+" ");
						}
						System.out.println();
					}
				break;
		case 3: divisionMatrices(tamFiles, tamColum, matrizA, matrizB);
					for (int i=0;i<matrizDivision.length;i++){
						for (int x=0;x<matrizDivision[0].length;x++){
							System.out.print(matrizDivision[i][x]+" ");
						}
						System.out.println();
					}
				break;
		case 4: multiMatrices(tamFiles, tamColum, matrizA, matrizB);
					for (int i=0;i<matrizMulti.length;i++){
						for (int x=0;x<matrizMulti[0].length;x++){
							System.out.print(matrizMulti[i][x]+" ");
						}
						System.out.println();
					}
				break;
		case 5: System.out.println("\nMatriz A:");
				muestraUnaMatriz(matrizA);
				System.out.println("\nMatriz B:");
				muestraUnaMatriz(matrizB);
				break;
		case 6: System.out.println("¡Hasta Pronto!");
				break;
		default: System.out.println("La tecla introducida no es correcta");
				break;
		}
		}while(eleccion !=3);		
	}
	
	//Este metodo pide al usuario un tamaño de fila y columna para las matrices
	public static int pideTam(String missatge){
		Scanner scA = new Scanner(System.in);
		System.out.println("Introduce el tamaño de "+missatge+"  de la Matriz");
		int valor = scA.nextInt();
		return valor;
	}
	
	//Este metodo pide al usuario un numero para cada posicion de las matrices
	public static int[][] pideNumMatriz(int matrizA[][]){
		Scanner scN = new Scanner(System.in);
		int numArray = 0;
		
		for (int i=0;i<matrizA.length;i++){
			for (int x=0;x<matrizA[i].length;x++){
				System.out.println("Introduce el valor de pos ["+i+"]["+x+"]");
				matrizA[i][x] = scN.nextInt();
			}
		}
		
		return matrizA;
	}
	
	//Este metodo es el que muestra la informacion de las matrices 
	public static void muestraUnaMatriz(int matrizAMostrar[][]){
		
		for (int i=0;i<matrizAMostrar.length;i++){
			for (int x=0;x<matrizAMostrar[i].length;x++){
				System.out.print(matrizAMostrar[i][x]+"\t");
			}
			System.out.println();
		}
	}
	
	//Este metodo es el menú que nos da las opciones 
	public static int menuMatriz(){
		int eleccion;
		Scanner opcion = new Scanner(System.in);
		System.out.println("***** MENU MATRICES *****");
		System.out.println("1. Suma de dos matrices");
		System.out.println("2. Resta de dos matrices");
		System.out.println("3. Division de dos matrices");
		System.out.println("4. Multiplicacion de dos matrices");
		System.out.println("5. Muestra las matrices");
		System.out.println("6. Salir del menú");
		eleccion = opcion.nextInt();
		return eleccion;
	}
	
	//Este metodo suma las dos matrices
	public static int[][] sumaMatrices(int tamFiles, int tamColum, int matrizA[][], int matrizB[][]){
		int matrizSuma[][];
		matrizSuma = new int [tamFiles][tamColum];
		for (int i=0;i<matrizA.length;i++){
			for (int x=0;x<matrizA[i].length;x++){
				matrizSuma[i][x]=matrizA[i][x]+matrizB[i][x];
			}
		}
		return matrizSuma;
	}
	
	//Este metodo resta las matrices
	public static int[][] restaMatrices(int tamFiles, int tamColum, int matrizA[][], int matrizB[][]){
		int matrizResta[][];
		matrizResta = new int [tamFiles][tamColum];
		for (int i=0;i<matrizA.length;i++){
			for (int x=0;x<matrizA[i].length;x++){
				matrizResta[i][x]=matrizA[i][x]-matrizB[i][x];
				
			}
		}
		return matrizResta;
	}
	
	//Este metodo divide las matrices
	public static int[][] divisionMatrices(int tamFiles, int tamColum, int matrizA[][], int matrizB[][]){
		int matrizDivision[][];
		matrizDivision = new int [tamFiles][tamColum];
		for (int i=0;i<matrizA.length;i++){
			for (int x=0;x<matrizA[i].length;x++){
				matrizDivision[i][x]=matrizA[i][x]/matrizB[i][x];
				
			}
		}
		return matrizDivision;
	}
	
	//Este metodo multiplica las matrices
	public static int[][] multiMatrices(int tamFiles, int tamColum, int matrizA[][], int matrizB[][]){
		int matrizMulti[][];
		matrizMulti = new int [tamFiles][tamColum];
		for (int i=0;i<matrizA.length;i++){
			for (int x=0;x<matrizA[i].length;x++){
				matrizMulti[i][x]=matrizA[i][x]/matrizB[i][x];
				
			}
		}
		return matrizMulti;
	}
	
	
}	
