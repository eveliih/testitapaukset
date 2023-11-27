import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SecToTimeTest {

    @ParameterizedTest(name="Luvun {0} merkkijono on {1}")
    @CsvSource({ "0, 0:00:00", "3665, 1:01:05", "-2147483647, -1", "2147483647, -1", "-3665, -1"})
    void timeToSecNumerot(String sekunnit, String tulos) {
        String viesti = sekunnit + " muutettu merkkijonoksi virheellisesti";

        int sek = Integer.parseInt(sekunnit);
        String vastaus = TimeUtils.secToTime(sek);
        assertEquals(tulos, vastaus, viesti);
    }

}