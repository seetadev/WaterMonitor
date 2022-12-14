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
public class SetIntegerNowFunc extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -2023877496;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> HYPERTABLE = Internal.createParameter("hypertable", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false);

    /**
     * The parameter <code>public.set_integer_now_func.integer_now_func</code>.
     */
    public static final Parameter<String> INTEGER_NOW_FUNC = Internal.createParameter("integer_now_func", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.set_integer_now_func.replace_if_exists</code>.
     */
    public static final Parameter<Boolean> REPLACE_IF_EXISTS = Internal.createParameter("replace_if_exists", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public SetIntegerNowFunc() {
        super("set_integer_now_func", Public.PUBLIC);

        addInParameter(HYPERTABLE);
        addInParameter(INTEGER_NOW_FUNC);
        addInParameter(REPLACE_IF_EXISTS);
    }

    /**
     * Set the <code>hypertable</code> parameter IN value to the routine
     */
    public void setHypertable(Object value) {
        setValue(HYPERTABLE, value);
    }

    /**
     * Set the <code>integer_now_func</code> parameter IN value to the routine
     */
    public void setIntegerNowFunc(String value) {
        setValue(INTEGER_NOW_FUNC, value);
    }

    /**
     * Set the <code>replace_if_exists</code> parameter IN value to the routine
     */
    public void setReplaceIfExists(Boolean value) {
        setValue(REPLACE_IF_EXISTS, value);
    }
}
