package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.windowssys.core.HRESULT

public expect fun AddPointerInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerid: UInt): HRESULT

public expect fun BufferPointerPacketsInteractionContext(interactioncontext: HINTERACTIONCONTEXT, entriescount: UInt, pointerinfo: Long): HRESULT

public expect fun CreateInteractionContext(interactioncontext: Long): HRESULT

public expect fun DestroyInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT

public expect fun GetCrossSlideParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, threshold: CROSS_SLIDE_THRESHOLD, distance: Long): HRESULT

public expect fun GetHoldParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: HOLD_PARAMETER, value: Long): HRESULT

public expect fun GetInertiaParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, inertiaparameter: INERTIA_PARAMETER, value: Long): HRESULT

public expect fun GetInteractionConfigurationInteractionContext(interactioncontext: HINTERACTIONCONTEXT, configurationcount: UInt, configuration: Long): HRESULT

public expect fun GetMouseWheelParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: MOUSE_WHEEL_PARAMETER, value: Long): HRESULT

public expect fun GetPropertyInteractionContext(interactioncontext: HINTERACTIONCONTEXT, contextproperty: INTERACTION_CONTEXT_PROPERTY, value: Long): HRESULT

public expect fun GetStateInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerinfo: Long, state: Long): HRESULT

public expect fun GetTapParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TAP_PARAMETER, value: Long): HRESULT

public expect fun GetTranslationParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TRANSLATION_PARAMETER, value: Long): HRESULT

public expect fun ProcessBufferedPacketsInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT

public expect fun ProcessInertiaInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT

public expect fun ProcessPointerFramesInteractionContext(interactioncontext: HINTERACTIONCONTEXT, entriescount: UInt, pointercount: UInt, pointerinfo: Long): HRESULT

public expect fun RegisterOutputCallbackInteractionContext(interactioncontext: HINTERACTIONCONTEXT, outputcallback: INTERACTION_CONTEXT_OUTPUT_CALLBACK, clientdata: Long): HRESULT

public expect fun RegisterOutputCallbackInteractionContext2(interactioncontext: HINTERACTIONCONTEXT, outputcallback: INTERACTION_CONTEXT_OUTPUT_CALLBACK2, clientdata: Long): HRESULT

public expect fun RemovePointerInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerid: UInt): HRESULT

public expect fun ResetInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT

public expect fun SetCrossSlideParametersInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parametercount: UInt, crossslideparameters: Long): HRESULT

public expect fun SetHoldParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: HOLD_PARAMETER, value: Float): HRESULT

public expect fun SetInertiaParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, inertiaparameter: INERTIA_PARAMETER, value: Float): HRESULT

public expect fun SetInteractionConfigurationInteractionContext(interactioncontext: HINTERACTIONCONTEXT, configurationcount: UInt, configuration: Long): HRESULT

public expect fun SetMouseWheelParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: MOUSE_WHEEL_PARAMETER, value: Float): HRESULT

public expect fun SetPivotInteractionContext(interactioncontext: HINTERACTIONCONTEXT, x: Float, y: Float, radius: Float): HRESULT

public expect fun SetPropertyInteractionContext(interactioncontext: HINTERACTIONCONTEXT, contextproperty: INTERACTION_CONTEXT_PROPERTY, value: UInt): HRESULT

public expect fun SetTapParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TAP_PARAMETER, value: Float): HRESULT

public expect fun SetTranslationParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TRANSLATION_PARAMETER, value: Float): HRESULT

public expect fun StopInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT
