// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class MicrowaveOvenDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.MicrowaveOvenDevice.GoogleTraits, standardTraits: com.google.home.matter.standard.MicrowaveOvenDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.MicrowaveOvenDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.MicrowaveOvenDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.MicrowaveOvenDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.MicrowaveOvenDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedModeSelect: com.google.home.google.ExtendedModeSelect?, cook: com.google.home.google.Cook?, timer: com.google.home.google.Timer?) {
        public final val extendedModeSelect: com.google.home.google.ExtendedModeSelect? /* compiled code */

        public final val cook: com.google.home.google.Cook? /* compiled code */

        public final val timer: com.google.home.google.Timer? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(microwaveOvenMode: com.google.home.matter.standard.MicrowaveOvenMode?, microwaveOvenControl: com.google.home.matter.standard.MicrowaveOvenControl?, operationalState: com.google.home.matter.standard.OperationalState?, identify: com.google.home.matter.standard.Identify?, fanControl: com.google.home.matter.standard.FanControl?) {
        public final val microwaveOvenMode: com.google.home.matter.standard.MicrowaveOvenMode? /* compiled code */

        public final val microwaveOvenControl: com.google.home.matter.standard.MicrowaveOvenControl? /* compiled code */

        public final val operationalState: com.google.home.matter.standard.OperationalState? /* compiled code */

        public final val identify: com.google.home.matter.standard.Identify? /* compiled code */

        public final val fanControl: com.google.home.matter.standard.FanControl? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.MicrowaveOvenDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.MicrowaveOvenDevice { /* compiled code */ }
    }
}

