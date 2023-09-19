package exercise.test04.example2;

public class MP3 {

    private String company;
    private int size;

    public MP3(String company, int size) {
        this.company = company;
        this.size = size;
    }

    public MP3(String company) {
        this.company = company;
        size = 2;
    }

    public MP3() {
        this.company = "아이팟";
        this.size = 2;
    }

    public String getCompany() {
        return company;
    }

    public int getSize() {
        return size;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void print(){
        System.out.printf("MP3(company=%s, size=%d)\n",
                this.company, this.size);
    }
}
