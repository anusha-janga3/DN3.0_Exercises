// src/com/example/product/Computer.java
package com.example.product;

public class Computer {
    // Attributes
    private String CPU;
    private String RAM;
    private String storage;
    private boolean hasGraphicsCard;
    private boolean hasBluetooth;
    private boolean hasWiFi;

    // Private constructor to be called by the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasWiFi = builder.hasWiFi;
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean hasGraphicsCard;
        private boolean hasBluetooth;
        private boolean hasWiFi;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Builder setWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage +
                ", hasGraphicsCard=" + hasGraphicsCard + ", hasBluetooth=" + hasBluetooth +
                ", hasWiFi=" + hasWiFi + "]";
    }
}
