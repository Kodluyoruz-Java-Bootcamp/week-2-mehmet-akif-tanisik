package week2.question2.builderpattern;

public class MobilePhone {

    private String brand;
    private String memory;

    private boolean isBluetoothEnabled;

    public String getBrand() {
        return brand;
    }

    public String getMemory() {
        return memory;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private MobilePhone(MobilePhoneBuilder builder) {
        this.brand =builder.brand;
        this.memory =builder.memory;
        this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }

    public static class MobilePhoneBuilder{
        private String brand;
        private String memory;
        private boolean isBluetoothEnabled;

        public MobilePhoneBuilder(String brand, String memory){
            this.brand = brand;
            this.memory = memory;
        }

        public MobilePhoneBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            System.out.println("Is Bluetooth enabled ? " + isBluetoothEnabled);
            return this;
        }

        public MobilePhone build(){
            return new MobilePhone(this);
        }
    }
}
