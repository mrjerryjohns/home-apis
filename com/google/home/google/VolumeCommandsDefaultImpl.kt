// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface VolumeCommandsDefaultImpl : com.google.home.google.VolumeCommands {
    public open suspend fun moveToVolume(volumePercent: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun volumeStep(stepMode: com.google.home.google.VolumeTrait.VolumeStepModeEnum, step: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun mute(): kotlin.Unit { /* compiled code */ }

    public open suspend fun unmute(): kotlin.Unit { /* compiled code */ }

    public open fun moveToVolumeBatchable(volumePercent: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun volumeStepBatchable(stepMode: com.google.home.google.VolumeTrait.VolumeStepModeEnum, step: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun muteBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun unmuteBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

