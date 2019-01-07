package com.designPatternsGoF.Facade.facade;

import com.designPatternsGoF.Facade.scannerTasks.ChooseSavingFormat;
import com.designPatternsGoF.Facade.scannerTasks.SaveScannedFile;
import com.designPatternsGoF.Facade.scannerTasks.StartScanning;

public class ScannerFacade {
    private StartScanning startScanning = new StartScanning();
    private ChooseSavingFormat chooseSavingFormat = new ChooseSavingFormat();
    private SaveScannedFile saveScannedFile = new SaveScannedFile();

    public void scan() {
        startScanning.start();
        chooseSavingFormat.chooseFormat();
        saveScannedFile.saveFile();
    }
}
