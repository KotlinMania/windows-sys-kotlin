@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.windowssys.core.HRESULT

public actual fun AddPointerInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerid: UInt): HRESULT =
    0

public actual fun BufferPointerPacketsInteractionContext(interactioncontext: HINTERACTIONCONTEXT, entriescount: UInt, pointerinfo: Long): HRESULT =
    0

public actual fun CreateInteractionContext(interactioncontext: Long): HRESULT =
    0

public actual fun DestroyInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    0

public actual fun GetCrossSlideParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, threshold: CROSS_SLIDE_THRESHOLD, distance: Long): HRESULT =
    0

public actual fun GetHoldParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: HOLD_PARAMETER, value: Long): HRESULT =
    0

public actual fun GetInertiaParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, inertiaparameter: INERTIA_PARAMETER, value: Long): HRESULT =
    0

public actual fun GetInteractionConfigurationInteractionContext(interactioncontext: HINTERACTIONCONTEXT, configurationcount: UInt, configuration: Long): HRESULT =
    0

public actual fun GetMouseWheelParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: MOUSE_WHEEL_PARAMETER, value: Long): HRESULT =
    0

public actual fun GetPropertyInteractionContext(interactioncontext: HINTERACTIONCONTEXT, contextproperty: INTERACTION_CONTEXT_PROPERTY, value: Long): HRESULT =
    0

public actual fun GetStateInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerinfo: Long, state: Long): HRESULT =
    0

public actual fun GetTapParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TAP_PARAMETER, value: Long): HRESULT =
    0

public actual fun GetTranslationParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TRANSLATION_PARAMETER, value: Long): HRESULT =
    0

public actual fun ProcessBufferedPacketsInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    0

public actual fun ProcessInertiaInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    0

public actual fun ProcessPointerFramesInteractionContext(interactioncontext: HINTERACTIONCONTEXT, entriescount: UInt, pointercount: UInt, pointerinfo: Long): HRESULT =
    0

public actual fun RegisterOutputCallbackInteractionContext(interactioncontext: HINTERACTIONCONTEXT, outputcallback: INTERACTION_CONTEXT_OUTPUT_CALLBACK, clientdata: Long): HRESULT =
    0

public actual fun RegisterOutputCallbackInteractionContext2(interactioncontext: HINTERACTIONCONTEXT, outputcallback: INTERACTION_CONTEXT_OUTPUT_CALLBACK2, clientdata: Long): HRESULT =
    0

public actual fun RemovePointerInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerid: UInt): HRESULT =
    0

public actual fun ResetInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    0

public actual fun SetCrossSlideParametersInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parametercount: UInt, crossslideparameters: Long): HRESULT =
    0

public actual fun SetHoldParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: HOLD_PARAMETER, value: Float): HRESULT =
    0

public actual fun SetInertiaParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, inertiaparameter: INERTIA_PARAMETER, value: Float): HRESULT =
    0

public actual fun SetInteractionConfigurationInteractionContext(interactioncontext: HINTERACTIONCONTEXT, configurationcount: UInt, configuration: Long): HRESULT =
    0

public actual fun SetMouseWheelParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: MOUSE_WHEEL_PARAMETER, value: Float): HRESULT =
    0

public actual fun SetPivotInteractionContext(interactioncontext: HINTERACTIONCONTEXT, x: Float, y: Float, radius: Float): HRESULT =
    0

public actual fun SetPropertyInteractionContext(interactioncontext: HINTERACTIONCONTEXT, contextproperty: INTERACTION_CONTEXT_PROPERTY, value: UInt): HRESULT =
    0

public actual fun SetTapParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TAP_PARAMETER, value: Float): HRESULT =
    0

public actual fun SetTranslationParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TRANSLATION_PARAMETER, value: Float): HRESULT =
    0

public actual fun StopInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    0
