// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public sealed interface NodeCandidate {
    public abstract val entity: com.google.home.HasId

    public abstract val types: kotlin.collections.List<com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>>

    public abstract val trait: com.google.home.TraitFactory<out com.google.home.Trait>

    @kotlin.Deprecated public abstract val fields: kotlin.collections.Map<kotlin.String, com.google.home.automation.FieldDetails>

    public abstract val fieldDetailsMap: kotlin.collections.Map<com.google.home.Field, com.google.home.automation.FieldDetails>

    public abstract val unsupportedReasons: kotlin.collections.List<com.google.home.automation.UnsupportedCandidateReason>
}
