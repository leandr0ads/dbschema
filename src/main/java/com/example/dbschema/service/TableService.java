// src/main/java/com/example/dbschema/service/TableService.java
package com.example.dbschema.service;

import com.example.dbschema.model.ColumnDefinition;
import com.example.dbschema.model.TableDefinition;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class TableService {

    private final JdbcTemplate jdbcTemplate;

    public TableService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createTable(TableDefinition tableDefinition) {
        StringBuilder sql = new StringBuilder("CREATE TABLE ")
                .append(tableDefinition.getTableName())
                .append(" (\n");

        for (int i = 0; i < tableDefinition.getColumns().size(); i++) {
            ColumnDefinition column = tableDefinition.getColumns().get(i);
            sql.append("    ").append(column.getName()).append(" ").append(column.getType());

            if ("VARCHAR".equalsIgnoreCase(column.getType()) && column.getLength() != null) {
                sql.append("(").append(column.getLength()).append(")");
            }

            if (column.isPrimaryKey()) {
                sql.append(" PRIMARY KEY");
            }

            if (column.isAutoIncrement()) {
                sql.append(" AUTO_INCREMENT");
            }

            if (!column.isNullable()) {
                sql.append(" NOT NULL");
            }

            if (i < tableDefinition.getColumns().size() - 1) {
                sql.append(",\n");
            }
        }

        sql.append("\n);");

        jdbcTemplate.execute(sql.toString());
    }
}