@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32StorageInstallablefilesystemsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterAttach(lpfiltername: Long, lpvolumename: Long, lpinstancename: Long, dwcreatedinstancenamelength: Int, lpcreatedinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterAttachAtAltitude(lpfiltername: Long, lpvolumename: Long, lpaltitude: Long, lpinstancename: Long, dwcreatedinstancenamelength: Int, lpcreatedinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterClose(hfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterConnectCommunicationPort(lpportname: Long, dwoptions: Int, lpcontext: Long, wsizeofcontext: Short, lpsecurityattributes: Long, hport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterCreate(lpfiltername: Long, hfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterDetach(lpfiltername: Long, lpvolumename: Long, lpinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterFindClose(hfilterfind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterFindFirst(dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long, lpfilterfind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterFindNext(hfilterfind: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterGetDosName(lpvolumename: Long, lpdosname: Long, dwdosnamebuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterGetInformation(hfilter: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterGetMessage(hport: Long, lpmessagebuffer: Long, dwmessagebuffersize: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterInstanceClose(hinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterInstanceCreate(lpfiltername: Long, lpvolumename: Long, lpinstancename: Long, hinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindClose(hfilterinstancefind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindFirst(lpfiltername: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long, lpfilterinstancefind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindNext(hfilterinstancefind: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterInstanceGetInformation(hinstance: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterLoad(lpfiltername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterReplyMessage(hport: Long, lpreplybuffer: Long, dwreplybuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterSendMessage(hport: Long, lpinbuffer: Long, dwinbuffersize: Int, lpoutbuffer: Long, dwoutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterUnload(lpfiltername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindClose(hvolumefind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindFirst(dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long, lpvolumefind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindNext(hvolumefind: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindClose(hvolumeinstancefind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindFirst(lpvolumename: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long, lpvolumeinstancefind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindNext(hvolumeinstancefind: Long, dwinformationclass: Int, lpbuffer: Long, dwbuffersize: Int, lpbytesreturned: Long): Int
}

public actual fun filterAttach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterAttach((lpfiltername?.value ?: 0L), (lpvolumename?.value ?: 0L), (lpinstancename?.value ?: 0L), dwcreatedinstancenamelength.toInt(), (lpcreatedinstancename?.value ?: 0L))

public actual fun filterAttachAtAltitude(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpaltitude: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterAttachAtAltitude((lpfiltername?.value ?: 0L), (lpvolumename?.value ?: 0L), (lpaltitude?.value ?: 0L), (lpinstancename?.value ?: 0L), dwcreatedinstancenamelength.toInt(), (lpcreatedinstancename?.value ?: 0L))

public actual fun filterClose(hfilter: Hfilter): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterClose(hfilter)

public actual fun filterConnectCommunicationPort(lpportname: Pcwstr, dwoptions: UInt, lpcontext: COpaquePointer?, wsizeofcontext: UShort, lpsecurityattributes: COpaquePointer?, hport: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterConnectCommunicationPort((lpportname?.value ?: 0L), dwoptions.toInt(), (lpcontext?.value ?: 0L), wsizeofcontext.toShort(), (lpsecurityattributes?.value ?: 0L), (hport?.value ?: 0L))

public actual fun filterCreate(lpfiltername: Pcwstr, hfilter: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterCreate((lpfiltername?.value ?: 0L), (hfilter?.value ?: 0L))

public actual fun filterDetach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterDetach((lpfiltername?.value ?: 0L), (lpvolumename?.value ?: 0L), (lpinstancename?.value ?: 0L))

public actual fun filterFindClose(hfilterfind: Handle): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterFindClose((hfilterfind?.value ?: 0L))

public actual fun filterFindFirst(dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpfilterfind: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterFindFirst(dwinformationclass, (lpbuffer?.value ?: 0L), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpfilterfind?.value ?: 0L))

public actual fun filterFindNext(hfilterfind: Handle, dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterFindNext((hfilterfind?.value ?: 0L), dwinformationclass, (lpbuffer?.value ?: 0L), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L))

public actual fun filterGetDosName(lpvolumename: Pcwstr, lpdosname: Pwstr, dwdosnamebuffersize: UInt): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterGetDosName((lpvolumename?.value ?: 0L), (lpdosname?.value ?: 0L), dwdosnamebuffersize.toInt())

public actual fun filterGetInformation(hfilter: Hfilter, dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterGetInformation(hfilter, dwinformationclass, (lpbuffer?.value ?: 0L), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L))

public actual fun filterGetMessage(hport: Handle, lpmessagebuffer: COpaquePointer?, dwmessagebuffersize: UInt, lpoverlapped: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterGetMessage((hport?.value ?: 0L), (lpmessagebuffer?.value ?: 0L), dwmessagebuffersize.toInt(), (lpoverlapped?.value ?: 0L))

public actual fun filterInstanceClose(hinstance: HfilterInstance): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterInstanceClose(hinstance)

public actual fun filterInstanceCreate(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, hinstance: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterInstanceCreate((lpfiltername?.value ?: 0L), (lpvolumename?.value ?: 0L), (lpinstancename?.value ?: 0L), (hinstance?.value ?: 0L))

public actual fun filterInstanceFindClose(hfilterinstancefind: Handle): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindClose((hfilterinstancefind?.value ?: 0L))

public actual fun filterInstanceFindFirst(lpfiltername: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpfilterinstancefind: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindFirst((lpfiltername?.value ?: 0L), dwinformationclass, (lpbuffer?.value ?: 0L), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpfilterinstancefind?.value ?: 0L))

public actual fun filterInstanceFindNext(hfilterinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindNext((hfilterinstancefind?.value ?: 0L), dwinformationclass, (lpbuffer?.value ?: 0L), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L))

public actual fun filterInstanceGetInformation(hinstance: HfilterInstance, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterInstanceGetInformation(hinstance, dwinformationclass, (lpbuffer?.value ?: 0L), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L))

public actual fun filterLoad(lpfiltername: Pcwstr): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterLoad((lpfiltername?.value ?: 0L))

public actual fun filterReplyMessage(hport: Handle, lpreplybuffer: COpaquePointer?, dwreplybuffersize: UInt): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterReplyMessage((hport?.value ?: 0L), (lpreplybuffer?.value ?: 0L), dwreplybuffersize.toInt())

public actual fun filterSendMessage(hport: Handle, lpinbuffer: COpaquePointer?, dwinbuffersize: UInt, lpoutbuffer: COpaquePointer?, dwoutbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterSendMessage((hport?.value ?: 0L), (lpinbuffer?.value ?: 0L), dwinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), dwoutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L))

public actual fun filterUnload(lpfiltername: Pcwstr): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterUnload((lpfiltername?.value ?: 0L))

public actual fun filterVolumeFindClose(hvolumefind: Handle): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindClose((hvolumefind?.value ?: 0L))

public actual fun filterVolumeFindFirst(dwinformationclass: FilterVolumeInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpvolumefind: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindFirst(dwinformationclass, (lpbuffer?.value ?: 0L), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpvolumefind?.value ?: 0L))

public actual fun filterVolumeFindNext(hvolumefind: Handle, dwinformationclass: FilterVolumeInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindNext((hvolumefind?.value ?: 0L), dwinformationclass, (lpbuffer?.value ?: 0L), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L))

public actual fun filterVolumeInstanceFindClose(hvolumeinstancefind: Handle): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindClose((hvolumeinstancefind?.value ?: 0L))

public actual fun filterVolumeInstanceFindFirst(lpvolumename: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpvolumeinstancefind: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindFirst((lpvolumename?.value ?: 0L), dwinformationclass, (lpbuffer?.value ?: 0L), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpvolumeinstancefind?.value ?: 0L))

public actual fun filterVolumeInstanceFindNext(hvolumeinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    WindowsWin32StorageInstallablefilesystemsJniBridge.windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindNext((hvolumeinstancefind?.value ?: 0L), dwinformationclass, (lpbuffer?.value ?: 0L), dwbuffersize.toInt(), (lpbytesreturned?.value ?: 0L))
