package edu.neumont.diyauto.Models;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by jjensen on 6/9/14.
 */
@Entity
@Table(name = "Make", schema = "diyauto")
public class MakeModel {
    private int idMake;
    private String make;
    private Collection<CarsModel> carsesByIdMake;

    @Id
    @Column(name = "idMake")
    public int getIdMake() {
        return idMake;
    }

    public void setIdMake(int idMake) {
        this.idMake = idMake;
    }

    @Basic
    @Column(name = "Make")
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MakeModel makeModel = (MakeModel) o;

        if (idMake != makeModel.idMake) return false;
        if (make != null ? !make.equals(makeModel.make) : makeModel.make != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMake;
        result = 31 * result + (make != null ? make.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "makeByMakeId")
    public Collection<CarsModel> getCarsesByIdMake() {
        return carsesByIdMake;
    }

    public void setCarsesByIdMake(Collection<CarsModel> carsesByIdMake) {
        this.carsesByIdMake = carsesByIdMake;
    }
}
