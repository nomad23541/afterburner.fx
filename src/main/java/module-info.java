import com.airhacks.afterburner.injection.PresenterFactory;

module afterburner.fx {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires transitive jakarta.inject;
    requires transitive jakarta.annotation;
    
    uses PresenterFactory;

    exports com.airhacks.afterburner.injection;
    exports com.airhacks.afterburner.configuration;
    exports com.airhacks.afterburner.views;
}