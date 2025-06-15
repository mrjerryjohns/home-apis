// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface TemperatureControlCommandsDefaultImpl : com.google.home.matter.standard.TemperatureControlCommands {
    public open suspend fun setTemperature(optionalArgs: com.google.home.matter.standard.TemperatureControlTrait.SetTemperatureCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun setTemperatureBatchable(optionalArgs: com.google.home.matter.standard.TemperatureControlTrait.SetTemperatureCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

