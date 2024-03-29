/*
 * This file is generated by jOOQ.
 */
package com.example.multipledatabasesmultipleconnections.jooq.theredb.public_.tables.records;


import com.example.multipledatabasesmultipleconnections.jooq.theredb.public_.tables.Hello;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class HelloRecord extends UpdatableRecordImpl<HelloRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -421649968;

    /**
     * Setter for <code>public.hello.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.hello.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.hello.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.hello.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Hello.HELLO.ID;
    }

    @Override
    public Field<String> field2() {
        return Hello.HELLO.VALUE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getValue();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getValue();
    }

    @Override
    public HelloRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public HelloRecord value2(String value) {
        setValue(value);
        return this;
    }

    @Override
    public HelloRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HelloRecord
     */
    public HelloRecord() {
        super(Hello.HELLO);
    }

    /**
     * Create a detached, initialised HelloRecord
     */
    public HelloRecord(Integer id, String value) {
        super(Hello.HELLO);

        set(0, id);
        set(1, value);
    }
}
