public class Education {
    private String GMU;
    private String GWU;
    private String UCMD;
    private String Harvard;
    private String Stanford;
    private String Penn;
    private String Princeton;
    private String GeorgiaTech;
    private String NYU;
    private String CMU;

    public Education() {
    }

    public String getGMU() {
        return GMU;
    }

    public void setGMU(String GMU) {
        this.GMU = GMU;
    }

    public String getGWU() {
        return GWU;
    }

    public void setGWU(String GWU) {
        this.GWU = GWU;
    }

    public String getUCMD() {
        return UCMD;
    }

    public void setUCMD(String UCMD) {
        this.UCMD = UCMD;
    }

    public String getHarvard() {
        return Harvard;
    }

    public void setHarvard(String harvard) {
        Harvard = harvard;
    }

    public String getStanford() {
        return Stanford;
    }

    public void setStanford(String stanford) {
        Stanford = stanford;
    }

    public String getPenn() {
        return Penn;
    }

    public void setPenn(String penn) {
        Penn = penn;
    }

    public String getPrinceton() {
        return Princeton;
    }

    public void setPrinceton(String princeton) {
        Princeton = princeton;
    }

    public String getGeorgiaTech() {
        return GeorgiaTech;
    }

    public void setGeorgiaTech(String georgiaTech) {
        GeorgiaTech = georgiaTech;
    }

    public String getNYU() {
        return NYU;
    }

    public void setNYU(String NYU) {
        this.NYU = NYU;
    }

    public String getCMU() {
        return CMU;
    }

    public void setCMU(String CMU) {
        this.CMU = CMU;
    }

    @Override
    public String toString() {
        return "He went to GeorgiaTech in " + GeorgiaTech;
    }
}
