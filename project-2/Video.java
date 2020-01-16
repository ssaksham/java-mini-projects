import java.util.Scanner;

public class Video {
    static Scanner sc = new Scanner(System.in);
    String videoName;
    boolean checkout =false;
    int rating = 0;

    public Video(String videoName) {
        this.videoName = videoName;
    }
    void doCheckOut() {
        if (checkout == false) {
            checkout =true;
            System.out.println(videoName+" checkout");
        }
       else System.out.println(videoName+" already checkout");
    }

    void doReturn(){
        if(checkout == true)
        {
            System.out.println(videoName+" get returned");
            checkout = false;
        }
        else System.out.println(videoName+" already returned");
}

    void receiveRating(int rating){
        this.rating = rating;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if(rating<11&&rating>=-1)
        this.rating = rating;
        else{
            System.out.println("Enter between 0 to 10");
            int newRating = sc.nextInt();
            this.setRating(newRating);
        }
    }

    @Override
    public String toString() {
        return "Name: "+videoName + " Rating: "+rating;
    }

    @Override
    public boolean equals(Object obj) {
        if ((((Video)obj).videoName).equals(videoName))
            return true;
        return false;
    }
}
