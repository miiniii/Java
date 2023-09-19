package exercise.test04.example3;

public class Printer {

    private String modelname;
    private String manufacturer;
    private String inferface;
    protected int pages;
    protected int extrapages;

    public Printer(String modelname, String manufacturer, String inferface, int pages, int extrapages) {
        this.modelname = modelname;
        this.manufacturer = manufacturer;
        this.inferface = inferface;
        this.pages = pages;
        this.extrapages = extrapages;
    }

    public void print(int pages){

        if (pages > extrapages){
            System.out.println("인쇄 용지가 부족하여 인쇄를 못합니다.");
        } else{
            System.out.println(pages+"장을 인쇄합니다.");
            extrapages -= pages;
            System.out.println("남은 인쇄용지는 " + extrapages + "장 입니다.");
        }

    }

}
