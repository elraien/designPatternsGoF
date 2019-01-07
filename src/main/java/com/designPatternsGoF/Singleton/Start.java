package com.designPatternsGoF.Singleton;

public class Start {
    public static void main(String[] args) {
        PrinterSingleton.getInstance().startPrinting();
        PrinterSingleton.getInstance().stopPrinting();
    }
}
