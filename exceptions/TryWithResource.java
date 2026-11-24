class DatabaseSession implements AutoCloseable {
    public void query(String sql) {
        System.out.println("Executing: " + sql);
    }

    @Override
    public void close() {
        System.out.println("Closing database session");
    }
}

public class TryWithResource {
    public static void main(String[] args) {
        try (DatabaseSession session = new DatabaseSession()) {
            session.query("SELECT * FROM users");
        } finally {
            System.out.println("Execution completed");
        }
    }
}
/*
output:Executing: SELECT * FROM users
Closing database session
Execution completed

 */