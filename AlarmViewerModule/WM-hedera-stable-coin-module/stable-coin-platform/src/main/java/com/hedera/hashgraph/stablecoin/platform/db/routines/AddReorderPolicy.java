/*
 * This file is generated by jOOQ.
 */
package com.hedera.hashgraph.stablecoin.platform.db.routines;


import com.hedera.hashgraph.stablecoin.platform.db.Public;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AddReorderPolicy extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -1040842472;

    /**
     * The parameter <code>public.add_reorder_policy.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> HYPERTABLE = Internal.createParameter("hypertable", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false);

    /**
     * The parameter <code>public.add_reorder_policy.index_name</code>.
     */
    public static final Parameter<String> INDEX_NAME = Internal.createParameter("index_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.add_reorder_policy.if_not_exists</code>.
     */
    public static final Parameter<Boolean> IF_NOT_EXISTS = Internal.createParameter("if_not_exists", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public AddReorderPolicy() {
        super("add_reorder_policy", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(HYPERTABLE);
        addInParameter(INDEX_NAME);
        addInParameter(IF_NOT_EXISTS);
    }

    /**
     * Set the <code>hypertable</code> parameter IN value to the routine
     */
    public void setHypertable(Object value) {
        setValue(HYPERTABLE, value);
    }

    /**
     * Set the <code>hypertable</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setHypertable(Field<Object> field) {
        setField(HYPERTABLE, field);
    }

    /**
     * Set the <code>index_name</code> parameter IN value to the routine
     */
    public void setIndexName(String value) {
        setValue(INDEX_NAME, value);
    }

    /**
     * Set the <code>index_name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setIndexName(Field<String> field) {
        setField(INDEX_NAME, field);
    }

    /**
     * Set the <code>if_not_exists</code> parameter IN value to the routine
     */
    public void setIfNotExists(Boolean value) {
        setValue(IF_NOT_EXISTS, value);
    }

    /**
     * Set the <code>if_not_exists</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setIfNotExists(Field<Boolean> field) {
        setField(IF_NOT_EXISTS, field);
    }
}
