package gui;

import controller.Controller;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Vare;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;


public class StartWindow extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("3-Timers");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private TextField txfSalatmix, txfIceberg,txfAgurk, txfTomat, txfPickles, txfOst, txfLøg, txfRødløg;


    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(20));

        VBox vBox1 = new VBox();
        VBox vBox2 = new VBox();

        txfAgurk = new TextField("Agurk");
        Button button = new Button("Start Timer");
        button.setOnAction(event -> this.timer());

        pane.add(txfAgurk,0,0);
        pane.add(button,0,1);

//        vBox1.getChildren().add(txfAgurk);
//        txfIceberg.setText("Iceberg");
//        vBox1.getChildren().add(txfIceberg);
//        txfLøg.setText("Løg");
//        vBox1.getChildren().add(txfLøg);
//        txfOst.setText("Ost");
//        vBox1.getChildren().add(txfOst);
//        txfPickles.setText("Pickles");
//        vBox2.getChildren().add(txfPickles);
//        txfRødløg.setText("Rødløg");
//        vBox2.getChildren().add(txfRødløg);
//        txfSalatmix.setText("Salatmix");
//        vBox2.getChildren().add(txfSalatmix);
//        txfTomat.setText("Tomat");
//        vBox2.getChildren().add(txfTomat);

        pane.add(vBox1,1,1);
        pane.add(vBox2,2,1);
    }

    private void timer() {

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int counter = 180;
            @Override
            public void run() {
                if(counter > 0){
                    txfAgurk.setText(fromMinutesToHHmm(counter));
                    counter--;
                }else{
                    txfAgurk.setText("Agurk");
                    timer.cancel();
                }

            }
        };
        timer.scheduleAtFixedRate(timerTask,0,60000);
    }

    public String fromMinutesToHHmm(int minutes) {
        long hours = TimeUnit.MINUTES.toHours(Long.valueOf(minutes));
        long remainMinutes = minutes - TimeUnit.HOURS.toMinutes(hours);
        return String.format("%02d:%02d", hours, remainMinutes);
    }


}