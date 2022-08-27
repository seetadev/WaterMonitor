/*
 * This file is generated by jOOQ.
 */
package com.hedera.hashgraph.stablecoin.platform.db;


import org.jooq.Sequence;
import org.jooq.impl.Internal;


/**
 * Convenience access to all sequences in public
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.account_id_seq</code>
     */
    public static final Sequence<Long> ACCOUNT_ID_SEQ = Internal.createSequence("account_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.petition_id_seq</code>
     */
    public static final Sequence<Long> PETITION_ID_SEQ = Internal.createSequence("petition_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);
}
