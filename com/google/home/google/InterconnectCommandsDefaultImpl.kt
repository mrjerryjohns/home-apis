// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface InterconnectCommandsDefaultImpl : com.google.home.google.InterconnectCommands {
    public open suspend fun setInterconnectCredentials(threadPanId: kotlin.Long, networkKey: kotlin.String, networkChannel: kotlin.Long): kotlin.Unit { /* compiled code */ }

    public open suspend fun clearInterconnectCredentials(): kotlin.Unit { /* compiled code */ }

    public open fun setInterconnectCredentialsBatchable(threadPanId: kotlin.Long, networkKey: kotlin.String, networkChannel: kotlin.Long): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun clearInterconnectCredentialsBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
