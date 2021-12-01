package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		//Crea dos array: una para palos (suits) y otro para valores (values)
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		//Crea un ArrayList a partir de la clase Card (carta).
		ArrayList<Card> deck = new ArrayList<Card>();

		//Asigna un palo y un valor hasta crear la baraja completa
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}

		//Desordena la baraja anteriormente creada
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}

		//Selecciona las 5 primeras cartas de la baraja
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
