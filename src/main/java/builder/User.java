package builder;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@ToString @Builder
public class User {
    private String firstName;
    private String lastName;
    @Singular
    private List<String> occupations;
    private String gender;
    private int age;
}
