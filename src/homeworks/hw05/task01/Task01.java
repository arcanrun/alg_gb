package homeworks.hw05.task01;

public class Task01 {
    public static void main(String[] args) {
        System.out.println(pow(12,11));
    }

    public static long pow(long number, long pow){
        if(pow == 1){
            return number;
        }
        return number * pow(number, pow-1);
    }
}
