@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32StorageInstallablefilesystemsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterAttach(lpfiltername: Long, lpvolumename: Long, lpinstancename: Long, dwcreatedinstancenamelength: Int, lpcreatedinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterAttachAtAltitude(lpfiltername: Long, lpvolumename: Long, lpaltitude: Long, lpinstancename: Long, dwcreatedinstancenamelength: Int, lpcreatedinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterClose(hfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterConnectCommunicationPort(lpportname: Long, dwoptions: Int, lpcontext: Long, wsizeofcontext: Short, lpsecurityattributes: Long, hport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterCreate(lpfiltername: Long, hfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterDetach(lpfiltername: Long, lpvolumename: Long, lpinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterFindClose(hfilterfind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterFindFirst(dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long, lpfilterfind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterFindNext(hfilterfind: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterGetDosName(lpvolumename: Long, lpdosname: Long, dwdosnamebuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterGetInformation(hfilter: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterGetMessage(hport: Long, lpmessagebuffer: Long, dwmessagebuffersize: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterInstanceClose(hinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterInstanceCreate(lpfiltername: Long, lpvolumename: Long, lpinstancename: Long, hinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindClose(hfilterinstancefind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindFirst(lpfiltername: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long, lpfilterinstancefind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindNext(hfilterinstancefind: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterInstanceGetInformation(hinstance: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterLoad(lpfiltername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterReplyMessage(hport: Long, lpreplybuffer: Long, dwreplybuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterSendMessage(hport: Long, lpinbuffer: Long, dwinbuffersize: Int, lpoutbuffer: Long, dwoutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterUnload(lpfiltername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindClose(hvolumefind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindFirst(dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long, lpvolumefind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindNext(hvolumefind: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindClose(hvolumeinstancefind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindFirst(lpvolumename: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long, lpvolumeinstancefind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindNext(hvolumeinstancefind: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int
}

public actual fun FilterAttach(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: PWSTR): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterAttach(lpfiltername, lpvolumename, lpinstancename, dwcreatedinstancenamelength.toInt(), lpcreatedinstancename)

public actual fun FilterAttachAtAltitude(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpaltitude: PCWSTR, lpinstancename: PCWSTR, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: PWSTR): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterAttachAtAltitude(lpfiltername, lpvolumename, lpaltitude, lpinstancename, dwcreatedinstancenamelength.toInt(), lpcreatedinstancename)

public actual fun FilterClose(hfilter: HFILTER): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterClose(hfilter)

public actual fun FilterConnectCommunicationPort(lpportname: PCWSTR, dwoptions: UInt, lpcontext: Long, wsizeofcontext: UShort, lpsecurityattributes: Long, hport: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterConnectCommunicationPort(lpportname, dwoptions.toInt(), lpcontext, wsizeofcontext.toShort(), lpsecurityattributes, hport)

public actual fun FilterCreate(lpfiltername: PCWSTR, hfilter: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterCreate(lpfiltername, hfilter)

public actual fun FilterDetach(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterDetach(lpfiltername, lpvolumename, lpinstancename)

public actual fun FilterFindClose(hfilterfind: HANDLE): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterFindClose(hfilterfind)

public actual fun FilterFindFirst(dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterfind: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterFindFirst(dwinformationclass, lpbuffer, dwbuffersize.toInt(), lpbytesreturned, lpfilterfind)

public actual fun FilterFindNext(hfilterfind: HANDLE, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterFindNext(hfilterfind, dwinformationclass, lpbuffer, dwbuffersize.toInt(), lpbytesreturned)

public actual fun FilterGetDosName(lpvolumename: PCWSTR, lpdosname: PWSTR, dwdosnamebuffersize: UInt): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterGetDosName(lpvolumename, lpdosname, dwdosnamebuffersize.toInt())

public actual fun FilterGetInformation(hfilter: HFILTER, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterGetInformation(hfilter, dwinformationclass, lpbuffer, dwbuffersize.toInt(), lpbytesreturned)

public actual fun FilterGetMessage(hport: HANDLE, lpmessagebuffer: Long, dwmessagebuffersize: UInt, lpoverlapped: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterGetMessage(hport, lpmessagebuffer, dwmessagebuffersize.toInt(), lpoverlapped)

public actual fun FilterInstanceClose(hinstance: HFILTER_INSTANCE): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceClose(hinstance)

public actual fun FilterInstanceCreate(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, hinstance: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceCreate(lpfiltername, lpvolumename, lpinstancename, hinstance)

public actual fun FilterInstanceFindClose(hfilterinstancefind: HANDLE): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindClose(hfilterinstancefind)

public actual fun FilterInstanceFindFirst(lpfiltername: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterinstancefind: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindFirst(lpfiltername, dwinformationclass, lpbuffer, dwbuffersize.toInt(), lpbytesreturned, lpfilterinstancefind)

public actual fun FilterInstanceFindNext(hfilterinstancefind: HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindNext(hfilterinstancefind, dwinformationclass, lpbuffer, dwbuffersize.toInt(), lpbytesreturned)

public actual fun FilterInstanceGetInformation(hinstance: HFILTER_INSTANCE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceGetInformation(hinstance, dwinformationclass, lpbuffer, dwbuffersize.toInt(), lpbytesreturned)

public actual fun FilterLoad(lpfiltername: PCWSTR): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterLoad(lpfiltername)

public actual fun FilterReplyMessage(hport: HANDLE, lpreplybuffer: Long, dwreplybuffersize: UInt): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterReplyMessage(hport, lpreplybuffer, dwreplybuffersize.toInt())

public actual fun FilterSendMessage(hport: HANDLE, lpinbuffer: Long, dwinbuffersize: UInt, lpoutbuffer: Long, dwoutbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterSendMessage(hport, lpinbuffer, dwinbuffersize.toInt(), lpoutbuffer, dwoutbuffersize.toInt(), lpbytesreturned)

public actual fun FilterUnload(lpfiltername: PCWSTR): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterUnload(lpfiltername)

public actual fun FilterVolumeFindClose(hvolumefind: HANDLE): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindClose(hvolumefind)

public actual fun FilterVolumeFindFirst(dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumefind: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindFirst(dwinformationclass, lpbuffer, dwbuffersize.toInt(), lpbytesreturned, lpvolumefind)

public actual fun FilterVolumeFindNext(hvolumefind: HANDLE, dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindNext(hvolumefind, dwinformationclass, lpbuffer, dwbuffersize.toInt(), lpbytesreturned)

public actual fun FilterVolumeInstanceFindClose(hvolumeinstancefind: HANDLE): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindClose(hvolumeinstancefind)

public actual fun FilterVolumeInstanceFindFirst(lpvolumename: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumeinstancefind: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindFirst(lpvolumename, dwinformationclass, lpbuffer, dwbuffersize.toInt(), lpbytesreturned, lpvolumeinstancefind)

public actual fun FilterVolumeInstanceFindNext(hvolumeinstancefind: HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindNext(hvolumeinstancefind, dwinformationclass, lpbuffer, dwbuffersize.toInt(), lpbytesreturned)
