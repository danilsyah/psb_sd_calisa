
package com.controller;
import com.entity.User;
import java.sql.SQLException;

public interface C_user {
    public boolean cekLogin(User u)throws SQLException;
}
