public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[n+1];
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }
        int j = 2;
        while (j < n) {
            for (int i = j+1; i < primes.length; i++) {
                if (i % j == 0)
                {
                    primes[i] = false;
                }
            }
            for (int i = j+1; i < primes.length; i++) {
                if (primes[i] == true) { 
                    j = i;
                    break;
                }
            }
        }
        int counter = 0;
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == true) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + (100*counter/n) + "% are primes)");
    }
}