// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface WindowCoveringCommands {
    public abstract suspend fun upOrOpen(): kotlin.Unit

    public abstract suspend fun downOrClose(): kotlin.Unit

    public abstract suspend fun stopMotion(): kotlin.Unit

    public abstract suspend fun goToLiftValue(liftValue: kotlin.UShort): kotlin.Unit

    public abstract suspend fun goToLiftPercentage(liftPercent100thsValue: kotlin.UShort): kotlin.Unit

    public abstract suspend fun goToTiltValue(tiltValue: kotlin.UShort): kotlin.Unit

    public abstract suspend fun goToTiltPercentage(tiltPercent100thsValue: kotlin.UShort): kotlin.Unit

    public abstract fun upOrOpenBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun downOrCloseBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stopMotionBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun goToLiftValueBatchable(liftValue: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun goToLiftPercentageBatchable(liftPercent100thsValue: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun goToTiltValueBatchable(tiltValue: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun goToTiltPercentageBatchable(tiltPercent100thsValue: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>
}

