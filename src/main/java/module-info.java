module org.theseed.shared.jfx {
    requires transitive javafx.controls;
    requires javafx.fxml;
	requires java.prefs;
	requires slf4j.api;
	requires shared;
	requires commons.math3;

    opens org.theseed.shared.jfx to javafx.fxml;
    exports org.theseed.shared.jfx;
}
