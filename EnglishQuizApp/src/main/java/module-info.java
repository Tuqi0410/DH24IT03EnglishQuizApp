module com.tptq.englishquizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tptq.englishquizapp to javafx.fxml;
    exports com.tptq.englishquizapp;
}
