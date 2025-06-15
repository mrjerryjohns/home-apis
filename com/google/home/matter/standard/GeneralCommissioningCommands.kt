// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface GeneralCommissioningCommands {
    public abstract suspend fun armFailSafe(expiryLengthSeconds: kotlin.UShort, breadcrumb: kotlin.ULong): com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Response

    public abstract suspend fun setRegulatoryConfig(newRegulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum, countryCode: kotlin.String, breadcrumb: kotlin.ULong): com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Response

    public abstract suspend fun commissioningComplete(): com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Response

    public abstract suspend fun setTcAcknowledgements(tcVersion: kotlin.UShort, tcUserResponse: kotlin.UShort): com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Response

    public abstract fun armFailSafeBatchable(expiryLengthSeconds: kotlin.UShort, breadcrumb: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Response>

    public abstract fun setRegulatoryConfigBatchable(newRegulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum, countryCode: kotlin.String, breadcrumb: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Response>

    public abstract fun commissioningCompleteBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Response>

    public abstract fun setTcAcknowledgementsBatchable(tcVersion: kotlin.UShort, tcUserResponse: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Response>
}

