package com.designPatternsGoF.Adapter.PrinterAdapter;

import com.designPatternsGoF.Adapter.Objects.Printer;

import java.util.List;

public class Adapter implements ListPrinter{

    private Printer printer = new Printer();

    public void print(List<String> newList) {
        for (String page : newList) {
            printer.print(page);
        }
    }
}
