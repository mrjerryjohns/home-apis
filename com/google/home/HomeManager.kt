// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface HomeManager : com.google.home.HasHomeDevices, com.google.home.HasStructures, com.google.home.HasRooms {
    public abstract fun ghpCoreMetadata(): kotlinx.coroutines.flow.SharedFlow<com.google.home.GhpCoreMetadata>
}

