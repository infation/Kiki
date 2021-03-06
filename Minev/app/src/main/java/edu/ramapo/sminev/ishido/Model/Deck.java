package edu.ramapo.sminev.ishido.Model;

import java.util.Random;
import java.util.Vector;

/************************************************************
 * Name:  Stanislav Minev                                   *
 * Project:  Project 2                                      *
 * Class:  CMPS 331 Artificial Intelligence I               *
 * Date:  02/23/2015                                        *
 ************************************************************/


/*The class's contains a Vector of as many tiles as there are in the serialization file,
with color/shape combination. Tiles at any index can be accessed with getTileAt() and also
the current tile with getCurrentTile(). Tiles can be added on the top of deck with addTile()
and the current tile can be removed with removeCurrentTile(). For the size of the deck
size() is used.
 */

public class Deck {

    //The data of tiles in the deck is
    public Vector<Tile> deck=new Vector<>();

    //Default constructor, just for instantiation
    public Deck() {

    }

    //To initialize the deck with all the tiles in the game
    public void initializeDeck(){
        deck.add(new Tile("White", "*"));
        deck.add(new Tile("White", "*"));
        deck.add(new Tile("White", "!"));
        deck.add(new Tile("White", "!"));
        deck.add(new Tile("White", "@"));
        deck.add(new Tile("White", "@"));
        deck.add(new Tile("White", "?"));
        deck.add(new Tile("White", "?"));
        deck.add(new Tile("White", "%"));
        deck.add(new Tile("White", "%"));
        deck.add(new Tile("White", "+"));
        deck.add(new Tile("Blue", "+"));
        deck.add(new Tile("Blue", "*"));
        deck.add(new Tile("Blue", "!"));
        deck.add(new Tile("Blue", "!"));
        deck.add(new Tile("Blue", "@"));
        deck.add(new Tile("Blue", "@"));
        deck.add(new Tile("Blue", "?"));
        deck.add(new Tile("Blue", "?"));
        deck.add(new Tile("Blue", "%"));
        deck.add(new Tile("Blue", "%"));
        deck.add(new Tile("Blue", "+"));
        deck.add(new Tile("Blue", "+"));
        deck.add(new Tile("Blue", "+"));
        deck.add(new Tile("Red", "*"));
        deck.add(new Tile("Red", "*"));
        deck.add(new Tile("Red", "!"));
        deck.add(new Tile("Red", "!"));
        deck.add(new Tile("Red", "@"));
        deck.add(new Tile("Red", "@"));
        deck.add(new Tile("Red", "?"));
        deck.add(new Tile("Red", "?"));
        deck.add(new Tile("Red", "%"));
        deck.add(new Tile("Red", "%"));
        deck.add(new Tile("Red", "+"));
        deck.add(new Tile("Red", "+"));
        deck.add(new Tile("Yellow", "*"));
        deck.add(new Tile("Yellow", "*"));
        deck.add(new Tile("Yellow", "!"));
        deck.add(new Tile("Yellow", "!"));
        deck.add(new Tile("Yellow", "@"));
        deck.add(new Tile("Yellow", "@"));
        deck.add(new Tile("Yellow", "?"));
        deck.add(new Tile("Yellow", "?"));
        deck.add(new Tile("Yellow", "%"));
        deck.add(new Tile("Yellow", "%"));
        deck.add(new Tile("Yellow", "+"));
        deck.add(new Tile("Yellow", "+"));
        deck.add(new Tile("Orange", "+"));
        deck.add(new Tile("Orange", "*"));
        deck.add(new Tile("Orange", "!"));
        deck.add(new Tile("Orange", "!"));
        deck.add(new Tile("Orange", "@"));
        deck.add(new Tile("Orange", "@"));
        deck.add(new Tile("Orange", "?"));
        deck.add(new Tile("Orange", "?"));
        deck.add(new Tile("Orange", "%"));
        deck.add(new Tile("Orange", "%"));
        deck.add(new Tile("Orange", "+"));
        deck.add(new Tile("Orange", "+"));
        deck.add(new Tile("Green", "*"));
        deck.add(new Tile("Green", "*"));
        deck.add(new Tile("Green", "!"));
        deck.add(new Tile("Green", "!"));
        deck.add(new Tile("Green", "@"));
        deck.add(new Tile("Green", "@"));
        deck.add(new Tile("Green", "?"));
        deck.add(new Tile("Green", "?"));
        deck.add(new Tile("Green", "%"));
        deck.add(new Tile("Green", "%"));
        deck.add(new Tile("Green", "+"));
        deck.add(new Tile("Green", "+"));
    }

    //To shuffle the tiles in the deck
    public void shuffleDeck(){
        for(int i=0;i<10000;i++){
            Random rand=new Random();
            int removeIndex=rand.nextInt(72);
            Tile tempTile=new Tile(deck.get(removeIndex).getColor(),deck.get(removeIndex).getShape());
            deck.remove(removeIndex);
            int insertIndex=rand.nextInt(72);
            deck.add(insertIndex,tempTile);
        }
    }

    //Getter for the current tile, if the deck is empty, return an empty tile
    public Tile getCurrentTile(){
        if(deck.size()!=0) {
            return deck.get(0);
        }
        Tile tile=new Tile();
        return tile;
    }

    //Getter for a tile at particular index in the deck, if the index is greater than the deck
    //size, then return an empty tile
    public Tile getTileAt(int index){
        if(deck.size()>index){
            return deck.get(index);
        }
        Tile tile=new Tile();
        return tile;
    }

    //To add a tile in the deck, its placed on the top of the deck
    public void  addTile(Tile tile){
        deck.add(tile);
    }

    //Remove the current tile from the deck, if deck.size() is >0 of course
    public void removeCurrentFromDeck(){
        if(deck.size()>0) {
            deck.remove(0);
        }
    }

    //Get the size of the deck
    public int size() {
        return deck.size();
    }

}
