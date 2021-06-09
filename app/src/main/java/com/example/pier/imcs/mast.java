package com.example.pier.imcs;

import android.app.Application;
import android.content.res.Resources;

import android.content.Context;

import static android.provider.Settings.Global.getString;

/**
 * Created by pier on 06/01/17.
 */
public class mast {
    private static mast ourInstance = new mast();

    public static mast getInstance() {
        if (ourInstance == null)
            ourInstance = new mast();
        return ourInstance;
    }

    private mast() {
    }

    // ==========================================================
    private double L, Lref, db, d1, d2, d3, dt, fb, f01, f02, f03, ft, f11, f12, f13, a, b, c, d, imcs, flex;

    private String identificativo, marca, note, curva;

    //-------------------------------------
    //-------------------------------------
    public String getcurva() {
        return curva;
    }

    public void setcurva(String strValue) {
        this.curva = strValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double geta() {
        return a;
    }

    public void seta(double doubleValue) {
        this.a = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getb() {
        return b;
    }

    public void setb(double doubleValue) {
        this.b = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getc() {
        return c;
    }

    public void setc(double doubleValue) {
        this.c = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getd() {
        return d;
    }

    public void setd(double doubleValue) {
        this.d = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getimcs() {
        return imcs;
    }

    public void setimcs(double doubleValue) {
        this.imcs = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getflex() {
        return flex;
    }

    public void setflex(double doubleValue) {
        this.flex = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getf13() {
        return f13;
    }

    public void setf13(double doubleValue) {
        this.f13 = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getf12() {
        return f12;
    }

    public void setf12(double doubleValue) {
        this.f12 = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getf11() {
        return f11;
    }

    public void setf11(double doubleValue) {
        this.f11 = doubleValue;
    }
    //-------------------------------------

    //-------------------------------------
    public double getft() {
        return ft;
    }

    public void setft(double doubleValue) {
        this.ft = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getf03() {
        return f03;
    }

    public void setf03(double doubleValue) {
        this.f03 = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getf02() {
        return f02;
    }

    public void setf02(double doubleValue) {
        this.f02 = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getf01() {
        return f01;
    }

    public void setf01(double doubleValue) {
        this.f01 = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getfb() {
        return fb;
    }

    public void setfb(double doubleValue) {
        this.fb = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public String getnote() {
        return note;
    }

    public void setnote(String strValue) {
        this.note = strValue;
    }
    //-------------------------------------

    //-------------------------------------
    public String getmarca() {
        return marca;
    }

    public void setmarca(String strValue) {
        this.marca = strValue;
    }
    //-------------------------------------

    //-------------------------------------
    public String getident() {
        return identificativo;
    }

    public void setident(String strValue) {
        this.identificativo = strValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getLref() {
        return Lref;
    }

    public void setLref(double doubleValue) {
        this.Lref = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getL() {
        return L;
    }

    public void setL(double doubleValue) {
        this.L = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getdb() {
        return db;
    }

    public void setdb(double doubleValue) {
        this.db = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getd1() {
        return d1;
    }

    public void setd1(double doubleValue) {
        this.d1 = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getd2() {
        return d2;
    }

    public void setd2(double doubleValue) {
        this.d2 = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getd3() {
        return d3;
    }

    public void setd3(double doubleValue) {
        this.d3 = doubleValue;
    }

    //-------------------------------------
    //-------------------------------------
    public double getdt() {
        return dt;
    }

    public void setdt(double doubleValue) {
        this.dt = doubleValue;
    }

    //-------------------------------------
    //
    // --------------------------- AZZERA TUTTO --------------------
    public void azzera() {
        //L=db=d1=d2=d3=dt=fb=f01=f02=f03=ft=f11=f12=f13=imcs=flex=a=b=c=d=0;
        //identificativo = "";
        //marca = "";
        //note = "";
        //curva = "";
        L = 5200;
        Lref = 4600;
        db = 54;
        d1 = 49.5;
        d2 = 45;
        d3 = 36.5;
        dt = 28.5;
        fb = 789;
        f01 = 775.0;
        f02 = 768.0;
        f03 = 762.0;
        ft = 764.0;
        f11 = 649.0;
        f12 = 580.0;
        f13 = 617.0;
        imcs = 0.0;
        flex = 0.0;
        a = b = c = d = 0.0;
        identificativo = "Prova-Umbertone";
        marca = "Gastra-Amex";
        note = "Esempio dati precaricati: Albero Umbertone (Fossacesia Beach) 520 Bottom Gastra Top Amex";
        curva = "";
    }

    //
    // --------------------------- CALCOLA --------------------------
    public void calcola() {
        double hb = this.fb - (this.db / 2);
        double h01 = this.f01 - (this.d1 / 2);

        double h02 = this.f02 - (this.d2 / 2);
        double h03 = this.f03 - (this.d3 / 2);
        double ht = this.ft - (this.dt / 2);

        double h11 = this.f11 - (this.d1 / 2);
        double h12 = this.f12 - (this.d2 / 2);
        double h13 = this.f13 - (this.d3 / 2);

        double f1 = (h01 - h11); // freccia in 1 in mm
        double f2 = (h02 - h12); // freccia in 2 in mm
        double f3 = (h03 - h13); // freccia in 3 in mm

        this.imcs = (Math.pow(this.L, 3) / Math.pow(Lref, 2) / f2);
        this.flex = (f3 - f1) / f2 * 100;

        //
        // coefficienti della polinomiale
        //

        this.a = -128.0 / 3.0 / Math.pow(this.L, 4) * f1 + 64.0 / Math.pow(this.L, 4) * f2 - 128.0 / 3.0 / Math.pow(this.L, 4) * f3;
        this.b = 96.0 / Math.pow(this.L, 3) * f1 - 128.0 / Math.pow(this.L, 3) * f2 + 224.0 / 3.0 / Math.pow(this.L, 3) * f3;
        this.c = -208.0 / 3.0 / Math.pow(this.L, 2) * f1 + 76.0 / Math.pow(this.L, 2) * f2 - 112.0 / 3.0 / Math.pow(this.L, 2) * f3;
        this.d = 16.0 / this.L * f1 - 12.0 / this.L * f2 + 16.0 / 3.0 / this.L * f3;

        //
        // determinazione tipo curva
        //

        if (this.flex <= 6)
            this.curva = "Hard Top";
        else if (this.flex <= 9)
            this.curva = "Hard Top - Constant Curve";
        else if (this.flex <= 12)
            this.curva = "Constant Curve";
        else if (this.flex <= 15)
            this.curva = "Constant Curve - Flex Top";
        else if (this.flex <= 18)
            this.curva = "Flex Top";
        else if (this.flex <= 21)
            this.curva = "Flex Top - Super Flex Top";
        else
            this.curva = "Super Flex Top";
    }

}






