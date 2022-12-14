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
public class SetChunkTimeInterval extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 73945170;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> MAIN_TABLE = Internal.createParameter("main_table", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> CHUNK_TIME_INTERVAL = Internal.createParameter("chunk_time_interval", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\""), false, false);

    /**
     * The parameter <code>public.set_chunk_time_interval.dimension_name</code>.
     */
    public static final Parameter<String> DIMENSION_NAME = Internal.createParameter("dimension_name", org.jooq.impl.SQLDataType.VARCHAR.defaultValue(org.jooq.impl.DSL.field("NULL::name", org.jooq.impl.SQLDataType.VARCHAR)), true, false);

    /**
     * Create a new routine call instance
     */
    public SetChunkTimeInterval() {
        super("set_chunk_time_interval", Public.PUBLIC);

        addInParameter(MAIN_TABLE);
        addInParameter(CHUNK_TIME_INTERVAL);
        addInParameter(DIMENSION_NAME);
    }

    /**
     * Set the <code>main_table</code> parameter IN value to the routine
     */
    public void setMainTable(Object value) {
        setValue(MAIN_TABLE, value);
    }

    /**
     * Set the <code>chunk_time_interval</code> parameter IN value to the routine
     */
    public void setChunkTimeInterval(Object value) {
        setValue(CHUNK_TIME_INTERVAL, value);
    }

    /**
     * Set the <code>dimension_name</code> parameter IN value to the routine
     */
    public void setDimensionName(String value) {
        setValue(DIMENSION_NAME, value);
    }
}
