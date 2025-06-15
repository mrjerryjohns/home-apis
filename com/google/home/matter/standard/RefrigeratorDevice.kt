// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class RefrigeratorDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.RefrigeratorDevice.GoogleTraits, standardTraits: com.google.home.matter.standard.RefrigeratorDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.RefrigeratorDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.RefrigeratorDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.RefrigeratorDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.RefrigeratorDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedTemperatureControl: com.google.home.google.ExtendedTemperatureControl?) {
        public final val extendedTemperatureControl: com.google.home.google.ExtendedTemperatureControl? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(identify: com.google.home.matter.standard.Identify?, refrigeratorAndTemperatureControlledCabinetMode: com.google.home.matter.standard.RefrigeratorAndTemperatureControlledCabinetMode?, refrigeratorAlarm: com.google.home.matter.standard.RefrigeratorAlarm?) {
        public final val identify: com.google.home.matter.standard.Identify? /* compiled code */

        public final val refrigeratorAndTemperatureControlledCabinetMode: com.google.home.matter.standard.RefrigeratorAndTemperatureControlledCabinetMode? /* compiled code */

        public final val refrigeratorAlarm: com.google.home.matter.standard.RefrigeratorAlarm? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.RefrigeratorDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.RefrigeratorDevice { /* compiled code */ }
    }
}

