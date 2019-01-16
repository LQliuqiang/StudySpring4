package com.lq.s1.s4;

import java.util.List;

public class Family {

    private String familyName; //家名称
    private List<String> familyPresons;//家成员

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public List<String> getFamilyPresons() {
        return familyPresons;
    }

    public void setFamilyPresons(List<String> familyPresons) {
        this.familyPresons = familyPresons;
    }

    @Override
    public String toString() {
        return "Family{" +
                "familyName='" + familyName + '\'' +
                ", familyPresons=" + familyPresons +
                '}';
    }
}
