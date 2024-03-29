/*
 * This file is generated by jOOQ.
 */
package com.example.multipledatabasesmultipleconnections.jooq.db.public_;


import com.example.multipledatabasesmultipleconnections.jooq.db.DefaultCatalog;
import com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.Author;
import com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.Book;
import com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.BookStore;
import com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.BookToBookStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -419475826;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.author</code>.
     */
    public final Author AUTHOR = com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.Author.AUTHOR;

    /**
     * The table <code>public.book</code>.
     */
    public final Book BOOK = com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.Book.BOOK;

    /**
     * The table <code>public.book_store</code>.
     */
    public final BookStore BOOK_STORE = com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.BookStore.BOOK_STORE;

    /**
     * The table <code>public.book_to_book_store</code>.
     */
    public final BookToBookStore BOOK_TO_BOOK_STORE = com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.BookToBookStore.BOOK_TO_BOOK_STORE;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Author.AUTHOR,
            Book.BOOK,
            BookStore.BOOK_STORE,
            BookToBookStore.BOOK_TO_BOOK_STORE);
    }
}
