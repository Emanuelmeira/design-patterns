package designpartner.creational.builder.objects;

public class HDD implements HD{

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
        return "HDD{" +
                "type='" + type + '\'' +
                ", writingSpeed=" + writingSpeed +
                '}';
    }
}
