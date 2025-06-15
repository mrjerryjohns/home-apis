// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ForceReadCommandsDefaultImpl : com.google.home.google.ForceReadCommands {
    public open suspend fun forceReadCommand(trait_id: kotlin.String): com.google.home.google.ForceReadTrait.ForceReadCommandCommand.Response { /* compiled code */ }

    public open fun forceReadCommandBatchable(trait_id: kotlin.String): com.google.home.BatchableCommand<com.google.home.google.ForceReadTrait.ForceReadCommandCommand.Response> { /* compiled code */ }
}
