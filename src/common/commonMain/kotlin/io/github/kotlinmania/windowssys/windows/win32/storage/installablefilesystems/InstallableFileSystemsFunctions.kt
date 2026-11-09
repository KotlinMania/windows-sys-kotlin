package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun FilterAttach(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: PWSTR): HRESULT

public expect fun FilterAttachAtAltitude(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpaltitude: PCWSTR, lpinstancename: PCWSTR, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: PWSTR): HRESULT

public expect fun FilterClose(hfilter: HFILTER): HRESULT

public expect fun FilterConnectCommunicationPort(lpportname: PCWSTR, dwoptions: UInt, lpcontext: Long, wsizeofcontext: UShort, lpsecurityattributes: Long, hport: Long): HRESULT

public expect fun FilterCreate(lpfiltername: PCWSTR, hfilter: Long): HRESULT

public expect fun FilterDetach(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR): HRESULT

public expect fun FilterFindClose(hfilterfind: HANDLE): HRESULT

public expect fun FilterFindFirst(dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterfind: Long): HRESULT

public expect fun FilterFindNext(hfilterfind: HANDLE, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT

public expect fun FilterGetDosName(lpvolumename: PCWSTR, lpdosname: PWSTR, dwdosnamebuffersize: UInt): HRESULT

public expect fun FilterGetInformation(hfilter: HFILTER, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT

public expect fun FilterGetMessage(hport: HANDLE, lpmessagebuffer: Long, dwmessagebuffersize: UInt, lpoverlapped: Long): HRESULT

public expect fun FilterInstanceClose(hinstance: HFILTER_INSTANCE): HRESULT

public expect fun FilterInstanceCreate(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, hinstance: Long): HRESULT

public expect fun FilterInstanceFindClose(hfilterinstancefind: HANDLE): HRESULT

public expect fun FilterInstanceFindFirst(lpfiltername: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterinstancefind: Long): HRESULT

public expect fun FilterInstanceFindNext(hfilterinstancefind: HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT

public expect fun FilterInstanceGetInformation(hinstance: HFILTER_INSTANCE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT

public expect fun FilterLoad(lpfiltername: PCWSTR): HRESULT

public expect fun FilterReplyMessage(hport: HANDLE, lpreplybuffer: Long, dwreplybuffersize: UInt): HRESULT

public expect fun FilterSendMessage(hport: HANDLE, lpinbuffer: Long, dwinbuffersize: UInt, lpoutbuffer: Long, dwoutbuffersize: UInt, lpbytesreturned: Long): HRESULT

public expect fun FilterUnload(lpfiltername: PCWSTR): HRESULT

public expect fun FilterVolumeFindClose(hvolumefind: HANDLE): HRESULT

public expect fun FilterVolumeFindFirst(dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumefind: Long): HRESULT

public expect fun FilterVolumeFindNext(hvolumefind: HANDLE, dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT

public expect fun FilterVolumeInstanceFindClose(hvolumeinstancefind: HANDLE): HRESULT

public expect fun FilterVolumeInstanceFindFirst(lpvolumename: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumeinstancefind: Long): HRESULT

public expect fun FilterVolumeInstanceFindNext(hvolumeinstancefind: HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT
