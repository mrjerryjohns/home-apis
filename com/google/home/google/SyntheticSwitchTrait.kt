// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object SyntheticSwitchTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public interface ButtonPress {
        public abstract val pressCount: kotlin.UInt?

        public abstract val latchPosition: kotlin.UInt?
    }

    public final class ButtonPressImpl public constructor(pressCount: kotlin.UInt? = COMPILED_CODE, latchPosition: kotlin.UInt? = COMPILED_CODE) : com.google.home.google.SyntheticSwitchTrait.ButtonPress {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SyntheticSwitchTrait.ButtonPress> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SyntheticSwitchTrait.ButtonPress): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SyntheticSwitchTrait.ButtonPress { /* compiled code */ }
        }

        public open val pressCount: kotlin.UInt? /* compiled code */

        public open val latchPosition: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface LongPressStart {
    }

    public final class LongPressStartImpl public constructor() : com.google.home.google.SyntheticSwitchTrait.LongPressStart {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SyntheticSwitchTrait.LongPressStart> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SyntheticSwitchTrait.LongPressStartImpl { /* compiled code */ }
        }
    }

    public interface LongPressRelease {
    }

    public final class LongPressReleaseImpl public constructor() : com.google.home.google.SyntheticSwitchTrait.LongPressRelease {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SyntheticSwitchTrait.LongPressRelease> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SyntheticSwitchTrait.LongPressReleaseImpl { /* compiled code */ }
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SyntheticSwitchTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SyntheticSwitchTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SyntheticSwitchTrait.Attributes { /* compiled code */ }
        }

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.SyntheticSwitchTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.SyntheticSwitchTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.SyntheticSwitchTrait.Attributes) { /* compiled code */ }

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.SyntheticSwitchTrait.AttributesImpl { /* compiled code */ }
    }
}

