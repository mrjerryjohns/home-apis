// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class DishwasherDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.DishwasherDevice.GoogleTraits, standardTraits: com.google.home.matter.standard.DishwasherDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.DishwasherDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.DishwasherDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.DishwasherDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.DishwasherDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedOperationalState: com.google.home.google.ExtendedOperationalState?, extendedTemperatureControl: com.google.home.google.ExtendedTemperatureControl?) {
        public final val extendedOperationalState: com.google.home.google.ExtendedOperationalState? /* compiled code */

        public final val extendedTemperatureControl: com.google.home.google.ExtendedTemperatureControl? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(operationalState: com.google.home.matter.standard.OperationalState?, identify: com.google.home.matter.standard.Identify?, onOff: com.google.home.matter.standard.OnOff?, temperatureControl: com.google.home.matter.standard.TemperatureControl?, dishwasherMode: com.google.home.matter.standard.DishwasherMode?, dishwasherAlarm: com.google.home.matter.standard.DishwasherAlarm?) {
        public final val operationalState: com.google.home.matter.standard.OperationalState? /* compiled code */

        public final val identify: com.google.home.matter.standard.Identify? /* compiled code */

        public final val onOff: com.google.home.matter.standard.OnOff? /* compiled code */

        public final val temperatureControl: com.google.home.matter.standard.TemperatureControl? /* compiled code */

        public final val dishwasherMode: com.google.home.matter.standard.DishwasherMode? /* compiled code */

        public final val dishwasherAlarm: com.google.home.matter.standard.DishwasherAlarm? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.DishwasherDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.DishwasherDevice { /* compiled code */ }
    }
}

