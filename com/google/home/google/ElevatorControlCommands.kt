// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ElevatorControlCommands {
    public abstract suspend fun callElevator(floorName: kotlin.String): kotlin.Unit

    public abstract fun callElevatorBatchable(floorName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>
}
