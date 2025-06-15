// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface SelfTestCommandsDefaultImpl : com.google.home.google.SelfTestCommands {
    public open suspend fun updateStructureSelfTestStatus(manualTest: com.google.home.google.SelfTestTrait.Test, audioTest: com.google.home.google.SelfTestTrait.Test): kotlin.Unit { /* compiled code */ }

    public open suspend fun setExecutionSummary(warningDevices: kotlin.collections.List<com.google.home.google.SelfTestTrait.DeviceStatus>, criticalDevices: kotlin.collections.List<com.google.home.google.SelfTestTrait.DeviceStatus>): kotlin.Unit { /* compiled code */ }

    public open fun updateStructureSelfTestStatusBatchable(manualTest: com.google.home.google.SelfTestTrait.Test, audioTest: com.google.home.google.SelfTestTrait.Test): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setExecutionSummaryBatchable(warningDevices: kotlin.collections.List<com.google.home.google.SelfTestTrait.DeviceStatus>, criticalDevices: kotlin.collections.List<com.google.home.google.SelfTestTrait.DeviceStatus>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
