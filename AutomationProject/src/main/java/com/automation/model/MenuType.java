package com.automation.model;

public enum MenuType {
    FILE_DATA_EXTRACTION("FILE DATA EXTRACTION"),
    DATA_UPLOAD("DATA UPLOAD");

    String menuText;

    MenuType(String menuText) {
        this.menuText = menuText;
    }

    @Override
    public String toString() {
        return this.menuText;
    }
}
