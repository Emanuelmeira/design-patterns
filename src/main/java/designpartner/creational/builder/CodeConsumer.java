package designpartner.creational.builder;

import designpartner.creational.builder.builders.NoteBookConcreteBuilder;
import designpartner.creational.builder.objects.SSD;

public class CodeConsumer {

    public static void main(String[] args) {
        withDirector();
        noDirector();
    }

    private static void noDirector() {

        var notebookBuilder = new NoteBookConcreteBuilder();

        var ssd = new SSD();
        ssd.setType("m2");
        ssd.setWritingSpeed(4000);

        notebookBuilder.setBrand("Alienware");
        notebookBuilder.setHD(ssd);
        notebookBuilder.setProcessor("Intel Xeon Platinum");
        notebookBuilder.setRAM("64");
        notebookBuilder.setScreenSize(20);

        System.out.println(notebookBuilder.getResult());

    }

    private static void withDirector() {
        //A director class can be used to concentrate calls to construct an object, but it is not mandatory.

        var director = new NoteBookDirector();
        var notebookBuilder = new NoteBookConcreteBuilder();

        director.makePowerfulNotebook(notebookBuilder);
        var notebookPowerFul = notebookBuilder.getResult();
        System.out.println(notebookPowerFul);

        notebookBuilder.reset(); //clean object notebook
        director.makeMacBook(notebookBuilder);
        var mac = notebookBuilder.getResult();
        System.out.println(mac);

        notebookBuilder.reset(); //clean object notebook
        director.makeSimpleNoteBook(notebookBuilder);
        var simpleNotebook = notebookBuilder.getResult();
        System.out.println(simpleNotebook);
    }
}
