package designpartner.creational.builder.builders;

import designpartner.creational.builder.objects.HD;
import designpartner.creational.builder.objects.NoteBook;

public class NoteBookConcreteBuilder implements NoteBookBuilder {

    private NoteBook noteBook;

    //methods can contain rules to process the information before setting the object

    public NoteBookConcreteBuilder() {
        reset();
    }

    @Override
    public void setBrand(String brand) {
        //rules
        //can call an API
        //can search data in a database
        noteBook.setBrand(brand);
    }

    @Override
    public void setRAM(String RAM) {
        //rules
        //can call an API
        //can search data in a database
        noteBook.setRAM(RAM);
    }

    @Override
    public void setProcessor(String processor) {
        //rules
        //can call an API
        //can search data in a database
        noteBook.setProcessor(processor);
    }

    @Override
    public void setHD(HD hd) {
        //rules
        //can call an API
        //can search data in a database
        noteBook.setHD(hd);
    }

    @Override
    public void setScreenSize(int screenSize) {
        //rules
        //can call an API
        //can search data in a database
        noteBook.setScreenSize(screenSize);
    }

    //method get result is unique to the concrete class, because each builder can return different objects
    public NoteBook getResult(){
        return this.noteBook;
    }

    public void reset(){
        this.noteBook = new NoteBook();
    }
}
