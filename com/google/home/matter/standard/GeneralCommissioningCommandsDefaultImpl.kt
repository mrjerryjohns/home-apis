// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface GeneralCommissioningCommandsDefaultImpl : com.google.home.matter.standard.GeneralCommissioningCommands {
    public open suspend fun armFailSafe(expiryLengthSeconds: kotlin.UShort, breadcrumb: kotlin.ULong): com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Response { /* compiled code */ }

    public open suspend fun setRegulatoryConfig(newRegulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum, countryCode: kotlin.String, breadcrumb: kotlin.ULong): com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Response { /* compiled code */ }

    public open suspend fun commissioningComplete(): com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Response { /* compiled code */ }

    public open suspend fun setTcAcknowledgements(tcVersion: kotlin.UShort, tcUserResponse: kotlin.UShort): com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Response { /* compiled code */ }

    public open fun armFailSafeBatchable(expiryLengthSeconds: kotlin.UShort, breadcrumb: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Response> { /* compiled code */ }

    public open fun setRegulatoryConfigBatchable(newRegulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum, countryCode: kotlin.String, breadcrumb: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Response> { /* compiled code */ }

    public open fun commissioningCompleteBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Response> { /* compiled code */ }

    public open fun setTcAcknowledgementsBatchable(tcVersion: kotlin.UShort, tcUserResponse: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Response> { /* compiled code */ }
}

