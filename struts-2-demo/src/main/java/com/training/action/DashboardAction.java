package com.training.action;

import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class DashboardAction extends ActionSupport{
     private String username;
        private List<String> menu;

        public String execute() {

            username = "ADMIN";

            menu = Arrays.asList(
                    "Dashboard",
                    "Reports",
                    "User Management",
                    "Settings"
            );

            return SUCCESS;
        }

        public String getUsername() {
            return username;
        }

        public List<String> getMenu() {
            return menu;
        }

}