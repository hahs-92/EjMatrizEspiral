package co.com.sofkau.tl;



public class MatrizEspiral {
    // parámetros: matriz, nro fila o columna, el nro en el que comienza
    public static int initialValue = 1;
    public static int start = 0;
    public static int numRow = 0;

    public static void main(String[] args) {
        int sizeMatriz = 3;
        int[][] matriz = new int[sizeMatriz][sizeMatriz];
        numRow = sizeMatriz;

        matriz = fromLeftToRight(matriz,numRow, start);
        matriz = fromToptoBottom(matriz, numRow, start);
        matriz = fromRightToLeft(matriz, numRow, start);
        matriz = fromBottomtoTop(matriz, numRow, start);

        printMatriz(matriz);
    }

    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario
   


    // método para recorrer fila izq-der
    public  static int[][] fromLeftToRight(int[][] matriz, int numRow, int start) {
        for(int i = start; i <= numRow - 1; i++) {
            matriz[start][i] = initialValue++;
        }
        return  matriz;
    }

    // método para recorrer columna desc
    public  static int[][] fromToptoBottom(int[][] matriz, int numRow, int start) {
        for(int i = start + 1; i <= numRow - 1 ; i++) {
            matriz[i][numRow - 1] = initialValue++;
        }
        return  matriz;
    }

    // método para recorrer fila der-izq
    public  static int[][] fromRightToLeft(int[][] matriz, int numRow, int start) {
        for(int i = numRow - 2; i >= start ; i--) {
            matriz[numRow - 1][i] = initialValue++;
        }
        return  matriz;
    }

    // método para recorrer columna asc
    public  static int[][] fromBottomtoTop(int[][] matriz, int numRow, int start) {
        for(int i = numRow - 2 ; i >= start + 1 ; i--) {
            matriz[i][start] = initialValue++;
        }
        return  matriz;
    }

    // método para imprimir la matriz
    public static void printMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
    }

}
