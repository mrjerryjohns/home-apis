// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface HasDeviceTypes {
    public abstract fun <T : com.google.home.DeviceType> has(type: com.google.home.DeviceTypeFactory<T>): kotlin.Boolean

    public abstract fun <T : com.google.home.DeviceType> type(type: com.google.home.DeviceTypeFactory<T>): kotlinx.coroutines.flow.Flow<T>

    public abstract fun <T : com.google.home.DeviceType> typeOrNull(type: com.google.home.DeviceTypeFactory<T>): kotlinx.coroutines.flow.Flow<T?>

    public abstract fun types(): kotlinx.coroutines.flow.Flow<kotlin.collections.Set<com.google.home.DeviceType>>
}
