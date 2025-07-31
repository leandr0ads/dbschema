// src/main/java/com/example/dbschema/model/TableDefinition.java
package com.example.dbschema.model;

import java.util.ArrayList;
import java.util.List;

public class TableDefinition {
    private String tableName;
    private List<ColumnDefinition> columns = new ArrayList<>();

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<ColumnDefinition> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnDefinition> columns) {
        this.columns = columns;
    }

    public void addColumn(ColumnDefinition column) {
        this.columns.add(column);
    }
}