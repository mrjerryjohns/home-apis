// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface RotationCommandsDefaultImpl : com.google.home.google.RotationCommands {
    public open suspend fun rotateToDegrees(rotationDegrees: kotlin.Float): kotlin.Unit { /* compiled code */ }

    public open suspend fun rotateToPercentage(rotationPercent: kotlin.Float): kotlin.Unit { /* compiled code */ }

    public open fun rotateToDegreesBatchable(rotationDegrees: kotlin.Float): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun rotateToPercentageBatchable(rotationPercent: kotlin.Float): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
