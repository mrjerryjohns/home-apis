// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ThreadNetworkDiagnostics : com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.ThreadNetworkDiagnosticsCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.ThreadNetworkDiagnostics> {
        public final val channel: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val routingRole: com.google.home.automation.Attribute<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RoutingRoleEnum?> /* compiled code */
            public final get

        public final val networkName: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val panId: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val extendedPanId: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val meshLocalPrefix: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val overrunCount: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val neighborTable: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct>?> /* compiled code */
            public final get

        public final val routeTable: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct>?> /* compiled code */
            public final get

        public final val partitionId: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val weighting: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val dataVersion: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val stableDataVersion: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val leaderRouterId: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val detachedRoleCount: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val childRoleCount: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val routerRoleCount: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val leaderRoleCount: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val attachAttemptCount: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val partitionIdChangeCount: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val betterPartitionAttachAttemptCount: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val parentChangeCount: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val txTotalCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txUnicastCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txBroadcastCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txAckRequestedCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txAckedCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txNoAckRequestedCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txDataCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txDataPollCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txBeaconCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txBeaconRequestCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txOtherCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txRetryCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txDirectMaxRetryExpiryCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txIndirectMaxRetryExpiryCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txErrCcaCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txErrAbortCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val txErrBusyChannelCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxTotalCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxUnicastCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxBroadcastCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxDataCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxDataPollCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxBeaconCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxBeaconRequestCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxOtherCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxAddressFilteredCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxDestAddrFilteredCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxDuplicatedCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxErrNoFrameCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxErrUnknownNeighborCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxErrInvalidSrcAddrCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxErrSecCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxErrFcsCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val rxErrOtherCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val activeTimestamp: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val pendingTimestamp: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val delay: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val securityPolicy: com.google.home.automation.Attribute<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy?> /* compiled code */
            public final get

        public final val channelPage0Mask: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val operationalDatasetComponents: com.google.home.automation.Attribute<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?> /* compiled code */
            public final get

        public final val activeNetworkFaultsList: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.channel: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.routingRole: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RoutingRoleEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.networkName: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.panId: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.extendedPanId: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.meshLocalPrefix: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.overrunCount: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.neighborTable: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.routeTable: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.partitionId: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.weighting: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.dataVersion: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.stableDataVersion: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.leaderRouterId: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.detachedRoleCount: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.childRoleCount: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.routerRoleCount: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.leaderRoleCount: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.attachAttemptCount: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.partitionIdChangeCount: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.betterPartitionAttachAttemptCount: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.parentChangeCount: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txTotalCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txUnicastCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txBroadcastCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txAckRequestedCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txAckedCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txNoAckRequestedCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txDataCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txDataPollCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txBeaconCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txBeaconRequestCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txOtherCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txRetryCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txDirectMaxRetryExpiryCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txIndirectMaxRetryExpiryCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txErrCcaCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txErrAbortCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.txErrBusyChannelCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxTotalCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxUnicastCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxBroadcastCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxDataCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxDataPollCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxBeaconCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxBeaconRequestCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxOtherCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxAddressFilteredCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxDestAddrFilteredCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxDuplicatedCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxErrNoFrameCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxErrUnknownNeighborCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxErrInvalidSrcAddrCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxErrSecCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxErrFcsCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.rxErrOtherCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.activeTimestamp: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.pendingTimestamp: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.delay: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.securityPolicy: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.channelPage0Mask: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.operationalDatasetComponents: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.activeNetworkFaultsList: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun resetCounts(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.ThreadNetworkDiagnostics> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.ThreadNetworkDiagnostics.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.ThreadNetworkDiagnostics.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThreadNetworkDiagnostics.Attribute> {
        @androidx.annotation.NonNull channel,

        @androidx.annotation.NonNull routingRole,

        @androidx.annotation.NonNull networkName,

        @androidx.annotation.NonNull panId,

        @androidx.annotation.NonNull extendedPanId,

        @androidx.annotation.NonNull meshLocalPrefix,

        @androidx.annotation.NonNull overrunCount,

        @androidx.annotation.NonNull neighborTable,

        @androidx.annotation.NonNull routeTable,

        @androidx.annotation.NonNull partitionId,

        @androidx.annotation.NonNull weighting,

        @androidx.annotation.NonNull dataVersion,

        @androidx.annotation.NonNull stableDataVersion,

        @androidx.annotation.NonNull leaderRouterId,

        @androidx.annotation.NonNull detachedRoleCount,

        @androidx.annotation.NonNull childRoleCount,

        @androidx.annotation.NonNull routerRoleCount,

        @androidx.annotation.NonNull leaderRoleCount,

        @androidx.annotation.NonNull attachAttemptCount,

        @androidx.annotation.NonNull partitionIdChangeCount,

        @androidx.annotation.NonNull betterPartitionAttachAttemptCount,

        @androidx.annotation.NonNull parentChangeCount,

        @androidx.annotation.NonNull txTotalCount,

        @androidx.annotation.NonNull txUnicastCount,

        @androidx.annotation.NonNull txBroadcastCount,

        @androidx.annotation.NonNull txAckRequestedCount,

        @androidx.annotation.NonNull txAckedCount,

        @androidx.annotation.NonNull txNoAckRequestedCount,

        @androidx.annotation.NonNull txDataCount,

        @androidx.annotation.NonNull txDataPollCount,

        @androidx.annotation.NonNull txBeaconCount,

        @androidx.annotation.NonNull txBeaconRequestCount,

        @androidx.annotation.NonNull txOtherCount,

        @androidx.annotation.NonNull txRetryCount,

        @androidx.annotation.NonNull txDirectMaxRetryExpiryCount,

        @androidx.annotation.NonNull txIndirectMaxRetryExpiryCount,

        @androidx.annotation.NonNull txErrCcaCount,

        @androidx.annotation.NonNull txErrAbortCount,

        @androidx.annotation.NonNull txErrBusyChannelCount,

        @androidx.annotation.NonNull rxTotalCount,

        @androidx.annotation.NonNull rxUnicastCount,

        @androidx.annotation.NonNull rxBroadcastCount,

        @androidx.annotation.NonNull rxDataCount,

        @androidx.annotation.NonNull rxDataPollCount,

        @androidx.annotation.NonNull rxBeaconCount,

        @androidx.annotation.NonNull rxBeaconRequestCount,

        @androidx.annotation.NonNull rxOtherCount,

        @androidx.annotation.NonNull rxAddressFilteredCount,

        @androidx.annotation.NonNull rxDestAddrFilteredCount,

        @androidx.annotation.NonNull rxDuplicatedCount,

        @androidx.annotation.NonNull rxErrNoFrameCount,

        @androidx.annotation.NonNull rxErrUnknownNeighborCount,

        @androidx.annotation.NonNull rxErrInvalidSrcAddrCount,

        @androidx.annotation.NonNull rxErrSecCount,

        @androidx.annotation.NonNull rxErrFcsCount,

        @androidx.annotation.NonNull rxErrOtherCount,

        @androidx.annotation.NonNull activeTimestamp,

        @androidx.annotation.NonNull pendingTimestamp,

        @androidx.annotation.NonNull delay,

        @androidx.annotation.NonNull securityPolicy,

        @androidx.annotation.NonNull channelPage0Mask,

        @androidx.annotation.NonNull operationalDatasetComponents,

        @androidx.annotation.NonNull activeNetworkFaultsList,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

        public companion object {
            public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
        }

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.ThreadNetworkDiagnostics.Command> {
        @androidx.annotation.NonNull ResetCounts;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class ConnectionStatusEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatus) : com.google.home.Event, com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatus {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.ThreadNetworkDiagnostics.ConnectionStatusEvent> {
            public final val connectionStatus: com.google.home.automation.EventField<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatusEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics.ConnectionStatusEvent?>.connectionStatus: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatusEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatus /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val connectionStatus: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatusEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThreadNetworkDiagnostics.ConnectionStatusEvent.EventFields> {
            @androidx.annotation.NonNull connectionStatus;

            public companion object {
                public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
            }

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class NetworkFaultChangeEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultChange) : com.google.home.Event, com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultChange {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.ThreadNetworkDiagnostics.NetworkFaultChangeEvent> {
            public final val current: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>?> /* compiled code */
                public final get

            public final val previous: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics.NetworkFaultChangeEvent?>.current: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnostics.NetworkFaultChangeEvent?>.previous: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultChange /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val current: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThreadNetworkDiagnostics.NetworkFaultChangeEvent.EventFields> {
            @androidx.annotation.NonNull current,

            @androidx.annotation.NonNull previous;

            public companion object {
                public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
            }

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }
}

