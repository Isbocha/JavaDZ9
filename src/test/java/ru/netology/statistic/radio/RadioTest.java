package ru.netology.statistic.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10, 9, 0, 0, 100, 0, 0);

    @Test
    public void shouldSetStation() {

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() {

        radio.setMaxStation(9);
        int expected = 9;
        int actual = radio.getMaxStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {

        radio.setMinStation(2);
        int expected = 2;
        int actual = radio.getMinStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMinStation() {

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMaxStation() {

        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveCurrentStation() { //переключение станций вперед

        radio.setCurrentStation(3);
        radio.increaseStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveCurrentStationNineZero() { //переключение станций вперед в начало

        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowCurrentStation() { //переключение станций назад

        radio.setCurrentStation(3);
        radio.decreaseStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowCurrentStationZeroNine() { //переключение станций назад

        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testQuantityStation() {
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testStation() {

        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolume() {

        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {

        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        radio.setMinVolume(0);
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMinVolume() {

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMaxVolume() {

        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMaxMaxVolume() {

        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveCurrentVolume() { //увеличение громкости

        radio.setCurrentVolume(56);
        radio.increaseVolume();
        int expected = 57;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveCurrentMaxVolume() { //увеличение громкости сверх доступной

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowCurrentMinVolume() { //уменьшение громкости

        radio.setCurrentVolume(56);
        radio.decreaseVolume();
        int expected = 55;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowCurrentMinVolume0() { //установление громкости меньше минимальной
        ;
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume() {
        Assertions.assertEquals(10, radio.getQuantityStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testNewMaxVolume() {
        radio.setMaxVolume(110);
        int expected = 110;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNewQuantityStationNew() {
        radio.setQuantityStation(110);
        int expected = 110;
        int actual = radio.getQuantityStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNull() {
        Assertions.assertEquals(10, radio.getQuantityStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
