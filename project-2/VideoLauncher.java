import java.util.Scanner;

public class VideoLauncher {
    public static Scanner sc = new Scanner(System.in);
    public static VideoStore vikuStore;

    public static void print1() {
        System.out.println("MAIN MENU");
        System.out.println("==========");
        System.out.println("1. Add Video :");
        System.out.println("2. Checkout Video");
        System.out.println("3. Return Video");
        System.out.println("4. Receive Rating");
        System.out.println("5. List Inventory");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) {
        vikuStore = new VideoStore();
        while (1 < 2) {
            print1();
            int input = sc.nextInt();
            String name;
            switch (input) {
                case 1:
                    System.out.println("Enter name of video:");
                    name = sc.next();
                    vikuStore.addVideo(name);
                    break;
                case 2:
                    System.out.println("Enter name of video:");
                    name = sc.next();
                    vikuStore.doCheckout(name);
                    break;
                case 3:
                    System.out.println("Enter name of video:");
                    name = sc.next();
                    vikuStore.doReturn(name);
                    break;
                case 4:
                    System.out.println("Enter name of video:");
                    name = sc.next();
                    System.out.println("Enter rating from 0 to 10");
                    int rating = sc.nextInt();
                    vikuStore.receiveRating(name, rating);
                    break;
                case 5:
                    vikuStore.listInventory();
                    break;
                case 6:
                    return;

            }
        }
    }
}
