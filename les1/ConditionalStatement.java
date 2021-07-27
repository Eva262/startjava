import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько вам лет? ");
        int age = in.nextInt();
        if (age > 20) {
        System.out.println("А больше 20 и не дашь:) ");
        }
        System.out.println("Укажите ваш пол M/F? ");
        char gender = in.next().charAt(0);
        if (gender == 'M') {
        System.out.println("Мужской пол ");
        }
        if (gender != 'M') {
        System.out.println("Немужcкой пол ");
        }
        System.out.println("Укажите ваш рост в сантиметрах? ");
        float height = in.nextFloat()/100;
        if (height < 1.80) {
        System.out.println("Хороший рост! Не всем  же быть баскетболистами:) ");
        }
        else {
        System.out.println("Хороший рост! ");    
        } 
        System.out.println("Укажите первую букву вашего имени латиницей? ");
        char name = in.next().charAt(0);
        if (name == 'M') {
        System.out.println("Первая буква имени " + name);
        }
        else if (name == 'I') {
        System.out.println("Первая буква имени " + name);
        }
        else {
        System.out.println("Первая буква имени ни М и ни I");
        }   
    }
}    