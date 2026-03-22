class SmartLight {

    private String id;
    private String name;
    private int brightness;

    public SmartLight(String id, String name, int brightness) {
        this.id = id;
        this.name = name;
        this.brightness = brightness;
    }

    public SmartLight(String id, String name) {
        this(id, name, 50);
    }

    public void setBrightness(int b) {
        this.brightness = b;
    }

    public void setBrightness(String preset) {

        if (preset.equals("MAX")) this.setBrightness(100);
        if (preset.equals("MIN")) this.setBrightness(10);
        if (preset.equals("ECO")) this.setBrightness(30);
    }

    public void connectToHub(CentralHub hub) {
        hub.registerDevice(this);
    }

    public String getName() {
        return name;
    }

    public int getBrightness() {
        return brightness;
    }
}

class CentralHub {

    public void registerDevice(SmartLight light) {
        System.out.println("[HUB] Dang ket noi voi thiet bi: " + light.getName());
    }
}

class Bai210 {

    public static void main(String[] args) {

        CentralHub hub = new CentralHub();

        SmartLight l1 = new SmartLight("L01", "Den phong khach", 80);
        SmartLight l2 = new SmartLight("L02", "Den ngu");

        l2.setBrightness("ECO");

        l1.connectToHub(hub);
        l2.connectToHub(hub);

        System.out.println(l1.getBrightness());
        System.out.println(l2.getBrightness());
    }
}
