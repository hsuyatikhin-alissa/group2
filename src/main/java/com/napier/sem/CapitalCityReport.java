package com.napier.sem;

import java.sql.*;

public class CapitalCityReport {

    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }

}
