/*
 * This file is generated by jOOQ.
 */
package com.hedera.hashgraph.stablecoin.platform.db.routines;


import com.hedera.hashgraph.stablecoin.platform.db.Public;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReorderChunk extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 379590644;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> CHUNK = Internal.createParameter("chunk", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> INDEX = Internal.createParameter("index", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\"").defaultValue(org.jooq.impl.DSL.field("NULL::regclass", org.jooq.impl.SQLDataType.OTHER)), true, false);

    /**
     * The parameter <code>public.reorder_chunk.verbose</code>.
     */
    public static final Parameter<Boolean> VERBOSE = Internal.createParameter("verbose", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public ReorderChunk() {
        super("reorder_chunk", Public.PUBLIC);

        addInParameter(CHUNK);
        addInParameter(INDEX);
        addInParameter(VERBOSE);
    }

    /**
     * Set the <code>chunk</code> parameter IN value to the routine
     */
    public void setChunk(Object value) {
        setValue(CHUNK, value);
    }

    /**
     * Set the <code>index</code> parameter IN value to the routine
     */
    public void setIndex(Object value) {
        setValue(INDEX, value);
    }

    /**
     * Set the <code>verbose</code> parameter IN value to the routine
     */
    public void setVerbose(Boolean value) {
        setValue(VERBOSE, value);
    }
}
