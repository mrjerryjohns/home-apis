// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ThreadNetworkDiagnosticsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Attributes) : com.google.home.matter.standard.ThreadNetworkDiagnostics, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val activeNetworkFaultsList: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>? /* compiled code */

    public open val activeTimestamp: kotlin.ULong? /* compiled code */

    public open val attachAttemptCount: kotlin.UShort? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val betterPartitionAttachAttemptCount: kotlin.UShort? /* compiled code */

    public open val channel: kotlin.UShort? /* compiled code */

    public open val channelPage0Mask: kotlin.ByteArray? /* compiled code */

    public open val childRoleCount: kotlin.UShort? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val dataVersion: kotlin.UShort? /* compiled code */

    public open val delay: kotlin.UInt? /* compiled code */

    public open val detachedRoleCount: kotlin.UShort? /* compiled code */

    public open val extendedPanId: kotlin.ULong? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val leaderRoleCount: kotlin.UShort? /* compiled code */

    public open val leaderRouterId: kotlin.UByte? /* compiled code */

    public open val meshLocalPrefix: kotlin.ByteArray? /* compiled code */

    public open val neighborTable: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct>? /* compiled code */

    public open val networkName: kotlin.String? /* compiled code */

    public open val operationalDatasetComponents: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents? /* compiled code */

    public open val overrunCount: kotlin.ULong? /* compiled code */

    public open val panId: kotlin.UShort? /* compiled code */

    public open val parentChangeCount: kotlin.UShort? /* compiled code */

    public open val partitionId: kotlin.UInt? /* compiled code */

    public open val partitionIdChangeCount: kotlin.UShort? /* compiled code */

    public open val pendingTimestamp: kotlin.ULong? /* compiled code */

    public open val routeTable: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct>? /* compiled code */

    public open val routerRoleCount: kotlin.UShort? /* compiled code */

    public open val routingRole: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RoutingRoleEnum? /* compiled code */

    public open val rxAddressFilteredCount: kotlin.UInt? /* compiled code */

    public open val rxBeaconCount: kotlin.UInt? /* compiled code */

    public open val rxBeaconRequestCount: kotlin.UInt? /* compiled code */

    public open val rxBroadcastCount: kotlin.UInt? /* compiled code */

    public open val rxDataCount: kotlin.UInt? /* compiled code */

    public open val rxDataPollCount: kotlin.UInt? /* compiled code */

    public open val rxDestAddrFilteredCount: kotlin.UInt? /* compiled code */

    public open val rxDuplicatedCount: kotlin.UInt? /* compiled code */

    public open val rxErrFcsCount: kotlin.UInt? /* compiled code */

    public open val rxErrInvalidSrcAddrCount: kotlin.UInt? /* compiled code */

    public open val rxErrNoFrameCount: kotlin.UInt? /* compiled code */

    public open val rxErrOtherCount: kotlin.UInt? /* compiled code */

    public open val rxErrSecCount: kotlin.UInt? /* compiled code */

    public open val rxErrUnknownNeighborCount: kotlin.UInt? /* compiled code */

    public open val rxOtherCount: kotlin.UInt? /* compiled code */

    public open val rxTotalCount: kotlin.UInt? /* compiled code */

    public open val rxUnicastCount: kotlin.UInt? /* compiled code */

    public open val securityPolicy: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy? /* compiled code */

    public open val stableDataVersion: kotlin.UShort? /* compiled code */

    public open val txAckRequestedCount: kotlin.UInt? /* compiled code */

    public open val txAckedCount: kotlin.UInt? /* compiled code */

    public open val txBeaconCount: kotlin.UInt? /* compiled code */

    public open val txBeaconRequestCount: kotlin.UInt? /* compiled code */

    public open val txBroadcastCount: kotlin.UInt? /* compiled code */

    public open val txDataCount: kotlin.UInt? /* compiled code */

    public open val txDataPollCount: kotlin.UInt? /* compiled code */

    public open val txDirectMaxRetryExpiryCount: kotlin.UInt? /* compiled code */

    public open val txErrAbortCount: kotlin.UInt? /* compiled code */

    public open val txErrBusyChannelCount: kotlin.UInt? /* compiled code */

    public open val txErrCcaCount: kotlin.UInt? /* compiled code */

    public open val txIndirectMaxRetryExpiryCount: kotlin.UInt? /* compiled code */

    public open val txNoAckRequestedCount: kotlin.UInt? /* compiled code */

    public open val txOtherCount: kotlin.UInt? /* compiled code */

    public open val txRetryCount: kotlin.UInt? /* compiled code */

    public open val txTotalCount: kotlin.UInt? /* compiled code */

    public open val txUnicastCount: kotlin.UInt? /* compiled code */

    public open val weighting: kotlin.UShort? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.ThreadNetworkDiagnostics.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.ThreadNetworkDiagnostics.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun resetCounts(): kotlin.Unit { /* compiled code */ }

    public open fun resetCountsBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
