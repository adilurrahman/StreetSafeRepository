package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * Created by Adil ur Rahman on 06-Jun-17.
 */
public class MainFrameController {

    public AnchorPane mainFrameAnchorPane;
    public AnchorPane notificationPane;
    public AnchorPane mapPane;

    public Label headingLbl;
    public Label usernameLbl;
    public Label passwordLbl;
    public Label createLbl;
    public Label notificationsLbl;

    public TextField usernameTF;
    public PasswordField passwordPF;

    public Button loginBtn;
    public Button createBtn;

    public void login (){

        String username;
        String passworrd;

        username = usernameTF.getText();
        passworrd = passwordPF.getText();

        if (username.equals("mash") && passworrd.equals("123")){

            headingLbl.setText("LOGIN WAS SUCCESSFUL");
        }

    }
}
