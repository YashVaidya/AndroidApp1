package com.example.owner.androidapp1.model;

public enum locationType {
        DROPOFF("Drop Off"),
        WAREHOUSE("Warehouse"),
        STORE("Store");

        private String type;

        locationType(String type){
            this.type = type;
        }

        public String toString() {
            return type;
    }

}
