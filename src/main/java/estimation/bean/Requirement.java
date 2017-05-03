package estimation.bean;

/**
 * Created by xuawai on 03/05/2017.
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Language;

@Document(collection = "requirement")
public class Requirement {
    @Id
    private Long id;

    private Description description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}
