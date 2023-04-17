import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите неделю: ");
        Week weeks = Week.valueOf(scanner.nextLine().toUpperCase());
        switch (weeks){
            case MONDAY -> System.out.println(Week.MONDAY);
            case TUESDAY -> System.out.println(Week.TUESDAY);
            case WEDNESDAY -> System.out.println(Week.WEDNESDAY);
            case THURSDAY -> System.out.println(Week.THURSDAY);
            case FRIDAY -> System.out.println(Week.FRIDAY);
            case SATURDAY -> System.out.println(Week.SATURDAY);
            case SUNDAY -> System.out.println(Week.SUNDAY);
        }
    }
}