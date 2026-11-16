@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult

private val windowsWin32UiInteractioncontextNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addPointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextAddPointerInteractionContext(interactioncontext.rawAddress.toString(), pointerid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferPointerPacketsInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointerinfo: ConstPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextBufferPointerPacketsInteractionContext(interactioncontext.rawAddress.toString(), entriescount.toInt(), pointerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createInteractionContext(interactioncontext: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextCreateInteractionContext(interactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextDestroyInteractionContext(interactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCrossSlideParameterInteractionContext(interactioncontext: Hinteractioncontext, threshold: CrossSlideThreshold, distance: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextGetCrossSlideParameterInteractionContext(interactioncontext.rawAddress.toString(), threshold, distance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextGetHoldParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextGetInertiaParameterInteractionContext(interactioncontext.rawAddress.toString(), inertiaparameter, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextGetInteractionConfigurationInteractionContext(interactioncontext.rawAddress.toString(), configurationcount.toInt(), configuration.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextGetMouseWheelParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextGetPropertyInteractionContext(interactioncontext.rawAddress.toString(), contextproperty, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStateInteractionContext(interactioncontext: Hinteractioncontext, pointerinfo: ConstPtr, state: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextGetStateInteractionContext(interactioncontext.rawAddress.toString(), pointerinfo.rawAddress.toString(), state.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextGetTapParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: MutPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextGetTranslationParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processBufferedPacketsInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextProcessBufferedPacketsInteractionContext(interactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processInertiaInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextProcessInertiaInteractionContext(interactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processPointerFramesInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointercount: UInt, pointerinfo: ConstPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextProcessPointerFramesInteractionContext(interactioncontext.rawAddress.toString(), entriescount.toInt(), pointercount.toInt(), pointerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerOutputCallbackInteractionContext(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback, clientdata: ConstPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext(interactioncontext.rawAddress.toString(), 0L.toString(), clientdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerOutputCallbackInteractionContext2(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback2, clientdata: ConstPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext2(interactioncontext.rawAddress.toString(), 0L.toString(), clientdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextRemovePointerInteractionContext(interactioncontext.rawAddress.toString(), pointerid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextResetInteractionContext(interactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCrossSlideParametersInteractionContext(interactioncontext: Hinteractioncontext, parametercount: UInt, crossslideparameters: ConstPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextSetCrossSlideParametersInteractionContext(interactioncontext.rawAddress.toString(), parametercount.toInt(), crossslideparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: Float): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextSetHoldParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: Float): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextSetInertiaParameterInteractionContext(interactioncontext.rawAddress.toString(), inertiaparameter, value.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: ConstPtr): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextSetInteractionConfigurationInteractionContext(interactioncontext.rawAddress.toString(), configurationcount.toInt(), configuration.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: Float): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextSetMouseWheelParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPivotInteractionContext(interactioncontext: Hinteractioncontext, x: Float, y: Float, radius: Float): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextSetPivotInteractionContext(interactioncontext.rawAddress.toString(), x.toDouble(), y.toDouble(), radius.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: UInt): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextSetPropertyInteractionContext(interactioncontext.rawAddress.toString(), contextproperty, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: Float): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextSetTapParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: Float): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextSetTranslationParameterInteractionContext(interactioncontext.rawAddress.toString(), parameter, value.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    if (windowsWin32UiInteractioncontextNapiAddon != null) (windowsWin32UiInteractioncontextNapiAddon.windowssysWindowsWin32UiInteractioncontextStopInteractionContext(interactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
