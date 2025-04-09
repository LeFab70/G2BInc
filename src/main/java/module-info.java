module org.example.g2binc_tp2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.g2binc_tp2 to javafx.fxml;
    exports org.example.g2binc_tp2;
}