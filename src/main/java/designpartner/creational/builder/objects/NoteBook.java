package designpartner.creational.builder.objects;

public class NoteBook {

    private String brand;
    private String RAM;
    private String processor;
    private HD HD;
    private int screenSize;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public designpartner.creational.builder.objects.HD getHD() {
        return HD;
    }

    public void setHD(designpartner.creational.builder.objects.HD HD) {
        this.HD = HD;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "brand='" + brand + '\'' +
                ", RAM='" + RAM + '\'' +
                ", processor='" + processor + '\'' +
                ", HD=" + HD +
                ", screenSize=" + screenSize +
                '}';
    }
}
