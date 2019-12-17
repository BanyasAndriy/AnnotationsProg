package Task2;


import java.io.FileNotFoundException;
import java.io.PrintWriter;


@SaveTo(path = "C:\\Users\\User\\Desktop\\file.txt")
 class TextContainer {
    private String someText;

     public  TextContainer(String someText){
         this.someText=someText;
    }

    public TextContainer(){

    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }

    public String getSomeText() {
        return someText;
    }

    @Saver
    public void save(String path){
        try (PrintWriter pw = new PrintWriter(path)) {
            pw.write(this.getSomeText());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
