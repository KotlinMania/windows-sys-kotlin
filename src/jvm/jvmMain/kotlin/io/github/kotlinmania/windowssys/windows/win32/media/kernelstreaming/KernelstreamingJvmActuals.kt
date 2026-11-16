@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32MediaKernelstreamingJniBridge {
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
        val stream = WindowsWin32MediaKernelstreamingJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator(connectionhandle: Long, allocatorframing: Long, allocatorhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator2(connectionhandle: Long, allocatorframing: Long, allocatorhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaKernelstreamingKsCreateClock(connectionhandle: Long, clockcreate: Long, clockhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaKernelstreamingKsCreateClock2(connectionhandle: Long, clockcreate: Long, clockhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaKernelstreamingKsCreatePin(filterhandle: Long, connect: Long, desiredaccess: Int, connectionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaKernelstreamingKsCreatePin2(filterhandle: Long, connect: Long, desiredaccess: Int, connectionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode(parenthandle: Long, nodecreate: Long, desiredaccess: Int, nodehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode2(parenthandle: Long, nodecreate: Long, desiredaccess: Int, nodehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaKernelstreamingKsGetMediaTypeCount(filterhandle: Long, pinfactoryid: Int, mediatypecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaKernelstreamingKsGetMultiplePinFactoryItems(filterhandle: Long, pinfactoryid: Int, propertyid: Int, items: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaKernelstreamingKsOpenDefaultDevice(category: Long, access: Int, devicehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaKernelstreamingKsResolveRequiredAttributes(datarange: Long, attributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaKernelstreamingKsSynchronousDeviceControl(handle: Long, iocontrol: Int, inbuffer: Long, inlength: Int, outbuffer: Long, outlength: Int, bytesreturned: Long): Int
}

public actual fun ksCreateAllocator(connectionhandle: Handle, allocatorframing: ConstPtr, allocatorhandle: MutPtr): UInt =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator(connectionhandle.rawAddress, allocatorframing.rawAddress, allocatorhandle.rawAddress).toUInt()

public actual fun ksCreateAllocator2(connectionhandle: Handle, allocatorframing: ConstPtr, allocatorhandle: MutPtr): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator2(connectionhandle.rawAddress, allocatorframing.rawAddress, allocatorhandle.rawAddress)

public actual fun ksCreateClock(connectionhandle: Handle, clockcreate: ConstPtr, clockhandle: MutPtr): UInt =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsCreateClock(connectionhandle.rawAddress, clockcreate.rawAddress, clockhandle.rawAddress).toUInt()

public actual fun ksCreateClock2(connectionhandle: Handle, clockcreate: ConstPtr, clockhandle: MutPtr): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsCreateClock2(connectionhandle.rawAddress, clockcreate.rawAddress, clockhandle.rawAddress)

public actual fun ksCreatePin(filterhandle: Handle, connect: ConstPtr, desiredaccess: UInt, connectionhandle: MutPtr): UInt =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsCreatePin(filterhandle.rawAddress, connect.rawAddress, desiredaccess.toInt(), connectionhandle.rawAddress).toUInt()

public actual fun ksCreatePin2(filterhandle: Handle, connect: ConstPtr, desiredaccess: UInt, connectionhandle: MutPtr): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsCreatePin2(filterhandle.rawAddress, connect.rawAddress, desiredaccess.toInt(), connectionhandle.rawAddress)

public actual fun ksCreateTopologyNode(parenthandle: Handle, nodecreate: ConstPtr, desiredaccess: UInt, nodehandle: MutPtr): UInt =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode(parenthandle.rawAddress, nodecreate.rawAddress, desiredaccess.toInt(), nodehandle.rawAddress).toUInt()

public actual fun ksCreateTopologyNode2(parenthandle: Handle, nodecreate: ConstPtr, desiredaccess: UInt, nodehandle: MutPtr): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode2(parenthandle.rawAddress, nodecreate.rawAddress, desiredaccess.toInt(), nodehandle.rawAddress)

public actual fun ksGetMediaTypeCount(filterhandle: Handle, pinfactoryid: UInt, mediatypecount: MutPtr): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsGetMediaTypeCount(filterhandle.rawAddress, pinfactoryid.toInt(), mediatypecount.rawAddress)

public actual fun ksGetMultiplePinFactoryItems(filterhandle: Handle, pinfactoryid: UInt, propertyid: UInt, items: MutPtr): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsGetMultiplePinFactoryItems(filterhandle.rawAddress, pinfactoryid.toInt(), propertyid.toInt(), items.rawAddress)

public actual fun ksOpenDefaultDevice(category: ConstPtr, access: UInt, devicehandle: MutPtr): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsOpenDefaultDevice(category.rawAddress, access.toInt(), devicehandle.rawAddress)

public actual fun ksResolveRequiredAttributes(datarange: ConstPtr, attributes: ConstPtr): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsResolveRequiredAttributes(datarange.rawAddress, attributes.rawAddress)

public actual fun ksSynchronousDeviceControl(handle: Handle, iocontrol: UInt, inbuffer: ConstPtr, inlength: UInt, outbuffer: MutPtr, outlength: UInt, bytesreturned: MutPtr): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssysWindowsWin32MediaKernelstreamingKsSynchronousDeviceControl(handle.rawAddress, iocontrol.toInt(), inbuffer.rawAddress, inlength.toInt(), outbuffer.rawAddress, outlength.toInt(), bytesreturned.rawAddress)
