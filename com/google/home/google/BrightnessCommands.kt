// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface BrightnessCommands {
    public abstract suspend fun moveToBrightness(brightnessPercent: kotlin.UByte): kotlin.Unit

    public abstract suspend fun brightnessStep(stepMode: com.google.home.google.BrightnessTrait.BrightnessStepModeEnum, step: kotlin.UByte): kotlin.Unit

    public abstract fun moveToBrightnessBatchable(brightnessPercent: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun brightnessStepBatchable(stepMode: com.google.home.google.BrightnessTrait.BrightnessStepModeEnum, step: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>
}

