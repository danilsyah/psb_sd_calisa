/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;
import  com.entity.Setting;
import java.sql.SQLException;
/**
 *
 * @author danil
 */
public interface C_Setting {
    public void insertTahunAjaran(Setting s)throws SQLException;
    public void updateDirGambar(Setting s) throws SQLException;
    public void selectDirGambar(Setting s)throws SQLException;
}
