// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface RotationCommands {
    public abstract suspend fun rotateToDegrees(rotationDegrees: kotlin.Float): kotlin.Unit

    public abstract suspend fun rotateToPercentage(rotationPercent: kotlin.Float): kotlin.Unit

    public abstract fun rotateToDegreesBatchable(rotationDegrees: kotlin.Float): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun rotateToPercentageBatchable(rotationPercent: kotlin.Float): com.google.home.BatchableCommand<kotlin.Unit>
}
