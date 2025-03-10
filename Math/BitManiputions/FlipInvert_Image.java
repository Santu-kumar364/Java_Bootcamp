package Java_Bootcamp.Math.BitManiputions;

class FlipInvert_Image {
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;

        for (int[] row : image) {
            for (int i = 0; i < (n + 1) / 2; i++) {
                // Swap and invert using XOR
                int temp = row[i] ^ 1;
                row[i] = row[n-i-1] ^ 1;
                row[n-i-1] = temp;
            }
        }
        return image; // Return the flipped and inverted matrix
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        int[][] result = flipAndInvertImage(arr);

        // Print the result properly
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}













