// src/main/java/com/example/dbschema/model/ColumnDefinition.java
package com.example.dbschema.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ColumnDefinition {
//    @NotBlank(message = "Column name is required")
//    private String name;
//
//    @NotBlank(message = "Column type is required")
//    private String type;
//
//    @Positive(message = "Size must be a positive number")
//    private Integer length;
    private String name;
    private String type;
    private Integer length;

    private boolean primaryKey;
    private boolean nullable = true;
    private boolean autoIncrement;

    // Getters e Setters (mantenha os mesmos que você já tem)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public boolean isPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public boolean isNullable() {
        return nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    public boolean isAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
    }
}