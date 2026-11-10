@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult

private object WindowsWin32UiInteractioncontextJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_addPointerInteractionContext(interactioncontext: Long, pointerid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_bufferPointerPacketsInteractionContext(interactioncontext: Long, entriescount: Int, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_createInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_destroyInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_getCrossSlideParameterInteractionContext(interactioncontext: Long, threshold: Int, distance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_getHoldParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_getInertiaParameterInteractionContext(interactioncontext: Long, inertiaparameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_getInteractionConfigurationInteractionContext(interactioncontext: Long, configurationcount: Int, configuration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_getMouseWheelParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_getPropertyInteractionContext(interactioncontext: Long, contextproperty: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_getStateInteractionContext(interactioncontext: Long, pointerinfo: Long, state: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_getTapParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_getTranslationParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_processBufferedPacketsInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_processInertiaInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_processPointerFramesInteractionContext(interactioncontext: Long, entriescount: Int, pointercount: Int, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_registerOutputCallbackInteractionContext(interactioncontext: Long, outputcallback: Long, clientdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_registerOutputCallbackInteractionContext2(interactioncontext: Long, outputcallback: Long, clientdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_removePointerInteractionContext(interactioncontext: Long, pointerid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_resetInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_setCrossSlideParametersInteractionContext(interactioncontext: Long, parametercount: Int, crossslideparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_setHoldParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_setInertiaParameterInteractionContext(interactioncontext: Long, inertiaparameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_setInteractionConfigurationInteractionContext(interactioncontext: Long, configurationcount: Int, configuration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_setMouseWheelParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_setPivotInteractionContext(interactioncontext: Long, x: Float, y: Float, radius: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_setPropertyInteractionContext(interactioncontext: Long, contextproperty: Int, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_setTapParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_setTranslationParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_interactioncontext_stopInteractionContext(interactioncontext: Long): Int
}

public actual fun addPointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_addPointerInteractionContext((interactioncontext?.value ?: 0L), pointerid.toInt())

public actual fun bufferPointerPacketsInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointerinfo: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_bufferPointerPacketsInteractionContext((interactioncontext?.value ?: 0L), entriescount.toInt(), (pointerinfo?.value ?: 0L))

public actual fun createInteractionContext(interactioncontext: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_createInteractionContext((interactioncontext?.value ?: 0L))

public actual fun destroyInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_destroyInteractionContext((interactioncontext?.value ?: 0L))

public actual fun getCrossSlideParameterInteractionContext(interactioncontext: Hinteractioncontext, threshold: CrossSlideThreshold, distance: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_getCrossSlideParameterInteractionContext((interactioncontext?.value ?: 0L), threshold, (distance?.value ?: 0L))

public actual fun getHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_getHoldParameterInteractionContext((interactioncontext?.value ?: 0L), parameter, (value?.value ?: 0L))

public actual fun getInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_getInertiaParameterInteractionContext((interactioncontext?.value ?: 0L), inertiaparameter, (value?.value ?: 0L))

public actual fun getInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_getInteractionConfigurationInteractionContext((interactioncontext?.value ?: 0L), configurationcount.toInt(), (configuration?.value ?: 0L))

public actual fun getMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_getMouseWheelParameterInteractionContext((interactioncontext?.value ?: 0L), parameter, (value?.value ?: 0L))

public actual fun getPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_getPropertyInteractionContext((interactioncontext?.value ?: 0L), contextproperty, (value?.value ?: 0L))

public actual fun getStateInteractionContext(interactioncontext: Hinteractioncontext, pointerinfo: COpaquePointer?, state: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_getStateInteractionContext((interactioncontext?.value ?: 0L), (pointerinfo?.value ?: 0L), (state?.value ?: 0L))

public actual fun getTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_getTapParameterInteractionContext((interactioncontext?.value ?: 0L), parameter, (value?.value ?: 0L))

public actual fun getTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_getTranslationParameterInteractionContext((interactioncontext?.value ?: 0L), parameter, (value?.value ?: 0L))

public actual fun processBufferedPacketsInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_processBufferedPacketsInteractionContext((interactioncontext?.value ?: 0L))

public actual fun processInertiaInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_processInertiaInteractionContext((interactioncontext?.value ?: 0L))

public actual fun processPointerFramesInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointercount: UInt, pointerinfo: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_processPointerFramesInteractionContext((interactioncontext?.value ?: 0L), entriescount.toInt(), pointercount.toInt(), (pointerinfo?.value ?: 0L))

public actual fun registerOutputCallbackInteractionContext(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback, clientdata: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_registerOutputCallbackInteractionContext((interactioncontext?.value ?: 0L), 0L, (clientdata?.value ?: 0L))

public actual fun registerOutputCallbackInteractionContext2(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback2, clientdata: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_registerOutputCallbackInteractionContext2((interactioncontext?.value ?: 0L), 0L, (clientdata?.value ?: 0L))

public actual fun removePointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_removePointerInteractionContext((interactioncontext?.value ?: 0L), pointerid.toInt())

public actual fun resetInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_resetInteractionContext((interactioncontext?.value ?: 0L))

public actual fun setCrossSlideParametersInteractionContext(interactioncontext: Hinteractioncontext, parametercount: UInt, crossslideparameters: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_setCrossSlideParametersInteractionContext((interactioncontext?.value ?: 0L), parametercount.toInt(), (crossslideparameters?.value ?: 0L))

public actual fun setHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: Float): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_setHoldParameterInteractionContext((interactioncontext?.value ?: 0L), parameter, value)

public actual fun setInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: Float): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_setInertiaParameterInteractionContext((interactioncontext?.value ?: 0L), inertiaparameter, value)

public actual fun setInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: COpaquePointer?): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_setInteractionConfigurationInteractionContext((interactioncontext?.value ?: 0L), configurationcount.toInt(), (configuration?.value ?: 0L))

public actual fun setMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: Float): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_setMouseWheelParameterInteractionContext((interactioncontext?.value ?: 0L), parameter, value)

public actual fun setPivotInteractionContext(interactioncontext: Hinteractioncontext, x: Float, y: Float, radius: Float): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_setPivotInteractionContext((interactioncontext?.value ?: 0L), x, y, radius)

public actual fun setPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: UInt): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_setPropertyInteractionContext((interactioncontext?.value ?: 0L), contextproperty, value.toInt())

public actual fun setTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: Float): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_setTapParameterInteractionContext((interactioncontext?.value ?: 0L), parameter, value)

public actual fun setTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: Float): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_setTranslationParameterInteractionContext((interactioncontext?.value ?: 0L), parameter, value)

public actual fun stopInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssys_windows_win32_ui_interactioncontext_stopInteractionContext((interactioncontext?.value ?: 0L))
