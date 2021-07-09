@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
}