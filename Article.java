public class Article {
    private int code;
    private double prixOrigine;

    public Article(int code, double prixOrigine) {
        this.code = code;
        this.prixOrigine = prixOrigine;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrixOrigine() {
        return prixOrigine;
    }

    public void setPrixOrigine(double prixOrigine) {
        this.prixOrigine = prixOrigine;
    }

    public String toString() {
        return code + ";" + prixOrigine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Article) {
            Article other = (Article) obj;
            return this.code == other.code;
        }
        return false;
    }

    public double prixArticle() {
        return prixOrigine;
    }
}