package com.company;

public class Main {

    private static Application configureApplication(String input) {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }
    private static Application configureApplication2(String input) {
        Application app;
        GUIFactory factory;

        if (input.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication("os");
        app.paint();
        Application app2 = configureApplication2("mac.os");
        app2.paint();
    }
}
