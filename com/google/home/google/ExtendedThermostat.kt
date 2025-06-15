// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedThermostat : com.google.home.google.ExtendedThermostatTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.google.ExtendedThermostat, com.google.home.google.ExtendedThermostatTrait.MutableAttributes>, com.google.home.google.ExtendedThermostatCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.ExtendedThermostat> {
        public final val minHeatSafetySetpointLimit: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val maxHeatSafetySetpointLimit: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val minCoolSafetySetpointLimit: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val maxCoolSafetySetpointLimit: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val extendedSupportedModes: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode>?> /* compiled code */
            public final get

        public final val extendedRunningMode: com.google.home.automation.Attribute<com.google.home.google.ExtendedThermostatTrait.ExtendedRunningMode?> /* compiled code */
            public final get

        public final val presets: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.Preset>?> /* compiled code */
            public final get

        public final val maxSetpointHoldSeconds: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
            public final get

        public final val targetTemperatureTimestampSeconds: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val activePresetHandle: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val averageLocalTemperature: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val remoteTemperatureSensorIds: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val maxSettableThermostatTemperatureSensors: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val activeRemoteTemperatureSensorIds: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val temperatureSetpointHoldExpiryTimestampSeconds: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val extendedSetpointChangeSource: com.google.home.automation.Attribute<com.google.home.google.ExtendedThermostatTrait.ExtendedSetpointChangeSource?> /* compiled code */
            public final get

        public final val extendedProgrammingOperationMode: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val extendedSystemMode: com.google.home.automation.Attribute<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatFeature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.minHeatSafetySetpointLimit: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.maxHeatSafetySetpointLimit: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.minCoolSafetySetpointLimit: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.maxCoolSafetySetpointLimit: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.extendedSupportedModes: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.extendedRunningMode: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedThermostatTrait.ExtendedRunningMode?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.presets: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.Preset>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.maxSetpointHoldSeconds: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.targetTemperatureTimestampSeconds: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.activePresetHandle: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.averageLocalTemperature: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.remoteTemperatureSensorIds: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.maxSettableThermostatTemperatureSensors: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.activeRemoteTemperatureSensorIds: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.temperatureSetpointHoldExpiryTimestampSeconds: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.extendedSetpointChangeSource: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedThermostatTrait.ExtendedSetpointChangeSource?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.extendedProgrammingOperationMode: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.extendedSystemMode: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatFeature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedThermostat?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.google.ExtendedThermostat>.setActivePresetHandle(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.google.ExtendedThermostat>.setActiveRemoteTemperatureSensorIds(value: kotlin.collections.List<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.google.ExtendedThermostat>.setExtendedSystemMode(value: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode): kotlin.Unit { /* compiled code */ }

        public final fun notifySensorStateChange(sensorType: com.google.home.google.ExtendedThermostatTrait.SensorType, alarmType: com.google.home.google.ExtendedThermostatTrait.AlarmType): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.ExtendedThermostat> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.ExtendedThermostat.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.ExtendedThermostat.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedThermostat.Attribute> {
        @androidx.annotation.NonNull minHeatSafetySetpointLimit,

        @androidx.annotation.NonNull maxHeatSafetySetpointLimit,

        @androidx.annotation.NonNull minCoolSafetySetpointLimit,

        @androidx.annotation.NonNull maxCoolSafetySetpointLimit,

        @androidx.annotation.NonNull extendedSupportedModes,

        @androidx.annotation.NonNull extendedRunningMode,

        @androidx.annotation.NonNull presets,

        @androidx.annotation.NonNull maxSetpointHoldSeconds,

        @androidx.annotation.NonNull targetTemperatureTimestampSeconds,

        @androidx.annotation.NonNull activePresetHandle,

        @androidx.annotation.NonNull averageLocalTemperature,

        @androidx.annotation.NonNull remoteTemperatureSensorIds,

        @androidx.annotation.NonNull maxSettableThermostatTemperatureSensors,

        @androidx.annotation.NonNull activeRemoteTemperatureSensorIds,

        @androidx.annotation.NonNull temperatureSetpointHoldExpiryTimestampSeconds,

        @androidx.annotation.NonNull extendedSetpointChangeSource,

        @androidx.annotation.NonNull extendedProgrammingOperationMode,

        @androidx.annotation.NonNull extendedSystemMode,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.ExtendedThermostat.Command> {
        @androidx.annotation.NonNull NotifySensorStateChange;

        public final val tag: kotlin.UInt /* compiled code */
    }
}

