// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface AdministratorCommissioningCommandsDefaultImpl : com.google.home.matter.standard.AdministratorCommissioningCommands {
    public open suspend fun openCommissioningWindow(commissioningTimeout: kotlin.UShort, pakePasscodeVerifier: kotlin.ByteArray, discriminator: kotlin.UShort, iterations: kotlin.UInt, salt: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

    public open suspend fun openBasicCommissioningWindow(commissioningTimeout: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun revokeCommissioning(): kotlin.Unit { /* compiled code */ }

    public open fun openCommissioningWindowBatchable(commissioningTimeout: kotlin.UShort, pakePasscodeVerifier: kotlin.ByteArray, discriminator: kotlin.UShort, iterations: kotlin.UInt, salt: kotlin.ByteArray): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun openBasicCommissioningWindowBatchable(commissioningTimeout: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun revokeCommissioningBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
