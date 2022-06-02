package com.revature;

import com.revature.controller.BoardGameController;
import io.javalin.Javalin;


public class Driver {

    public static void main(String[] args) {
        BoardGameController boardgameController = new BoardGameController();

        Javalin appBG = Javalin.create();
        appBG.start(8080);

        appBG.get("/boardgameHello", ctx -> ctx.result("Hello from Board Games"));
        appBG.get("/boardgameList", boardgameController.getAllBoardGameName );
        appBG.post("/boardgameList", boardgameController.createNewBoardGameName);
    }
}
