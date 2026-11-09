@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.windowssys.core.HRESULT

private object WindowsWin32UiInteractioncontextJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_AddPointerInteractionContext(interactioncontext: Long, pointerid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_BufferPointerPacketsInteractionContext(interactioncontext: Long, entriescount: Int, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_CreateInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_DestroyInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_GetCrossSlideParameterInteractionContext(interactioncontext: Long, threshold: Int, distance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_GetHoldParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_GetInertiaParameterInteractionContext(interactioncontext: Long, inertiaparameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_GetInteractionConfigurationInteractionContext(interactioncontext: Long, configurationcount: Int, configuration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_GetMouseWheelParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_GetPropertyInteractionContext(interactioncontext: Long, contextproperty: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_GetStateInteractionContext(interactioncontext: Long, pointerinfo: Long, state: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_GetTapParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_GetTranslationParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_ProcessBufferedPacketsInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_ProcessInertiaInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_ProcessPointerFramesInteractionContext(interactioncontext: Long, entriescount: Int, pointercount: Int, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext(interactioncontext: Long, outputcallback: Long, clientdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext2(interactioncontext: Long, outputcallback: Long, clientdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_RemovePointerInteractionContext(interactioncontext: Long, pointerid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_ResetInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_SetCrossSlideParametersInteractionContext(interactioncontext: Long, parametercount: Int, crossslideparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_SetHoldParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_SetInertiaParameterInteractionContext(interactioncontext: Long, inertiaparameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_SetInteractionConfigurationInteractionContext(interactioncontext: Long, configurationcount: Int, configuration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_SetMouseWheelParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_SetPivotInteractionContext(interactioncontext: Long, x: Float, y: Float, radius: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_SetPropertyInteractionContext(interactioncontext: Long, contextproperty: Int, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_SetTapParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_SetTranslationParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_StopInteractionContext(interactioncontext: Long): Int
}

public actual fun AddPointerInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerid: UInt): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_AddPointerInteractionContext(interactioncontext, pointerid.toInt())

public actual fun BufferPointerPacketsInteractionContext(interactioncontext: HINTERACTIONCONTEXT, entriescount: UInt, pointerinfo: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_BufferPointerPacketsInteractionContext(interactioncontext, entriescount.toInt(), pointerinfo)

public actual fun CreateInteractionContext(interactioncontext: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_CreateInteractionContext(interactioncontext)

public actual fun DestroyInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_DestroyInteractionContext(interactioncontext)

public actual fun GetCrossSlideParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, threshold: CROSS_SLIDE_THRESHOLD, distance: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_GetCrossSlideParameterInteractionContext(interactioncontext, threshold, distance)

public actual fun GetHoldParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: HOLD_PARAMETER, value: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_GetHoldParameterInteractionContext(interactioncontext, parameter, value)

public actual fun GetInertiaParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, inertiaparameter: INERTIA_PARAMETER, value: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_GetInertiaParameterInteractionContext(interactioncontext, inertiaparameter, value)

public actual fun GetInteractionConfigurationInteractionContext(interactioncontext: HINTERACTIONCONTEXT, configurationcount: UInt, configuration: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_GetInteractionConfigurationInteractionContext(interactioncontext, configurationcount.toInt(), configuration)

public actual fun GetMouseWheelParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: MOUSE_WHEEL_PARAMETER, value: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_GetMouseWheelParameterInteractionContext(interactioncontext, parameter, value)

public actual fun GetPropertyInteractionContext(interactioncontext: HINTERACTIONCONTEXT, contextproperty: INTERACTION_CONTEXT_PROPERTY, value: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_GetPropertyInteractionContext(interactioncontext, contextproperty, value)

public actual fun GetStateInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerinfo: Long, state: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_GetStateInteractionContext(interactioncontext, pointerinfo, state)

public actual fun GetTapParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TAP_PARAMETER, value: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_GetTapParameterInteractionContext(interactioncontext, parameter, value)

public actual fun GetTranslationParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TRANSLATION_PARAMETER, value: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_GetTranslationParameterInteractionContext(interactioncontext, parameter, value)

public actual fun ProcessBufferedPacketsInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_ProcessBufferedPacketsInteractionContext(interactioncontext)

public actual fun ProcessInertiaInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_ProcessInertiaInteractionContext(interactioncontext)

public actual fun ProcessPointerFramesInteractionContext(interactioncontext: HINTERACTIONCONTEXT, entriescount: UInt, pointercount: UInt, pointerinfo: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_ProcessPointerFramesInteractionContext(interactioncontext, entriescount.toInt(), pointercount.toInt(), pointerinfo)

public actual fun RegisterOutputCallbackInteractionContext(interactioncontext: HINTERACTIONCONTEXT, outputcallback: INTERACTION_CONTEXT_OUTPUT_CALLBACK, clientdata: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext(interactioncontext, outputcallback.toLong(), clientdata)

public actual fun RegisterOutputCallbackInteractionContext2(interactioncontext: HINTERACTIONCONTEXT, outputcallback: INTERACTION_CONTEXT_OUTPUT_CALLBACK2, clientdata: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext2(interactioncontext, outputcallback.toLong(), clientdata)

public actual fun RemovePointerInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerid: UInt): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_RemovePointerInteractionContext(interactioncontext, pointerid.toInt())

public actual fun ResetInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_ResetInteractionContext(interactioncontext)

public actual fun SetCrossSlideParametersInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parametercount: UInt, crossslideparameters: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_SetCrossSlideParametersInteractionContext(interactioncontext, parametercount.toInt(), crossslideparameters)

public actual fun SetHoldParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: HOLD_PARAMETER, value: Float): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_SetHoldParameterInteractionContext(interactioncontext, parameter, value)

public actual fun SetInertiaParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, inertiaparameter: INERTIA_PARAMETER, value: Float): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_SetInertiaParameterInteractionContext(interactioncontext, inertiaparameter, value)

public actual fun SetInteractionConfigurationInteractionContext(interactioncontext: HINTERACTIONCONTEXT, configurationcount: UInt, configuration: Long): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_SetInteractionConfigurationInteractionContext(interactioncontext, configurationcount.toInt(), configuration)

public actual fun SetMouseWheelParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: MOUSE_WHEEL_PARAMETER, value: Float): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_SetMouseWheelParameterInteractionContext(interactioncontext, parameter, value)

public actual fun SetPivotInteractionContext(interactioncontext: HINTERACTIONCONTEXT, x: Float, y: Float, radius: Float): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_SetPivotInteractionContext(interactioncontext, x, y, radius)

public actual fun SetPropertyInteractionContext(interactioncontext: HINTERACTIONCONTEXT, contextproperty: INTERACTION_CONTEXT_PROPERTY, value: UInt): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_SetPropertyInteractionContext(interactioncontext, contextproperty, value.toInt())

public actual fun SetTapParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TAP_PARAMETER, value: Float): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_SetTapParameterInteractionContext(interactioncontext, parameter, value)

public actual fun SetTranslationParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TRANSLATION_PARAMETER, value: Float): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_SetTranslationParameterInteractionContext(interactioncontext, parameter, value)

public actual fun StopInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_StopInteractionContext(interactioncontext)
