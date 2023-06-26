
package ru.netology.statistic.radio;
public class Radio {

    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        {
            currentStation = 0;
        }
    }

    public void increaseStation() {

        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }

    }

    //  }
    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (
                currentStation == 0) {
            currentStation = 9;
        }
    }

    //Тут по звуку


    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void increaseVolume() {//увеличение громкости на 1
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {//уменьшение громкости - 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}

