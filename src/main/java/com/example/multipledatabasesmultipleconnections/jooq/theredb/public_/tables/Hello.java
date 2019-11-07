/*
 * This file is generated by jOOQ.
 */
package com.example.multipledatabasesmultipleconnections.jooq.theredb.public_.tables;


import com.example.multipledatabasesmultipleconnections.jooq.theredb.public_.Indexes;
import com.example.multipledatabasesmultipleconnections.jooq.theredb.public_.Keys;
import com.example.multipledatabasesmultipleconnections.jooq.theredb.public_.Public;
import com.example.multipledatabasesmultipleconnections.jooq.theredb.public_.tables.records.HelloRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Hello extends TableImpl<HelloRecord> {

    private static final long serialVersionUID = 1443199475;

    /**
     * The reference instance of <code>public.hello</code>
     */
    public static final Hello HELLO = new Hello();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HelloRecord> getRecordType() {
        return HelloRecord.class;
    }

    /**
     * The column <code>public.hello.id</code>.
     */
    public final TableField<HelloRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('hello_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.hello.value</code>.
     */
    public final TableField<HelloRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>public.hello</code> table reference
     */
    public Hello() {
        this(DSL.name("hello"), null);
    }

    /**
     * Create an aliased <code>public.hello</code> table reference
     */
    public Hello(String alias) {
        this(DSL.name(alias), HELLO);
    }

    /**
     * Create an aliased <code>public.hello</code> table reference
     */
    public Hello(Name alias) {
        this(alias, HELLO);
    }

    private Hello(Name alias, Table<HelloRecord> aliased) {
        this(alias, aliased, null);
    }

    private Hello(Name alias, Table<HelloRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Hello(Table<O> child, ForeignKey<O, HelloRecord> key) {
        super(child, key, HELLO);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.HELLO_PKEY);
    }

    @Override
    public Identity<HelloRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HELLO;
    }

    @Override
    public UniqueKey<HelloRecord> getPrimaryKey() {
        return Keys.HELLO_PKEY;
    }

    @Override
    public List<UniqueKey<HelloRecord>> getKeys() {
        return Arrays.<UniqueKey<HelloRecord>>asList(Keys.HELLO_PKEY);
    }

    @Override
    public Hello as(String alias) {
        return new Hello(DSL.name(alias), this);
    }

    @Override
    public Hello as(Name alias) {
        return new Hello(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Hello rename(String name) {
        return new Hello(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Hello rename(Name name) {
        return new Hello(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}