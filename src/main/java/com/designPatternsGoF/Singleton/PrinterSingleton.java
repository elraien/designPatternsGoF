package com.designPatternsGoF.Singleton;

public class PrinterSingleton {

    private static PrinterSingleton instance;

    public static PrinterSingleton getInstance() {
        if (instance==null) {
            instance = new PrinterSingleton();
        }
            return instance;
    }

    private PrinterSingleton() {
    }

    public void startPrinting() {
        System.out.println(this);
    }

    public void stopPrinting() {
        System.out.println("stop printing job");
    }
}
