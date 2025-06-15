// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class LaundryDryerDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.LaundryDryerDevice.GoogleTraits, standardTraits: com.google.home.matter.standard.LaundryDryerDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.LaundryDryerDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.LaundryDryerDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.LaundryDryerDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.LaundryDryerDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedOperationalState: com.google.home.google.ExtendedOperationalState?, timer: com.google.home.google.Timer?, toggles: com.google.home.google.Toggles?) {
        public final val extendedOperationalState: com.google.home.google.ExtendedOperationalState? /* compiled code */

        public final val timer: com.google.home.google.Timer? /* compiled code */

        public final val toggles: com.google.home.google.Toggles? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(operationalState: com.google.home.matter.standard.OperationalState?, identify: com.google.home.matter.standard.Identify?, onOff: com.google.home.matter.standard.OnOff?, laundryDryerControls: com.google.home.matter.standard.LaundryDryerControls?, laundryWasherMode: com.google.home.matter.standard.LaundryWasherMode?, temperatureControl: com.google.home.matter.standard.TemperatureControl?) {
        public final val operationalState: com.google.home.matter.standard.OperationalState? /* compiled code */

        public final val identify: com.google.home.matter.standard.Identify? /* compiled code */

        public final val onOff: com.google.home.matter.standard.OnOff? /* compiled code */

        public final val laundryDryerControls: com.google.home.matter.standard.LaundryDryerControls? /* compiled code */

        public final val laundryWasherMode: com.google.home.matter.standard.LaundryWasherMode? /* compiled code */

        public final val temperatureControl: com.google.home.matter.standard.TemperatureControl? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.LaundryDryerDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.LaundryDryerDevice { /* compiled code */ }
    }
}

