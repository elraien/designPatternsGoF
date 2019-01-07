package com.designPatternsGoF.Facade.objects;

import com.designPatternsGoF.Facade.facade.ScannerFacade;

public class StartFacade {

    public static void main(String[] args) {
        ScannerFacade scannerFacade = new ScannerFacade();
        scannerFacade.scan();


    }
}
