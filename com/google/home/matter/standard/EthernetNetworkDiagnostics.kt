// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface EthernetNetworkDiagnostics : com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.EthernetNetworkDiagnosticsCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.EthernetNetworkDiagnostics> {
        public final val phyRate: com.google.home.automation.Attribute<com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.PhyRateEnum?> /* compiled code */
            public final get

        public final val fullDuplex: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val packetRxCount: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val packetTxCount: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val txErrCount: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val collisionCount: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val overrunCount: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val carrierDetect: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val timeSinceReset: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.phyRate: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.PhyRateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.fullDuplex: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.packetRxCount: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.packetTxCount: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.txErrCount: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.collisionCount: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.overrunCount: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.carrierDetect: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.timeSinceReset: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EthernetNetworkDiagnostics?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun resetCounts(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.EthernetNetworkDiagnostics> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.EthernetNetworkDiagnostics.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.EthernetNetworkDiagnostics.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EthernetNetworkDiagnostics.Attribute> {
        @androidx.annotation.NonNull phyRate,

        @androidx.annotation.NonNull fullDuplex,

        @androidx.annotation.NonNull packetRxCount,

        @androidx.annotation.NonNull packetTxCount,

        @androidx.annotation.NonNull txErrCount,

        @androidx.annotation.NonNull collisionCount,

        @androidx.annotation.NonNull overrunCount,

        @androidx.annotation.NonNull carrierDetect,

        @androidx.annotation.NonNull timeSinceReset,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.EthernetNetworkDiagnostics.Command> {
        @androidx.annotation.NonNull ResetCounts;

        public final val tag: kotlin.UInt /* compiled code */
    }
}
