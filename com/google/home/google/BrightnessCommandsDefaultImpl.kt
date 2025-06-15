// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface BrightnessCommandsDefaultImpl : com.google.home.google.BrightnessCommands {
    public open suspend fun moveToBrightness(brightnessPercent: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun brightnessStep(stepMode: com.google.home.google.BrightnessTrait.BrightnessStepModeEnum, step: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open fun moveToBrightnessBatchable(brightnessPercent: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun brightnessStepBatchable(stepMode: com.google.home.google.BrightnessTrait.BrightnessStepModeEnum, step: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

