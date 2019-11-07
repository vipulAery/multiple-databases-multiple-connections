/*
 * This file is generated by jOOQ.
 */
package com.example.multipledatabasesmultipleconnections.jooq.theredb.public_;


import com.example.multipledatabasesmultipleconnections.jooq.theredb.DefaultCatalog;
import com.example.multipledatabasesmultipleconnections.jooq.theredb.public_.tables.Hello;

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

    private static final long serialVersionUID = 1351494588;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.hello</code>.
     */
    public final Hello HELLO = com.example.multipledatabasesmultipleconnections.jooq.theredb.public_.tables.Hello.HELLO;

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
            Hello.HELLO);
    }
}
