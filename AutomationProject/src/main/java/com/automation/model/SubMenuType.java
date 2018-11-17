package com.automation.model;

public enum SubMenuType {
    STASHBOARD("Stashboard"),
    STASHBOARD_SUMMARY("Stahboard Summary");

    String subMenuItem;

    SubMenuType(String subMenuItem) {
        this.subMenuItem = subMenuItem;
    }

    @Override
    public String toString() {
        return this.subMenuItem;
    }
}
