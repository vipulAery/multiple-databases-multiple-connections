/*
 * This file is generated by jOOQ.
 */
package com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.records;


import com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.BookStore;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BookStoreRecord extends UpdatableRecordImpl<BookStoreRecord> implements Record1<String> {

    private static final long serialVersionUID = 745667830;

    /**
     * Setter for <code>public.book_store.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.book_store.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return BookStore.BOOK_STORE.NAME;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public BookStoreRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public BookStoreRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookStoreRecord
     */
    public BookStoreRecord() {
        super(BookStore.BOOK_STORE);
    }

    /**
     * Create a detached, initialised BookStoreRecord
     */
    public BookStoreRecord(String name) {
        super(BookStore.BOOK_STORE);

        set(0, name);
    }
}
