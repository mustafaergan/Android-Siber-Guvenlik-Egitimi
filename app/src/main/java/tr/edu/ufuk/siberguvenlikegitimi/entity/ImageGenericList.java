package tr.edu.ufuk.siberguvenlikegitimi.entity;

/**
 * Created by mustafaergan
 */

public class ImageGenericList {
    private String name;
    private int imageNumber;

    public ImageGenericList(String name, int imageNumber) {
        this.name = name;
        this.imageNumber = imageNumber;
    }

    public void setImageNumber(int imageNumber) {
        this.imageNumber = imageNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageNumber() {
        return imageNumber;
    }

    public String getName() {
        return name;
    }
}
