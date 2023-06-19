import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {
    @Test
    public void testRadioConstructor() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getVolume());
    }
    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }
    @Test
    public void testSetCurrentStationOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void testSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        assertEquals(50, radio.getVolume());
    }
    @Test
    public void testSetVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        assertEquals(0, radio.getVolume());
        radio.setVolume(101);
        assertEquals(0, radio.getVolume());
    }
    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }
    @Test
    public void testNextStationMaxValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void testPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }
    @Test
    public void testPrevStationMinValue() {
        Radio radio = new Radio();
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void testSetStation() {
        Radio radio = new Radio();
        radio.setStation(6);
        assertEquals(6, radio.getCurrentStation());
    }
    @Test
    public void testSetStationOutOfRange() {
        Radio radio = new Radio();
        radio.setStation(-1);
        assertEquals(0, radio.getCurrentStation());
        radio.setStation(10);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getVolume());
    }
    @Test
    public void testIncreaseVolumeMaxValue() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }
    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getVolume());
    }
    @Test
    public void testDecreaseVolumeMinValue() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
}