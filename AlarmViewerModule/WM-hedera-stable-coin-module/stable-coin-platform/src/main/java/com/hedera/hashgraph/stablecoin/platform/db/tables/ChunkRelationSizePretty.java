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
public class ChunkRelationSizePretty extends TableImpl<Record> {

    private static final long serialVersionUID = 397002621;

    /**
     * The reference instance of <code>public.chunk_relation_size_pretty</code>
     */
    public static final ChunkRelationSizePretty CHUNK_RELATION_SIZE_PRETTY = new ChunkRelationSizePretty();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>public.chunk_relation_size_pretty.chunk_id</code>.
     */
    public final TableField<Record, Integer> CHUNK_ID = createField(DSL.name("chunk_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.chunk_relation_size_pretty.chunk_table</code>.
     */
    public final TableField<Record, String> CHUNK_TABLE = createField(DSL.name("chunk_table"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.chunk_relation_size_pretty.partitioning_columns</code>.
     */
    public final TableField<Record, String[]> PARTITIONING_COLUMNS = createField(DSL.name("partitioning_columns"), org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.chunk_relation_size_pretty.partitioning_column_types</code>.
     */
    public final TableField<Record, Object[]> PARTITIONING_COLUMN_TYPES = createField(DSL.name("partitioning_column_types"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regtype\"").getArrayDataType(), this, "");

    /**
     * The column <code>public.chunk_relation_size_pretty.partitioning_hash_functions</code>.
     */
    public final TableField<Record, String[]> PARTITIONING_HASH_FUNCTIONS = createField(DSL.name("partitioning_hash_functions"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>public.chunk_relation_size_pretty.ranges</code>.
     */
    public final TableField<Record, String[]> RANGES = createField(DSL.name("ranges"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>public.chunk_relation_size_pretty.table_size</code>.
     */
    public final TableField<Record, String> TABLE_SIZE = createField(DSL.name("table_size"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.chunk_relation_size_pretty.index_size</code>.
     */
    public final TableField<Record, String> INDEX_SIZE = createField(DSL.name("index_size"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.chunk_relation_size_pretty.toast_size</code>.
     */
    public final TableField<Record, String> TOAST_SIZE = createField(DSL.name("toast_size"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.chunk_relation_size_pretty.total_size</code>.
     */
    public final TableField<Record, String> TOTAL_SIZE = createField(DSL.name("total_size"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.chunk_relation_size_pretty</code> table reference
     */
    public ChunkRelationSizePretty() {
        this(DSL.name("chunk_relation_size_pretty"), null);
    }

    /**
     * Create an aliased <code>public.chunk_relation_size_pretty</code> table reference
     */
    public ChunkRelationSizePretty(String alias) {
        this(DSL.name(alias), CHUNK_RELATION_SIZE_PRETTY);
    }

    /**
     * Create an aliased <code>public.chunk_relation_size_pretty</code> table reference
     */
    public ChunkRelationSizePretty(Name alias) {
        this(alias, CHUNK_RELATION_SIZE_PRETTY);
    }

    private ChunkRelationSizePretty(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private ChunkRelationSizePretty(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public <O extends Record> ChunkRelationSizePretty(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, CHUNK_RELATION_SIZE_PRETTY);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public ChunkRelationSizePretty as(String alias) {
        return new ChunkRelationSizePretty(DSL.name(alias), this, parameters);
    }

    @Override
    public ChunkRelationSizePretty as(Name alias) {
        return new ChunkRelationSizePretty(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public ChunkRelationSizePretty rename(String name) {
        return new ChunkRelationSizePretty(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public ChunkRelationSizePretty rename(Name name) {
        return new ChunkRelationSizePretty(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public ChunkRelationSizePretty call(Object mainTable) {
        return new ChunkRelationSizePretty(DSL.name(getName()), null, new Field[] { 
              DSL.val(mainTable, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""))
        });
    }

    /**
     * Call this table-valued function
     */
    public ChunkRelationSizePretty call(Field<Object> mainTable) {
        return new ChunkRelationSizePretty(DSL.name(getName()), null, new Field[] { 
              mainTable
        });
    }
}
