// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface WindowCoveringCommandsDefaultImpl : com.google.home.matter.standard.WindowCoveringCommands {
    public open suspend fun upOrOpen(): kotlin.Unit { /* compiled code */ }

    public open suspend fun downOrClose(): kotlin.Unit { /* compiled code */ }

    public open suspend fun stopMotion(): kotlin.Unit { /* compiled code */ }

    public open suspend fun goToLiftValue(liftValue: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun goToLiftPercentage(liftPercent100thsValue: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun goToTiltValue(tiltValue: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun goToTiltPercentage(tiltPercent100thsValue: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open fun upOrOpenBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun downOrCloseBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopMotionBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun goToLiftValueBatchable(liftValue: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun goToLiftPercentageBatchable(liftPercent100thsValue: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun goToTiltValueBatchable(tiltValue: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun goToTiltPercentageBatchable(tiltPercent100thsValue: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
