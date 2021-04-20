package com.trian.test_app.data.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "tb_question")
public class QuestionEntity {
    @PrimaryKey
    private int id;
    @ColumnInfo(name = "nidn")
    private int nidn;
    @ColumnInfo(name = "email")
    private String email;
    @ColumnInfo(name = "alamat_instansi")
    private String alamat_instansi;
    @ColumnInfo(name = "no_hp")
    private String nohp;

    @Ignore
    public QuestionEntity() {
    }

    public QuestionEntity(int nidn, String email, String alamat_instansi, String nohp) {
        this.nidn = nidn;
        this.email = email;
        this.alamat_instansi = alamat_instansi;
        this.nohp = nohp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat_instansi() {
        return alamat_instansi;
    }

    public void setAlamat_instansi(String alamat_instansi) {
        this.alamat_instansi = alamat_instansi;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
