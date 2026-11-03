package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT

public fun interface FnCallback {
    public operator fun invoke(clientdata: Long, output: Long)
}

public fun AddPointerInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "AddPointerInteractionContext", longArrayOf(interactioncontext, pointerid.toLong())).toInt()
}

public fun BufferPointerPacketsInteractionContext(interactioncontext: HINTERACTIONCONTEXT, entriescount: UInt, pointerinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "BufferPointerPacketsInteractionContext", longArrayOf(interactioncontext, entriescount.toLong(), pointerinfo)).toInt()
}

public fun CreateInteractionContext(interactioncontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "CreateInteractionContext", longArrayOf(interactioncontext)).toInt()
}

public fun DestroyInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "DestroyInteractionContext", longArrayOf(interactioncontext)).toInt()
}

public fun GetCrossSlideParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, threshold: CROSS_SLIDE_THRESHOLD, distance: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "GetCrossSlideParameterInteractionContext", longArrayOf(interactioncontext, threshold.toLong(), distance)).toInt()
}

public fun GetHoldParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: HOLD_PARAMETER, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "GetHoldParameterInteractionContext", longArrayOf(interactioncontext, parameter.toLong(), value)).toInt()
}

public fun GetInertiaParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, inertiaparameter: INERTIA_PARAMETER, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "GetInertiaParameterInteractionContext", longArrayOf(interactioncontext, inertiaparameter.toLong(), value)).toInt()
}

public fun GetInteractionConfigurationInteractionContext(interactioncontext: HINTERACTIONCONTEXT, configurationcount: UInt, configuration: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "GetInteractionConfigurationInteractionContext", longArrayOf(interactioncontext, configurationcount.toLong(), configuration)).toInt()
}

public fun GetMouseWheelParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: MOUSE_WHEEL_PARAMETER, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "GetMouseWheelParameterInteractionContext", longArrayOf(interactioncontext, parameter.toLong(), value)).toInt()
}

public fun GetPropertyInteractionContext(interactioncontext: HINTERACTIONCONTEXT, contextproperty: INTERACTION_CONTEXT_PROPERTY, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "GetPropertyInteractionContext", longArrayOf(interactioncontext, contextproperty.toLong(), value)).toInt()
}

public fun GetStateInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerinfo: Long, state: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "GetStateInteractionContext", longArrayOf(interactioncontext, pointerinfo, state)).toInt()
}

public fun GetTapParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TAP_PARAMETER, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "GetTapParameterInteractionContext", longArrayOf(interactioncontext, parameter.toLong(), value)).toInt()
}

public fun GetTranslationParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TRANSLATION_PARAMETER, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "GetTranslationParameterInteractionContext", longArrayOf(interactioncontext, parameter.toLong(), value)).toInt()
}

public fun ProcessBufferedPacketsInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "ProcessBufferedPacketsInteractionContext", longArrayOf(interactioncontext)).toInt()
}

public fun ProcessInertiaInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "ProcessInertiaInteractionContext", longArrayOf(interactioncontext)).toInt()
}

public fun ProcessPointerFramesInteractionContext(interactioncontext: HINTERACTIONCONTEXT, entriescount: UInt, pointercount: UInt, pointerinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "ProcessPointerFramesInteractionContext", longArrayOf(interactioncontext, entriescount.toLong(), pointercount.toLong(), pointerinfo)).toInt()
}

public fun RegisterOutputCallbackInteractionContext(interactioncontext: HINTERACTIONCONTEXT, outputcallback: INTERACTION_CONTEXT_OUTPUT_CALLBACK, clientdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "RegisterOutputCallbackInteractionContext", longArrayOf(interactioncontext, Win32DynamicFfi.objectSlot(outputcallback), clientdata)).toInt()
}

public fun RegisterOutputCallbackInteractionContext2(interactioncontext: HINTERACTIONCONTEXT, outputcallback: INTERACTION_CONTEXT_OUTPUT_CALLBACK2, clientdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "RegisterOutputCallbackInteractionContext2", longArrayOf(interactioncontext, Win32DynamicFfi.objectSlot(outputcallback), clientdata)).toInt()
}

public fun RemovePointerInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "RemovePointerInteractionContext", longArrayOf(interactioncontext, pointerid.toLong())).toInt()
}

public fun ResetInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "ResetInteractionContext", longArrayOf(interactioncontext)).toInt()
}

public fun SetCrossSlideParametersInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parametercount: UInt, crossslideparameters: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "SetCrossSlideParametersInteractionContext", longArrayOf(interactioncontext, parametercount.toLong(), crossslideparameters)).toInt()
}

public fun SetHoldParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: HOLD_PARAMETER, value: Float): HRESULT {
    return Win32DynamicFfi.invokeFp("ninput.dll", "SetHoldParameterInteractionContext", 16, false, longArrayOf(interactioncontext, parameter.toLong(), (value.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun SetInertiaParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, inertiaparameter: INERTIA_PARAMETER, value: Float): HRESULT {
    return Win32DynamicFfi.invokeFp("ninput.dll", "SetInertiaParameterInteractionContext", 16, false, longArrayOf(interactioncontext, inertiaparameter.toLong(), (value.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun SetInteractionConfigurationInteractionContext(interactioncontext: HINTERACTIONCONTEXT, configurationcount: UInt, configuration: Long): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "SetInteractionConfigurationInteractionContext", longArrayOf(interactioncontext, configurationcount.toLong(), configuration)).toInt()
}

public fun SetMouseWheelParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: MOUSE_WHEEL_PARAMETER, value: Float): HRESULT {
    return Win32DynamicFfi.invokeFp("ninput.dll", "SetMouseWheelParameterInteractionContext", 16, false, longArrayOf(interactioncontext, parameter.toLong(), (value.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun SetPivotInteractionContext(interactioncontext: HINTERACTIONCONTEXT, x: Float, y: Float, radius: Float): HRESULT {
    return Win32DynamicFfi.invokeFp("ninput.dll", "SetPivotInteractionContext", 84, false, longArrayOf(interactioncontext, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (radius.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun SetPropertyInteractionContext(interactioncontext: HINTERACTIONCONTEXT, contextproperty: INTERACTION_CONTEXT_PROPERTY, value: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "SetPropertyInteractionContext", longArrayOf(interactioncontext, contextproperty.toLong(), value.toLong())).toInt()
}

public fun SetTapParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TAP_PARAMETER, value: Float): HRESULT {
    return Win32DynamicFfi.invokeFp("ninput.dll", "SetTapParameterInteractionContext", 16, false, longArrayOf(interactioncontext, parameter.toLong(), (value.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun SetTranslationParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TRANSLATION_PARAMETER, value: Float): HRESULT {
    return Win32DynamicFfi.invokeFp("ninput.dll", "SetTranslationParameterInteractionContext", 16, false, longArrayOf(interactioncontext, parameter.toLong(), (value.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun StopInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT {
    return Win32DynamicFfi.invoke("ninput.dll", "StopInteractionContext", longArrayOf(interactioncontext)).toInt()
}
