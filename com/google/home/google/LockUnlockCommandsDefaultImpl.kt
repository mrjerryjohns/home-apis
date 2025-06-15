// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface LockUnlockCommandsDefaultImpl : com.google.home.google.LockUnlockCommands {
    public open suspend fun lock(followUpToken: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun unlock(followUpToken: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun lockBatchable(followUpToken: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun unlockBatchable(followUpToken: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

