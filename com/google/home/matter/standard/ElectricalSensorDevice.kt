// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ElectricalSensorDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, standardTraits: com.google.home.matter.standard.ElectricalSensorDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.ElectricalSensorDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.ElectricalSensorDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.ElectricalSensorDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class StandardTraits public constructor(powerTopology: com.google.home.matter.standard.PowerTopology?, electricalPowerMeasurement: com.google.home.matter.standard.ElectricalPowerMeasurement?, electricalEnergyMeasurement: com.google.home.matter.standard.ElectricalEnergyMeasurement?) {
        public final val powerTopology: com.google.home.matter.standard.PowerTopology? /* compiled code */

        public final val electricalPowerMeasurement: com.google.home.matter.standard.ElectricalPowerMeasurement? /* compiled code */

        public final val electricalEnergyMeasurement: com.google.home.matter.standard.ElectricalEnergyMeasurement? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.ElectricalSensorDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.ElectricalSensorDevice { /* compiled code */ }
    }
}

