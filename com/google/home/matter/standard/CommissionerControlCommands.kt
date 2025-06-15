// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface CommissionerControlCommands {
    public abstract suspend fun requestCommissioningApproval(requestId: kotlin.ULong, vendorId: kotlin.UShort, productId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.CommissionerControlTrait.RequestCommissioningApprovalCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun commissionNode(requestId: kotlin.ULong, responseTimeoutSeconds: kotlin.UShort): com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Response

    public abstract fun requestCommissioningApprovalBatchable(requestId: kotlin.ULong, vendorId: kotlin.UShort, productId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.CommissionerControlTrait.RequestCommissioningApprovalCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun commissionNodeBatchable(requestId: kotlin.ULong, responseTimeoutSeconds: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Response>
}
