// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface SimplifiedThermostatCommands {
    public abstract suspend fun setSystemMode(systemMode: com.google.home.google.SimplifiedThermostatTrait.SystemModeEnum): kotlin.Unit

    public abstract fun setSystemModeBatchable(systemMode: com.google.home.google.SimplifiedThermostatTrait.SystemModeEnum): com.google.home.BatchableCommand<kotlin.Unit>
}

