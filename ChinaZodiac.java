import java.util.Scanner;
public class ChinaZodiac {
    public static void main(String[] args) {
        int year,kalan;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        year = input.nextInt();

        kalan = year%12;


        switch (kalan){
            case 0:
                System.out.println("Çin Zodiyağı Burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Çin Zodiyağı Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Çin Zodiyağı Burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Çin Zodiyağı Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Çin Zodiyağı Burcunuz : Fare");
                break;
            case 5:
                System.out.println("Çin Zodiyağı Burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Çin Zodiyağı Burcunuz : Kaplan");
            case 7:
                System.out.println("Çin Zodiyağı Burcunuz : Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodiyağı Burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodiyağı Burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Çin Zodiyağı Burcunuz : At");
                break;
            default:
                System.out.println("Çin Zodiyağı Burcunuz : Koyun");

        }
    }
}
