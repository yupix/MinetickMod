package net.minecraft.server;

import java.util.concurrent.Callable;

final class CrashReportGenLayer1 implements Callable {

    final int a;

    CrashReportGenLayer1(int i) {
        this.a = i;
    }

    public String a() {
        //return String.valueOf(BiomeBase.getBiome(this.a));
        return String.valueOf(this.a); // Poweruser
    }

    public Object call() {
        return this.a();
    }
}