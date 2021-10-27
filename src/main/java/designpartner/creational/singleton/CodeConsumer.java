package designpartner.creational.singleton;

public class CodeConsumer {

    public static void main(String[] args) {

        var databaseAccess = DatabaseAccess.getInstance();
        databaseAccess.setSql("Select ...");
        System.out.println(databaseAccess.getSql());

    }
}
