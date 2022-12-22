import java.util.ArrayList;

public class PrimeDirective{

    //constructor
    public PrimeDirective(){

    }
    //prime check
    public boolean isPrime(int number){
        //handling edge case for number=2 and number<2
        if (number == 2){
            return true;
        }else if(number < 2){
            return false;
        }

        for (int i=2;i<number;i++){
            if (number % i == 0){
                return false;
            }
        }return true;
    }

    //Collect onlyPrime
    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();

       for(int number : numbers){
        if(isPrime(number)){
            primes.add(number);
        }
       }return primes;
    }
    //main method
    public static void main(String[] args){

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        //testing the isPrime()
        for (int i = 0; i< numbers.length;i++){
            System.out.println(i + " prime?: "+pd.isPrime(i));
        }

        //print onlyPrimes
        System.out.println(pd.onlyPrimes(numbers));
    }
}
