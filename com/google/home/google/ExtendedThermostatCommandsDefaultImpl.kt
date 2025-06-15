// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedThermostatCommandsDefaultImpl : com.google.home.google.ExtendedThermostatCommands {
    public open suspend fun notifySensorStateChange(sensorType: com.google.home.google.ExtendedThermostatTrait.SensorType, alarmType: com.google.home.google.ExtendedThermostatTrait.AlarmType): kotlin.Unit { /* compiled code */ }

    public open fun notifySensorStateChangeBatchable(sensorType: com.google.home.google.ExtendedThermostatTrait.SensorType, alarmType: com.google.home.google.ExtendedThermostatTrait.AlarmType): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

