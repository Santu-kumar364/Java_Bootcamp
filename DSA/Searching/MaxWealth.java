package Java_Bootcamp.DSA.Searching;

public class MaxWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] person : accounts) {
            int sum = 0;
            for (int account : person) {
                sum += person[account];
            }
            maxWealth = Math.max(maxWealth, sum);
        }

        return maxWealth; 
    }
    
}
