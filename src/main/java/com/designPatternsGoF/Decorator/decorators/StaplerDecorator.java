package com.designPatternsGoF.Decorator.decorators;

import com.designPatternsGoF.Decorator.objects.BasicPage;

public class StaplerDecorator extends Decorator {


    public StaplerDecorator(BasicPage basicPage) {
        super(basicPage);
    }

    public void afterPrint() {
        System.out.println("........printed pages have been stapled");
    }
}
