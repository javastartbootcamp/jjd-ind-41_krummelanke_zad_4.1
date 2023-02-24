class Televisor {

    private boolean isOn;

    public Televisor(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean turnOn() {
        return isOn = true;

    }

    public boolean turnOff() {
        return isOn = false;

    }

    public void showStatus() {
        if (isOn) {
            System.out.println("Telewizor jest włączony");
        } else {
            System.out.println("Telewizor jest wyłączony");
        }
    }

}
