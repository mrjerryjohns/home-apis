// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface Room : com.google.home.HasId, com.google.home.HasHomeDevices, com.google.home.automation.HasCandidates {
    public abstract val name: kotlin.String

    public abstract val structureId: com.google.home.Id

    public abstract suspend fun structure(): com.google.home.Structure

    public abstract suspend fun setName(name: kotlin.String): com.google.home.Room
}
