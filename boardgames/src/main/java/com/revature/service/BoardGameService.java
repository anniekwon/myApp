package com.revature.service;

import com.revature.model.BoardGameName;

import java.util.ArrayList;

public class BoardGameService {

    private ArrayList<BoardGameName> boardgameList = new ArrayList<>();

    //CREATE - adds a new board game to the list
    public void createNewBoardGameName(BoardGameName boardgame) {
        boardgameList.add(boardgame);
    }

    //READ - returns the list
    public ArrayList<BoardGameName> getAllBoardGameName() {
        return boardgameList;
    }
}
