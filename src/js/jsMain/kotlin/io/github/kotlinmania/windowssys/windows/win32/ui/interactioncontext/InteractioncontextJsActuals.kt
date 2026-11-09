@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.windowssys.core.HRESULT

private val _windowsWin32UiInteractioncontextNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AddPointerInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerid: UInt): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_AddPointerInteractionContext(interactioncontext.toString(), pointerid.toInt()) as Int) else 0

public actual fun BufferPointerPacketsInteractionContext(interactioncontext: HINTERACTIONCONTEXT, entriescount: UInt, pointerinfo: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_BufferPointerPacketsInteractionContext(interactioncontext.toString(), entriescount.toInt(), pointerinfo.toString()) as Int) else 0

public actual fun CreateInteractionContext(interactioncontext: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_CreateInteractionContext(interactioncontext.toString()) as Int) else 0

public actual fun DestroyInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_DestroyInteractionContext(interactioncontext.toString()) as Int) else 0

public actual fun GetCrossSlideParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, threshold: CROSS_SLIDE_THRESHOLD, distance: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_GetCrossSlideParameterInteractionContext(interactioncontext.toString(), threshold, distance.toString()) as Int) else 0

public actual fun GetHoldParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: HOLD_PARAMETER, value: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_GetHoldParameterInteractionContext(interactioncontext.toString(), parameter, value.toString()) as Int) else 0

public actual fun GetInertiaParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, inertiaparameter: INERTIA_PARAMETER, value: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_GetInertiaParameterInteractionContext(interactioncontext.toString(), inertiaparameter, value.toString()) as Int) else 0

public actual fun GetInteractionConfigurationInteractionContext(interactioncontext: HINTERACTIONCONTEXT, configurationcount: UInt, configuration: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_GetInteractionConfigurationInteractionContext(interactioncontext.toString(), configurationcount.toInt(), configuration.toString()) as Int) else 0

public actual fun GetMouseWheelParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: MOUSE_WHEEL_PARAMETER, value: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_GetMouseWheelParameterInteractionContext(interactioncontext.toString(), parameter, value.toString()) as Int) else 0

public actual fun GetPropertyInteractionContext(interactioncontext: HINTERACTIONCONTEXT, contextproperty: INTERACTION_CONTEXT_PROPERTY, value: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_GetPropertyInteractionContext(interactioncontext.toString(), contextproperty, value.toString()) as Int) else 0

public actual fun GetStateInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerinfo: Long, state: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_GetStateInteractionContext(interactioncontext.toString(), pointerinfo.toString(), state.toString()) as Int) else 0

public actual fun GetTapParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TAP_PARAMETER, value: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_GetTapParameterInteractionContext(interactioncontext.toString(), parameter, value.toString()) as Int) else 0

public actual fun GetTranslationParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TRANSLATION_PARAMETER, value: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_GetTranslationParameterInteractionContext(interactioncontext.toString(), parameter, value.toString()) as Int) else 0

public actual fun ProcessBufferedPacketsInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_ProcessBufferedPacketsInteractionContext(interactioncontext.toString()) as Int) else 0

public actual fun ProcessInertiaInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_ProcessInertiaInteractionContext(interactioncontext.toString()) as Int) else 0

public actual fun ProcessPointerFramesInteractionContext(interactioncontext: HINTERACTIONCONTEXT, entriescount: UInt, pointercount: UInt, pointerinfo: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_ProcessPointerFramesInteractionContext(interactioncontext.toString(), entriescount.toInt(), pointercount.toInt(), pointerinfo.toString()) as Int) else 0

public actual fun RegisterOutputCallbackInteractionContext(interactioncontext: HINTERACTIONCONTEXT, outputcallback: INTERACTION_CONTEXT_OUTPUT_CALLBACK, clientdata: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext(interactioncontext.toString(), outputcallback.toLong().toString(), clientdata.toString()) as Int) else 0

public actual fun RegisterOutputCallbackInteractionContext2(interactioncontext: HINTERACTIONCONTEXT, outputcallback: INTERACTION_CONTEXT_OUTPUT_CALLBACK2, clientdata: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_RegisterOutputCallbackInteractionContext2(interactioncontext.toString(), outputcallback.toLong().toString(), clientdata.toString()) as Int) else 0

public actual fun RemovePointerInteractionContext(interactioncontext: HINTERACTIONCONTEXT, pointerid: UInt): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_RemovePointerInteractionContext(interactioncontext.toString(), pointerid.toInt()) as Int) else 0

public actual fun ResetInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_ResetInteractionContext(interactioncontext.toString()) as Int) else 0

public actual fun SetCrossSlideParametersInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parametercount: UInt, crossslideparameters: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_SetCrossSlideParametersInteractionContext(interactioncontext.toString(), parametercount.toInt(), crossslideparameters.toString()) as Int) else 0

public actual fun SetHoldParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: HOLD_PARAMETER, value: Float): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_SetHoldParameterInteractionContext(interactioncontext.toString(), parameter, value.toDouble()) as Int) else 0

public actual fun SetInertiaParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, inertiaparameter: INERTIA_PARAMETER, value: Float): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_SetInertiaParameterInteractionContext(interactioncontext.toString(), inertiaparameter, value.toDouble()) as Int) else 0

public actual fun SetInteractionConfigurationInteractionContext(interactioncontext: HINTERACTIONCONTEXT, configurationcount: UInt, configuration: Long): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_SetInteractionConfigurationInteractionContext(interactioncontext.toString(), configurationcount.toInt(), configuration.toString()) as Int) else 0

public actual fun SetMouseWheelParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: MOUSE_WHEEL_PARAMETER, value: Float): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_SetMouseWheelParameterInteractionContext(interactioncontext.toString(), parameter, value.toDouble()) as Int) else 0

public actual fun SetPivotInteractionContext(interactioncontext: HINTERACTIONCONTEXT, x: Float, y: Float, radius: Float): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_SetPivotInteractionContext(interactioncontext.toString(), x.toDouble(), y.toDouble(), radius.toDouble()) as Int) else 0

public actual fun SetPropertyInteractionContext(interactioncontext: HINTERACTIONCONTEXT, contextproperty: INTERACTION_CONTEXT_PROPERTY, value: UInt): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_SetPropertyInteractionContext(interactioncontext.toString(), contextproperty, value.toInt()) as Int) else 0

public actual fun SetTapParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TAP_PARAMETER, value: Float): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_SetTapParameterInteractionContext(interactioncontext.toString(), parameter, value.toDouble()) as Int) else 0

public actual fun SetTranslationParameterInteractionContext(interactioncontext: HINTERACTIONCONTEXT, parameter: TRANSLATION_PARAMETER, value: Float): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_SetTranslationParameterInteractionContext(interactioncontext.toString(), parameter, value.toDouble()) as Int) else 0

public actual fun StopInteractionContext(interactioncontext: HINTERACTIONCONTEXT): HRESULT =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_StopInteractionContext(interactioncontext.toString()) as Int) else 0
