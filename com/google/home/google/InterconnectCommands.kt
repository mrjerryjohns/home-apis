// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface InterconnectCommands {
    public abstract suspend fun setInterconnectCredentials(threadPanId: kotlin.Long, networkKey: kotlin.String, networkChannel: kotlin.Long): kotlin.Unit

    public abstract suspend fun clearInterconnectCredentials(): kotlin.Unit

    public abstract fun setInterconnectCredentialsBatchable(threadPanId: kotlin.Long, networkKey: kotlin.String, networkChannel: kotlin.Long): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun clearInterconnectCredentialsBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}

