// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class BridgedNodeDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, standardTraits: com.google.home.matter.standard.BridgedNodeDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.BridgedNodeDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.BridgedNodeDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.BridgedNodeDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class StandardTraits public constructor(bridgedDeviceBasicInformation: com.google.home.matter.standard.BridgedDeviceBasicInformation?, powerSourceConfiguration: com.google.home.matter.standard.PowerSourceConfiguration?, powerSource: com.google.home.matter.standard.PowerSource?) {
        public final val bridgedDeviceBasicInformation: com.google.home.matter.standard.BridgedDeviceBasicInformation? /* compiled code */

        public final val powerSourceConfiguration: com.google.home.matter.standard.PowerSourceConfiguration? /* compiled code */

        public final val powerSource: com.google.home.matter.standard.PowerSource? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.BridgedNodeDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.BridgedNodeDevice { /* compiled code */ }
    }
}

