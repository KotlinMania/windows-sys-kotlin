@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult

public actual fun addPointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bufferPointerPacketsInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointerinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createInteractionContext(interactioncontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroyInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCrossSlideParameterInteractionContext(interactioncontext: Hinteractioncontext, threshold: CrossSlideThreshold, distance: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getStateInteractionContext(interactioncontext: Hinteractioncontext, pointerinfo: COpaquePointer?, state: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun processBufferedPacketsInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun processInertiaInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun processPointerFramesInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointercount: UInt, pointerinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerOutputCallbackInteractionContext(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback, clientdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerOutputCallbackInteractionContext2(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback2, clientdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removePointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun resetInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCrossSlideParametersInteractionContext(interactioncontext: Hinteractioncontext, parametercount: UInt, crossslideparameters: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: Float): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: Float): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: Float): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setPivotInteractionContext(interactioncontext: Hinteractioncontext, x: Float, y: Float, radius: Float): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: Float): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: Float): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stopInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
