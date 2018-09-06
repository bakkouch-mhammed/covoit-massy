package fr.massy.covoit.covoit_massy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Calendar;

public class Time {

    private int hour;
    private int minute;
    private Calendar time;

    public Time(int hour, int minute) {
        Calendar time = Calendar.getInstance();
        time.set(Calendar.HOUR_OF_DAY, hour);
        time.set(Calendar.MINUTE, minute);
        this.time = time;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }
}

