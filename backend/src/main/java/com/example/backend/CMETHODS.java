package com.example.backend;

import java.util.Scanner;

import static com.example.backend.IText.DOPPELPUNKT;
import static com.example.backend.IText.T;

public class CMETHODS implements IConstants{
    static CMETHODS methods() {
        return new CMETHODS();
    }

    static Scanner read() {
        return new Scanner(SOURCE);
    }

    public void l(int c1) {
        OUT.println(T + (c1 + 1) + DOPPELPUNKT);
    }

    void f(String g) {
        OUT.print(g + "\n");
    }

}
