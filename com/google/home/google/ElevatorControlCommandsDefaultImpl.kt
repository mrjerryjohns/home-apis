// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ElevatorControlCommandsDefaultImpl : com.google.home.google.ElevatorControlCommands {
    public open suspend fun callElevator(floorName: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun callElevatorBatchable(floorName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

