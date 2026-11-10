@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult

private val _windowsWin32UiInteractioncontextNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addPointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_addPointerInteractionContext((interactioncontext?.value ?: 0L).toString(), pointerid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferPointerPacketsInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointerinfo: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_bufferPointerPacketsInteractionContext((interactioncontext?.value ?: 0L).toString(), entriescount.toInt(), (pointerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createInteractionContext(interactioncontext: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_createInteractionContext((interactioncontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_destroyInteractionContext((interactioncontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCrossSlideParameterInteractionContext(interactioncontext: Hinteractioncontext, threshold: CrossSlideThreshold, distance: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_getCrossSlideParameterInteractionContext((interactioncontext?.value ?: 0L).toString(), threshold, (distance?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_getHoldParameterInteractionContext((interactioncontext?.value ?: 0L).toString(), parameter, (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_getInertiaParameterInteractionContext((interactioncontext?.value ?: 0L).toString(), inertiaparameter, (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_getInteractionConfigurationInteractionContext((interactioncontext?.value ?: 0L).toString(), configurationcount.toInt(), (configuration?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_getMouseWheelParameterInteractionContext((interactioncontext?.value ?: 0L).toString(), parameter, (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_getPropertyInteractionContext((interactioncontext?.value ?: 0L).toString(), contextproperty, (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStateInteractionContext(interactioncontext: Hinteractioncontext, pointerinfo: COpaquePointer?, state: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_getStateInteractionContext((interactioncontext?.value ?: 0L).toString(), (pointerinfo?.value ?: 0L).toString(), (state?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_getTapParameterInteractionContext((interactioncontext?.value ?: 0L).toString(), parameter, (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_getTranslationParameterInteractionContext((interactioncontext?.value ?: 0L).toString(), parameter, (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processBufferedPacketsInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_processBufferedPacketsInteractionContext((interactioncontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processInertiaInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_processInertiaInteractionContext((interactioncontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processPointerFramesInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointercount: UInt, pointerinfo: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_processPointerFramesInteractionContext((interactioncontext?.value ?: 0L).toString(), entriescount.toInt(), pointercount.toInt(), (pointerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerOutputCallbackInteractionContext(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback, clientdata: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_registerOutputCallbackInteractionContext((interactioncontext?.value ?: 0L).toString(), 0L.toString(), (clientdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerOutputCallbackInteractionContext2(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback2, clientdata: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_registerOutputCallbackInteractionContext2((interactioncontext?.value ?: 0L).toString(), 0L.toString(), (clientdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_removePointerInteractionContext((interactioncontext?.value ?: 0L).toString(), pointerid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_resetInteractionContext((interactioncontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCrossSlideParametersInteractionContext(interactioncontext: Hinteractioncontext, parametercount: UInt, crossslideparameters: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_setCrossSlideParametersInteractionContext((interactioncontext?.value ?: 0L).toString(), parametercount.toInt(), (crossslideparameters?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: Float): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_setHoldParameterInteractionContext((interactioncontext?.value ?: 0L).toString(), parameter, value.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: Float): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_setInertiaParameterInteractionContext((interactioncontext?.value ?: 0L).toString(), inertiaparameter, value.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: COpaquePointer?): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_setInteractionConfigurationInteractionContext((interactioncontext?.value ?: 0L).toString(), configurationcount.toInt(), (configuration?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: Float): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_setMouseWheelParameterInteractionContext((interactioncontext?.value ?: 0L).toString(), parameter, value.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPivotInteractionContext(interactioncontext: Hinteractioncontext, x: Float, y: Float, radius: Float): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_setPivotInteractionContext((interactioncontext?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), radius.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: UInt): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_setPropertyInteractionContext((interactioncontext?.value ?: 0L).toString(), contextproperty, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: Float): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_setTapParameterInteractionContext((interactioncontext?.value ?: 0L).toString(), parameter, value.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: Float): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_setTranslationParameterInteractionContext((interactioncontext?.value ?: 0L).toString(), parameter, value.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (_windowsWin32UiInteractioncontextNapiAddon != null) (_windowsWin32UiInteractioncontextNapiAddon.windowssys_windows_win32_ui_interactioncontext_stopInteractionContext((interactioncontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
