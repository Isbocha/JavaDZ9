package ru.netology.statistic.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() {
        Radio station = new Radio();
        station.setToMaxStation();
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {
        Radio station = new Radio();
        station.setToMinStation();
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMinStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMaxStation() {
        Radio station = new Radio();
        station.setCurrentStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveCurrentStation() { //переключение станций вперед
        Radio station = new Radio();
        station.setCurrentStation(3);
        station.increaseStation();
        int expected = 4;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveCurrentStationNineZero() { //переключение станций вперед в начало
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.increaseStation();
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowCurrentStation() { //переключение станций назад
        Radio station = new Radio();
        station.setCurrentStation(3);
        station.decreaseStation();
        int expected = 2;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowCurrentStationZeroNine() { //переключение станций назад
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.decreaseStation();
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testQuantityStation() {
        Radio station = new Radio(10);
        Assertions.assertEquals(9, station.getMaxStation());
        Assertions.assertEquals(0, station.getMinStation());
        Assertions.assertEquals(9, station.getCurrentStation());
    }

    @Test
    public void testStation() {
        Radio station = new Radio();
        Assertions.assertEquals(9, station.getMaxStation());
        Assertions.assertEquals(0, station.getMinStation());
        Assertions.assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio volume = new Radio();
        volume.setToMaxVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio volume = new Radio();
        volume.setToMinVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMinVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMaxVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMaxMaxVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveCurrentVolume() { //увеличение громкости
        Radio volume = new Radio();
        volume.setCurrentVolume(56);
        volume.increaseVolume();
        int expected = 57;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveCurrentMaxVolume() { //увеличение громкости сверх доступной
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowCurrentMinVolume() { //уменьшение громкости
        Radio volume = new Radio();
        volume.setCurrentVolume(56);
        volume.decreaseVolume();
        int expected = 55;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowCurrentMinVolume0() { //установление громкости меньше минимальной
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume() {
        Radio station = new Radio();
        Assertions.assertEquals(9, station.getMaxStation());
        Assertions.assertEquals(0, station.getMinStation());
        Assertions.assertEquals(0, station.getCurrentStation());
    }
}
