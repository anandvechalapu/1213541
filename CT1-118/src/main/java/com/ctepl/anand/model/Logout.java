@Entity
@Table(name="logout")
public class Logout {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private boolean isLoggedOut;
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public boolean isLoggedOut() {
        return isLoggedOut;
    }
    
    public void setLoggedOut(boolean isLoggedOut) {
        this.isLoggedOut = isLoggedOut;
    }
}