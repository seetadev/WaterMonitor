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
public class TimeBucketGapfill5 extends AbstractRoutine<LocalDateTime> {

    private static final long serialVersionUID = 1069040703;

    /**
     * The parameter <code>public.time_bucket_gapfill.RETURN_VALUE</code>.
     */
    public static final Parameter<LocalDateTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.LOCALDATETIME, false, false);

    /**
     * The parameter <code>public.time_bucket_gapfill.bucket_width</code>.
     */
    public static final Parameter<YearToSecond> BUCKET_WIDTH = Internal.createParameter("bucket_width", org.jooq.impl.SQLDataType.INTERVAL, false, false);

    /**
     * The parameter <code>public.time_bucket_gapfill.ts</code>.
     */
    public static final Parameter<LocalDateTime> TS = Internal.createParameter("ts", org.jooq.impl.SQLDataType.LOCALDATETIME, false, false);

    /**
     * The parameter <code>public.time_bucket_gapfill.start</code>.
     */
    public static final Parameter<LocalDateTime> START = Internal.createParameter("start", org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.LOCALDATETIME)), true, false);

    /**
     * The parameter <code>public.time_bucket_gapfill.finish</code>.
     */
    public static final Parameter<LocalDateTime> FINISH = Internal.createParameter("finish", org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.LOCALDATETIME)), true, false);

    /**
     * Create a new routine call instance
     */
    public TimeBucketGapfill5() {
        super("time_bucket_gapfill", Public.PUBLIC, org.jooq.impl.SQLDataType.LOCALDATETIME);

        setReturnParameter(RETURN_VALUE);
        addInParameter(BUCKET_WIDTH);
        addInParameter(TS);
        addInParameter(START);
        addInParameter(FINISH);
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
     * Set the <code>start</code> parameter IN value to the routine
     */
    public void setStart(LocalDateTime value) {
        setValue(START, value);
    }

    /**
     * Set the <code>start</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setStart(Field<LocalDateTime> field) {
        setField(START, field);
    }

    /**
     * Set the <code>finish</code> parameter IN value to the routine
     */
    public void setFinish(LocalDateTime value) {
        setValue(FINISH, value);
    }

    /**
     * Set the <code>finish</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFinish(Field<LocalDateTime> field) {
        setField(FINISH, field);
    }
}
