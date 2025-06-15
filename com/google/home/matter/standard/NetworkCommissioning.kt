// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface NetworkCommissioning : com.google.home.matter.standard.NetworkCommissioningTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.NetworkCommissioning, com.google.home.matter.standard.NetworkCommissioningTrait.MutableAttributes>, com.google.home.matter.standard.NetworkCommissioningCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.NetworkCommissioning> {
        public final val maxNetworks: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val networks: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct>?> /* compiled code */
            public final get

        public final val scanMaxTimeSeconds: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val connectMaxTimeSeconds: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val interfaceEnabled: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val lastNetworkingStatus: com.google.home.automation.Attribute<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum?> /* compiled code */
            public final get

        public final val lastNetworkId: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val lastConnectErrorValue: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
            public final get

        public final val supportedWiFiBands: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiBandEnum>?> /* compiled code */
            public final get

        public final val supportedThreadFeatures: com.google.home.automation.Attribute<com.google.home.matter.standard.NetworkCommissioningTrait.ThreadCapabilitiesBitmap?> /* compiled code */
            public final get

        public final val threadVersion: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.NetworkCommissioningTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.maxNetworks: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.networks: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.scanMaxTimeSeconds: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.connectMaxTimeSeconds: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.interfaceEnabled: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.lastNetworkingStatus: com.google.home.automation.TypedExpression<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.lastNetworkId: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.lastConnectErrorValue: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.supportedWiFiBands: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiBandEnum>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.supportedThreadFeatures: com.google.home.automation.TypedExpression<com.google.home.matter.standard.NetworkCommissioningTrait.ThreadCapabilitiesBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.threadVersion: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.NetworkCommissioningTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioning?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.NetworkCommissioning>.setInterfaceEnabled(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun scanNetworks(optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun addOrUpdateWiFiNetwork(ssid: kotlin.ByteArray, credentials: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun addOrUpdateThreadNetwork(operationalDataset: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun removeNetwork(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun connectNetwork(networkId: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun reorderNetwork(networkId: kotlin.ByteArray, networkIndex: kotlin.UByte, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun queryIdentity(keyIdentifier: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.NetworkCommissioning> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.NetworkCommissioning.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.NetworkCommissioning.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioning.Attribute> {
        @androidx.annotation.NonNull maxNetworks,

        @androidx.annotation.NonNull networks,

        @androidx.annotation.NonNull scanMaxTimeSeconds,

        @androidx.annotation.NonNull connectMaxTimeSeconds,

        @androidx.annotation.NonNull interfaceEnabled,

        @androidx.annotation.NonNull lastNetworkingStatus,

        @androidx.annotation.NonNull lastNetworkId,

        @androidx.annotation.NonNull lastConnectErrorValue,

        @androidx.annotation.NonNull supportedWiFiBands,

        @androidx.annotation.NonNull supportedThreadFeatures,

        @androidx.annotation.NonNull threadVersion,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.NetworkCommissioning.Command> {
        @androidx.annotation.NonNull ScanNetworks,

        @androidx.annotation.NonNull AddOrUpdateWiFiNetwork,

        @androidx.annotation.NonNull AddOrUpdateThreadNetwork,

        @androidx.annotation.NonNull RemoveNetwork,

        @androidx.annotation.NonNull ConnectNetwork,

        @androidx.annotation.NonNull ReorderNetwork,

        @androidx.annotation.NonNull QueryIdentity;

        public final val tag: kotlin.UInt /* compiled code */
    }
}
