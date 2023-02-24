class Test {
    public static void main(String[] args) {
        Televisor televisor = new Televisor(false);
        televisor.showStatus();
        televisor.turnOn();
        televisor.showStatus();
        televisor.turnOff();
        televisor.showStatus();
    }
}

