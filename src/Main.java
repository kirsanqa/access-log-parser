import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите текст и нажмите <Enter>: ");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        System.out.println("Длина введённого текста: " + inputText.length());
    }
}