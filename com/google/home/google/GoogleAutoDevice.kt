// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class GoogleAutoDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.google.GoogleAutoDevice.GoogleTraits, standardTraits: com.google.home.google.GoogleAutoDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.google.GoogleAutoDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.google.GoogleAutoDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.google.GoogleAutoDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.google.GoogleAutoDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(lockUnlock: com.google.home.google.LockUnlock?, extendedOperationalState: com.google.home.google.ExtendedOperationalState?, extendedPowerSource: com.google.home.google.ExtendedPowerSource?, toggles: com.google.home.google.Toggles?, extendedModeSelect: com.google.home.google.ExtendedModeSelect?) {
        public final val lockUnlock: com.google.home.google.LockUnlock? /* compiled code */

        public final val extendedOperationalState: com.google.home.google.ExtendedOperationalState? /* compiled code */

        public final val extendedPowerSource: com.google.home.google.ExtendedPowerSource? /* compiled code */

        public final val toggles: com.google.home.google.Toggles? /* compiled code */

        public final val extendedModeSelect: com.google.home.google.ExtendedModeSelect? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(operationalState: com.google.home.matter.standard.OperationalState?, powerSource: com.google.home.matter.standard.PowerSource?) {
        public final val operationalState: com.google.home.matter.standard.OperationalState? /* compiled code */

        public final val powerSource: com.google.home.matter.standard.PowerSource? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.google.GoogleAutoDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.google.GoogleAutoDevice { /* compiled code */ }
    }
}

