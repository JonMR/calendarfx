package com.jonmr.workinprogresscalendar;

import java.time.Month;

import com.calendarfx.view.DateControl;
import com.calendarfx.view.page.YearPage;

public class WorkInProgressYearPage extends YearPage {
    public WorkInProgressYearPage() {
        super();

        for (Month month : Month.values()) {
            getYearView().getMonthView(month).setShowToday(false);
        }

        getCalendarSources().add(new FakeCalendarSource());
        setUsagePolicy(eventCount -> {
            if (eventCount == 3)
                return DateControl.Usage.MEDIUM;
            if (eventCount == 2)
                return DateControl.Usage.LOW;
            if (eventCount == 1)
                return DateControl.Usage.VERY_LOW;
            if (eventCount == 0)
                return DateControl.Usage.NONE;
            else
                return DateControl.Usage.VERY_HIGH;
        });
    }
}
