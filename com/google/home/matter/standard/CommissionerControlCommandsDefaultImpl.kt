// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface CommissionerControlCommandsDefaultImpl : com.google.home.matter.standard.CommissionerControlCommands {
    public open suspend fun requestCommissioningApproval(requestId: kotlin.ULong, vendorId: kotlin.UShort, productId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.CommissionerControlTrait.RequestCommissioningApprovalCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun commissionNode(requestId: kotlin.ULong, responseTimeoutSeconds: kotlin.UShort): com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Response { /* compiled code */ }

    public open fun requestCommissioningApprovalBatchable(requestId: kotlin.ULong, vendorId: kotlin.UShort, productId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.CommissionerControlTrait.RequestCommissioningApprovalCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun commissionNodeBatchable(requestId: kotlin.ULong, responseTimeoutSeconds: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Response> { /* compiled code */ }
}

