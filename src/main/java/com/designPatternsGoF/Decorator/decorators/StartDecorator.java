package com.designPatternsGoF.Decorator.decorators;

import com.designPatternsGoF.Decorator.objects.BasicPage;
import com.designPatternsGoF.Decorator.objects.BothSideView;
import com.designPatternsGoF.Decorator.objects.OneSideView;

public class StartDecorator {
    public static void main(String[] args) {
        BasicPage bothSideLaminated = new LaminatorDecorator(new BothSideView());
        bothSideLaminated.printPage();

        BasicPage oneSideStapled = new StaplerDecorator(new LaminatorDecorator(new OneSideView()));
        oneSideStapled.printPage();
    }
}
