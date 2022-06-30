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

        public Cast(String fullName, String role) {
            super();
            this.fullName = fullName;
            this.role = role;
        }


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

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Cast.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("fullName");
            sb.append('=');
            sb.append(((this.fullName == null)?"<null>":this.fullName));
            sb.append(',');
            sb.append("role");
            sb.append('=');
            sb.append(((this.role == null)?"<null>":this.role));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

    }

