/*
 * This file is generated by jOOQ.
 */
package com.hedera.hashgraph.stablecoin.platform.db.routines;


import com.hedera.hashgraph.stablecoin.platform.db.Public;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeBucket13 extends AbstractRoutine<LocalDateTime> {

    private static final long serialVersionUID = 1876554208;

    /**
     * The parameter <code>public.time_bucket.RETURN_VALUE</code>.
     */
    public static final Parameter<LocalDateTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.LOCALDATETIME, false, false);

    /**
     * The parameter <code>public.time_bucket.bucket_width</code>.
     */
    public static final Parameter<YearToSecond> BUCKET_WIDTH = Internal.createParameter("bucket_width", org.jooq.impl.SQLDataType.INTERVAL, false, false);

    /**
     * The parameter <code>public.time_bucket.ts</code>.
     */
    public static final Parameter<LocalDateTime> TS = Internal.createParameter("ts", org.jooq.impl.SQLDataType.LOCALDATETIME, false, false);

    /**
     * The parameter <code>public.time_bucket.offset</code>.
     */
    public static final Parameter<YearToSecond> OFFSET = Internal.createParameter("offset", org.jooq.impl.SQLDataType.INTERVAL, false, false);

    /**
     * Create a new routine call instance
     */
    public TimeBucket13() {
        super("time_bucket", Public.PUBLIC, org.jooq.impl.SQLDataType.LOCALDATETIME);

        setReturnParameter(RETURN_VALUE);
        addInParameter(BUCKET_WIDTH);
        addInParameter(TS);
        addInParameter(OFFSET);
        setOverloaded(true);
    }

    /**
     * Set the <code>bucket_width</code> parameter IN value to the routine
     */
    public void setBucketWidth(YearToSecond value) {
        setValue(BUCKET_WIDTH, value);
    }

    /**
     * Set the <code>bucket_width</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setBucketWidth(Field<YearToSecond> field) {
        setField(BUCKET_WIDTH, field);
    }

    /**
     * Set the <code>ts</code> parameter IN value to the routine
     */
    public void setTs(LocalDateTime value) {
        setValue(TS, value);
    }

    /**
     * Set the <code>ts</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTs(Field<LocalDateTime> field) {
        setField(TS, field);
    }

    /**
     * Set the <code>offset</code> parameter IN value to the routine
     */
    public void setOffset(YearToSecond value) {
        setValue(OFFSET, value);
    }

    /**
     * Set the <code>offset</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setOffset(Field<YearToSecond> field) {
        setField(OFFSET, field);
    }
}