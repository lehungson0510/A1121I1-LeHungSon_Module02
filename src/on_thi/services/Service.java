package on_thi.services;

import on_thi.utils.NotFoundProductException;

public interface Service {

    public void addNew();

    public void delete() throws NotFoundProductException;

    public void display();

    public void search();
}
