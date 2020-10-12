package com.kodedu.seals.products;

public sealed interface Expr permits ConstantExpr, NegExpr, PlusExpr, TimesExpr {
}
