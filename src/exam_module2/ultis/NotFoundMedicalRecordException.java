package exam_module2.ultis;

public class NotFoundMedicalRecordException extends Exception {
    public NotFoundMedicalRecordException(){
        super();
    }

    public NotFoundMedicalRecordException(String message){
        super(message);
    }
}
