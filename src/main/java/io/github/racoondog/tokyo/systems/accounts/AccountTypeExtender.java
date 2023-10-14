package io.github.racoondog.tokyo.systems.accounts;

import meteordevelopment.meteorclient.systems.accounts.AccountType;
import meteordevelopment.meteorclient.utils.PreInit;
import net.lenni0451.reflect.Enums;

public class AccountTypeExtender {
    public static final AccountType AccessToken;

    static {
        AccessToken = Enums.newInstance(AccountType.class, "AccessToken", 4, new Class[0], new Object[0]);
        Enums.addEnumInstance(AccountType.class, AccessToken);
    }

    @PreInit
    public static void extendEnum() {}
}
