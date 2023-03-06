class Televisor {

    private boolean isOn;

    public Televisor(boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void showStatus() {
        if (isOn) {
            System.out.println("Telewizor jest włączony");
        } else {
            System.out.println("Telewizor jest wyłączony");
        }
    }
}
