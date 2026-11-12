@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiInteractioncontextNapiAddon(): Boolean

private val windowsWin32UiInteractioncontextNapiAvailable: Boolean = initWindowsWin32UiInteractioncontextNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextAddPointerInteractionContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextAddPointerInteractionContext(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextBufferPointerPacketsInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextBufferPointerPacketsInteractionContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextCreateInteractionContext(p0)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextCreateInteractionContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextDestroyInteractionContext(p0)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextDestroyInteractionContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextGetCrossSlideParameterInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextGetCrossSlideParameterInteractionContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextGetHoldParameterInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextGetHoldParameterInteractionContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextGetInertiaParameterInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextGetInertiaParameterInteractionContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextGetInteractionConfigurationInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextGetInteractionConfigurationInteractionContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextGetMouseWheelParameterInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextGetMouseWheelParameterInteractionContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextGetPropertyInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextGetPropertyInteractionContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextGetStateInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextGetStateInteractionContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextGetTapParameterInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextGetTapParameterInteractionContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextGetTranslationParameterInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextGetTranslationParameterInteractionContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextProcessBufferedPacketsInteractionContext(p0)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextProcessBufferedPacketsInteractionContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextProcessInertiaInteractionContext(p0)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextProcessInertiaInteractionContext(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextProcessPointerFramesInteractionContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextProcessPointerFramesInteractionContext(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextRemovePointerInteractionContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextRemovePointerInteractionContext(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextResetInteractionContext(p0)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextResetInteractionContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextSetCrossSlideParametersInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextSetCrossSlideParametersInteractionContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextSetHoldParameterInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextSetHoldParameterInteractionContext(p0: String, p1: Int, p2: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextSetInertiaParameterInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextSetInertiaParameterInteractionContext(p0: String, p1: Int, p2: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextSetInteractionConfigurationInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextSetInteractionConfigurationInteractionContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextSetMouseWheelParameterInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextSetMouseWheelParameterInteractionContext(p0: String, p1: Int, p2: Double): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextSetPivotInteractionContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextSetPivotInteractionContext(p0: String, p1: Double, p2: Double, p3: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextSetPropertyInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextSetPropertyInteractionContext(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextSetTapParameterInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextSetTapParameterInteractionContext(p0: String, p1: Int, p2: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextSetTranslationParameterInteractionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextSetTranslationParameterInteractionContext(p0: String, p1: Int, p2: Double): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInteractioncontextStopInteractionContext(p0)")
private external fun wasmWindowssysWindowsWin32UiInteractioncontextStopInteractionContext(p0: String): Int

public actual fun addPointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextAddPointerInteractionContext(interactioncontext.rawAddress.toString(), pointerid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferPointerPacketsInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointerinfo: ConstPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextBufferPointerPacketsInteractionContext(interactioncontext.rawAddress.toString(), entriescount.toInt(), pointerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createInteractionContext(interactioncontext: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextCreateInteractionContext(interactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextDestroyInteractionContext(interactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCrossSlideParameterInteractionContext(interactioncontext: Hinteractioncontext, threshold: CrossSlideThreshold, distance: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextGetCrossSlideParameterInteractionContext(interactioncontext.rawAddress.toString(), threshold, distance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextGetHoldParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextGetInertiaParameterInteractionContext(interactioncontext.rawAddress.toString(), inertiaparameter, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextGetInteractionConfigurationInteractionContext(interactioncontext.rawAddress.toString(), configurationcount.toInt(), configuration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextGetMouseWheelParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextGetPropertyInteractionContext(interactioncontext.rawAddress.toString(), contextproperty, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStateInteractionContext(interactioncontext: Hinteractioncontext, pointerinfo: ConstPtr, state: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextGetStateInteractionContext(interactioncontext.rawAddress.toString(), pointerinfo.rawAddress.toString(), state.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextGetTapParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextGetTranslationParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processBufferedPacketsInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextProcessBufferedPacketsInteractionContext(interactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processInertiaInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextProcessInertiaInteractionContext(interactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processPointerFramesInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointercount: UInt, pointerinfo: ConstPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextProcessPointerFramesInteractionContext(interactioncontext.rawAddress.toString(), entriescount.toInt(), pointercount.toInt(), pointerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerOutputCallbackInteractionContext(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback, clientdata: ConstPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext(interactioncontext.rawAddress.toString(), 0L.toString(), clientdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerOutputCallbackInteractionContext2(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback2, clientdata: ConstPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext2(interactioncontext.rawAddress.toString(), 0L.toString(), clientdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextRemovePointerInteractionContext(interactioncontext.rawAddress.toString(), pointerid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextResetInteractionContext(interactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCrossSlideParametersInteractionContext(interactioncontext: Hinteractioncontext, parametercount: UInt, crossslideparameters: ConstPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextSetCrossSlideParametersInteractionContext(interactioncontext.rawAddress.toString(), parametercount.toInt(), crossslideparameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: Float): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextSetHoldParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: Float): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextSetInertiaParameterInteractionContext(interactioncontext.rawAddress.toString(), inertiaparameter, value.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: ConstPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextSetInteractionConfigurationInteractionContext(interactioncontext.rawAddress.toString(), configurationcount.toInt(), configuration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: Float): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextSetMouseWheelParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPivotInteractionContext(interactioncontext: Hinteractioncontext, x: Float, y: Float, radius: Float): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextSetPivotInteractionContext(interactioncontext.rawAddress.toString(), x.toDouble(), y.toDouble(), radius.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: UInt): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextSetPropertyInteractionContext(interactioncontext.rawAddress.toString(), contextproperty, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: Float): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextSetTapParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: Float): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextSetTranslationParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (windowsWin32UiInteractioncontextNapiAvailable) wasmWindowssysWindowsWin32UiInteractioncontextStopInteractionContext(interactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
