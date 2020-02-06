package datatype;

public class Font {

    private String name;
    private String family;
    private float size;

    public Font(String name, String family, float size) {
        this.name = name;
        this.family = family;
        this.size = size;
    }

    public Font(String family, float size) {
        this.family = family;
        this.name = family;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

}


