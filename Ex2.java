public class Ex2 {
    public static void main(String[] args) {
        int[][] array = {{0,1,1}, {0,1,0},{1,0,1}};
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
        System.out.println();
        System.out.println(summMass(array));
    }
    
    public static int summMass(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            if (array.length != array[i].length) {
                throw new RuntimeException("Массив должен быть квадратным");
            }
            for (int cell : row) {
                if (cell != 0 && cell != 1) {
                    throw new RuntimeException("Массив должен состоять только из 0 и 1 ");
                }
                sum += cell;
            }
        }
        return sum;
    }
}
