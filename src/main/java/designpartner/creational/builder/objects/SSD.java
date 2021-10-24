package designpartner.creational.builder.objects;

public class SSD implements HD{

    private String type;
    private int writingSpeed;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setWritingSpeed(int writingSpeed) {
        this.writingSpeed = writingSpeed;
    }

    public String getType() {
        return type;
    }

    public int getWritingSpeed() {
        return writingSpeed;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "type='" + type + '\'' +
                ", writingSpeed=" + writingSpeed +
                '}';
    }
}
