package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult

public expect fun addPointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult

public expect fun bufferPointerPacketsInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointerinfo: ConstPtr<Input.Pointer.PointerInfo>): Hresult

public expect fun createInteractionContext(interactioncontext: MutPtr<Hinteractioncontext>): Hresult

public expect fun destroyInteractionContext(interactioncontext: Hinteractioncontext): Hresult

public expect fun getCrossSlideParameterInteractionContext(interactioncontext: Hinteractioncontext, threshold: CrossSlideThreshold, distance: MutPtr<Float>): Hresult

public expect fun getHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: MutPtr<Float>): Hresult

public expect fun getInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: MutPtr<Float>): Hresult

public expect fun getInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: MutPtr<InteractionContextConfiguration>): Hresult

public expect fun getMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: MutPtr<Float>): Hresult

public expect fun getPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: MutPtr<UInt>): Hresult

public expect fun getStateInteractionContext(interactioncontext: Hinteractioncontext, pointerinfo: ConstPtr<Input.Pointer.PointerInfo>, state: MutPtr<InteractionState>): Hresult

public expect fun getTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: MutPtr<Float>): Hresult

public expect fun getTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: MutPtr<Float>): Hresult

public expect fun processBufferedPacketsInteractionContext(interactioncontext: Hinteractioncontext): Hresult

public expect fun processInertiaInteractionContext(interactioncontext: Hinteractioncontext): Hresult

public expect fun processPointerFramesInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointercount: UInt, pointerinfo: ConstPtr<Input.Pointer.PointerInfo>): Hresult

public expect fun registerOutputCallbackInteractionContext(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback, clientdata: ConstPtr<CVoid>): Hresult

public expect fun registerOutputCallbackInteractionContext2(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback2, clientdata: ConstPtr<CVoid>): Hresult

public expect fun removePointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult

public expect fun resetInteractionContext(interactioncontext: Hinteractioncontext): Hresult

public expect fun setCrossSlideParametersInteractionContext(interactioncontext: Hinteractioncontext, parametercount: UInt, crossslideparameters: ConstPtr<CrossSlideParameter>): Hresult

public expect fun setHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: Float): Hresult

public expect fun setInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: Float): Hresult

public expect fun setInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: ConstPtr<InteractionContextConfiguration>): Hresult

public expect fun setMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: Float): Hresult

public expect fun setPivotInteractionContext(interactioncontext: Hinteractioncontext, x: Float, y: Float, radius: Float): Hresult

public expect fun setPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: UInt): Hresult

public expect fun setTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: Float): Hresult

public expect fun setTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: Float): Hresult

public expect fun stopInteractionContext(interactioncontext: Hinteractioncontext): Hresult
