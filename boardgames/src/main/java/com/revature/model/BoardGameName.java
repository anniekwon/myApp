package com.revature.model;

public class BoardGameName {

    //title of a board game
    public String titleName;

    //type of overall strategy in a game
    public String typeName;

    //name of the author or designer, usually the top name listed
    public String designerName;

    //name of the publisher
    public String publisherName;

    //name of the main artist, usually the top name listed
    public String artistName;


    //CONSTRUCTOR
    public BoardGameName(
            String titleName,
            String typeName,
            String designerName,
            String publisherName,
            String artistName
    ) {
        this.titleName = titleName;
        this.typeName = typeName;
        this.designerName = designerName;
        this.publisherName = publisherName;
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "Board Game {" +
                "Title = '" + titleName + '\'' +
                ", Type = '" + typeName + '\'' +
                ", Designer = '" + designerName + '\'' +
                ", Publisher = '" + publisherName + '\''+
                ", Artist = '" + artistName +
                '}';
    }
}
