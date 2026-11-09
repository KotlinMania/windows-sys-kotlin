@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.windowssys.core.HRESULT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun AddPointerInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_AddPointerInteractionContext(interactioncontext.toCPointer<ByteVar>(), pointerid)

public actual fun BufferPointerPacketsInteractionContext(interactioncontext: HINTERACTIONCONTEXT, entriescount: UInt, pointerinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_BufferPointerPacketsInteractionContext(interactioncontext.toCPointer<ByteVar>(), entriescount, pointerinfo.toCPointer<ByteVar>())

public actual fun CreateInteractionContext(interactioncontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_CreateInteractionContext(interactioncontext.toCPointer<ByteVar>())

public actual fun DestroyInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_DestroyInteractionContext(interactioncontext.toCPointer<ByteVar>())

public actual fun GetCrossSlideParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, threshold: CROSS_SLIDE_THRESHOLD, distance: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_GetCrossSlideParameterInteractionContext(interactioncontext.toCPointer<ByteVar>(), threshold, distance.toCPointer<ByteVar>())

public actual fun GetHoldParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: HOLD_PARAMETER, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_GetHoldParameterInteractionContext(interactioncontext.toCPointer<ByteVar>(), parameter, value.toCPointer<ByteVar>())

public actual fun GetInertiaParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, inertiaparameter: INERTIA_PARAMETER, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_GetInertiaParameterInteractionContext(interactioncontext.toCPointer<ByteVar>(), inertiaparameter, value.toCPointer<ByteVar>())

public actual fun GetInteractionConfigurationInteractionContext(interactioncontext: HINTERACTIONCONTEXT, configurationcount: UInt, configuration: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_GetInteractionConfigurationInteractionContext(interactioncontext.toCPointer<ByteVar>(), configurationcount, configuration.toCPointer<ByteVar>())

public actual fun GetMouseWheelParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: MOUSE_WHEEL_PARAMETER, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_GetMouseWheelParameterInteractionContext(interactioncontext.toCPointer<ByteVar>(), parameter, value.toCPointer<ByteVar>())

public actual fun GetPropertyInteractionContext(interactioncontext: HINTERACTIONCONTEXT, contextproperty: INTERACTION_CONTEXT_PROPERTY, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_GetPropertyInteractionContext(interactioncontext.toCPointer<ByteVar>(), contextproperty, value.toCPointer<ByteVar>())

public actual fun GetStateInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerinfo: Long, state: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_GetStateInteractionContext(interactioncontext.toCPointer<ByteVar>(), pointerinfo.toCPointer<ByteVar>(), state.toCPointer<ByteVar>())

public actual fun GetTapParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TAP_PARAMETER, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_GetTapParameterInteractionContext(interactioncontext.toCPointer<ByteVar>(), parameter, value.toCPointer<ByteVar>())

public actual fun GetTranslationParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TRANSLATION_PARAMETER, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_GetTranslationParameterInteractionContext(interactioncontext.toCPointer<ByteVar>(), parameter, value.toCPointer<ByteVar>())

public actual fun ProcessBufferedPacketsInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_ProcessBufferedPacketsInteractionContext(interactioncontext.toCPointer<ByteVar>())

public actual fun ProcessInertiaInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_ProcessInertiaInteractionContext(interactioncontext.toCPointer<ByteVar>())

public actual fun ProcessPointerFramesInteractionContext(interactioncontext: HINTERACTIONCONTEXT, entriescount: UInt, pointercount: UInt, pointerinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_ProcessPointerFramesInteractionContext(interactioncontext.toCPointer<ByteVar>(), entriescount, pointercount, pointerinfo.toCPointer<ByteVar>())

public actual fun RegisterOutputCallbackInteractionContext(interactioncontext: HINTERACTIONCONTEXT, outputcallback: INTERACTION_CONTEXT_OUTPUT_CALLBACK, clientdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext(interactioncontext.toCPointer<ByteVar>(), outputcallback.toLong().toCPointer<ByteVar>(), clientdata.toCPointer<ByteVar>())

public actual fun RegisterOutputCallbackInteractionContext2(interactioncontext: HINTERACTIONCONTEXT, outputcallback: INTERACTION_CONTEXT_OUTPUT_CALLBACK2, clientdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext2(interactioncontext.toCPointer<ByteVar>(), outputcallback.toLong().toCPointer<ByteVar>(), clientdata.toCPointer<ByteVar>())

public actual fun RemovePointerInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_RemovePointerInteractionContext(interactioncontext.toCPointer<ByteVar>(), pointerid)

public actual fun ResetInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_ResetInteractionContext(interactioncontext.toCPointer<ByteVar>())

public actual fun SetCrossSlideParametersInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parametercount: UInt, crossslideparameters: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_SetCrossSlideParametersInteractionContext(interactioncontext.toCPointer<ByteVar>(), parametercount, crossslideparameters.toCPointer<ByteVar>())

public actual fun SetHoldParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: HOLD_PARAMETER, value: Float): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_SetHoldParameterInteractionContext(interactioncontext.toCPointer<ByteVar>(), parameter, value)

public actual fun SetInertiaParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, inertiaparameter: INERTIA_PARAMETER, value: Float): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_SetInertiaParameterInteractionContext(interactioncontext.toCPointer<ByteVar>(), inertiaparameter, value)

public actual fun SetInteractionConfigurationInteractionContext(interactioncontext: HINTERACTIONCONTEXT, configurationcount: UInt, configuration: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_SetInteractionConfigurationInteractionContext(interactioncontext.toCPointer<ByteVar>(), configurationcount, configuration.toCPointer<ByteVar>())

public actual fun SetMouseWheelParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: MOUSE_WHEEL_PARAMETER, value: Float): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_SetMouseWheelParameterInteractionContext(interactioncontext.toCPointer<ByteVar>(), parameter, value)

public actual fun SetPivotInteractionContext(interactioncontext: HINTERACTIONCONTEXT, x: Float, y: Float, radius: Float): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_SetPivotInteractionContext(interactioncontext.toCPointer<ByteVar>(), x, y, radius)

public actual fun SetPropertyInteractionContext(interactioncontext: HINTERACTIONCONTEXT, contextproperty: INTERACTION_CONTEXT_PROPERTY, value: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_SetPropertyInteractionContext(interactioncontext.toCPointer<ByteVar>(), contextproperty, value)

public actual fun SetTapParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TAP_PARAMETER, value: Float): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_SetTapParameterInteractionContext(interactioncontext.toCPointer<ByteVar>(), parameter, value)

public actual fun SetTranslationParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TRANSLATION_PARAMETER, value: Float): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_SetTranslationParameterInteractionContext(interactioncontext.toCPointer<ByteVar>(), parameter, value)

public actual fun StopInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_StopInteractionContext(interactioncontext.toCPointer<ByteVar>())
