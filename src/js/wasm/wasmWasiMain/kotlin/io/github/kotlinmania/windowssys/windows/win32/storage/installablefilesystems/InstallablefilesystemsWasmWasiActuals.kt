@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun FilterAttach(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: PWSTR): HRESULT =
    0

public actual fun FilterAttachAtAltitude(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpaltitude: PCWSTR, lpinstancename: PCWSTR, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: PWSTR): HRESULT =
    0

public actual fun FilterClose(hfilter: HFILTER): HRESULT =
    0

public actual fun FilterConnectCommunicationPort(lpportname: PCWSTR, dwoptions: UInt, lpcontext: Long, wsizeofcontext: UShort, lpsecurityattributes: Long, hport: Long): HRESULT =
    0

public actual fun FilterCreate(lpfiltername: PCWSTR, hfilter: Long): HRESULT =
    0

public actual fun FilterDetach(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR): HRESULT =
    0

public actual fun FilterFindClose(hfilterfind: HANDLE): HRESULT =
    0

public actual fun FilterFindFirst(dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterfind: Long): HRESULT =
    0

public actual fun FilterFindNext(hfilterfind: HANDLE, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    0

public actual fun FilterGetDosName(lpvolumename: PCWSTR, lpdosname: PWSTR, dwdosnamebuffersize: UInt): HRESULT =
    0

public actual fun FilterGetInformation(hfilter: HFILTER, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    0

public actual fun FilterGetMessage(hport: HANDLE, lpmessagebuffer: Long, dwmessagebuffersize: UInt, lpoverlapped: Long): HRESULT =
    0

public actual fun FilterInstanceClose(hinstance: HFILTER_INSTANCE): HRESULT =
    0

public actual fun FilterInstanceCreate(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, hinstance: Long): HRESULT =
    0

public actual fun FilterInstanceFindClose(hfilterinstancefind: HANDLE): HRESULT =
    0

public actual fun FilterInstanceFindFirst(lpfiltername: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterinstancefind: Long): HRESULT =
    0

public actual fun FilterInstanceFindNext(hfilterinstancefind: HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    0

public actual fun FilterInstanceGetInformation(hinstance: HFILTER_INSTANCE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    0

public actual fun FilterLoad(lpfiltername: PCWSTR): HRESULT =
    0

public actual fun FilterReplyMessage(hport: HANDLE, lpreplybuffer: Long, dwreplybuffersize: UInt): HRESULT =
    0

public actual fun FilterSendMessage(hport: HANDLE, lpinbuffer: Long, dwinbuffersize: UInt, lpoutbuffer: Long, dwoutbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    0

public actual fun FilterUnload(lpfiltername: PCWSTR): HRESULT =
    0

public actual fun FilterVolumeFindClose(hvolumefind: HANDLE): HRESULT =
    0

public actual fun FilterVolumeFindFirst(dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumefind: Long): HRESULT =
    0

public actual fun FilterVolumeFindNext(hvolumefind: HANDLE, dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    0

public actual fun FilterVolumeInstanceFindClose(hvolumeinstancefind: HANDLE): HRESULT =
    0

public actual fun FilterVolumeInstanceFindFirst(lpvolumename: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumeinstancefind: Long): HRESULT =
    0

public actual fun FilterVolumeInstanceFindNext(hvolumeinstancefind: HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    0
