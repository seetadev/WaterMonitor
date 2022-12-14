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
public class TimeBucket8 extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -1741736983;

    /**
     * The parameter <code>public.time_bucket.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.time_bucket.bucket_width</code>.
     */
    public static final Parameter<Integer> BUCKET_WIDTH = Internal.createParameter("bucket_width", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.time_bucket.ts</code>.
     */
    public static final Parameter<Integer> TS = Internal.createParameter("ts", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public TimeBucket8() {
        super("time_bucket", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(BUCKET_WIDTH);
        addInParameter(TS);
        setOverloaded(true);
    }

    /**
     * Set the <code>bucket_width</code> parameter IN value to the routine
     */
    public void setBucketWidth(Integer value) {
        setValue(BUCKET_WIDTH, value);
    }

    /**
     * Set the <code>bucket_width</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setBucketWidth(Field<Integer> field) {
        setField(BUCKET_WIDTH, field);
    }

    /**
     * Set the <code>ts</code> parameter IN value to the routine
     */
    public void setTs(Integer value) {
        setValue(TS, value);
    }

    /**
     * Set the <code>ts</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTs(Field<Integer> field) {
        setField(TS, field);
    }
}
