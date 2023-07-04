

package ru.netology.statistic.radio;

public class Radio {
    private int quantityStation = 10;
    private int maxStation = quantityStation - 1;
    private int minStation = 0;
    private int currentStation = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int station) {
        this.quantityStation = station;
        this.maxStation = station - 1;
        this.minStation = minStation;
        this.currentStation = station - 1;
    }

    public Radio() {
        this.currentStation = minStation;
        this.maxStation = maxStation;
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int setQuantityStation() {
        return quantityStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void setToMaxStation() {
        currentStation = maxStation;
    }

    public void setToMinStation() {
        currentStation = minStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }

        currentVolume = newCurrentVolume;
    }


    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }

    public void increaseStation() {

        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    //  }
    public void decreaseStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
        if (
                currentStation == minStation) {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {//увеличение громкости на 1
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {//уменьшение громкости - 1
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}


