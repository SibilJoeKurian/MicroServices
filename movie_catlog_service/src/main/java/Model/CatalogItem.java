package Model;

public class CatalogItem {
private String name;
private String desc;
private float rating;

    public CatalogItem(String name, String desc, float rating) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String toString(){
        return name +" "+desc+" "+String.valueOf(rating);
    }
}
