package markerinterfaces;

public class UserData implements BackupSerializable {
    private final String username;
    private final String email;
    public UserData(String username, String email) { this.username = username; this.email = email; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    @Override public String toString() { return "UserData{" + username + ", " + email + "}"; }
}
