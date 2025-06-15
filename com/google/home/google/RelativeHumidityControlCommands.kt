// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface RelativeHumidityControlCommands {
    public abstract suspend fun setRelativeHumidity(humidity: kotlin.UInt): kotlin.Unit

    public abstract suspend fun stepRelativeHumidity(relativeHumidityPercent: kotlin.UInt, relativeHumidityWeight: kotlin.UInt, stepMode: com.google.home.google.RelativeHumidityControlTrait.StepMode): kotlin.Unit

    public abstract fun setRelativeHumidityBatchable(humidity: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stepRelativeHumidityBatchable(relativeHumidityPercent: kotlin.UInt, relativeHumidityWeight: kotlin.UInt, stepMode: com.google.home.google.RelativeHumidityControlTrait.StepMode): com.google.home.BatchableCommand<kotlin.Unit>
}

