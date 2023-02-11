public class Caso2GPT {
  public static void main(String[] args) {
    /*
     * ENUNCIADO:
     * Dado un Array bidimensional con números enteros, devolver la posición donde
     * se encuentra el número más alto.
     */

    int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[] posicion = encontrarNumeroMasAlto(array);
    System.out.println("El número más alto se encuentra en la fila " + posicion[0] + " y en la columna " + posicion[1]);
  }

  public static int[] encontrarNumeroMasAlto(int[][] array) {
    int[] posicion = { 0, 0 };
    int max = array[0][0];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] > max) {
          max = array[i][j];
          posicion[0] = i;
          posicion[1] = j;
        }
      }
    }
    return posicion;
  }
}
