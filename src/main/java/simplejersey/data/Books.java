package simplejersey.data;

import simplejersey.epicpojos.EpicBook;
import simplejersey.pojos.PlainBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Books {

    public static List<PlainBook> getPlainBooks() {

        List<PlainBook> pbs = new ArrayList<PlainBook>(3);

        PlainBook pb = new PlainBook();
        pb.setTitle( "Learn You a Haskell for Great Good! A Beginner's Guide" );
        pb.setAuthors( Collections.singletonList( "Miran Lipovaca" ) );
        pb.setDescription(
            "It's all in the name: Learn You a Haskell for Great Good! is a hilarious, " +
            "illustrated guide to this complex functional language. Packed with the author's " +
            "original artwork, pop culture references, and most importantly, useful example " +
            "code, this book teaches functional fundamentals in a way you never thought possible."
        );
        pbs.add(pb);

        pb = new PlainBook();
        pb.setTitle( "Programming: Principles and Practice Using C++" );
        pb.setAuthors( Collections.singletonList( "Bjarne Stroustrup" ) );
        pb.setDescription(
            "Preparation for Programming in the Real World. " +
            "The book assumes that you aim eventually to write non-trivial programs, whether for work in software " +
            "development or in some other technical field."
        );
        pbs.add(pb);

        pb = new PlainBook();
        pb.setTitle( "Design Patterns: Elements of Reusable Object-Oriented Software" );
        pb.setAuthors( Arrays.asList( "Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides" ) );
        pb.setDescription(
            "Capturing a wealth of experience about the design of object-oriented software, four top-notch " +
            "designers present a catalogue of simple and succinct solutions to commonly occurring design " +
            "problems. Previously undocumented, these 23 patterns allow designers to create more flexible, " +
            "elegant, and ultimately reusable designs without having to rediscover the design solutions themselves."
        );
        pbs.add(pb);

        return pbs;
    }

    public static List<EpicBook> getEpicBooks() {

        List<PlainBook> pbs = getPlainBooks();
        List<EpicBook> ebs = new ArrayList<EpicBook>( pbs.size() );

        for (PlainBook pb : pbs ) {
            EpicBook eb = new EpicBook();
            eb.setTitle( pb.getTitle() );
            eb.setAuthors( pb.getAuthors() );
            eb.setDescription( pb.getDescription() );
            ebs.add( eb );
        }

        return ebs;
    }
}
