package Java_Bootcamp.DSA.Searching.BinarySearch;

public class NextGratestLetter {
    static char find(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        if (target >= letters[end]) {
            return letters[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target >= letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start];
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'e';
        char result = find(letters, target);

        System.out.println("Next Gratest letter of " + target + " is: " + result);
    }
}


// avoid to return mid , because i don't want to return same value

