@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

private object WindowsWin32StorageInstallablefilesystemsJniBridge {
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
        val stream = WindowsWin32StorageInstallablefilesystemsJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterAttach(lpfiltername: Long, lpvolumename: Long, lpinstancename: Long, dwcreatedinstancenamelength: Int, lpcreatedinstancename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterAttachAtAltitude(lpfiltername: Long, lpvolumename: Long, lpaltitude: Long, lpinstancename: Long, dwcreatedinstancenamelength: Int, lpcreatedinstancename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterClose(hfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterConnectCommunicationPort(lpportname: Long, dwoptions: Int, lpcontext: Long, wsizeofcontext: Short, lpsecurityattributes: Long, hport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterCreate(lpfiltername: Long, hfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterDetach(lpfiltername: Long, lpvolumename: Long, lpinstancename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterFindClose(hfilterfind: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterFindFirst(dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long, lpfilterfind: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterFindNext(hfilterfind: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterGetDosName(lpvolumename: Long, lpdosname: Long, dwdosnamebuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterGetInformation(hfilter: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterGetMessage(hport: Long, lpmessagebuffer: Long, dwmessagebuffersize: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceClose(hinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceCreate(lpfiltername: Long, lpvolumename: Long, lpinstancename: Long, hinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindClose(hfilterinstancefind: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindFirst(lpfiltername: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long, lpfilterinstancefind: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindNext(hfilterinstancefind: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceGetInformation(hinstance: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterLoad(lpfiltername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterReplyMessage(hport: Long, lpreplybuffer: Long, dwreplybuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterSendMessage(hport: Long, lpinbuffer: Long, dwinbuffersize: Int, lpoutbuffer: Long, dwoutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterUnload(lpfiltername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindClose(hvolumefind: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindFirst(dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long, lpvolumefind: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindNext(hvolumefind: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindClose(hvolumeinstancefind: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindFirst(lpvolumename: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long, lpvolumeinstancefind: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindNext(hvolumeinstancefind: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int
}

public actual fun filterAttach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterAttach(lpfiltername.rawAddress, lpvolumename.rawAddress, lpinstancename.rawAddress, dwcreatedinstancenamelength.toInt(), lpcreatedinstancename.rawAddress)

public actual fun filterAttachAtAltitude(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpaltitude: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterAttachAtAltitude(lpfiltername.rawAddress, lpvolumename.rawAddress, lpaltitude.rawAddress, lpinstancename.rawAddress, dwcreatedinstancenamelength.toInt(), lpcreatedinstancename.rawAddress)

public actual fun filterClose(hfilter: Hfilter): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterClose(hfilter)

public actual fun filterConnectCommunicationPort(lpportname: Pcwstr, dwoptions: UInt, lpcontext: ConstPtr<CVoid>, wsizeofcontext: UShort, lpsecurityattributes: ConstPtr<SecurityAttributes>, hport: MutPtr<Handle>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterConnectCommunicationPort(lpportname.rawAddress, dwoptions.toInt(), lpcontext.rawAddress, wsizeofcontext.toShort(), lpsecurityattributes.rawAddress, hport.rawAddress)

public actual fun filterCreate(lpfiltername: Pcwstr, hfilter: MutPtr<Hfilter>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterCreate(lpfiltername.rawAddress, hfilter.rawAddress)

public actual fun filterDetach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterDetach(lpfiltername.rawAddress, lpvolumename.rawAddress, lpinstancename.rawAddress)

public actual fun filterFindClose(hfilterfind: Handle): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterFindClose(hfilterfind.rawAddress)

public actual fun filterFindFirst(dwinformationclass: FilterInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpfilterfind: MutPtr<Handle>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterFindFirst(dwinformationclass, lpbuffer.rawAddress, dwbuffersize.toInt(), lpbytesreturned.rawAddress, lpfilterfind.rawAddress)

public actual fun filterFindNext(hfilterfind: Handle, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterFindNext(hfilterfind.rawAddress, dwinformationclass, lpbuffer.rawAddress, dwbuffersize.toInt(), lpbytesreturned.rawAddress)

public actual fun filterGetDosName(lpvolumename: Pcwstr, lpdosname: Pwstr, dwdosnamebuffersize: UInt): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterGetDosName(lpvolumename.rawAddress, lpdosname.rawAddress, dwdosnamebuffersize.toInt())

public actual fun filterGetInformation(hfilter: Hfilter, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterGetInformation(hfilter, dwinformationclass, lpbuffer.rawAddress, dwbuffersize.toInt(), lpbytesreturned.rawAddress)

public actual fun filterGetMessage(hport: Handle, lpmessagebuffer: MutPtr<FilterMessageHeader>, dwmessagebuffersize: UInt, lpoverlapped: MutPtr<Overlapped>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterGetMessage(hport.rawAddress, lpmessagebuffer.rawAddress, dwmessagebuffersize.toInt(), lpoverlapped.rawAddress)

public actual fun filterInstanceClose(hinstance: HfilterInstance): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceClose(hinstance)

public actual fun filterInstanceCreate(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, hinstance: MutPtr<HfilterInstance>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceCreate(lpfiltername.rawAddress, lpvolumename.rawAddress, lpinstancename.rawAddress, hinstance.rawAddress)

public actual fun filterInstanceFindClose(hfilterinstancefind: Handle): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindClose(hfilterinstancefind.rawAddress)

public actual fun filterInstanceFindFirst(lpfiltername: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpfilterinstancefind: MutPtr<Handle>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindFirst(lpfiltername.rawAddress, dwinformationclass, lpbuffer.rawAddress, dwbuffersize.toInt(), lpbytesreturned.rawAddress, lpfilterinstancefind.rawAddress)

public actual fun filterInstanceFindNext(hfilterinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindNext(hfilterinstancefind.rawAddress, dwinformationclass, lpbuffer.rawAddress, dwbuffersize.toInt(), lpbytesreturned.rawAddress)

public actual fun filterInstanceGetInformation(hinstance: HfilterInstance, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceGetInformation(hinstance, dwinformationclass, lpbuffer.rawAddress, dwbuffersize.toInt(), lpbytesreturned.rawAddress)

public actual fun filterLoad(lpfiltername: Pcwstr): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterLoad(lpfiltername.rawAddress)

public actual fun filterReplyMessage(hport: Handle, lpreplybuffer: ConstPtr<FilterReplyHeader>, dwreplybuffersize: UInt): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterReplyMessage(hport.rawAddress, lpreplybuffer.rawAddress, dwreplybuffersize.toInt())

public actual fun filterSendMessage(hport: Handle, lpinbuffer: ConstPtr<CVoid>, dwinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, dwoutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterSendMessage(hport.rawAddress, lpinbuffer.rawAddress, dwinbuffersize.toInt(), lpoutbuffer.rawAddress, dwoutbuffersize.toInt(), lpbytesreturned.rawAddress)

public actual fun filterUnload(lpfiltername: Pcwstr): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterUnload(lpfiltername.rawAddress)

public actual fun filterVolumeFindClose(hvolumefind: Handle): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindClose(hvolumefind.rawAddress)

public actual fun filterVolumeFindFirst(dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpvolumefind: MutPtr<Handle>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindFirst(dwinformationclass, lpbuffer.rawAddress, dwbuffersize.toInt(), lpbytesreturned.rawAddress, lpvolumefind.rawAddress)

public actual fun filterVolumeFindNext(hvolumefind: Handle, dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindNext(hvolumefind.rawAddress, dwinformationclass, lpbuffer.rawAddress, dwbuffersize.toInt(), lpbytesreturned.rawAddress)

public actual fun filterVolumeInstanceFindClose(hvolumeinstancefind: Handle): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindClose(hvolumeinstancefind.rawAddress)

public actual fun filterVolumeInstanceFindFirst(lpvolumename: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpvolumeinstancefind: MutPtr<Handle>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindFirst(lpvolumename.rawAddress, dwinformationclass, lpbuffer.rawAddress, dwbuffersize.toInt(), lpbytesreturned.rawAddress, lpvolumeinstancefind.rawAddress)

public actual fun filterVolumeInstanceFindNext(hvolumeinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindNext(hvolumeinstancefind.rawAddress, dwinformationclass, lpbuffer.rawAddress, dwbuffersize.toInt(), lpbytesreturned.rawAddress)
