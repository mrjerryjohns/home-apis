// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ColorControl : com.google.home.matter.standard.ColorControlTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.ColorControl, com.google.home.matter.standard.ColorControlTrait.MutableAttributes>, com.google.home.matter.standard.ColorControlCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.ColorControl> {
        public final val currentHue: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val currentSaturation: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val remainingTime: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val currentX: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val currentY: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val driftCompensation: com.google.home.automation.Attribute<com.google.home.matter.standard.ColorControlTrait.DriftCompensationEnum?> /* compiled code */
            public final get

        public final val compensationText: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val colorTemperatureMireds: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val colorMode: com.google.home.automation.Attribute<com.google.home.matter.standard.ColorControlTrait.ColorModeEnum?> /* compiled code */
            public final get

        public final val options: com.google.home.automation.Attribute<com.google.home.matter.standard.ColorControlTrait.OptionsBitmap?> /* compiled code */
            public final get

        public final val numberOfPrimaries: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val primary1X: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val primary1Y: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val primary1Intensity: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val primary2X: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val primary2Y: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val primary2Intensity: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val primary3X: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val primary3Y: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val primary3Intensity: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val primary4X: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val primary4Y: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val primary4Intensity: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val primary5X: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val primary5Y: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val primary5Intensity: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val primary6X: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val primary6Y: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val primary6Intensity: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val whitePointX: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val whitePointY: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val colorPointRx: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val colorPointRy: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val colorPointRIntensity: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val colorPointGx: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val colorPointGy: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val colorPointGIntensity: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val colorPointBx: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val colorPointBy: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val colorPointBIntensity: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val enhancedCurrentHue: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val enhancedColorMode: com.google.home.automation.Attribute<com.google.home.matter.standard.ColorControlTrait.EnhancedColorModeEnum?> /* compiled code */
            public final get

        public final val colorLoopActive: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val colorLoopDirection: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val colorLoopTime: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val colorLoopStartEnhancedHue: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val colorLoopStoredEnhancedHue: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val colorCapabilities: com.google.home.automation.Attribute<com.google.home.matter.standard.ColorControlTrait.ColorCapabilitiesBitmap?> /* compiled code */
            public final get

        public final val colorTempPhysicalMinMireds: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val colorTempPhysicalMaxMireds: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val coupleColorTempToLevelMinMireds: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val startUpColorTemperatureMireds: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.ColorControlTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.currentHue: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.currentSaturation: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.remainingTime: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.currentX: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.currentY: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.driftCompensation: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ColorControlTrait.DriftCompensationEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.compensationText: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorTemperatureMireds: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorMode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ColorControlTrait.ColorModeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.options: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ColorControlTrait.OptionsBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.numberOfPrimaries: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary1X: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary1Y: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary1Intensity: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary2X: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary2Y: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary2Intensity: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary3X: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary3Y: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary3Intensity: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary4X: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary4Y: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary4Intensity: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary5X: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary5Y: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary5Intensity: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary6X: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary6Y: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.primary6Intensity: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.whitePointX: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.whitePointY: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorPointRx: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorPointRy: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorPointRIntensity: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorPointGx: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorPointGy: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorPointGIntensity: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorPointBx: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorPointBy: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorPointBIntensity: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.enhancedCurrentHue: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.enhancedColorMode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ColorControlTrait.EnhancedColorModeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorLoopActive: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorLoopDirection: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorLoopTime: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorLoopStartEnhancedHue: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorLoopStoredEnhancedHue: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorCapabilities: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ColorControlTrait.ColorCapabilitiesBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorTempPhysicalMinMireds: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.colorTempPhysicalMaxMireds: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.coupleColorTempToLevelMinMireds: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.startUpColorTemperatureMireds: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ColorControlTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ColorControl?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setOptions(value: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setWhitePointX(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setWhitePointY(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setColorPointRx(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setColorPointRy(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setColorPointRIntensity(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setColorPointGx(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setColorPointGy(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setColorPointGIntensity(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setColorPointBx(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setColorPointBy(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setColorPointBIntensity(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ColorControl>.setStartUpColorTemperatureMireds(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun moveToHue(hue: kotlin.UByte, direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveHue(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun stepHue(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveToSaturation(saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveSaturation(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun stepSaturation(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveToHueAndSaturation(hue: kotlin.UByte, saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveToColor(colorX: kotlin.UShort, colorY: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveColor(rateX: kotlin.Short, rateY: kotlin.Short, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun stepColor(stepX: kotlin.Short, stepY: kotlin.Short, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveToColorTemperature(colorTemperatureMireds: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun enhancedMoveToHue(enhancedHue: kotlin.UShort, direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun enhancedMoveHue(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun enhancedStepHue(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun enhancedMoveToHueAndSaturation(enhancedHue: kotlin.UShort, saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun colorLoopSet(updateFlags: com.google.home.matter.standard.ColorControlTrait.UpdateFlagsBitmap, action: com.google.home.matter.standard.ColorControlTrait.ColorLoopActionEnum, direction: com.google.home.matter.standard.ColorControlTrait.ColorLoopDirectionEnum, time: kotlin.UShort, startHue: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun stopMoveStep(optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveColorTemperature(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UShort, colorTemperatureMinimumMireds: kotlin.UShort, colorTemperatureMaximumMireds: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun stepColorTemperature(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UShort, transitionTime: kotlin.UShort, colorTemperatureMinimumMireds: kotlin.UShort, colorTemperatureMaximumMireds: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.ColorControl> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.ColorControl.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.ColorControl.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControl.Attribute> {
        @androidx.annotation.NonNull currentHue,

        @androidx.annotation.NonNull currentSaturation,

        @androidx.annotation.NonNull remainingTime,

        @androidx.annotation.NonNull currentX,

        @androidx.annotation.NonNull currentY,

        @androidx.annotation.NonNull driftCompensation,

        @androidx.annotation.NonNull compensationText,

        @androidx.annotation.NonNull colorTemperatureMireds,

        @androidx.annotation.NonNull colorMode,

        @androidx.annotation.NonNull options,

        @androidx.annotation.NonNull numberOfPrimaries,

        @androidx.annotation.NonNull primary1X,

        @androidx.annotation.NonNull primary1Y,

        @androidx.annotation.NonNull primary1Intensity,

        @androidx.annotation.NonNull primary2X,

        @androidx.annotation.NonNull primary2Y,

        @androidx.annotation.NonNull primary2Intensity,

        @androidx.annotation.NonNull primary3X,

        @androidx.annotation.NonNull primary3Y,

        @androidx.annotation.NonNull primary3Intensity,

        @androidx.annotation.NonNull primary4X,

        @androidx.annotation.NonNull primary4Y,

        @androidx.annotation.NonNull primary4Intensity,

        @androidx.annotation.NonNull primary5X,

        @androidx.annotation.NonNull primary5Y,

        @androidx.annotation.NonNull primary5Intensity,

        @androidx.annotation.NonNull primary6X,

        @androidx.annotation.NonNull primary6Y,

        @androidx.annotation.NonNull primary6Intensity,

        @androidx.annotation.NonNull whitePointX,

        @androidx.annotation.NonNull whitePointY,

        @androidx.annotation.NonNull colorPointRx,

        @androidx.annotation.NonNull colorPointRy,

        @androidx.annotation.NonNull colorPointRIntensity,

        @androidx.annotation.NonNull colorPointGx,

        @androidx.annotation.NonNull colorPointGy,

        @androidx.annotation.NonNull colorPointGIntensity,

        @androidx.annotation.NonNull colorPointBx,

        @androidx.annotation.NonNull colorPointBy,

        @androidx.annotation.NonNull colorPointBIntensity,

        @androidx.annotation.NonNull enhancedCurrentHue,

        @androidx.annotation.NonNull enhancedColorMode,

        @androidx.annotation.NonNull colorLoopActive,

        @androidx.annotation.NonNull colorLoopDirection,

        @androidx.annotation.NonNull colorLoopTime,

        @androidx.annotation.NonNull colorLoopStartEnhancedHue,

        @androidx.annotation.NonNull colorLoopStoredEnhancedHue,

        @androidx.annotation.NonNull colorCapabilities,

        @androidx.annotation.NonNull colorTempPhysicalMinMireds,

        @androidx.annotation.NonNull colorTempPhysicalMaxMireds,

        @androidx.annotation.NonNull coupleColorTempToLevelMinMireds,

        @androidx.annotation.NonNull startUpColorTemperatureMireds,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.ColorControl.Command> {
        @androidx.annotation.NonNull MoveToHue,

        @androidx.annotation.NonNull MoveHue,

        @androidx.annotation.NonNull StepHue,

        @androidx.annotation.NonNull MoveToSaturation,

        @androidx.annotation.NonNull MoveSaturation,

        @androidx.annotation.NonNull StepSaturation,

        @androidx.annotation.NonNull MoveToHueAndSaturation,

        @androidx.annotation.NonNull MoveToColor,

        @androidx.annotation.NonNull MoveColor,

        @androidx.annotation.NonNull StepColor,

        @androidx.annotation.NonNull MoveToColorTemperature,

        @androidx.annotation.NonNull EnhancedMoveToHue,

        @androidx.annotation.NonNull EnhancedMoveHue,

        @androidx.annotation.NonNull EnhancedStepHue,

        @androidx.annotation.NonNull EnhancedMoveToHueAndSaturation,

        @androidx.annotation.NonNull ColorLoopSet,

        @androidx.annotation.NonNull StopMoveStep,

        @androidx.annotation.NonNull MoveColorTemperature,

        @androidx.annotation.NonNull StepColorTemperature;

        public final val tag: kotlin.UInt /* compiled code */
    }
}
