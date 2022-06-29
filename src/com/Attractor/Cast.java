package com.Attractor;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



    public class Cast {

        @SerializedName("fullName")
        @Expose
        private String fullName;
        @SerializedName("role")
        @Expose
        private String role;

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

    }

