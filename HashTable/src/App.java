public class App {

	public static void main(String[] args) throws Exception {
        HashTableSeparateChaining<String,Double> ht = new HashTableSeparateChaining<>();
        
        String[] foods = {"burger", "hotdog", "chicken wing", "pizza"};

        double[] prices = {4.00, 2.00, .50, 3.00};

        for (int i = 0; i < prices.length; i++) {
            ht.add(foods[i], prices[i]);
        }

        for (int i = 0; i < prices.length; i++) {
            System.out.printf("%s: %.2f\n",foods[i], ht.get(foods[i]));
        }
    }
}