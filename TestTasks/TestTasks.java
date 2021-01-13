
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class TestTasks {
    @Test
    void mainPositive() throws Exception{

        List<Tasks> tasksList = new ArrayList<>();
        Tasks t = new Tasks("Paine", 3, "doar la juma de kilogram", tasksList);

        assertEquals("Paine", t.getName());
        assertEquals("3", t.getNotizen());
        assertTrue(t.getTeilAufgaben().isEmpty());
}
