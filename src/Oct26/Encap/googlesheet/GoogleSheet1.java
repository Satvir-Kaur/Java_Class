package Oct26.Encap.googlesheet;

public class GoogleSheet1 {
    private String title="I am read only";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        //this.title = title;
        System.out.println("Access Denied!!!");
    }
}
