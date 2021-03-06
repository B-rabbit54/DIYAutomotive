package edu.neumont.diyauto.Models;

import javax.persistence.*;

/**
 * Created by jjensen on 6/9/14.
 */
@Entity
@Table(name = "Cars", schema = "diyauto")
public class CarsModel {
    private int idCars;
    private int makeId;
    private int modelId;
    private int subModelId;
    private int year;
    private int userId;
    private MakeModel makeByMakeId;
    private ModelModel modelByModelId;
    private SubModelModel subModelBySubModelId;
    private AccountModel accountByUserId;

    @Id
    @Column(name = "idCars")
    public int getIdCars() {
        return idCars;
    }

    public void setIdCars(int idCars) {
        this.idCars = idCars;
    }

    @Basic
    @Column(name = "MakeID")
    public int getMakeId() {
        return makeId;
    }

    public void setMakeId(int makeId) {
        this.makeId = makeId;
    }

    @Basic
    @Column(name = "ModelID")
    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    @Basic
    @Column(name = "SubModelID")
    public int getSubModelId() {
        return subModelId;
    }

    public void setSubModelId(int subModelId) {
        this.subModelId = subModelId;
    }

    @Basic
    @Column(name = "Year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Basic
    @Column(name = "UserID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarsModel carsModel = (CarsModel) o;

        if (idCars != carsModel.idCars) return false;
        if (makeId != carsModel.makeId) return false;
        if (modelId != carsModel.modelId) return false;
        if (subModelId != carsModel.subModelId) return false;
        if (userId != carsModel.userId) return false;
        if (year != carsModel.year) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCars;
        result = 31 * result + makeId;
        result = 31 * result + modelId;
        result = 31 * result + subModelId;
        result = 31 * result + year;
        result = 31 * result + userId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "MakeID", referencedColumnName = "idMake", nullable = false, insertable = false, updatable = false)
    public MakeModel getMakeByMakeId() {
        return makeByMakeId;
    }

    public void setMakeByMakeId(MakeModel makeByMakeId) {
        this.makeByMakeId = makeByMakeId;
    }

    @ManyToOne
    @JoinColumn(name = "ModelID", referencedColumnName = "idModel", nullable = false, insertable = false, updatable = false)
    public ModelModel getModelByModelId() {
        return modelByModelId;
    }

    public void setModelByModelId(ModelModel modelByModelId) {
        this.modelByModelId = modelByModelId;
    }

    @ManyToOne
    @JoinColumn(name = "SubModelID", referencedColumnName = "idSubModel", nullable = false, insertable = false, updatable = false)
    public SubModelModel getSubModelBySubModelId() {
        return subModelBySubModelId;
    }

    public void setSubModelBySubModelId(SubModelModel subModelBySubModelId) {
        this.subModelBySubModelId = subModelBySubModelId;
    }

    @ManyToOne
    @JoinColumn(name = "UserID", referencedColumnName = "idUser", nullable = false, insertable = false, updatable = false)
    public AccountModel getAccountByUserId() {
        return accountByUserId;
    }

    public void setAccountByUserId(AccountModel accountByUserId) {
        this.accountByUserId = accountByUserId;
    }
}
