package c346.rp.edu.p02_holidays;


public class holiday {
    private String name;
    private int image;
    private String date;

    public holiday(String name,int image, String date) {
        this.name = name;
        this.image = image;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getDate() {
        return date;
    }
}
