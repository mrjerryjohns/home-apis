// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedThermostatCommands {
    public abstract suspend fun notifySensorStateChange(sensorType: com.google.home.google.ExtendedThermostatTrait.SensorType, alarmType: com.google.home.google.ExtendedThermostatTrait.AlarmType): kotlin.Unit

    public abstract fun notifySensorStateChangeBatchable(sensorType: com.google.home.google.ExtendedThermostatTrait.SensorType, alarmType: com.google.home.google.ExtendedThermostatTrait.AlarmType): com.google.home.BatchableCommand<kotlin.Unit>
}
