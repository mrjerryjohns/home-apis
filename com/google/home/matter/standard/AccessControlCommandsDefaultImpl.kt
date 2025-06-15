// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface AccessControlCommandsDefaultImpl : com.google.home.matter.standard.AccessControlCommands {
    public open suspend fun reviewFabricRestrictions(arl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct>): com.google.home.matter.standard.AccessControlTrait.ReviewFabricRestrictionsCommand.Response { /* compiled code */ }

    public open fun reviewFabricRestrictionsBatchable(arl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct>): com.google.home.BatchableCommand<com.google.home.matter.standard.AccessControlTrait.ReviewFabricRestrictionsCommand.Response> { /* compiled code */ }
}

