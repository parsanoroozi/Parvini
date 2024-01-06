package session19;

public enum Os {
    WINDOWS(11), LINUX(12), SOLARIS(5);

    private double version;

    private Os(double v) {this.version = v;}

    public double getVersion(){return this.version;}
}
