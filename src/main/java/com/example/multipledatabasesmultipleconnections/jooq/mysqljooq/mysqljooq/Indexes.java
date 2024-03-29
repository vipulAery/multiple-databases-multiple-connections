/*
 * This file is generated by jOOQ.
 */
package com.example.multipledatabasesmultipleconnections.jooq.mysqljooq.mysqljooq;


import com.example.multipledatabasesmultipleconnections.jooq.mysqljooq.mysqljooq.tables.Student;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>mysqljooq</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index STUDENT_PRIMARY = Indexes0.STUDENT_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index STUDENT_PRIMARY = Internal.createIndex("PRIMARY", Student.STUDENT, new OrderField[] { Student.STUDENT.ROLL_NUMBER }, true);
    }
}
