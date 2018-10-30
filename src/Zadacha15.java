import java.util.Scanner;

public class Zadacha15 {

String alphabet="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

String message;

    public void solving(){
        char[] chars=alphabet.toCharArray();

        Scanner reader = new Scanner(System.in);

        System.out.println("Введите сообщение");
        message = reader.next();

        char[] mes=message.toCharArray();

//если символ из алфавита совпадает с символом из сообщения выводим индекс символа из алфавита +1
        for(int j=0;j<mes.length;j++){
            for (int i=0;i<alphabet.length();i++){

               if(mes[j]==chars[i]) {
                   System.out.print(i + 1);
               }
            }
        }

    }
}
