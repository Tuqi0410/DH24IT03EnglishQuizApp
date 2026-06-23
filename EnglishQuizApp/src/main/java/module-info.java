module com.tptq.englishquizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    opens com.tptq.englishquizapp to javafx.fxml;
    exports com.tptq.englishquizapp;
}
