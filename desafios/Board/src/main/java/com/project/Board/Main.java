package com.project.Board;

import com.project.Board.persistence.migration.MigrationStrategy;
import com.project.Board.ui.MainMenu;

import java.sql.SQLException;

import static com.project.Board.persistence.config.ConnectionConfig.getConnection;

public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}