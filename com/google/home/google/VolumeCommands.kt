// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface VolumeCommands {
    public abstract suspend fun moveToVolume(volumePercent: kotlin.UByte): kotlin.Unit

    public abstract suspend fun volumeStep(stepMode: com.google.home.google.VolumeTrait.VolumeStepModeEnum, step: kotlin.UByte): kotlin.Unit

    public abstract suspend fun mute(): kotlin.Unit

    public abstract suspend fun unmute(): kotlin.Unit

    public abstract fun moveToVolumeBatchable(volumePercent: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun volumeStepBatchable(stepMode: com.google.home.google.VolumeTrait.VolumeStepModeEnum, step: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun muteBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun unmuteBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}

