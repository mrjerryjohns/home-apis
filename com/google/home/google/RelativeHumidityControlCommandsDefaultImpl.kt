// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface RelativeHumidityControlCommandsDefaultImpl : com.google.home.google.RelativeHumidityControlCommands {
    public open suspend fun setRelativeHumidity(humidity: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open suspend fun stepRelativeHumidity(relativeHumidityPercent: kotlin.UInt, relativeHumidityWeight: kotlin.UInt, stepMode: com.google.home.google.RelativeHumidityControlTrait.StepMode): kotlin.Unit { /* compiled code */ }

    public open fun setRelativeHumidityBatchable(humidity: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stepRelativeHumidityBatchable(relativeHumidityPercent: kotlin.UInt, relativeHumidityWeight: kotlin.UInt, stepMode: com.google.home.google.RelativeHumidityControlTrait.StepMode): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

