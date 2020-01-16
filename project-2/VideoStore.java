import java.util.ArrayList;

public class VideoStore {
    ArrayList<Video> store;
    public VideoStore(){
        store = new ArrayList<>();
    }
    void doCheckout(String name){
        Video item = new Video(name);
        if (isHave(item)){
            Video item1 = getVideo(name);
            item1.doCheckOut();
        }
        else  System.out.println(item.videoName+" not available");
    }

    void doReturn(String name){
        Video item = new Video(name);
        if (isHave(item)){
            Video item1 = getVideo(name);
            item1.doReturn();
        }
        else  System.out.println(item.videoName+" not available");
    }
    void receiveRating(String name , int rating){
        Video item = new Video(name);
        if (isHave(item)){
            Video item1 = getVideo(name);
            item1.setRating(rating);
        }
        else  System.out.println(item.videoName+" not available");
    }

    void listInventory(){
        System.out.println(store);
    }

    void addVideo(String name){
        store.add(new Video(name));
    }


    boolean isHave(Video item){
        if(store.contains(item))
        return true;
        return false;
    }


Video getVideo(String name){
        Video item1 = new Video(name);
        int index = store.indexOf(item1);
        return store.get(index);
}


}