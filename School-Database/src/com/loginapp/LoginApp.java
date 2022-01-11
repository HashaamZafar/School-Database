package com.loginapp;

import com.loginapp.login.controllers.LoginController;
import com.loginapp.login.dao.LoginUserDAO;
import com.loginapp.login.dao.SQLiteLoginUserDAO;
import com.loginapp.login.models.LoginModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginApp extends Application {

    private LoginUserDAO buildLoginUserDAO() {
        return new SQLiteLoginUserDAO();
    }

    private LoginModel buildLoginModel() {
        return new LoginModel(buildLoginUserDAO());
    }

    private LoginController buildLoginController(Stage stage) {
        return new LoginController(buildLoginModel(), stage);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/com/loginapp/login/ui/loginapp.fxml"));
        fxmlLoader.setControllerFactory(t -> buildLoginController(stage));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("School Management System");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
