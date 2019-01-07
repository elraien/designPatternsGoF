package com.designPatternsGoF.Adapter.Objects;

import com.designPatternsGoF.Adapter.PrinterAdapter.Adapter;
import java.util.ArrayList;
import java.util.List;

public class StartAdapter {

    public static void main(String[] args) {
        List newList = new ArrayList();
        newList.add("page 1");
        newList.add("page 2");
        newList.add("page 3");
        newList.add("page 4");
        newList.add("page 5");

        Adapter adapter = new Adapter();
        adapter.print(newList);
    }
}
