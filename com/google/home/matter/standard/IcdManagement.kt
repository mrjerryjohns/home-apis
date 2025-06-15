// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface IcdManagement : com.google.home.matter.standard.IcdManagementTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.IcdManagementCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.IcdManagement> {
        public final val idleModeDuration: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val activeModeDuration: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val activeModeThreshold: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val registeredClients: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct>?> /* compiled code */
            public final get

        public final val icdCounter: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val clientsSupportedPerFabric: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val userActiveModeTriggerHint: com.google.home.automation.Attribute<com.google.home.matter.standard.IcdManagementTrait.UserActiveModeTriggerBitmap?> /* compiled code */
            public final get

        public final val userActiveModeTriggerInstruction: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val operatingMode: com.google.home.automation.Attribute<com.google.home.matter.standard.IcdManagementTrait.OperatingModeEnum?> /* compiled code */
            public final get

        public final val maximumCheckInBackOff: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.IcdManagementTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.idleModeDuration: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.activeModeDuration: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.activeModeThreshold: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.registeredClients: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.icdCounter: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.clientsSupportedPerFabric: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.userActiveModeTriggerHint: com.google.home.automation.TypedExpression<com.google.home.matter.standard.IcdManagementTrait.UserActiveModeTriggerBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.userActiveModeTriggerInstruction: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.operatingMode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.IcdManagementTrait.OperatingModeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.maximumCheckInBackOff: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.IcdManagementTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagement?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun registerClient(checkInNodeId: kotlin.ULong, monitoredSubject: kotlin.ULong, key: kotlin.ByteArray, clientType: com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun unregisterClient(checkInNodeId: kotlin.ULong, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.UnregisterClientCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun stayActiveRequest(stayActiveDuration: kotlin.UInt): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.IcdManagement> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.IcdManagement.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.IcdManagement.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.IcdManagement.Attribute> {
        @androidx.annotation.NonNull idleModeDuration,

        @androidx.annotation.NonNull activeModeDuration,

        @androidx.annotation.NonNull activeModeThreshold,

        @androidx.annotation.NonNull registeredClients,

        @androidx.annotation.NonNull icdCounter,

        @androidx.annotation.NonNull clientsSupportedPerFabric,

        @androidx.annotation.NonNull userActiveModeTriggerHint,

        @androidx.annotation.NonNull userActiveModeTriggerInstruction,

        @androidx.annotation.NonNull operatingMode,

        @androidx.annotation.NonNull maximumCheckInBackOff,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

        public companion object {
            public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
        }

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.IcdManagement.Command> {
        @androidx.annotation.NonNull RegisterClient,

        @androidx.annotation.NonNull UnregisterClient,

        @androidx.annotation.NonNull StayActiveRequest;

        public final val tag: kotlin.UInt /* compiled code */
    }
}
