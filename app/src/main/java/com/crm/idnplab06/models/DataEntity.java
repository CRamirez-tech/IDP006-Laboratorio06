package com.crm.idnplab06.models;
public class DataEntity {
    private String category;
    private float value;

    public DataEntity(String category, float value){
        this.category = category;
        this.value = value;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
