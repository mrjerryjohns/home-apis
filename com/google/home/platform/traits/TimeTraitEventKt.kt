// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object TimeTraitEventKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.TimeTraitEvent.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.TimeTraitEvent.Builder): com.google.home.platform.traits.TimeTraitEventKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.TimeTraitEvent.Builder /* compiled code */

        public final var scheduledEvent: com.google.home.platform.traits.TimeTrait.ScheduledEvent /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.TimeTrait.ScheduledEvent) {/* compiled code */ }

        public final var delayedEvent: com.google.home.platform.traits.TimeTrait.DelayedEvent /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.TimeTrait.DelayedEvent) {/* compiled code */ }

        public final var recurringClockTimeScheduledEvent: com.google.home.platform.traits.TimeTrait.RecurringClockTimeScheduledEvent /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.TimeTrait.RecurringClockTimeScheduledEvent) {/* compiled code */ }

        public final var recurringSolarTimeScheduledEvent: com.google.home.platform.traits.TimeTrait.RecurringSolarTimeScheduledEvent /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.TimeTrait.RecurringSolarTimeScheduledEvent) {/* compiled code */ }

        public final val eventCase: com.google.home.platform.traits.TimeTraitEvent.EventCase /* compiled code */
            public final @kotlin.jvm.JvmName get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.TimeTraitEvent { /* compiled code */ }

        public final fun clearScheduledEvent(): kotlin.Unit { /* compiled code */ }

        public final fun hasScheduledEvent(): kotlin.Boolean { /* compiled code */ }

        public final fun clearDelayedEvent(): kotlin.Unit { /* compiled code */ }

        public final fun hasDelayedEvent(): kotlin.Boolean { /* compiled code */ }

        public final fun clearRecurringClockTimeScheduledEvent(): kotlin.Unit { /* compiled code */ }

        public final fun hasRecurringClockTimeScheduledEvent(): kotlin.Boolean { /* compiled code */ }

        public final fun clearRecurringSolarTimeScheduledEvent(): kotlin.Unit { /* compiled code */ }

        public final fun hasRecurringSolarTimeScheduledEvent(): kotlin.Boolean { /* compiled code */ }

        public final fun clearEvent(): kotlin.Unit { /* compiled code */ }
    }
}
