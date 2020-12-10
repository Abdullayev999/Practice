package com.company;


import java.util.Arrays;
import java.util.Random;

public class Main {

    static void method(int from,int to){
        for (int i = from; i < to; i++) {
            if (i%2==0) System.out.println(i+" ");
        }
    }

    /*
    адание 3
Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
Метод принимает в качестве параметра: длину линии,
направление, символ.
     */
    static void line(int line,boolean isLine,char smb){
        for (int i = 0; i < line; i++) {
            if (isLine){
                System.out.print(smb);
            }else
            {
                System.out.println(smb);
            }
        }
    }
public  static int count = 0;
    public static int fibonacci(int n) {
        System.out.println(count++);
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }


    public static int sumArr(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
        }

        return sum;
    }

    public static int maxArr(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i])
                max = arr[i];
        }

        return max;
    }

    public static int[] findOddEvenNegPos(int[] arr){

        int[] find = new int[4];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0){
                find[0]++;
            }else{
                find[1]++;
            }

            if (arr[i]%2==0)find[2]++;
            else find[3]++;
        }

        return find;
    }

    static void sort(int[] arr, int sort){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (sort==1){
                    if (arr[j]>arr[j+1]){
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }else if(sort==2){
                    if (arr[j]<arr[j+1]){
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
        }




    }

    static public int[] reverse(int[] arr){
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - i - 1];
        }
        return newArr;
    }





    static int[][] sumAllRowArr(int[][] arr){

        int sum = 0 , max = 0 , maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            max +=arr[0][i];
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum +=arr[i][j];
            }
            if (sum>max){
                max = sum;
                maxIndex = i;
            }
            sum = 0;
        }

        int[][] find = new int[2][];
        find[0] = new int[]{maxIndex};
        find[1] = arr[maxIndex];

        return find;
    }

    public static void main(String[] s)
    {

 /*
 2) Найти массив с максимальной суммой элементов
Сгенерировать десять массивов из случайных чисел. +
Вывести их и сумму их элементов на экран.
Найти среди них один с максимальной суммой элементов.
Указать какой он по счету, повторно вывести этот массив и сумму его элементов.
 *
        Random rand = new Random();

        int[][] arr = new int[10][10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i) + " )   " );
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(10);
                sum += arr[i][j];
                System.out.print( arr[i][j] + " ");
            }
            System.out.print("  =>  "+ sum);
            sum = 0;
            System.out.println();
        }

        int[][] newArr = sumAllRowArr(arr);

        System.out.println();
        System.out.println("Max = " + newArr[0][0]);

        System.out.print("Max stroka = ");
        for (int i = 0; i < newArr[1].length; i++) {
            System.out.print(newArr[1][i] + " ");
        }*/






        /*Задание 5
Напишите метод, переворачивающий содержимое
массива
 */
        /*Scanner scanner = new Scanner(System.in);
        Random  rand = new Random();
        int size = rand.nextInt(6)+5;
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] newArr = reverse(arr);
        System.out.println();
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }*/

/*Задание 4
Напишите метод, сортирующий массив по убыванию или возрастанию в зависимости от выбора
пользователя.  */
        /*Scanner scanner = new Scanner(System.in);
        Random  rand = new Random();
        int size = rand.nextInt(6)+5;
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("1 : 1->9");
        System.out.println("2 : 9->1");
        int select = scanner.nextInt();


        sort(arr,select);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


        System.out.println();
        System.out.println("1 : 1->9");
        System.out.println("2 : 9->1");
         select = scanner.nextInt();
        sort(arr,select);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }*/






        /*Задание 3
Напишите метод, определяющий количество чётных,
нечётных, положительных, отрицательных элементов
массива. Массив передаётся в качестве параметра.

Random  rand = new Random();
        int size = rand.nextInt(6)+5;
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i]+" ");
        }

        int even = 0 , noteven = 0 , pos = 0,  neg = 0;
        int[] newArr = findOddEvenNegPos(arr);

        System.out.println("\npozitif = " + newArr[0]);
        System.out.println("neg = " + newArr[1]);
        System.out.println("even = " + newArr[2]);
        System.out.println("noteven = " + newArr[3]);

*/






        /*
        Задание 1
Напишите метод, вычисляющий сумму элементов
массива. Массив передаётся в качестве параметра.  */

        /*Random  rand = new Random();
        int size = rand.nextInt(6)+5;
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println(sumArr(arr));*/





        /*Задание 2
Напишите метод для нахождения максимума в массиве. Массив передаётся в качестве параметра.  */


        /*Random  rand = new Random();
        int size = rand.nextInt(6)+5;
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println(" max = " + maxArr(arr));*/





        //  fibonacci Последовательност
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first = 1;
        int second = 1;
        int tmp = first + second;
        if(n == 1)
        {
            System.out.print(1 + " ");
        }
        if(n == 2)
        {
            System.out.print(1 + " ");
            System.out.print(1 + " ");
        }
        if(n > 2)
        {
            System.out.print(1 + " ");
            System.out.print(1 + " ");
        }
        for(int i = 0 ; i < n - 2;i++)
        {
            System.out.print(tmp + " ");
            first = second;
            second = tmp;
            tmp = first + second;
        }*/
        //System.out.println(fibonacci(8));











       // line(5,false,'*');

       /*
       6. Ввести n слов с консоли. Найти слово ,
          символы в котором идут в стро-гом порядке возрастания их кодов.
          Если таких слов несколько, найти первое из них.
        *//*
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String tmp = "";
        boolean b = true;
        String good = "";
       one: for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)!=' '){
                tmp+= str.charAt(i);
            }else {
                System.out.println(tmp);
                int count = 0;
                b = true;
                count=(int)tmp.charAt(0);
                for (int j = 1; j < tmp.length(); j++) {
                   if (count<=(int)tmp.charAt(j))count=(int)tmp.charAt(j);
                   else b=false;
                }

               if (b) {
                   good = tmp;
                   break one;
               }
                  tmp = "";
            }

        }

        System.out.println(good);*/




        //1. Ввести n строк с консоли,
        // найти самую короткую и самую длинную строки.
        // Вывести найденные строки и их длину.

       /* Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str+=" ";
        String tmp = "";
        int min = 1000;
        int max = -1;
        String minWord="";
        String maxWord="";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)!=' '||i==str.length()-1){
                tmp+= str.charAt(i);
            }else {

                if (tmp.length()>max) {
                    max = tmp.length();
                    maxWord = tmp;
                }

                if (tmp.length()<min) {
                    min = tmp.length();
                     minWord = tmp;
                }
                tmp = "";
            }

        }

        System.out.println("Min = "+ minWord);
        System.out.println("count = "+ min);

        System.out.println();

        System.out.println("Max = "+ maxWord);
        System.out.println("count = "+ max);*/








        /*
        Пользователь вводит строку , посчитать сколько там цифр
         */

        /*Scanner scanner = new Scanner(System.in);
        int countNumbers = 0;
        int countLetters = 0;
        int countSentence = 0;
        String newStr = "";
        System.out.print("Введите строку : ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if ((int)str.charAt(i) >= 48 && (int)str.charAt(i) <=57){
                countNumbers++;
            }

            if (((int)str.charAt(i) >=65 && (int)str.charAt(i)<=90) ||
                    ((int)str.charAt(i)>=97 && (int)str.charAt(i) <=122)){
                countLetters++;
            }

            if ((int)str.charAt(i) == 46){ // или   str.charAt(i) == '.'
                countSentence++;
            }

            if ( i!=0 && (int)str.charAt(i-1)==46 && (int)str.charAt(i)>=97 && (int)str.charAt(i) <=122){
                int tmp = (int)str.charAt(i) - 32;

                newStr+=(char)tmp;
            }else {
                newStr+=str.charAt(i);
            }
        }

        System.out.println("Цифры   = " + countNumbers);
        System.out.println("Буквы   = " + countLetters);
        System.out.println("Символы = " + (str.length() - countLetters - countNumbers));
        System.out.println("Весь размер = " + str.length());
        System.out.println("Количество предложений = " + countSentence);
        System.out.println("New str = " + newStr);*/




        /*
        Задание 3
        Пользователь вводит с клавиатуры строку, слово для
        поиска, слово для замены. Произведите в строке замену
        одного слова на другое. Полученную строку отобразите
        на экране

        String str = "Hello world today world is snowy in my world."; //scanner.next();
        String subStr = "world";//scanner.next();
        String change = "car";

        System.out.println("До    = " + str);
        System.out.println("После = " + str.replace(subStr,change));
        */




        /*String tmp = "";
        String newStr = "";
        System.out.println("Str = " + str);
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ' && i != str.length()-1)
            {
                tmp+=str.charAt(i);
            }
            else{
                if (tmp.compareTo(subStr)==0)
                {
                    newStr+=change + " ";
                }else{
                    newStr+=tmp + " ";
                }
                tmp = "";
            }
        }
        System.out.println("newStr = " + newStr);
*/






       /* Задание 1
        Пользователь вводит с клавиатуры три цифры.
        Необходимо создать число, содержащее эти цифры. Например,
        если с клавиатуры введено 7, 3, 8, тогда нужно сформировать число 738.

        Scanner scanner = new Scanner(System.in);
        int newNum=0;

        for (int i = 100; i >0 ; i/=10) {
            int num = scanner.nextInt();
            newNum+=(num*i);
        }
        System.out.println(newNum);*/


        /*
        Задание 2
Пользователь вводит с клавиатуры число, состоящее
из четырех цифр. Требуется найти произведение цифр.
Например, если с клавиатуры введено 1324, тогда результат произведения 1*3*2*4 = 24.



        Scanner scanner = new Scanner(System.in);
        int newNum=1;
        int sum;
        int num = scanner.nextInt();
        for (int i = 1000 , b = 1; i >0 ; i/=10 , b*=10) {

            int tmp = num/i;
            newNum*=(num/i);
            num=num-tmp*i;
            System.out.println(num);
        }
        System.out.println(newNum);*/




/*
Задание 5
Пользователь с клавиатуры вводит четырёхзначное
число. Необходимо перевернуть число и отобразить
результат. Например, если введено 4512, результат 2154.
 *//*

        Scanner scanner = new Scanner(System.in);
        int newNum=0;
        int sum;
        int num = scanner.nextInt();
        for (int i = 1000 , b = 1; i >0 ; i/=10 , b*=10) {

            int tmp = num/i;
            newNum+=(tmp*b);
            num=num-tmp*i;
        }
        System.out.println(newNum);*/



































        /*int row = 3;
        int col = 4;
        int sum = 0;
        int necetnie=0;

        Random random = new Random();

        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }


        //Найти индекс минимального эл-та массива.
        int min = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (min>arr[i][j]){
                    min = arr[i][j];
                }
            }
        }


        // Найти индекс максимального эл-та массива .
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }

        // Поменять их местами .
        int maxStroka=0;
        int maxStolbik=0;
        int minStroka=0;
        int minStolbik=0;
        max = arr[0][0];
        min = arr[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max<arr[i][j]){
                    max = arr[i][j];
                    maxStroka = i;
                    maxStolbik = j;
                }
                if (min>arr[i][j]){
                    min = arr[i][j];
                    minStroka = i;
                    minStolbik = j;
                }
            }
        }

        int tmp = arr[maxStroka][maxStolbik];
        arr[maxStroka][maxStolbik] = arr[minStroka][minStolbik];
        arr[minStroka][minStolbik]=tmp;


        // Пользователь вводит строку , в этой строке идет сдвиг влево всех эл-ов строки


        Scanner scanner = new Scanner(System.in);
        System.out.print("Row = ");
        row =scanner.nextInt();
        System.out.print("Cols = ");
        col =scanner.nextInt();

        arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col-1; j++) {
                tmp = arr[i][j];
                arr[i][j]=arr[i][j+1];
                arr[i][j+1] = tmp;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println();
        System.out.println("После того как поменяли мин и макс");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }*/



















        /*int n = 4;
        int [] arr = new int[n];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i < n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.print("До = ");

        for(int i = 0 ; i < n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        // 1 2 3 4  ->    2 3 4 1

         int n = 4;
        // Сдвиг в лево
        for (int i = 0; i < n-1; i++)
        {
                //процесс сдвига
                int tmp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1] = tmp;
        }


        System.out.print("\nПосле = ");
        for(int i = 0 ; i < n;i++)
        {
            System.out.print(arr[i] + " ");
        }*/




        /*for(int i = 0 ; i < n ; i++)
        {
            average+= arr[i];
        }

        average = average/n;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] > average) {
                count++;
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (arr[i] > 0 && arr[i] % 2 == 0)
            {
                sumPos+=arr[i];
            }
        }

        max = 0;
        min = 0;
        int sumElement = 0;

        for (int i = 1; i < n; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
            if (arr[min] > arr[i]){
                min = i;
            }
        }




        if (min<max)
        {
            for (int i = min; i <= max; i++) {
                sumElement+=arr[i];
            }
        }else{
            for (int i = max; i <= min; i++) {
                sumElement+=arr[i];
            }
        }

        // 10 , 1 , 20 , 2
        // 0    1   2    3


        System.out.println();

        int tmp = arr[min];
        arr[min] = arr[max];
        arr[max] = tmp;

        for(int i = 0 ; i < n;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nAverage = " + average );
        System.out.println("Count large average = " + count );
        System.out.println("Сумма четных и положительных чисел = " + sumPos);
        System.out.println("Max index = " + max);
        System.out.println("Min index = " + min);
        System.out.println("Сумма между мин и макс = "+ sumElement);*/





        /*int arr[] = {100,2,30,499,59,96,-7,80,-9,10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i <arr.length-1; i++) {

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }*/
        /*int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for (int a:arr){
            System.out.print(a);
           arr[2]=10;
        }
        System.out.println();
        for (int a:arr){
            System.out.print(a);
            arr[0]=10;
        }*/
        //System.out.println(Arrays.toString(arr));;


        //int arr[] = {1,2,3,4,5,6,7,8,9,10};
        /*int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/





        /*int[] arr = new int[]{1,2,3,4,5};
        for (int i = 0; i <arr.length ; i++) {

            System.out.println(arr[i]);
        }*/






        /* Scanner scanner = new Scanner(System.in);
       int size = scanner.nextInt();
       int number;
       int sumPolojitelnix=0;
       int sumCetnix=0;
       int x=20;
       boolean proverka = false;
        for (int i = 0; i < size; i++) {
            number=scanner.nextInt();

            if (number>=0)sumPolojitelnix+=number;
            if (number%2==0)sumCetnix+=number;
            if (number==x)proverka=true;


        }

        System.out.println("Summa cetnix cisel " + sumCetnix);
        System.out.println("Summa polojitelnix cisel " + sumPolojitelnix);
        System.out.println("Est li cislo  " + x +  " = "+ proverka);



*/
        /*int score = 0;
        int levelGame = scanner.nextInt();
        int levelMode;
        switch (levelGame)
        {
            case 1:
                levelMode = 10;
                break;
            case 2:
                levelMode = 50;
                break;
            case 3:
                levelMode = 100;
                break;
            default:
                levelMode = 15;
                break;
        }
        int attempt = 5;
        while(true) {


            int compNumber = (int) (Math.random() * levelMode);
            System.out.println("Введите число ");
            int number = scanner.nextInt();
            System.out.println(compNumber);
            while (compNumber != number && attempt > 0) {
                if (compNumber > number)
                {
                    System.out.println("Вы ввели неправильное число (ваше меньше) , введите снова ");
                }
        else {
                    System.out.println("Вы ввели неправильное число (ваше больше) , введите снова ");
                }

                System.out.println("У вас " + attempt + " попыток");
                number = scanner.nextInt();
                attempt--;
            }
            if (number == compNumber) {
                score++;
                System.out.println("Вы победили! Угадывайте снова. У вас " + score + " очков! ");
            }
    else
            {
                score--;
                System.out.println("Вы проиграли! Угадывайте снова. У вас " + score + " очков! ");
            }
        }


*/





       // Scanner scanner = new Scanner(System.in);
        /*1.Пользователь вводит число с клавиатуры
        если оно положительно прибавить к нему 3
        иначе разделить на 5*/

        /*System.out.print("Please enter number = ");
        int number = scanner.nextInt();

        if (number>=0) {
            number+=3;
        }else{
            number/=5;
        }

        System.out.println(number);*/



        /*2. Если число больше 0 и меньше 5 ,
         тогда прибавить к нему 10 ,
         если число больше либо равно 5 то умножить его на 4
         . Если меньше нуля , то разделить на 19
         а если 0 оставить не трогая*/

        /*System.out.print("Please enter number = ");
         number = scanner.nextInt();

         if (number>0&&number<5){
             number+=10;
         }else if(number>=5)
         {
             number*=4;
         }else if (number < 0){
             number /= 19;
         }*/

        //1
       /* int sum=0;
        for (int i = 0; i < 123467; i+=7) {
            sum+=i;
        }
        System.out.println(sum);

        //2
         sum=0;
        for (int i = 4; i < 34678; i*=4) {
            sum+=i;
        }
        System.out.println(sum);

        //3
        sum=0;
        for (int i = 5; i > -3456; i-=5) {
            sum+=i;
        }
        System.out.println(sum);

        //4
        sum=0;
        for (int i = 3; i < 202; i+=3) {
            sum+=i;
        }
        System.out.println(sum);*/


        /* 5
        * Найти кубы чисел от 1 до 100 то есть
        * 1*1*1 + 2**2*2 + 3*3*3 и
        * так далее*/
        /*int kub=0;
        for (int i = 1; i < 100; i++) {
            kub = i*i*i;
            System.out.println("Kub cisla "+ i + " = " + kub);
        }*/


    }

}
