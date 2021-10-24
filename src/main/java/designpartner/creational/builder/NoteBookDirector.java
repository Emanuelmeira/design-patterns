package designpartner.creational.builder;

import designpartner.creational.builder.builders.NoteBookBuilder;
import designpartner.creational.builder.objects.SSD;

public class NoteBookDirector {

    void makeMacBook(NoteBookBuilder noteBookBuilder){
        var ssd = new SSD();
        ssd.setType("nvme");
        ssd.setWritingSpeed(2000);

        noteBookBuilder.setBrand("Apple");
        noteBookBuilder.setHD(ssd);
        noteBookBuilder.setProcessor("M1");
        noteBookBuilder.setRAM("32");
        noteBookBuilder.setScreenSize(13);
    }

    void makePowerfulNotebook(NoteBookBuilder noteBookBuilder){
        var ssd = new SSD();
        ssd.setType("m2");
        ssd.setWritingSpeed(4000);

        noteBookBuilder.setBrand("Alienware");
        noteBookBuilder.setHD(ssd);
        noteBookBuilder.setProcessor("Intel Xeon Platinum");
        noteBookBuilder.setRAM("64");
        noteBookBuilder.setScreenSize(20);
    }

    void makeSimpleNoteBook(NoteBookBuilder noteBookBuilder){
        var hdd = new SSD();
        hdd.setType("SATA");
        hdd.setWritingSpeed(300);

        noteBookBuilder.setBrand("positivo");
        noteBookBuilder.setHD(hdd);
        noteBookBuilder.setProcessor("Celeron");
        noteBookBuilder.setRAM("4");
        noteBookBuilder.setScreenSize(13);
    }
}
