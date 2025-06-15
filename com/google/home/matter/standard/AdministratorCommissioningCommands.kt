// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface AdministratorCommissioningCommands {
    public abstract suspend fun openCommissioningWindow(commissioningTimeout: kotlin.UShort, pakePasscodeVerifier: kotlin.ByteArray, discriminator: kotlin.UShort, iterations: kotlin.UInt, salt: kotlin.ByteArray): kotlin.Unit

    public abstract suspend fun openBasicCommissioningWindow(commissioningTimeout: kotlin.UShort): kotlin.Unit

    public abstract suspend fun revokeCommissioning(): kotlin.Unit

    public abstract fun openCommissioningWindowBatchable(commissioningTimeout: kotlin.UShort, pakePasscodeVerifier: kotlin.ByteArray, discriminator: kotlin.UShort, iterations: kotlin.UInt, salt: kotlin.ByteArray): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun openBasicCommissioningWindowBatchable(commissioningTimeout: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun revokeCommissioningBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}
