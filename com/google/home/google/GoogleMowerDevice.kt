// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class GoogleMowerDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.google.GoogleMowerDevice.GoogleTraits, standardTraits: com.google.home.google.GoogleMowerDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.google.GoogleMowerDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.google.GoogleMowerDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.google.GoogleMowerDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.google.GoogleMowerDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(dock: com.google.home.google.Dock?, extendedOperationalState: com.google.home.google.ExtendedOperationalState?, locator: com.google.home.google.Locator?, extendedPowerSource: com.google.home.google.ExtendedPowerSource?) {
        public final val dock: com.google.home.google.Dock? /* compiled code */

        public final val extendedOperationalState: com.google.home.google.ExtendedOperationalState? /* compiled code */

        public final val locator: com.google.home.google.Locator? /* compiled code */

        public final val extendedPowerSource: com.google.home.google.ExtendedPowerSource? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(onOff: com.google.home.matter.standard.OnOff?, operationalState: com.google.home.matter.standard.OperationalState?, powerSource: com.google.home.matter.standard.PowerSource?) {
        public final val onOff: com.google.home.matter.standard.OnOff? /* compiled code */

        public final val operationalState: com.google.home.matter.standard.OperationalState? /* compiled code */

        public final val powerSource: com.google.home.matter.standard.PowerSource? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.google.GoogleMowerDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.google.GoogleMowerDevice { /* compiled code */ }
    }
}
