public class Radio {
    private int currentStation;
    private int volume;
    private final int MAX_STATION = 9;
    private final int MIN_STATION = 0;
    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;
    public Radio() {
        this.currentStation = MIN_STATION;
        this.volume = MIN_VOLUME;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation >= MIN_STATION && currentStation <= MAX_STATION) {
            this.currentStation = currentStation;
        }
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
    }
    public void nextStation() {
        if (currentStation == MAX_STATION) {
            currentStation = MIN_STATION;
        } else {
            currentStation++;
        }
    }
    public void prevStation() {
        if (currentStation == MIN_STATION) {
            currentStation = MAX_STATION;
        } else {
            currentStation--;
        }
    }
    public void setStation(int station) {
        if (station >= MIN_STATION && station <= MAX_STATION) {
            currentStation = station;
        }
    }
    public void increaseVolume() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }
    public void decreaseVolume() {
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }
}