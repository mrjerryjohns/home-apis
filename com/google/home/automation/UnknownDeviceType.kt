// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public final class UnknownDeviceType public constructor(metadata: com.google.home.DeviceType.Metadata = COMPILED_CODE) : com.google.home.DeviceType {
    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType> /* compiled code */
        public open get

    public final class UnknownDeviceTypeFactory public constructor(id: kotlin.String) : com.google.home.DeviceTypeFactory<com.google.home.automation.UnknownDeviceType> {
        public final val id: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }
    }

    private final class Factory public constructor(typeId: com.google.home.Id, traits: kotlin.collections.List<com.google.home.TraitFactory<*>> = COMPILED_CODE) : com.google.home.InternalDeviceTypeFactory<com.google.home.automation.UnknownDeviceType> {
        public open val typeId: com.google.home.Id /* compiled code */

        public open val traits: kotlin.collections.List<com.google.home.TraitFactory<*>> /* compiled code */
    }
}
