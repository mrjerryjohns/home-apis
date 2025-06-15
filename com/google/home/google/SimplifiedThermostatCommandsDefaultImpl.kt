// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface SimplifiedThermostatCommandsDefaultImpl : com.google.home.google.SimplifiedThermostatCommands {
    public open suspend fun setSystemMode(systemMode: com.google.home.google.SimplifiedThermostatTrait.SystemModeEnum): kotlin.Unit { /* compiled code */ }

    public open fun setSystemModeBatchable(systemMode: com.google.home.google.SimplifiedThermostatTrait.SystemModeEnum): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

