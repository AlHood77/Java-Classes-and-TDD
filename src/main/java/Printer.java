import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Printer {
    private int paperSheets;
    private int pageCount;
    private int numberOfCopies;
    private int tonerVolume;

    public Printer(int paperSheets, int pageCount, int numberOfCopies, int tonerVolume){
        this.paperSheets = paperSheets;
        this.pageCount = pageCount;
        this.numberOfCopies = numberOfCopies;
        this.tonerVolume = tonerVolume;
    }

    public int numOfSheets(){
        return this.paperSheets;
    }

    public int pageCount(){
        return this.pageCount;
    }

    public int docCopies(){
        return this.numberOfCopies;
    }

    public int print(){
        if (this.pageCount * this.numberOfCopies <= this.paperSheets){
            return this.paperSheets - (this.pageCount * this.numberOfCopies);
        }
        return this.paperSheets;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public int reduceTonerVolume(){
        if (this.paperSheets <= this.tonerVolume){
            return this.tonerVolume - this.paperSheets;
        }
        return this.tonerVolume;
    }

}
