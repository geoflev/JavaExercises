
package calculation;


public class Calculations {
    

    
    public int getSum(int a,int b){
        int sum = a + b;
        return sum;
    }
    
    public double division(int num1 , int num2){
        if(num2 == 0){
            throw new ArithmeticException(num2 + " is zero.Cannot divide by 0!!!!");
        }
        double division = num1 / num2;
        return division;
    }
    
    public int sumOfArray(int [] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }
    
    public void multiplyArrayByNumber(int [] array,int num){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            array[i] *= num;
        }
    }
}
