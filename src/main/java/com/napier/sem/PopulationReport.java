package com.napier.sem;

import java.sql.*;

public class PopulationReport {

    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }

}
