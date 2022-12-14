/*
 * This file is generated by jOOQ.
 */
package com.hedera.hashgraph.stablecoin.platform.db;


import com.hedera.hashgraph.stablecoin.platform.db.tables.Account;
import com.hedera.hashgraph.stablecoin.platform.db.tables.FlywaySchemaHistory;
import com.hedera.hashgraph.stablecoin.platform.db.tables.Petition;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Record;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<Record, Long> IDENTITY_ACCOUNT = Identities0.IDENTITY_ACCOUNT;
    public static final Identity<Record, Long> IDENTITY_PETITION = Identities0.IDENTITY_PETITION;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<Record> ACCOUNT_PKEY = UniqueKeys0.ACCOUNT_PKEY;
    public static final UniqueKey<Record> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<Record> PETITION_PKEY = UniqueKeys0.PETITION_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<Record, Record> PETITION__PETITION_ACCOUNT_ID_FKEY = ForeignKeys0.PETITION__PETITION_ACCOUNT_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<Record, Long> IDENTITY_ACCOUNT = Internal.createIdentity(Account.ACCOUNT, Account.ACCOUNT.ID);
        public static Identity<Record, Long> IDENTITY_PETITION = Internal.createIdentity(Petition.PETITION, Petition.PETITION.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<Record> ACCOUNT_PKEY = Internal.createUniqueKey(Account.ACCOUNT, "account_pkey", new TableField[] { Account.ACCOUNT.ID }, true);
        public static final UniqueKey<Record> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static final UniqueKey<Record> PETITION_PKEY = Internal.createUniqueKey(Petition.PETITION, "petition_pkey", new TableField[] { Petition.PETITION.ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<Record, Record> PETITION__PETITION_ACCOUNT_ID_FKEY = Internal.createForeignKey(Keys.ACCOUNT_PKEY, Petition.PETITION, "petition_account_id_fkey", new TableField[] { Petition.PETITION.ACCOUNT_ID }, true);
    }
}
