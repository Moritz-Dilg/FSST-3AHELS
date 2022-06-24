package com.exmaple;


import com.exmaple.generics.linkedlist.List;
import com.exmaple.interfaces.Tokenizer;
import com.exmaple.interfaces.list.Node;
import com.exmaple.interfaces.dictionary.Dictionary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Interfaces
        /*List list = new List();
        list.add(new Node(5));
        list.add(new Node(3));
        list.add(new Node(7));
        list.add(new Node(4));
        list.add(new Node(6));
        list.add(new Node(1));

        list.print();

        list.remove(new Node(4));
        list.print();
        list.remove(new Node(1));
        list.print();
        list.remove(new Node(7));
        list.print();*/

        /*Tokenizer tokenizer = new Tokenizer("Hello world! How are you?");
        for (String s : tokenizer) {
            System.out.println(s);
        }*/

        // Dictionary
        /*Dictionary dictionary = new Dictionary();
        dictionary.insert("hello", "hallo");
        dictionary.insert("world", "welt");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        while (true) {
            String word = scanner.nextLine();
            System.out.println(dictionary.lookupGermanWord(word));
        }*/



        // Generics
        /*List<Integer> list = new List<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(6);
        list.add(1);

        list.print();

        list.remove(4);
        list.print();
        list.remove(1);
        list.print();
        list.remove(7);
        list.print();
        /**/
    }
}
