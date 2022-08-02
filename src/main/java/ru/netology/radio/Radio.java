package ru.netology.radio;

public class Radio {
    public int currentChannel;
    public int maxChannel = 9;
    public int minChannel = 0;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = minChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void nextChannel() {
        if (currentChannel < maxChannel) {
            currentChannel = currentChannel + 1;
            return;
        }
        this.currentChannel = minChannel;
    }

    public void prevChannel() {
        if (currentChannel > minChannel) {
            currentChannel = currentChannel - 1;
            return;
        }
        this.currentChannel = maxChannel;
    }

    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 10;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;

        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
        return;
    }
}

