/*
 * This file is generated by jOOQ.
 */
package com.hedera.hashgraph.stablecoin.platform.db.tables;


import com.hedera.hashgraph.stablecoin.platform.db.Public;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndexesRelationSizePretty extends TableImpl<Record> {

    private static final long serialVersionUID = 1354272367;

    /**
     * The reference instance of <code>public.indexes_relation_size_pretty</code>
     */
    public static final IndexesRelationSizePretty INDEXES_RELATION_SIZE_PRETTY = new IndexesRelationSizePretty();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>public.indexes_relation_size_pretty.index_name</code>.
     */
    public final TableField<Record, String> INDEX_NAME = createField(DSL.name("index_name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.indexes_relation_size_pretty.total_size</code>.
     */
    public final TableField<Record, String> TOTAL_SIZE = createField(DSL.name("total_size"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.indexes_relation_size_pretty</code> table reference
     */
    public IndexesRelationSizePretty() {
        this(DSL.name("indexes_relation_size_pretty"), null);
    }

    /**
     * Create an aliased <code>public.indexes_relation_size_pretty</code> table reference
     */
    public IndexesRelationSizePretty(String alias) {
        this(DSL.name(alias), INDEXES_RELATION_SIZE_PRETTY);
    }

    /**
     * Create an aliased <code>public.indexes_relation_size_pretty</code> table reference
     */
    public IndexesRelationSizePretty(Name alias) {
        this(alias, INDEXES_RELATION_SIZE_PRETTY);
    }

    private IndexesRelationSizePretty(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private IndexesRelationSizePretty(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public <O extends Record> IndexesRelationSizePretty(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, INDEXES_RELATION_SIZE_PRETTY);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public IndexesRelationSizePretty as(String alias) {
        return new IndexesRelationSizePretty(DSL.name(alias), this, parameters);
    }

    @Override
    public IndexesRelationSizePretty as(Name alias) {
        return new IndexesRelationSizePretty(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public IndexesRelationSizePretty rename(String name) {
        return new IndexesRelationSizePretty(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public IndexesRelationSizePretty rename(Name name) {
        return new IndexesRelationSizePretty(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public IndexesRelationSizePretty call(Object mainTable) {
        return new IndexesRelationSizePretty(DSL.name(getName()), null, new Field[] { 
              DSL.val(mainTable, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""))
        });
    }

    /**
     * Call this table-valued function
     */
    public IndexesRelationSizePretty call(Field<Object> mainTable) {
        return new IndexesRelationSizePretty(DSL.name(getName()), null, new Field[] { 
              mainTable
        });
    }
}
