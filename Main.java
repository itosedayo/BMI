import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("身長を入力してください");
        double height = scanner.nextDouble();
        System.out.print("体重を入力してください");
        double weight = scanner.nextDouble();
        scanner.close();
        System.out.printf("あなたのBMI値は%.2fです%n", weight / Math.pow(height / 100, 2));
    }
}