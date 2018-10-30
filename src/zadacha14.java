import java.util.Scanner;

public class zadacha14 {
    String text;
   // String text= "какой-то 1 текст был написан 2 раза а потом ещё 3 раза и так до 5";

    public void solving(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите сообщение");
        text = reader.nextLine();

        String[] splited = text.split("\\s+");

        for(int i=0;i<splited.length;i++) {
            switch (splited[i]) {

            case "1":
                splited[i] = "один";
                break;
            case "2":
                splited[i] = "два";
                break;
            case "3":
                splited[i] = "три";
                break;
            case "4":
                splited[i] = "четыре";
                break;
            case "5":
                splited[i] = "пять";
                break;
            }


            System.out.print(splited[i]+" ");
        }
    }
}
