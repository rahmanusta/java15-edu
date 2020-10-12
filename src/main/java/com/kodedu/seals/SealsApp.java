package com.kodedu.seals;

import com.kodedu.seals.products.*;

public class SealsApp {

    public static void main(String[] args) {

        // y = x * 2 - 1

        var x = 3;
        int y = calculateY(
                new PlusExpr(
                        new TimesExpr(
                                new ConstantExpr(x),
                                new ConstantExpr(2)
                        ),
                        new NegExpr(new ConstantExpr(1))
                )
        );
        System.out.println("Value of y: " + y);

    }

    private static int calculateY(Expr expr) {
        if (expr instanceof ConstantExpr c) {
            return c.value();
        } else if (expr instanceof PlusExpr p) {
            return calculateY(p.first()) + calculateY(p.second());
        } else if (expr instanceof TimesExpr t) {
            return calculateY(t.first()) * calculateY(t.second());
        } else if (expr instanceof NegExpr n) {
            return -calculateY(n.expr());
        } else {
            throw new RuntimeException("There is no such case " + expr);
        }
    }
}
