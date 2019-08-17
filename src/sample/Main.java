package sample;

import java.io.FileInputStream;
import java.util.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application/* implements EventHandler<ActionEvent>*/ {
    int numPlayers;
    List<Card> playersCards = new ArrayList<>();
    TextField text;

    Button btn, btn2, btn3, x, y, image;
    Button card1, card2, card3, card4, card5, card6;
    Stage myStage;
    Scene scene, scene2, scene3;
    HashMap<String, Scene> sceneMap;
    public String getCardName(Card temp)
    {
        String store = "";
        if(temp.getValue()<11)
        {
           store = Integer.toString(temp.getValue());
        }
        else if(temp.getValue()==13)
            {
                store = "K";
            }
            else if(temp.getValue()==12)
            {
                store = "Q";
            }
            else if(temp.getValue()==11)
            {
                store = "J";
            }
            else
            {
                store= "IDKK";
            }
          //  store=String.valueOf(temp.getValueString().charAt(0));
        if(temp.getSuit()=="Heart")
        {

            return store + "H.jpg";
        }
        if(temp.getSuit()=="Spade")
        {
            return store+"S.jpg";
        }
        if(temp.getSuit()=="Club")
        {
            return store+"C.jpg";
        }
        if(temp.getSuit()=="Diamond")
        {
            return store+"D.jpg";
        }
        return "SHit didnt work!!";
    }


    public static void main(String[] args) {

        launch(args);
    }


    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Pitch!");
        btn = new Button();
        btn.setText("Two player");
        btn2 = new Button();
        btn2.setText("Three player");
        btn3 = new Button("Four player");
        x = new Button("Play");
        y = new Button("Exit");
        myStage = primaryStage;

        x.setOnAction(e->
                {
                    myStage.setScene(scene2);
                    System.out.println("Switching scenes");

                }
                );
        y.setOnAction(e->
                {
                    System.out.println("Exiting programmer");
                    //exit(0);
                }
                );

        btn.setOnAction(e -> {
                numPlayers = 2;

                System.out.println("two player selected");
                myStage.setScene(scene3);
                }
                );
        btn2.setOnAction(e->
        {
            numPlayers =3;
            System.out.println("three player selected");
            myStage.setScene(scene/*sceneMap.get("TwoPlayer")*/);
        });
        btn3.setOnAction(e->{
            numPlayers =4;
            System.out.println("four players selected");
            myStage.setScene(scene);
        });



        //Layout 1
        VBox layout = new VBox(60);
        layout.getChildren().add(x);
        layout.getChildren().add(y);
        scene = new Scene(layout, 400, 400);


        //layout 2
        VBox layout2 = new VBox();
        layout2.getChildren().add(btn);
        layout2.getChildren().add(btn2);
        layout2.getChildren().add(btn3);
        scene2 = new Scene(layout2, 400,400);

     //------------------------------------------------------------------------------------
        //layout 3
        //Image imageView = new ImageView(new FileInputStream(cardsDown.jpg))
         Image pic = new Image("cardsDown.jpg");
        ImageView v = new ImageView(pic);
        v.setFitHeight(200);
        v.setFitWidth(100);
        v.setPreserveRatio(true);
        Pitch game = new Pitch(numPlayers);
        game.playerCards();
        image=new Button();
        image.setGraphic(v);
        BorderPane borderPaneTop = new BorderPane();

        //borderPane.setPadding(new Insets());
        //borderPane.setTop(image);
        borderPaneTop.setAlignment(image, Pos.CENTER);
        borderPaneTop.setCenter(image);

        playersCards = game.playerCards();
        Image pic2 = new Image(getCardName(playersCards.get(0)));
        ImageView A = new ImageView(pic2);
        A.setFitHeight(100);
        A.setFitWidth(50);
        A.setPreserveRatio(true);
        card1 = new Button();
        card1.setGraphic(A);


        BorderPane borderPaneBottom = new BorderPane();
        HBox one = new HBox(0);
        one.getChildren().add(card1);

        
        Image pic3 = new Image(getCardName(playersCards.get(1)));
        ImageView B = new ImageView(pic3);
        B.setFitHeight(100);
        B.setFitWidth(50);
        B.setPreserveRatio(true);
        card2 = new Button();
        card2.setGraphic(B);


        Image pic4 = new Image(getCardName(playersCards.get(2)));
        ImageView C = new ImageView(pic4);
        C.setFitHeight(100);
        C.setFitWidth(50);
        C.setPreserveRatio(true);
        card3 = new Button();
        card3.setGraphic(C);
            
        Image pic5 = new Image(getCardName(playersCards.get(3)));
        ImageView D = new ImageView(pic5);
        D.setFitHeight(100);
        D.setFitWidth(50);
        D.setPreserveRatio(true);
        card4 = new Button();                                            // BorderPane borderPaneBottom = new BorderPane();
        card4.setGraphic(D);


        Image pic6 = new Image(getCardName(playersCards.get(4)));
        ImageView E = new ImageView(pic6);
        E.setFitHeight(100);
        E.setFitWidth(50);
        E.setPreserveRatio(true);
        card5 = new Button();
        card5.setGraphic(E);


        Image pic7 = new Image(getCardName(playersCards.get(5)));
        ImageView F = new ImageView(pic7);
        F.setFitHeight(100);
        F.setFitWidth(50);
        F.setPreserveRatio(true);
        card6 = new Button();
        card6.setGraphic(F);




        //VBox one = new VBox(60);
        one.getChildren().add(card2);
        one.getChildren().add(card3);
        one.getChildren().add(card4);
        one.getChildren().add(card5);
        one.getChildren().add(card6);


          // one.getChildren().add(card2);


        BorderPane root = new BorderPane();
        root.setPrefSize(400, 400);
        root.setTop(borderPaneTop);
        root.setBottom(one);
        scene3 = new Scene(root);





        //HBox hbox = new HBox();
        //hbox.setSpacing(10);
        
       // scene3 = new Scene();

        //scene3 = new Scene(layout3, 400,400);

        //layout 4
        //BorderPane pane = new BorderPane();


        //sceneMap.put("TwoPlayer", scene3);
       // sceneMap.put("ThreePlayer", scene4);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

/*
    public void handle(ActionEvent event)
    {
        if(event.getSource()==btn)
        {
            System.out.println("Number of players are 1");
            numPlayers = 1;
        }
        else if(event.getSource()==btn2)
        {
            System.out.println("Number of players are 2");
            numPlayers =2;

        }
        else if(event.getSource()==btn3 )
        {
            System.out.println("Number of players is 3");
            numPlayers =3;
        }
        System.out.println("THis is the total " + numPlayers);
    }
}*/
        /*myStage = primaryStage;
        text = new TextField();
        btn = new Button();
        btn2 = new Button("1");
        btn3 = new Button("2");
        sceneMap = new HashMap<String, Scene>();

        x = new Button("one");
        y = new Button("two");
        z = new Button("three");

        EventHandler<ActionEvent> returnButton = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){

                Button b = (Button)event.getSource();
                b.setDisable(true);
                myStage.setScene(sceneMap.get("welcome"));

            }
        };

        x.setOnAction(returnButton);
        y.setOnAction(returnButton);
        z.setOnAction(returnButton);

        btn2.setOnAction(new EventHandler<ActionEvent>(){

            public void handle(ActionEvent event){
                myStage.setScene(sceneMap.get("gamePlay"));
            }
        });


        btn.setOnAction(new EventHandler<ActionEvent>(){

            public void handle(ActionEvent event){
                System.out.println(text.getText());
                text.clear();
            }
        });

        //replace param with name of your own picture.Make sure
        //its in the src folder
        Image pic = new Image("Sketch.png");
        ImageView v = new ImageView(pic);
        v.setFitHeight(200);
        v.setFitWidth(100);
        v.setPreserveRatio(true);

        btn.setGraphic(v);
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(70));

        VBox paneCenter = new VBox(10, text, btn);
        VBox paneCenter2 = new VBox(40, text, btn2);
        HBox newScene = new HBox(10, x,y,z);

        pane.setCenter(paneCenter);

        pane.setLeft(btn2);

        scene = new Scene(pane, 400, 500);
        scene2 = new Scene(newScene, 400, 500);

        sceneMap.put("welcome", scene);
        sceneMap.put("gamePlay", scene2);

        primaryStage.setScene(sceneMap.get("welcome"));
        primaryStage.show();

    }

}
*/