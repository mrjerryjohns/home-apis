// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface BridgedDeviceBasicInformationCommandsDefaultImpl : com.google.home.matter.standard.BridgedDeviceBasicInformationCommands {
    public open suspend fun keepActive(stayActiveDuration: kotlin.UInt, timeoutMs: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open fun keepActiveBatchable(stayActiveDuration: kotlin.UInt, timeoutMs: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

