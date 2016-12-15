import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import org.joda.time.DateTime;


@DatabaseTable
public class Date {
    @DatabaseField
    DateTime dateOfOfTheDay
}
