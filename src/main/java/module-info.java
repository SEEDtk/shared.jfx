module org.theseed.shared.jfx {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires shared;
    requires commons.math3;
    requires basic;
    requires java.prefs;
    requires org.slf4j;
    opens org.theseed.shared.jfx to javafx.fxml;
    exports org.theseed.shared.jfx;
}
