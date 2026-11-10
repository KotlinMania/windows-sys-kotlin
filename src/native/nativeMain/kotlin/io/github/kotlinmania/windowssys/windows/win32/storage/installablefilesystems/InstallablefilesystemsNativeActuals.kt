@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun filterAttach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterAttach(lpfiltername?.value?.toCPointer<ByteVar>(), lpvolumename?.value?.toCPointer<ByteVar>(), lpinstancename?.value?.toCPointer<ByteVar>(), dwcreatedinstancenamelength, lpcreatedinstancename?.value?.toCPointer<ByteVar>())

public actual fun filterAttachAtAltitude(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpaltitude: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterAttachAtAltitude(lpfiltername?.value?.toCPointer<ByteVar>(), lpvolumename?.value?.toCPointer<ByteVar>(), lpaltitude?.value?.toCPointer<ByteVar>(), lpinstancename?.value?.toCPointer<ByteVar>(), dwcreatedinstancenamelength, lpcreatedinstancename?.value?.toCPointer<ByteVar>())

public actual fun filterClose(hfilter: Hfilter): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterClose(hfilter.toLong())

public actual fun filterConnectCommunicationPort(lpportname: Pcwstr, dwoptions: UInt, lpcontext: COpaquePointer?, wsizeofcontext: UShort, lpsecurityattributes: COpaquePointer?, hport: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterConnectCommunicationPort(lpportname?.value?.toCPointer<ByteVar>(), dwoptions, lpcontext?.value?.toCPointer<ByteVar>(), wsizeofcontext, lpsecurityattributes?.value?.toCPointer<ByteVar>(), hport?.value?.toCPointer<ByteVar>())

public actual fun filterCreate(lpfiltername: Pcwstr, hfilter: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterCreate(lpfiltername?.value?.toCPointer<ByteVar>(), hfilter?.value?.toCPointer<ByteVar>())

public actual fun filterDetach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterDetach(lpfiltername?.value?.toCPointer<ByteVar>(), lpvolumename?.value?.toCPointer<ByteVar>(), lpinstancename?.value?.toCPointer<ByteVar>())

public actual fun filterFindClose(hfilterfind: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterFindClose(hfilterfind?.value?.toCPointer<ByteVar>())

public actual fun filterFindFirst(dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpfilterfind: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterFindFirst(dwinformationclass, lpbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpfilterfind?.value?.toCPointer<ByteVar>())

public actual fun filterFindNext(hfilterfind: Handle, dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterFindNext(hfilterfind?.value?.toCPointer<ByteVar>(), dwinformationclass, lpbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun filterGetDosName(lpvolumename: Pcwstr, lpdosname: Pwstr, dwdosnamebuffersize: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterGetDosName(lpvolumename?.value?.toCPointer<ByteVar>(), lpdosname?.value?.toCPointer<ByteVar>(), dwdosnamebuffersize)

public actual fun filterGetInformation(hfilter: Hfilter, dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterGetInformation(hfilter.toLong(), dwinformationclass, lpbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun filterGetMessage(hport: Handle, lpmessagebuffer: COpaquePointer?, dwmessagebuffersize: UInt, lpoverlapped: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterGetMessage(hport?.value?.toCPointer<ByteVar>(), lpmessagebuffer?.value?.toCPointer<ByteVar>(), dwmessagebuffersize, lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun filterInstanceClose(hinstance: HfilterInstance): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterInstanceClose(hinstance.toLong())

public actual fun filterInstanceCreate(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, hinstance: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterInstanceCreate(lpfiltername?.value?.toCPointer<ByteVar>(), lpvolumename?.value?.toCPointer<ByteVar>(), lpinstancename?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>())

public actual fun filterInstanceFindClose(hfilterinstancefind: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindClose(hfilterinstancefind?.value?.toCPointer<ByteVar>())

public actual fun filterInstanceFindFirst(lpfiltername: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpfilterinstancefind: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindFirst(lpfiltername?.value?.toCPointer<ByteVar>(), dwinformationclass, lpbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpfilterinstancefind?.value?.toCPointer<ByteVar>())

public actual fun filterInstanceFindNext(hfilterinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindNext(hfilterinstancefind?.value?.toCPointer<ByteVar>(), dwinformationclass, lpbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun filterInstanceGetInformation(hinstance: HfilterInstance, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterInstanceGetInformation(hinstance.toLong(), dwinformationclass, lpbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun filterLoad(lpfiltername: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterLoad(lpfiltername?.value?.toCPointer<ByteVar>())

public actual fun filterReplyMessage(hport: Handle, lpreplybuffer: COpaquePointer?, dwreplybuffersize: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterReplyMessage(hport?.value?.toCPointer<ByteVar>(), lpreplybuffer?.value?.toCPointer<ByteVar>(), dwreplybuffersize)

public actual fun filterSendMessage(hport: Handle, lpinbuffer: COpaquePointer?, dwinbuffersize: UInt, lpoutbuffer: COpaquePointer?, dwoutbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterSendMessage(hport?.value?.toCPointer<ByteVar>(), lpinbuffer?.value?.toCPointer<ByteVar>(), dwinbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), dwoutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun filterUnload(lpfiltername: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterUnload(lpfiltername?.value?.toCPointer<ByteVar>())

public actual fun filterVolumeFindClose(hvolumefind: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindClose(hvolumefind?.value?.toCPointer<ByteVar>())

public actual fun filterVolumeFindFirst(dwinformationclass: FilterVolumeInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpvolumefind: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindFirst(dwinformationclass, lpbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpvolumefind?.value?.toCPointer<ByteVar>())

public actual fun filterVolumeFindNext(hvolumefind: Handle, dwinformationclass: FilterVolumeInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindNext(hvolumefind?.value?.toCPointer<ByteVar>(), dwinformationclass, lpbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun filterVolumeInstanceFindClose(hvolumeinstancefind: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindClose(hvolumeinstancefind?.value?.toCPointer<ByteVar>())

public actual fun filterVolumeInstanceFindFirst(lpvolumename: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpvolumeinstancefind: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindFirst(lpvolumename?.value?.toCPointer<ByteVar>(), dwinformationclass, lpbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpvolumeinstancefind?.value?.toCPointer<ByteVar>())

public actual fun filterVolumeInstanceFindNext(hvolumeinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindNext(hvolumeinstancefind?.value?.toCPointer<ByteVar>(), dwinformationclass, lpbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())
