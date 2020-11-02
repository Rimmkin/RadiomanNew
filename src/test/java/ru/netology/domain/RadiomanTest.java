package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    Radioman radioman = new Radioman();


    private void constValue() {
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
    }
//станции

    @Test                                  //увеличение станции на 1
    void shouldNextNumberStation() {
        constValue();
        radioman.setCurrentStation(8);
        radioman.nextNumberStation ();
        assertEquals(9, radioman.getCurrentStation());
    }



    @Test                                   //уменьшение станции на 1
    void shouldPrevNumberStation() {
        constValue();
        radioman.setCurrentStation (1);
        radioman.prevNumberStation ();
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test                                 // уменьшение мин.значения станции
    void shouldPrevMinNumberStation() {
        constValue();
        radioman.setCurrentStation(0);
        radioman.prevNumberStation ();
        assertEquals(9, radioman.getCurrentStation());
    }
    @Test                                  //увеличение макс.значения станции
    void shouldNextMaxNumberStation() {
        constValue();
        radioman.setCurrentStation(9);
        radioman.nextNumberStation();
        assertEquals(0, radioman.getCurrentStation());
    }
        @Test                                  //увеличение макс.значения станции
        void shouldCurrentStationHighMax() {
            constValue();
            radioman.setCurrentStation(10);
            assertEquals(0, radioman.getCurrentStation());
        }


        @Test                                  // уменьшение мин.значения станции
        void shouldCurrentStationBelowMin() {
            constValue();
            radioman.setCurrentStation(-1);
            assertEquals(0, radioman.getCurrentStation());
        }


// громкость
    @Test                                     //увеличение на 1
    void shouldIncreaseVolume() {
        constValue();
        radioman.setCurrentVolume(9);
        radioman.increaseVolume();
        assertEquals(10, radioman.getCurrentVolume());
    }


    @Test                            //уменьшение на 1
    void shouldDecreaseVolume() {
        constValue();
        radioman.setCurrentVolume(1);
        radioman.decreaseVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test                           //увеличение макс.значения громкости
    void shouldCurrentVolumeHighMax() {
        constValue();
        radioman.setCurrentVolume(11);
        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test                              //уменьшение мин.значения громкости
    void shouldCurrentVolumeBelowMin() {
        constValue();
        radioman.setCurrentVolume(-1);
        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test                   //увеличение громкости на 1
    void shouldIncreaseMaxVolume() {
        constValue();
        radioman.setCurrentVolume(10);
        radioman.increaseVolume();
        assertEquals(10, radioman.getCurrentVolume());
    }

    @Test              //уменьшение громкости на 1
    void shouldDecreaseMinVolume() {
        constValue();
        radioman.setCurrentVolume(0);
        radioman.decreaseVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }

}


