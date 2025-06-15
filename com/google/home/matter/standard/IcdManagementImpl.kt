// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class IcdManagementImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.IcdManagementTrait.Attributes) : com.google.home.matter.standard.IcdManagement, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.IcdManagementTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.IcdManagementTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val activeModeDuration: kotlin.UInt? /* compiled code */

    public open val activeModeThreshold: kotlin.UShort? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clientsSupportedPerFabric: kotlin.UShort? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.IcdManagementTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val icdCounter: kotlin.UInt? /* compiled code */

    public open val idleModeDuration: kotlin.UInt? /* compiled code */

    public open val maximumCheckInBackOff: kotlin.UInt? /* compiled code */

    public open val operatingMode: com.google.home.matter.standard.IcdManagementTrait.OperatingModeEnum? /* compiled code */

    public open val registeredClients: kotlin.collections.List<com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct>? /* compiled code */

    public open val userActiveModeTriggerHint: com.google.home.matter.standard.IcdManagementTrait.UserActiveModeTriggerBitmap? /* compiled code */

    public open val userActiveModeTriggerInstruction: kotlin.String? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.IcdManagement.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.IcdManagement.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun registerClient(checkInNodeId: kotlin.ULong, monitoredSubject: kotlin.ULong, key: kotlin.ByteArray, clientType: com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Response { /* compiled code */ }

    public open suspend fun unregisterClient(checkInNodeId: kotlin.ULong, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.UnregisterClientCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun stayActiveRequest(stayActiveDuration: kotlin.UInt): com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Response { /* compiled code */ }

    public open fun registerClientBatchable(checkInNodeId: kotlin.ULong, monitoredSubject: kotlin.ULong, key: kotlin.ByteArray, clientType: com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Response> { /* compiled code */ }

    public open fun unregisterClientBatchable(checkInNodeId: kotlin.ULong, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.UnregisterClientCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stayActiveRequestBatchable(stayActiveDuration: kotlin.UInt): com.google.home.BatchableCommand<com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
