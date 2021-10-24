package designpartner.creational.builder.builders;

import designpartner.creational.builder.objects.HD;

public interface NoteBookBuilder {
    void setBrand(String brand);
    void setRAM(String RAM);
    void setProcessor(String processor);
    void setHD(HD hd);
    void setScreenSize(int screenSize);
}
