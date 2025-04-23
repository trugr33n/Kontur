module com.monolatte.kontur {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.monolatte.kontur to javafx.fxml;
    exports com.monolatte.kontur;
}