package metrocs.redistricting;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
/**
 * Tests for Voter objects.
 *
 * @author Jada, David, Colin, John, Daniel, Ali
 * @version
 */
public class StarGeneratorTest {
    @Test
    public void generatePatternTest() {
        ArrayList<ArrayList<Location>> firstLocation = new ArrayList<ArrayList<Location>>();
        ArrayList<ArrayList<Location>> secondLocation = new ArrayList<ArrayList<Location>>();
        //check if method returns something
        assertNotNull(StarGenerator.generatePattern(1));
        assertNotNull(StarGenerator.generatePattern(4));
        //assign same parameter, test if same result
        firstLocation = StarGenerator.generatePattern(4);
        secondLocation = StarGenerator.generatePattern(4);
        assertEquals(firstLocation, secondLocation);
        //assign different parameter, test if different result

    }

}
