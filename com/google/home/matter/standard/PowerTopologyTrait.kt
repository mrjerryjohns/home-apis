// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object PowerTopologyTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class Feature public constructor(nodeTopology: kotlin.Boolean = COMPILED_CODE, treeTopology: kotlin.Boolean = COMPILED_CODE, setTopology: kotlin.Boolean = COMPILED_CODE, dynamicPowerFlow: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.PowerTopologyTrait.Feature> {
            private const final val NODE_TOPOLOGY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TREE_TOPOLOGY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SET_TOPOLOGY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val DYNAMIC_POWER_FLOW_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.PowerTopologyTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.PowerTopologyTrait.Feature { /* compiled code */ }
        }

        public final val nodeTopology: kotlin.Boolean /* compiled code */

        public final val treeTopology: kotlin.Boolean /* compiled code */

        public final val setTopology: kotlin.Boolean /* compiled code */

        public final val dynamicPowerFlow: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(nodeTopology: kotlin.Boolean = COMPILED_CODE, treeTopology: kotlin.Boolean = COMPILED_CODE, setTopology: kotlin.Boolean = COMPILED_CODE, dynamicPowerFlow: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.PowerTopologyTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PowerTopologyTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.PowerTopologyTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PowerTopologyTrait.Attributes { /* compiled code */ }
        }

        public abstract val availableEndpoints: kotlin.collections.List<kotlin.UShort>?

        public abstract val activeEndpoints: kotlin.collections.List<kotlin.UShort>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.PowerTopologyTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(availableEndpoints: kotlin.collections.List<kotlin.UShort>? = COMPILED_CODE, activeEndpoints: kotlin.collections.List<kotlin.UShort>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.PowerTopologyTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.PowerTopologyTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.PowerTopologyTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.PowerTopologyTrait.Attributes) { /* compiled code */ }

        public open val availableEndpoints: kotlin.collections.List<kotlin.UShort>? /* compiled code */

        public open val activeEndpoints: kotlin.collections.List<kotlin.UShort>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.PowerTopologyTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(availableEndpoints: kotlin.collections.List<kotlin.UShort>? = COMPILED_CODE, activeEndpoints: kotlin.collections.List<kotlin.UShort>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.PowerTopologyTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.PowerTopologyTrait.AttributesImpl { /* compiled code */ }
    }
}

