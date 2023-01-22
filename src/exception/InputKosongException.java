
package exception;

public class InputKosongException extends Exception{
    public String message(){
        return "Inputan User Tidak Boleh Kosong atau Negatif";
    }
}
