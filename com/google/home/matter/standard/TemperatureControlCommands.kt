// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface TemperatureControlCommands {
    public abstract suspend fun setTemperature(optionalArgs: com.google.home.matter.standard.TemperatureControlTrait.SetTemperatureCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract fun setTemperatureBatchable(optionalArgs: com.google.home.matter.standard.TemperatureControlTrait.SetTemperatureCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>
}

