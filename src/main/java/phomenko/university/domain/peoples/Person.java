package phomenko.university.domain.peoples;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
@Data
public abstract class Person {
    private String firstName;
    private String lastName;
    private String fatherName;
    private List<PersonStatus> statuses;
}
