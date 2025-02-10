//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 15;
        System.out.println("The value of number is : (before) " + number);
        changeValue(number);
        System.out.println("The value of number is : (after) " + number);

        number = 20;
        //pass by reference
        NumberWrapper numberWrapper = new NumberWrapper(number);
        System.out.println("The value of number in NumberWrapper is (before)"+ numberWrapper.number);
        changeValue2(numberWrapper);
        System.out.println("The value of number in NumberWrapper is (after)"+ numberWrapper.number );

        Integer num = 25;

    }

    //pass by value
    static void changeValue(int number){
        number = number + 10;
    }

    static void changeValue2(NumberWrapper number){
        number.number = number.number = 10;
    }

    static class NumberWrapper{
        public int number;
        public NumberWrapper(int number){
        this.number = number;
        }
    }

    public static void sort(int{})
}