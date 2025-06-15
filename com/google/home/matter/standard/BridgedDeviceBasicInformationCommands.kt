// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface BridgedDeviceBasicInformationCommands {
    public abstract suspend fun keepActive(stayActiveDuration: kotlin.UInt, timeoutMs: kotlin.UInt): kotlin.Unit

    public abstract fun keepActiveBatchable(stayActiveDuration: kotlin.UInt, timeoutMs: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit>
}
