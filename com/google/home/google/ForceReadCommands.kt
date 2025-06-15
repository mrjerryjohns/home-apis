// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ForceReadCommands {
    public abstract suspend fun forceReadCommand(trait_id: kotlin.String): com.google.home.google.ForceReadTrait.ForceReadCommandCommand.Response

    public abstract fun forceReadCommandBatchable(trait_id: kotlin.String): com.google.home.BatchableCommand<com.google.home.google.ForceReadTrait.ForceReadCommandCommand.Response>
}

