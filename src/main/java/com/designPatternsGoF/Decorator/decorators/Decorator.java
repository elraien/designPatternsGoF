package com.designPatternsGoF.Decorator.decorators;

import com.designPatternsGoF.Decorator.objects.BasicPage;

public abstract class Decorator implements BasicPage {

    protected BasicPage basicPage;

    public Decorator(BasicPage basicPage) {
        this.basicPage = basicPage;
    }

    public abstract void afterPrint();

    public void printPage() {
        basicPage.printPage();
        afterPrint();
    }
}
