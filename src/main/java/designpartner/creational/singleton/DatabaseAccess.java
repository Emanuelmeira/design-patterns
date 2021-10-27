package designpartner.creational.singleton;

public class DatabaseAccess {

    // Has problems when used in multithreading environment

    private static DatabaseAccess databaseAccess;
    private String sql;

    private DatabaseAccess() { }

    public static DatabaseAccess getInstance(){
        if(databaseAccess == null){
            databaseAccess = new DatabaseAccess();
        }
        return databaseAccess;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
