package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadiomanTest {
    @Test
    void shouldChangeNextMaxNumberStation() {
        Radioman radioman = new Radioman(10, 10);
        radioman.changeNextNumberStation();
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void shouldChangeNextNumberStation() {
        Radioman radioman = new Radioman(5, 10);
        radioman.changeNextNumberStation();
        assertEquals(6, radioman.getCurrentStation());
    }


    @Test
    void shouldChangePrevMinNumberStationB() {
        Radioman radioman = new Radioman(0, 10);
        radioman.changePrevNumberStation();
        assertEquals(10, radioman.getCurrentStation());
    }

    @Test
    void shouldChangePrevNumberStation() {
        Radioman radioman= new Radioman(5, 10);
        radioman.changePrevNumberStation();
        assertEquals(4, radioman.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolumeUnderMax() {
        Radioman radioman= new Radioman(16, 100, 0);
        radioman.increaseVolume();
        assertEquals(17, radioman.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeHighMax() {
        Radioman radioman = new Radioman(100, 100, 0);
        radioman.increaseVolume();
        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radioman radioman = new Radioman(15, 100, 0);
        radioman.decreaseVolume();
        assertEquals(14, radioman.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeBelowMin() {
        Radioman radioman = new Radioman(0, 100, 0);
        radioman.decreaseVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }
}
