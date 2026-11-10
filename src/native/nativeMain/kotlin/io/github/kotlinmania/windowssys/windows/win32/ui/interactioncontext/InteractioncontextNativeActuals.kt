@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun addPointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_addPointerInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), pointerid)

public actual fun bufferPointerPacketsInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointerinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_bufferPointerPacketsInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), entriescount, pointerinfo?.value?.toCPointer<ByteVar>())

public actual fun createInteractionContext(interactioncontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_createInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>())

public actual fun destroyInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_destroyInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>())

public actual fun getCrossSlideParameterInteractionContext(interactioncontext: Hinteractioncontext, threshold: CrossSlideThreshold, distance: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_getCrossSlideParameterInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), threshold, distance?.value?.toCPointer<ByteVar>())

public actual fun getHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_getHoldParameterInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), parameter, value?.value?.toCPointer<ByteVar>())

public actual fun getInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_getInertiaParameterInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), inertiaparameter, value?.value?.toCPointer<ByteVar>())

public actual fun getInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_getInteractionConfigurationInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), configurationcount, configuration?.value?.toCPointer<ByteVar>())

public actual fun getMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_getMouseWheelParameterInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), parameter, value?.value?.toCPointer<ByteVar>())

public actual fun getPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_getPropertyInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), contextproperty, value?.value?.toCPointer<ByteVar>())

public actual fun getStateInteractionContext(interactioncontext: Hinteractioncontext, pointerinfo: COpaquePointer?, state: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_getStateInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), pointerinfo?.value?.toCPointer<ByteVar>(), state?.value?.toCPointer<ByteVar>())

public actual fun getTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_getTapParameterInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), parameter, value?.value?.toCPointer<ByteVar>())

public actual fun getTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_getTranslationParameterInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), parameter, value?.value?.toCPointer<ByteVar>())

public actual fun processBufferedPacketsInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_processBufferedPacketsInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>())

public actual fun processInertiaInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_processInertiaInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>())

public actual fun processPointerFramesInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointercount: UInt, pointerinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_processPointerFramesInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), entriescount, pointercount, pointerinfo?.value?.toCPointer<ByteVar>())

public actual fun registerOutputCallbackInteractionContext(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback, clientdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_registerOutputCallbackInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), clientdata?.value?.toCPointer<ByteVar>())

public actual fun registerOutputCallbackInteractionContext2(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback2, clientdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_registerOutputCallbackInteractionContext2(interactioncontext?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), clientdata?.value?.toCPointer<ByteVar>())

public actual fun removePointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_removePointerInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), pointerid)

public actual fun resetInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_resetInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>())

public actual fun setCrossSlideParametersInteractionContext(interactioncontext: Hinteractioncontext, parametercount: UInt, crossslideparameters: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_setCrossSlideParametersInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), parametercount, crossslideparameters?.value?.toCPointer<ByteVar>())

public actual fun setHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: Float): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_setHoldParameterInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), parameter, value)

public actual fun setInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: Float): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_setInertiaParameterInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), inertiaparameter, value)

public actual fun setInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_setInteractionConfigurationInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), configurationcount, configuration?.value?.toCPointer<ByteVar>())

public actual fun setMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: Float): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_setMouseWheelParameterInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), parameter, value)

public actual fun setPivotInteractionContext(interactioncontext: Hinteractioncontext, x: Float, y: Float, radius: Float): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_setPivotInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), x, y, radius)

public actual fun setPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_setPropertyInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), contextproperty, value)

public actual fun setTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: Float): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_setTapParameterInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), parameter, value)

public actual fun setTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: Float): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_setTranslationParameterInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>(), parameter, value)

public actual fun stopInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssys_windows_win32_ui_interactioncontext_stopInteractionContext(interactioncontext?.value?.toCPointer<ByteVar>())
