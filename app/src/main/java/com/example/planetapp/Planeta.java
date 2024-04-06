package com.example.planetapp;

public class Planeta {
    private String nomePlaneta;
    private String qtdLuasPlaneta;
    private int imgPlaneta;

    public Planeta(String nomePlaneta, String qtdLuasPlaneta, int imgPlaneta) {
        this.nomePlaneta = nomePlaneta;
        this.qtdLuasPlaneta = qtdLuasPlaneta;
        this.imgPlaneta = imgPlaneta;
    }

    public String getNomePlaneta() {
        return nomePlaneta;
    }

    public void setNomePlaneta(String nomePlaneta) {
        this.nomePlaneta = nomePlaneta;
    }

    public String getQtdLuasPlaneta() {
        return qtdLuasPlaneta;
    }

    public void setQtdLuasPlaneta(String qtdLuasPlaneta) {
        this.qtdLuasPlaneta = qtdLuasPlaneta;
    }

    public int getImgPlaneta() {
        return imgPlaneta;
    }

    public void setImgPlaneta(int imgPlaneta) {
        this.imgPlaneta = imgPlaneta;
    }
}
