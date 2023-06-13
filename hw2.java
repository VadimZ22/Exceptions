package homeWork;

import java.io.FileNotFoundException;
import java.util.*;

public class hw2 {

    public static void main(String[] args)
    {
       //floatInput("\nEnter a float number:");
        task2();
        task21();


    }

        public static float floatInput(String msg)
    {
        Scanner sc = new Scanner(System.in);
        float inputNum;
        while (true)
        {
            System.out.print(msg);
            try
            {
                inputNum =  Float.parseFloat(sc.next());
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Неверный ввод! Введите число!");
            }
        }
        return inputNum;
    }


    public static void task2()
    {
        int d =0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try {
                int[] intArray = new int[9];
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
                break;
            } catch (ArithmeticException e){
                System.out.println("На ноль делить нельзя, Catching exception: " + e);
                System.out.print("Введите число -> ");
                d = sc.nextInt();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Catching exception: " + e);
            }
        }

    }


    public static void task21()
    {
        try
        {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }
        catch (NullPointerException ex)
        {
            System.out.println("Указатель не может указывать на null!");
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так..." +
                    "\n" + ex.getMessage());

        }
    }


    public static void printSum(Integer a, Integer b) throws Exception
    {
        System.out.println(a + b);
    }


    public static void nullException(String msg)
    {
        Scanner sc = new Scanner(System.in);
        String inputStr;
        while (true)
        {
            System.out.print(msg);
            try
            {
                inputStr = sc.nextLine();
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Incorrect enter!");
            }
        }
        if (inputStr.isEmpty())
        {
            System.out.print("String is empty! Enter a symbol:");
            nullException(" ");
        }
        System.out.println(inputStr);
    }

}
