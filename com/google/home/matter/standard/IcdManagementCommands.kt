// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface IcdManagementCommands {
    public abstract suspend fun registerClient(checkInNodeId: kotlin.ULong, monitoredSubject: kotlin.ULong, key: kotlin.ByteArray, clientType: com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Response

    public abstract suspend fun unregisterClient(checkInNodeId: kotlin.ULong, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.UnregisterClientCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun stayActiveRequest(stayActiveDuration: kotlin.UInt): com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Response

    public abstract fun registerClientBatchable(checkInNodeId: kotlin.ULong, monitoredSubject: kotlin.ULong, key: kotlin.ByteArray, clientType: com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Response>

    public abstract fun unregisterClientBatchable(checkInNodeId: kotlin.ULong, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.UnregisterClientCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stayActiveRequestBatchable(stayActiveDuration: kotlin.UInt): com.google.home.BatchableCommand<com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Response>
}

