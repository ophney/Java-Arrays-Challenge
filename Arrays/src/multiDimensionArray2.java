public class multiDimensionArray2 {
    public static void main(String[] args) {
        int[][] myArray = new int[100][30];
        int[][] o = getRandomArray(myArray);
        System.out.print("Original multi-dimensional array of the sizes 100 outer 30 inner:\n ");
        for (int[] x : o) {
            for (int y : x) {
                if (y % 2 == 0 && y % 11 == 0) {
                    System.out.print(y + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("incremented values in the multi-dimensional array:\n ");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                o[i][j] = o[i][j] + 1;
            }
        }
        for (int[] x : o) {
            for (int y : x) {
                if (y % 2 == 0 && y % 11 == 0) {
                    System.out.print(y + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] getRandomArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = (int) (Math.random() * 150);
            }
        }
        return arr;
    }
}

