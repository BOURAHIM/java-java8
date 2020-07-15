package java8.ex07;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import org.junit.Test;

/**
 * Exercice 07 - Instant
 */
public class DateAndTime_07_Test {

    @Test
    public void test_date_to_localdate() throws Exception {

        // TODO Créer une date Java 1 (12/02/2017)
        Date date = new Date(2017,12,02);

        // TODO transformer la date en Instant
        Date currentDate = new Date();
        ZoneId currentZone = ZoneId.systemDefault();

        // TODO transformer la date en LocalDate
        LocalDate zoneDate = ZonedDate(now,currentZone);

        LocalDate result = null;

        // TODO valoriser les différentes variables afin de rendre le test passant

        assertThat(result.getYear(), is(2017));
        assertThat(result.getMonth(), is(Month.FEBRUARY));
        assertThat(result.getDayOfMonth(), is(12));

    }
}
