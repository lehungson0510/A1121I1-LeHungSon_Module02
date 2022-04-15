package exam_module2.services;

import exam_module2.ultis.NotFoundMedicalRecordException;

public interface Service {
    public void display();

    public void addNew();

    public void delete() throws NotFoundMedicalRecordException;
}
