@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextAddPointerInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextBufferPointerPacketsInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextCreateInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextDestroyInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextGetCrossSlideParameterInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextGetHoldParameterInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextGetInertiaParameterInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextGetInteractionConfigurationInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextGetMouseWheelParameterInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextGetPropertyInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextGetStateInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextGetTapParameterInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextGetTranslationParameterInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextProcessBufferedPacketsInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextProcessInertiaInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextProcessPointerFramesInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext2
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextRemovePointerInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextResetInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextSetCrossSlideParametersInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextSetHoldParameterInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextSetInertiaParameterInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextSetInteractionConfigurationInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextSetMouseWheelParameterInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextSetPivotInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextSetPropertyInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextSetTapParameterInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextSetTranslationParameterInteractionContext
import io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext.cinterop.windowssysWindowsWin32UiInteractioncontextStopInteractionContext
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun addPointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    windowssysWindowsWin32UiInteractioncontextAddPointerInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), pointerid)

public actual fun bufferPointerPacketsInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointerinfo: ConstPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextBufferPointerPacketsInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), entriescount, pointerinfo.rawAddress.toCPointer<ByteVar>())

public actual fun createInteractionContext(interactioncontext: MutPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextCreateInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>())

public actual fun destroyInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    windowssysWindowsWin32UiInteractioncontextDestroyInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>())

public actual fun getCrossSlideParameterInteractionContext(interactioncontext: Hinteractioncontext, threshold: CrossSlideThreshold, distance: MutPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextGetCrossSlideParameterInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), threshold, distance.rawAddress.toCPointer<ByteVar>())

public actual fun getHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: MutPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextGetHoldParameterInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), parameter, value.rawAddress.toCPointer<ByteVar>())

public actual fun getInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: MutPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextGetInertiaParameterInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), inertiaparameter, value.rawAddress.toCPointer<ByteVar>())

public actual fun getInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: MutPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextGetInteractionConfigurationInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), configurationcount, configuration.rawAddress.toCPointer<ByteVar>())

public actual fun getMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: MutPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextGetMouseWheelParameterInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), parameter, value.rawAddress.toCPointer<ByteVar>())

public actual fun getPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: MutPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextGetPropertyInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), contextproperty, value.rawAddress.toCPointer<ByteVar>())

public actual fun getStateInteractionContext(interactioncontext: Hinteractioncontext, pointerinfo: ConstPtr, state: MutPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextGetStateInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), pointerinfo.rawAddress.toCPointer<ByteVar>(), state.rawAddress.toCPointer<ByteVar>())

public actual fun getTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: MutPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextGetTapParameterInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), parameter, value.rawAddress.toCPointer<ByteVar>())

public actual fun getTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: MutPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextGetTranslationParameterInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), parameter, value.rawAddress.toCPointer<ByteVar>())

public actual fun processBufferedPacketsInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    windowssysWindowsWin32UiInteractioncontextProcessBufferedPacketsInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>())

public actual fun processInertiaInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    windowssysWindowsWin32UiInteractioncontextProcessInertiaInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>())

public actual fun processPointerFramesInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointercount: UInt, pointerinfo: ConstPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextProcessPointerFramesInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), entriescount, pointercount, pointerinfo.rawAddress.toCPointer<ByteVar>())

public actual fun registerOutputCallbackInteractionContext(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback, clientdata: ConstPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), clientdata.rawAddress.toCPointer<ByteVar>())

public actual fun registerOutputCallbackInteractionContext2(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback2, clientdata: ConstPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext2(interactioncontext.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), clientdata.rawAddress.toCPointer<ByteVar>())

public actual fun removePointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    windowssysWindowsWin32UiInteractioncontextRemovePointerInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), pointerid)

public actual fun resetInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    windowssysWindowsWin32UiInteractioncontextResetInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>())

public actual fun setCrossSlideParametersInteractionContext(interactioncontext: Hinteractioncontext, parametercount: UInt, crossslideparameters: ConstPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextSetCrossSlideParametersInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), parametercount, crossslideparameters.rawAddress.toCPointer<ByteVar>())

public actual fun setHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: Float): Hresult =
    windowssysWindowsWin32UiInteractioncontextSetHoldParameterInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), parameter, value)

public actual fun setInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: Float): Hresult =
    windowssysWindowsWin32UiInteractioncontextSetInertiaParameterInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), inertiaparameter, value)

public actual fun setInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: ConstPtr): Hresult =
    windowssysWindowsWin32UiInteractioncontextSetInteractionConfigurationInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), configurationcount, configuration.rawAddress.toCPointer<ByteVar>())

public actual fun setMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: Float): Hresult =
    windowssysWindowsWin32UiInteractioncontextSetMouseWheelParameterInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), parameter, value)

public actual fun setPivotInteractionContext(interactioncontext: Hinteractioncontext, x: Float, y: Float, radius: Float): Hresult =
    windowssysWindowsWin32UiInteractioncontextSetPivotInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), x, y, radius)

public actual fun setPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: UInt): Hresult =
    windowssysWindowsWin32UiInteractioncontextSetPropertyInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), contextproperty, value)

public actual fun setTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: Float): Hresult =
    windowssysWindowsWin32UiInteractioncontextSetTapParameterInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), parameter, value)

public actual fun setTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: Float): Hresult =
    windowssysWindowsWin32UiInteractioncontextSetTranslationParameterInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>(), parameter, value)

public actual fun stopInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    windowssysWindowsWin32UiInteractioncontextStopInteractionContext(interactioncontext.rawAddress.toCPointer<ByteVar>())
