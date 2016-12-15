import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.*;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@DatabaseTable
public class Todo {
    @DatabaseField
    @Setter
    private String name;
    @DatabaseField
    @Setter
    private boolean isDone;
    @DatabaseField(generatedId = true)
    private Integer id;

    public Todo (String name){
        this.name = name;
        isDone = false;
    }

    public String toString() {

        if (isDone) {
            return "[X] " + this.name;
        } else {
            return "[X] " + this.name;
        }
    }
}
