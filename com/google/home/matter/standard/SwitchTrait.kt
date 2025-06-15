// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object SwitchTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class Feature public constructor(latchingSwitch: kotlin.Boolean = COMPILED_CODE, momentarySwitch: kotlin.Boolean = COMPILED_CODE, momentarySwitchRelease: kotlin.Boolean = COMPILED_CODE, momentarySwitchLongPress: kotlin.Boolean = COMPILED_CODE, momentarySwitchMultiPress: kotlin.Boolean = COMPILED_CODE, actionSwitch: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.SwitchTrait.Feature> {
            private const final val LATCHING_SWITCH_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MOMENTARY_SWITCH_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MOMENTARY_SWITCH_RELEASE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MOMENTARY_SWITCH_LONG_PRESS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MOMENTARY_SWITCH_MULTI_PRESS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ACTION_SWITCH_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.SwitchTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.SwitchTrait.Feature { /* compiled code */ }
        }

        public final val latchingSwitch: kotlin.Boolean /* compiled code */

        public final val momentarySwitch: kotlin.Boolean /* compiled code */

        public final val momentarySwitchRelease: kotlin.Boolean /* compiled code */

        public final val momentarySwitchLongPress: kotlin.Boolean /* compiled code */

        public final val momentarySwitchMultiPress: kotlin.Boolean /* compiled code */

        public final val actionSwitch: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(latchingSwitch: kotlin.Boolean = COMPILED_CODE, momentarySwitch: kotlin.Boolean = COMPILED_CODE, momentarySwitchRelease: kotlin.Boolean = COMPILED_CODE, momentarySwitchLongPress: kotlin.Boolean = COMPILED_CODE, momentarySwitchMultiPress: kotlin.Boolean = COMPILED_CODE, actionSwitch: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.SwitchTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class GoogleSyntheticFeatures public constructor(hasSyntheticEvents: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.SwitchTrait.GoogleSyntheticFeatures> {
            private const final val HAS_SYNTHETIC_EVENTS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.SwitchTrait.GoogleSyntheticFeatures): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.SwitchTrait.GoogleSyntheticFeatures { /* compiled code */ }
        }

        public final val hasSyntheticEvents: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(hasSyntheticEvents: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.SwitchTrait.GoogleSyntheticFeatures { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface SwitchLatched {
        public abstract val newPosition: kotlin.UByte?
    }

    public final class SwitchLatchedImpl public constructor(newPosition: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.SwitchTrait.SwitchLatched {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SwitchTrait.SwitchLatched> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SwitchTrait.SwitchLatched): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SwitchTrait.SwitchLatched { /* compiled code */ }
        }

        public open val newPosition: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface InitialPress {
        public abstract val newPosition: kotlin.UByte?
    }

    public final class InitialPressImpl public constructor(newPosition: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.SwitchTrait.InitialPress {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SwitchTrait.InitialPress> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SwitchTrait.InitialPress): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SwitchTrait.InitialPress { /* compiled code */ }
        }

        public open val newPosition: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface LongPress {
        public abstract val newPosition: kotlin.UByte?
    }

    public final class LongPressImpl public constructor(newPosition: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.SwitchTrait.LongPress {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SwitchTrait.LongPress> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SwitchTrait.LongPress): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SwitchTrait.LongPress { /* compiled code */ }
        }

        public open val newPosition: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface ShortRelease {
        public abstract val previousPosition: kotlin.UByte?
    }

    public final class ShortReleaseImpl public constructor(previousPosition: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.SwitchTrait.ShortRelease {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SwitchTrait.ShortRelease> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SwitchTrait.ShortRelease): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SwitchTrait.ShortRelease { /* compiled code */ }
        }

        public open val previousPosition: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface LongRelease {
        public abstract val previousPosition: kotlin.UByte?
    }

    public final class LongReleaseImpl public constructor(previousPosition: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.SwitchTrait.LongRelease {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SwitchTrait.LongRelease> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SwitchTrait.LongRelease): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SwitchTrait.LongRelease { /* compiled code */ }
        }

        public open val previousPosition: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface MultiPressOngoing {
        public abstract val newPosition: kotlin.UByte?

        public abstract val currentNumberOfPressesCounted: kotlin.UByte?
    }

    public final class MultiPressOngoingImpl public constructor(newPosition: kotlin.UByte? = COMPILED_CODE, currentNumberOfPressesCounted: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.SwitchTrait.MultiPressOngoing {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SwitchTrait.MultiPressOngoing> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SwitchTrait.MultiPressOngoing): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SwitchTrait.MultiPressOngoing { /* compiled code */ }
        }

        public open val newPosition: kotlin.UByte? /* compiled code */

        public open val currentNumberOfPressesCounted: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface MultiPressComplete {
        public abstract val previousPosition: kotlin.UByte?

        public abstract val totalNumberOfPressesCounted: kotlin.UByte?
    }

    public final class MultiPressCompleteImpl public constructor(previousPosition: kotlin.UByte? = COMPILED_CODE, totalNumberOfPressesCounted: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.SwitchTrait.MultiPressComplete {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SwitchTrait.MultiPressComplete> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SwitchTrait.MultiPressComplete): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SwitchTrait.MultiPressComplete { /* compiled code */ }
        }

        public open val previousPosition: kotlin.UByte? /* compiled code */

        public open val totalNumberOfPressesCounted: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface SyntheticButtonPress {
        public abstract val pressCount: kotlin.UInt?

        public abstract val latchPosition: kotlin.UInt?
    }

    public final class SyntheticButtonPressImpl public constructor(pressCount: kotlin.UInt? = COMPILED_CODE, latchPosition: kotlin.UInt? = COMPILED_CODE) : com.google.home.matter.standard.SwitchTrait.SyntheticButtonPress {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SwitchTrait.SyntheticButtonPress> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SwitchTrait.SyntheticButtonPress): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SwitchTrait.SyntheticButtonPress { /* compiled code */ }
        }

        public open val pressCount: kotlin.UInt? /* compiled code */

        public open val latchPosition: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface SyntheticLongPressStart {
    }

    public final class SyntheticLongPressStartImpl public constructor() : com.google.home.matter.standard.SwitchTrait.SyntheticLongPressStart {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SwitchTrait.SyntheticLongPressStart> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SwitchTrait.SyntheticLongPressStartImpl { /* compiled code */ }
        }
    }

    public interface SyntheticLongPressRelease {
    }

    public final class SyntheticLongPressReleaseImpl public constructor() : com.google.home.matter.standard.SwitchTrait.SyntheticLongPressRelease {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SwitchTrait.SyntheticLongPressRelease> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SwitchTrait.SyntheticLongPressReleaseImpl { /* compiled code */ }
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SwitchTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SwitchTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SwitchTrait.Attributes { /* compiled code */ }
        }

        public abstract val numberOfPositions: kotlin.UByte?

        public abstract val currentPosition: kotlin.UByte?

        public abstract val multiPressMax: kotlin.UByte?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.SwitchTrait.Feature

        public abstract val clusterRevision: kotlin.UShort

        public abstract val googleSyntheticFeatures: com.google.home.matter.standard.SwitchTrait.GoogleSyntheticFeatures?
    }

    public open class AttributesImpl public constructor(numberOfPositions: kotlin.UByte? = COMPILED_CODE, currentPosition: kotlin.UByte? = COMPILED_CODE, multiPressMax: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.SwitchTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE, googleSyntheticFeatures: com.google.home.matter.standard.SwitchTrait.GoogleSyntheticFeatures? = COMPILED_CODE) : com.google.home.matter.standard.SwitchTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.SwitchTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.SwitchTrait.Attributes) { /* compiled code */ }

        public open val numberOfPositions: kotlin.UByte? /* compiled code */

        public open val currentPosition: kotlin.UByte? /* compiled code */

        public open val multiPressMax: kotlin.UByte? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.SwitchTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open val googleSyntheticFeatures: com.google.home.matter.standard.SwitchTrait.GoogleSyntheticFeatures? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(numberOfPositions: kotlin.UByte? = COMPILED_CODE, currentPosition: kotlin.UByte? = COMPILED_CODE, multiPressMax: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.SwitchTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE, googleSyntheticFeatures: com.google.home.matter.standard.SwitchTrait.GoogleSyntheticFeatures? = COMPILED_CODE): com.google.home.matter.standard.SwitchTrait.AttributesImpl { /* compiled code */ }
    }
}

