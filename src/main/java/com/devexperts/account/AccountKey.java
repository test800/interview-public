package com.devexperts.account;

/**
 * Unique Account identifier
 *
 * <p>
 * NOTE: we suspect that later {@link #accountId} is not going to be uniquely identifying an account,
 * as we might add human-readable account representation and some clearing codes for partners.
 * */
public class AccountKey {
    final long accountId;

    private AccountKey(long accountId) {
        this.accountId = accountId;
    }

    public static AccountKey valueOf(long accountId) {
        return new AccountKey(accountId);
    }
}
