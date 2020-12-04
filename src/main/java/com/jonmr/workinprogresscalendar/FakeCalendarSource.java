package com.jonmr.workinprogresscalendar;

import java.time.LocalDateTime;

import com.calendarfx.model.Calendar;
import com.calendarfx.model.CalendarSource;
import com.calendarfx.model.Entry;
import com.calendarfx.model.Interval;

public class FakeCalendarSource extends CalendarSource {
    private final Calendar userCalendar = new Calendar("John Smith");

    public FakeCalendarSource() {
        super("Fake");

        userCalendar.addEntries(
                new Entry<String>("Event 1", new Interval(LocalDateTime.now().minusDays(1), LocalDateTime.now().minusDays(1).plusMinutes(5))),
                new Entry<String>("Event 2", new Interval(LocalDateTime.now().minusDays(2), LocalDateTime.now().minusDays(2).plusMinutes(5))),
                new Entry<String>("Event 3", new Interval(LocalDateTime.now().minusDays(2), LocalDateTime.now().minusDays(2).plusMinutes(5))),
                new Entry<String>("Event 4", new Interval(LocalDateTime.now().minusDays(3), LocalDateTime.now().minusDays(3).plusMinutes(5))),
                new Entry<String>("Event 5", new Interval(LocalDateTime.now().minusDays(3), LocalDateTime.now().minusDays(3).plusMinutes(5))),
                new Entry<String>("Event 6", new Interval(LocalDateTime.now().minusDays(3), LocalDateTime.now().minusDays(3).plusMinutes(5)))
        );

        getCalendars().add(userCalendar);
    }
}
