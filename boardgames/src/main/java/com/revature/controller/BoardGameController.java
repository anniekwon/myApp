package com.revature.controller;

import com.revature.model.BoardGameName;
import com.revature.service.BoardGameService;
import io.javalin.http.Handler;

public class BoardGameController {

    BoardGameService boardgameService = new BoardGameService();

    //CREATE
    public Handler createNewBoardGameName = ctx -> {
        boardgameService.createNewBoardGameName(new BoardGameName(
                "Rajas of the Ganges",
                "Dice Worker Placement",
                "Inka Brand",
                "HUCH!",
                "Dennis Lohausen"
        ));

        ctx.status(201);
    };

    //READ
    public Handler getAllBoardGameName = ctx -> {
        ctx.result(boardgameService.getAllBoardGameName().toString());
    };
}
