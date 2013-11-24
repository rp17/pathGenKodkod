package Test;

public class EuclidianAlgorithm {
    public static void main(){
    	euclid(10, 100);
    }
    
    //Computes the GCD of inputs A and B
    
    public static int euclid(int a, int b){	
    	while( b != 0){
        if (a > b){
            a = a- b;
        }
        else
            b = b - a;
        }
    return a ;

    }
}
