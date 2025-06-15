// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface LockUnlockCommands {
    public abstract suspend fun lock(followUpToken: kotlin.String): kotlin.Unit

    public abstract suspend fun unlock(followUpToken: kotlin.String): kotlin.Unit

    public abstract fun lockBatchable(followUpToken: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun unlockBatchable(followUpToken: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>
}
