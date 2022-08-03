package gui;



import javafx.application.Application;

import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;

import javafx.scene.layout.*;

import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;


public class StartWindow extends Application{
    @Override
    public void start(Stage stage) {
        stage.setTitle("Sunset Salat 3-Timer");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane,1080,340);
        stage.getIcons().add(new Image("/GUI/sunset.png"));
        stage.setScene(scene);
        stage.show();
    }

    private TextField txfSalatmix, txfIceberg,txfAgurk, txfTomat, txfPickles, txfOst, txfLøg, txfRødløg;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;


    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(20));
        BackgroundImage myBI= new BackgroundImage(new Image("/GUI/SunsetBG.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        pane.setBackground(new Background(myBI));


        btn1 = new Button("Iceberg");
        btn2 = new Button("Løg");
        btn3 = new Button("Ost");
        btn4 = new Button("Rødløg");
        btn5 = new Button("Salatmix");
        btn6 = new Button("Tomat");
        btn7 = new Button("Agurk");
        btn8 = new Button("Pickles");


        pane.add(btn1,0,1);
        pane.add(btn2,1,1);
        pane.add(btn3,2,1);
        pane.add(btn4,3,1);
        pane.add(btn5,0,3);
        pane.add(btn6,1,3);
        pane.add(btn7,2,3);
        pane.add(btn8,3,3);

        btn1.setPrefHeight(100);
        btn1.setPrefWidth(250);
        btn2.setPrefHeight(100);
        btn2.setPrefWidth(250);
        btn3.setPrefHeight(100);
        btn3.setPrefWidth(250);
        btn4.setPrefHeight(100);
        btn4.setPrefWidth(250);
        btn5.setPrefHeight(100);
        btn5.setPrefWidth(250);
        btn6.setPrefHeight(100);
        btn6.setPrefWidth(250);
        btn7.setPrefHeight(100);
        btn7.setPrefWidth(250);
        btn8.setPrefHeight(100);
        btn8.setPrefWidth(250);

        txfIceberg = new TextField("Ikke startet");
        txfIceberg.setEditable(false);
        txfLøg = new TextField("Ikke startet");
        txfLøg.setEditable(false);
        txfOst = new TextField("Ikke startet");
        txfOst.setEditable(false);
        txfRødløg = new TextField("Ikke startet");
        txfRødløg.setEditable(false);
        txfSalatmix = new TextField("Ikke startet");
        txfSalatmix.setEditable(false);
        txfTomat = new TextField("Ikke startet");
        txfTomat.setEditable(false);
        txfAgurk = new TextField("Ikke startet");
        txfAgurk.setEditable(false);
        txfPickles = new TextField("Ikke startet");
        txfPickles.setEditable(false);

        pane.add(txfIceberg,0,0);
        pane.add(txfLøg,1,0);
        pane.add(txfOst,2,0);
        pane.add(txfRødløg,3,0);
        pane.add(txfSalatmix,0,2);
        pane.add(txfTomat,1,2);
        pane.add(txfAgurk,2,2);
        pane.add(txfPickles,3,2);


        btn1.setOnAction(event -> this.icebergTid());
        btn2.setOnAction(event -> this.løgTid());
        btn3.setOnAction(event -> this.ostTid());
        btn4.setOnAction(event -> this.rødløgTid());
        btn5.setOnAction(event -> this.salatmixTid());
        btn6.setOnAction(event -> this.tomatTid());
        btn7.setOnAction(event -> this.agurkTid());
        btn8.setOnAction(event -> this.picklesTid());


        //Color
        btn1.setStyle("-fx-background-color: #FDDA0D; -fx-text-fill: #1E8449; -fx-font-size: 15; -fx-border-color: black");
        btn2.setStyle("-fx-background-color: #FDDA0D; -fx-text-fill: #1E8449; -fx-font-size: 15; -fx-border-color: black");
        btn3.setStyle("-fx-background-color: #FDDA0D; -fx-text-fill: #1E8449; -fx-font-size: 15; -fx-border-color: black");
        btn4.setStyle("-fx-background-color: #FDDA0D; -fx-text-fill: #1E8449; -fx-font-size: 15; -fx-border-color: black");
        btn5.setStyle("-fx-background-color: #FDDA0D; -fx-text-fill: #1E8449; -fx-font-size: 15; -fx-border-color: black");
        btn6.setStyle("-fx-background-color: #FDDA0D; -fx-text-fill: #1E8449; -fx-font-size: 15; -fx-border-color: black");
        btn7.setStyle("-fx-background-color: #FDDA0D; -fx-text-fill: #1E8449; -fx-font-size: 15; -fx-border-color: black");
        btn8.setStyle("-fx-background-color: #FDDA0D; -fx-text-fill: #1E8449; -fx-font-size: 15; -fx-border-color: black");

        txfIceberg.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white");
        txfLøg.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white");
        txfOst.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white");
        txfRødløg.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white");
        txfSalatmix.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white");
        txfTomat.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white");
        txfAgurk.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white");
        txfPickles.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white");
    }

    private void icebergTid(){
        btn1.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white; -fx-font-size: 15");
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int counter = 180;
            @Override
            public void run() {
                if(counter <= 15){
                    txfIceberg.setStyle("-fx-background-color: red; -fx-text-fill: white");
                    btn1.setStyle("-fx-background-color: red; -fx-text-fill: white");
                }
                if(counter > 0){
                    txfIceberg.setText(fromMinutesToHHmm(counter));
                    counter--;
                }else{
                    txfIceberg.setText("Iceberg");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(timerTask,0,60000);

    }

    private void løgTid(){
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int counter = 180;
            @Override
            public void run() {
                if(counter > 0){
                    txfLøg.setText(fromMinutesToHHmm(counter));
                    counter--;
                }else{
                    txfLøg.setText("Løg");
                }

            }
        };
        timer.scheduleAtFixedRate(timerTask,0,60000);
        btn2.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white; -fx-font-size: 15");
    }

    private void ostTid(){
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int counter = 180;
            @Override
            public void run() {
                if(counter > 0){
                    txfOst.setText(fromMinutesToHHmm(counter));
                    counter--;
                }else{
                    txfOst.setText("Ost");
                }

            }
        };
        timer.scheduleAtFixedRate(timerTask,0,60000);
        btn3.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white; -fx-font-size: 15");
    }

    private void rødløgTid(){
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int counter = 180;
            @Override
            public void run() {
                if(counter > 0){
                    txfRødløg.setText(fromMinutesToHHmm(counter));
                    counter--;
                }else{
                    txfRødløg.setText("Rødløg");
                }

            }
        };
        timer.scheduleAtFixedRate(timerTask,0,60000);
        btn4.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white; -fx-font-size: 15");
    }

    private void salatmixTid(){
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int counter = 180;
            @Override
            public void run() {
                if(counter > 0){
                    txfSalatmix.setText(fromMinutesToHHmm(counter));
                    counter--;
                }else{
                    txfSalatmix.setText("Salatmix");
                }

            }
        };
        timer.scheduleAtFixedRate(timerTask,0,60000);
        btn5.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white; -fx-font-size: 15");
    }

    private void tomatTid(){
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int counter = 180;
            @Override
            public void run() {
                if(counter > 0){
                    txfTomat.setText(fromMinutesToHHmm(counter));
                    counter--;
                }else{
                    txfTomat.setText("Tomat");

                }

            }
        };
        timer.scheduleAtFixedRate(timerTask,0,60000);
        btn6.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white; -fx-font-size: 15");
    }

    private void agurkTid(){
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

                }

            }
        };
        timer.scheduleAtFixedRate(timerTask,0,60000);
        btn7.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white; -fx-font-size: 15");
    }

    private void picklesTid(){
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int counter = 180;
            @Override
            public void run() {
                if(counter > 0){
                    txfPickles.setText(fromMinutesToHHmm(counter));
                    counter--;
                }else{
                    txfPickles.setText("Pickles");
                }

            }
        };
        timer.scheduleAtFixedRate(timerTask,0,60000);
        btn8.setStyle("-fx-background-color: #1E8449; -fx-text-fill: white; -fx-font-size: 15");
    }

    public String fromMinutesToHHmm(int minutes) {
        long hours = TimeUnit.MINUTES.toHours(minutes);
        long remainMinutes = minutes - TimeUnit.HOURS.toMinutes(hours);
        return String.format("%02d:%02d", hours, remainMinutes);
    }


}