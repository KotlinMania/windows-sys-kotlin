@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult

private object WindowsWin32UiInteractioncontextJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32UiInteractioncontextJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextAddPointerInteractionContext(interactioncontext: Long, pointerid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextBufferPointerPacketsInteractionContext(interactioncontext: Long, entriescount: Int, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextCreateInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextDestroyInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextGetCrossSlideParameterInteractionContext(interactioncontext: Long, threshold: Int, distance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextGetHoldParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextGetInertiaParameterInteractionContext(interactioncontext: Long, inertiaparameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextGetInteractionConfigurationInteractionContext(interactioncontext: Long, configurationcount: Int, configuration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextGetMouseWheelParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextGetPropertyInteractionContext(interactioncontext: Long, contextproperty: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextGetStateInteractionContext(interactioncontext: Long, pointerinfo: Long, state: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextGetTapParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextGetTranslationParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextProcessBufferedPacketsInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextProcessInertiaInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextProcessPointerFramesInteractionContext(interactioncontext: Long, entriescount: Int, pointercount: Int, pointerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext(interactioncontext: Long, outputcallback: Long, clientdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext2(interactioncontext: Long, outputcallback: Long, clientdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextRemovePointerInteractionContext(interactioncontext: Long, pointerid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextResetInteractionContext(interactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextSetCrossSlideParametersInteractionContext(interactioncontext: Long, parametercount: Int, crossslideparameters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextSetHoldParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextSetInertiaParameterInteractionContext(interactioncontext: Long, inertiaparameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextSetInteractionConfigurationInteractionContext(interactioncontext: Long, configurationcount: Int, configuration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextSetMouseWheelParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextSetPivotInteractionContext(interactioncontext: Long, x: Float, y: Float, radius: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextSetPropertyInteractionContext(interactioncontext: Long, contextproperty: Int, value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextSetTapParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextSetTranslationParameterInteractionContext(interactioncontext: Long, parameter: Int, value: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInteractioncontextStopInteractionContext(interactioncontext: Long): Int
}

public actual fun addPointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextAddPointerInteractionContext(interactioncontext.rawAddress, pointerid.toInt())

public actual fun bufferPointerPacketsInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointerinfo: ConstPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextBufferPointerPacketsInteractionContext(interactioncontext.rawAddress, entriescount.toInt(), pointerinfo.rawAddress)

public actual fun createInteractionContext(interactioncontext: MutPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextCreateInteractionContext(interactioncontext.rawAddress)

public actual fun destroyInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextDestroyInteractionContext(interactioncontext.rawAddress)

public actual fun getCrossSlideParameterInteractionContext(interactioncontext: Hinteractioncontext, threshold: CrossSlideThreshold, distance: MutPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextGetCrossSlideParameterInteractionContext(interactioncontext.rawAddress, threshold, distance.rawAddress)

public actual fun getHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: MutPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextGetHoldParameterInteractionContext(interactioncontext.rawAddress, parameter, value.rawAddress)

public actual fun getInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: MutPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextGetInertiaParameterInteractionContext(interactioncontext.rawAddress, inertiaparameter, value.rawAddress)

public actual fun getInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: MutPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextGetInteractionConfigurationInteractionContext(interactioncontext.rawAddress, configurationcount.toInt(), configuration.rawAddress)

public actual fun getMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: MutPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextGetMouseWheelParameterInteractionContext(interactioncontext.rawAddress, parameter, value.rawAddress)

public actual fun getPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: MutPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextGetPropertyInteractionContext(interactioncontext.rawAddress, contextproperty, value.rawAddress)

public actual fun getStateInteractionContext(interactioncontext: Hinteractioncontext, pointerinfo: ConstPtr, state: MutPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextGetStateInteractionContext(interactioncontext.rawAddress, pointerinfo.rawAddress, state.rawAddress)

public actual fun getTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: MutPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextGetTapParameterInteractionContext(interactioncontext.rawAddress, parameter, value.rawAddress)

public actual fun getTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: MutPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextGetTranslationParameterInteractionContext(interactioncontext.rawAddress, parameter, value.rawAddress)

public actual fun processBufferedPacketsInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextProcessBufferedPacketsInteractionContext(interactioncontext.rawAddress)

public actual fun processInertiaInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextProcessInertiaInteractionContext(interactioncontext.rawAddress)

public actual fun processPointerFramesInteractionContext(interactioncontext: Hinteractioncontext, entriescount: UInt, pointercount: UInt, pointerinfo: ConstPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextProcessPointerFramesInteractionContext(interactioncontext.rawAddress, entriescount.toInt(), pointercount.toInt(), pointerinfo.rawAddress)

public actual fun registerOutputCallbackInteractionContext(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback, clientdata: ConstPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext(interactioncontext.rawAddress, 0L, clientdata.rawAddress)

public actual fun registerOutputCallbackInteractionContext2(interactioncontext: Hinteractioncontext, outputcallback: InteractionContextOutputCallback2, clientdata: ConstPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext2(interactioncontext.rawAddress, 0L, clientdata.rawAddress)

public actual fun removePointerInteractionContext(interactioncontext: Hinteractioncontext, pointerid: UInt): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextRemovePointerInteractionContext(interactioncontext.rawAddress, pointerid.toInt())

public actual fun resetInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextResetInteractionContext(interactioncontext.rawAddress)

public actual fun setCrossSlideParametersInteractionContext(interactioncontext: Hinteractioncontext, parametercount: UInt, crossslideparameters: ConstPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextSetCrossSlideParametersInteractionContext(interactioncontext.rawAddress, parametercount.toInt(), crossslideparameters.rawAddress)

public actual fun setHoldParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: HoldParameter, value: Float): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextSetHoldParameterInteractionContext(interactioncontext.rawAddress, parameter, value)

public actual fun setInertiaParameterInteractionContext(interactioncontext: Hinteractioncontext, inertiaparameter: InertiaParameter, value: Float): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextSetInertiaParameterInteractionContext(interactioncontext.rawAddress, inertiaparameter, value)

public actual fun setInteractionConfigurationInteractionContext(interactioncontext: Hinteractioncontext, configurationcount: UInt, configuration: ConstPtr): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextSetInteractionConfigurationInteractionContext(interactioncontext.rawAddress, configurationcount.toInt(), configuration.rawAddress)

public actual fun setMouseWheelParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: MouseWheelParameter, value: Float): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextSetMouseWheelParameterInteractionContext(interactioncontext.rawAddress, parameter, value)

public actual fun setPivotInteractionContext(interactioncontext: Hinteractioncontext, x: Float, y: Float, radius: Float): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextSetPivotInteractionContext(interactioncontext.rawAddress, x, y, radius)

public actual fun setPropertyInteractionContext(interactioncontext: Hinteractioncontext, contextproperty: InteractionContextProperty, value: UInt): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextSetPropertyInteractionContext(interactioncontext.rawAddress, contextproperty, value.toInt())

public actual fun setTapParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TapParameter, value: Float): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextSetTapParameterInteractionContext(interactioncontext.rawAddress, parameter, value)

public actual fun setTranslationParameterInteractionContext(interactioncontext: Hinteractioncontext, parameter: TranslationParameter, value: Float): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextSetTranslationParameterInteractionContext(interactioncontext.rawAddress, parameter, value)

public actual fun stopInteractionContext(interactioncontext: Hinteractioncontext): Hresult =
    WindowsWin32UiInteractioncontextJniBridge.windowssysWindowsWin32UiInteractioncontextStopInteractionContext(interactioncontext.rawAddress)
