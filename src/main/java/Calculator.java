public class Calculator {

    public int add(int fistrNum, int secondNum){
        int sum = 0;
        sum = fistrNum+secondNum;
        return sum;
    }
    public int Multiply(int firtsNum, int secondNum){
        int result = 0;
        result = firtsNum * secondNum;
        return result;
    }
    public int Divide(int firtsNum, int secondNum){
        int result = 0;
        result = firtsNum / secondNum;
        return result;
    }
    public int substract(int fistrNum, int secondNum){
        int sum = 0;
        sum = fistrNum-secondNum;
        return sum;
    }
    public boolean egual(int fistrNum, int secondNum){
        if(fistrNum==secondNum)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public int PGCD(int fistrNum, int secondNum){

        if (secondNum==0) return fistrNum;
        return PGCD(secondNum,fistrNum%secondNum);

    }
    public int max(int fistrNum, int secondNum){
        int max = 0;
        if(fistrNum>secondNum)
        {
            max = fistrNum;
        }
        else{
            max =secondNum;
        }

        return max;
    }
    public int min(int fistrNum, int secondNum){
        int min = 0;
        if(fistrNum<secondNum)
        {
            min = fistrNum;
        }
        else{
            min =secondNum;
        }

        return min;
    }
    public String ToBinairy(int x){
        String bin = Integer.toBinaryString(x);
        return bin;
    }
    public void Reconize(){


    }
}
