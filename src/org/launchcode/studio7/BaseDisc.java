package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private String type;
    private int capacityUsed;

    public BaseDisc(String name, int storageCapacity, String type, int capacityUsed) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.type = type;
        this.capacityUsed = capacityUsed;
    }

    public String playMedia(String file) {
        return "Now Playing: " + file;
    }

    public String pauseMedia(String file) {
        return "Paused: " + file;
    }

    public String resumeMedia(String file) {
        return "Resumed: " + file;
    }

    public double getStorageCapacity() { return storageCapacity; }

    public void setStorageCapacity(int storageCapacity) {this.storageCapacity = storageCapacity; }

    public String getName() {  return name;  }

    public void setName(String name) {  this.name = name; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public int getCapacityUsed() { return capacityUsed; }

    public void setCapacityUsed(int capacityUsed) { this.capacityUsed = capacityUsed; }
}
