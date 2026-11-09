@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun FilterAttach(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterAttach(lpfiltername.toCPointer<ByteVar>(), lpvolumename.toCPointer<ByteVar>(), lpinstancename.toCPointer<ByteVar>(), dwcreatedinstancenamelength, lpcreatedinstancename.toCPointer<ByteVar>())

public actual fun FilterAttachAtAltitude(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpaltitude: PCWSTR, lpinstancename: PCWSTR, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterAttachAtAltitude(lpfiltername.toCPointer<ByteVar>(), lpvolumename.toCPointer<ByteVar>(), lpaltitude.toCPointer<ByteVar>(), lpinstancename.toCPointer<ByteVar>(), dwcreatedinstancenamelength, lpcreatedinstancename.toCPointer<ByteVar>())

public actual fun FilterClose(hfilter: HFILTER): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterClose(hfilter)

public actual fun FilterConnectCommunicationPort(lpportname: PCWSTR, dwoptions: UInt, lpcontext: Long, wsizeofcontext: UShort, lpsecurityattributes: Long, hport: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterConnectCommunicationPort(lpportname.toCPointer<ByteVar>(), dwoptions, lpcontext.toCPointer<ByteVar>(), wsizeofcontext, lpsecurityattributes.toCPointer<ByteVar>(), hport.toCPointer<ByteVar>())

public actual fun FilterCreate(lpfiltername: PCWSTR, hfilter: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterCreate(lpfiltername.toCPointer<ByteVar>(), hfilter.toCPointer<ByteVar>())

public actual fun FilterDetach(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterDetach(lpfiltername.toCPointer<ByteVar>(), lpvolumename.toCPointer<ByteVar>(), lpinstancename.toCPointer<ByteVar>())

public actual fun FilterFindClose(hfilterfind: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterFindClose(hfilterfind.toCPointer<ByteVar>())

public actual fun FilterFindFirst(dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterfind: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterFindFirst(dwinformationclass, lpbuffer.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpfilterfind.toCPointer<ByteVar>())

public actual fun FilterFindNext(hfilterfind: HANDLE, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterFindNext(hfilterfind.toCPointer<ByteVar>(), dwinformationclass, lpbuffer.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun FilterGetDosName(lpvolumename: PCWSTR, lpdosname: PWSTR, dwdosnamebuffersize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterGetDosName(lpvolumename.toCPointer<ByteVar>(), lpdosname.toCPointer<ByteVar>(), dwdosnamebuffersize)

public actual fun FilterGetInformation(hfilter: HFILTER, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterGetInformation(hfilter, dwinformationclass, lpbuffer.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun FilterGetMessage(hport: HANDLE, lpmessagebuffer: Long, dwmessagebuffersize: UInt, lpoverlapped: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterGetMessage(hport.toCPointer<ByteVar>(), lpmessagebuffer.toCPointer<ByteVar>(), dwmessagebuffersize, lpoverlapped.toCPointer<ByteVar>())

public actual fun FilterInstanceClose(hinstance: HFILTER_INSTANCE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceClose(hinstance)

public actual fun FilterInstanceCreate(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, hinstance: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceCreate(lpfiltername.toCPointer<ByteVar>(), lpvolumename.toCPointer<ByteVar>(), lpinstancename.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>())

public actual fun FilterInstanceFindClose(hfilterinstancefind: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindClose(hfilterinstancefind.toCPointer<ByteVar>())

public actual fun FilterInstanceFindFirst(lpfiltername: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterinstancefind: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindFirst(lpfiltername.toCPointer<ByteVar>(), dwinformationclass, lpbuffer.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpfilterinstancefind.toCPointer<ByteVar>())

public actual fun FilterInstanceFindNext(hfilterinstancefind: HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindNext(hfilterinstancefind.toCPointer<ByteVar>(), dwinformationclass, lpbuffer.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun FilterInstanceGetInformation(hinstance: HFILTER_INSTANCE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceGetInformation(hinstance, dwinformationclass, lpbuffer.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun FilterLoad(lpfiltername: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterLoad(lpfiltername.toCPointer<ByteVar>())

public actual fun FilterReplyMessage(hport: HANDLE, lpreplybuffer: Long, dwreplybuffersize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterReplyMessage(hport.toCPointer<ByteVar>(), lpreplybuffer.toCPointer<ByteVar>(), dwreplybuffersize)

public actual fun FilterSendMessage(hport: HANDLE, lpinbuffer: Long, dwinbuffersize: UInt, lpoutbuffer: Long, dwoutbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterSendMessage(hport.toCPointer<ByteVar>(), lpinbuffer.toCPointer<ByteVar>(), dwinbuffersize, lpoutbuffer.toCPointer<ByteVar>(), dwoutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun FilterUnload(lpfiltername: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterUnload(lpfiltername.toCPointer<ByteVar>())

public actual fun FilterVolumeFindClose(hvolumefind: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindClose(hvolumefind.toCPointer<ByteVar>())

public actual fun FilterVolumeFindFirst(dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumefind: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindFirst(dwinformationclass, lpbuffer.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpvolumefind.toCPointer<ByteVar>())

public actual fun FilterVolumeFindNext(hvolumefind: HANDLE, dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindNext(hvolumefind.toCPointer<ByteVar>(), dwinformationclass, lpbuffer.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun FilterVolumeInstanceFindClose(hvolumeinstancefind: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindClose(hvolumeinstancefind.toCPointer<ByteVar>())

public actual fun FilterVolumeInstanceFindFirst(lpvolumename: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumeinstancefind: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindFirst(lpvolumename.toCPointer<ByteVar>(), dwinformationclass, lpbuffer.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpvolumeinstancefind.toCPointer<ByteVar>())

public actual fun FilterVolumeInstanceFindNext(hvolumeinstancefind: HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindNext(hvolumeinstancefind.toCPointer<ByteVar>(), dwinformationclass, lpbuffer.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.toCPointer<ByteVar>())
