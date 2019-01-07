package com.designPatternsGoF.Decorator.decorators;

import com.designPatternsGoF.Decorator.objects.BasicPage;

public class LaminatorDecorator extends Decorator {
    public LaminatorDecorator(BasicPage basicPage) {
        super(basicPage);
    }

    public void afterPrint() {
        System.out.println("........printed pages have been laminated");
    }
}
