// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface HasConnectivityState {
    public companion object {
        internal final fun computeSourceConnectivity(sourceConnectivityList: kotlin.collections.List<com.google.home.SourceConnectivity>): com.google.home.SourceConnectivity { /* compiled code */ }

        internal final fun computeConnectivityAggregate(connectivityStateList: kotlin.collections.List<com.google.home.ConnectivityState>): com.google.home.ConnectivityState { /* compiled code */ }

        internal final fun computeDataSourceLocalityForDevice(localityTypeList: kotlin.collections.List<com.google.home.LocalityType>): com.google.home.LocalityType { /* compiled code */ }
    }

    public abstract val sourceConnectivity: com.google.home.SourceConnectivity
}
