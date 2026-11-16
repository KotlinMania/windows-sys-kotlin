@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32SystemEventcollectorJniBridge {
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
        val stream = WindowsWin32SystemEventcollectorJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemEventcollectorEcClose(obj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcDeleteSubscription(subscriptionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: Int, subscriptionnamebuffer: Long, subscriptionnamebufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcGetObjectArrayProperty(objectarray: Long, propertyid: Int, arrayindex: Int, flags: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcGetObjectArraySize(objectarray: Long, objectarraysize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionProperty(subscription: Long, propertyid: Int, flags: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionRunTimeStatus(subscriptionname: Long, statusinfoid: Int, eventsourcename: Long, flags: Int, statusvaluebuffersize: Int, statusvaluebuffer: Long, statusvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement(objectarray: Long, arrayindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcOpenSubscription(subscriptionname: Long, accessmask: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum(flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement(objectarray: Long, arrayindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcRetrySubscription(subscriptionname: Long, eventsourcename: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcSaveSubscription(subscription: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcSetObjectArrayProperty(objectarray: Long, propertyid: Int, arrayindex: Int, flags: Int, propertyvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventcollectorEcSetSubscriptionProperty(subscription: Long, propertyid: Int, flags: Int, propertyvalue: Long): Int
}

public actual fun ecClose(obj: Long): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcClose(obj)

public actual fun ecDeleteSubscription(subscriptionname: Pcwstr, flags: UInt): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcDeleteSubscription(subscriptionname.rawAddress, flags.toInt())

public actual fun ecEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: Pwstr, subscriptionnamebufferused: MutPtr): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcEnumNextSubscription(subscriptionenum, subscriptionnamebuffersize.toInt(), subscriptionnamebuffer.rawAddress, subscriptionnamebufferused.rawAddress)

public actual fun ecGetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcGetObjectArrayProperty(objectarray, propertyid, arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress, propertyvaluebufferused.rawAddress)

public actual fun ecGetObjectArraySize(objectarray: Long, objectarraysize: MutPtr): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcGetObjectArraySize(objectarray, objectarraysize.rawAddress)

public actual fun ecGetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionProperty(subscription, propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress, propertyvaluebufferused.rawAddress)

public actual fun ecGetSubscriptionRunTimeStatus(subscriptionname: Pcwstr, statusinfoid: EcSubscriptionRuntimeStatusInfoId, eventsourcename: Pcwstr, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: MutPtr, statusvaluebufferused: MutPtr): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionRunTimeStatus(subscriptionname.rawAddress, statusinfoid, eventsourcename.rawAddress, flags.toInt(), statusvaluebuffersize.toInt(), statusvaluebuffer.rawAddress, statusvaluebufferused.rawAddress)

public actual fun ecInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement(objectarray, arrayindex.toInt())

public actual fun ecOpenSubscription(subscriptionname: Pcwstr, accessmask: UInt, flags: UInt): Long =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcOpenSubscription(subscriptionname.rawAddress, accessmask.toInt(), flags.toInt())

public actual fun ecOpenSubscriptionEnum(flags: UInt): Long =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum(flags.toInt())

public actual fun ecRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement(objectarray, arrayindex.toInt())

public actual fun ecRetrySubscription(subscriptionname: Pcwstr, eventsourcename: Pcwstr, flags: UInt): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcRetrySubscription(subscriptionname.rawAddress, eventsourcename.rawAddress, flags.toInt())

public actual fun ecSaveSubscription(subscription: Long, flags: UInt): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcSaveSubscription(subscription, flags.toInt())

public actual fun ecSetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvalue: MutPtr): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcSetObjectArrayProperty(objectarray, propertyid, arrayindex.toInt(), flags.toInt(), propertyvalue.rawAddress)

public actual fun ecSetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvalue: MutPtr): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssysWindowsWin32SystemEventcollectorEcSetSubscriptionProperty(subscription, propertyid, flags.toInt(), propertyvalue.rawAddress)
