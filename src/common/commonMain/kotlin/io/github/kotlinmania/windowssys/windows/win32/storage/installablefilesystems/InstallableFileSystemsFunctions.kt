package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun FilterAttach(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterAttach", longArrayOf(lpfiltername, lpvolumename, lpinstancename, dwcreatedinstancenamelength.toLong(), lpcreatedinstancename)).toInt()
}

public fun FilterAttachAtAltitude(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpaltitude: PCWSTR, lpinstancename: PCWSTR, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterAttachAtAltitude", longArrayOf(lpfiltername, lpvolumename, lpaltitude, lpinstancename, dwcreatedinstancenamelength.toLong(), lpcreatedinstancename)).toInt()
}

public fun FilterClose(hfilter: HFILTER): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterClose", longArrayOf(hfilter)).toInt()
}

public fun FilterConnectCommunicationPort(lpportname: PCWSTR, dwoptions: UInt, lpcontext: Long, wsizeofcontext: UShort, lpsecurityattributes: Long, hport: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterConnectCommunicationPort", longArrayOf(lpportname, dwoptions.toLong(), lpcontext, wsizeofcontext.toLong(), lpsecurityattributes, hport)).toInt()
}

public fun FilterCreate(lpfiltername: PCWSTR, hfilter: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterCreate", longArrayOf(lpfiltername, hfilter)).toInt()
}

public fun FilterDetach(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterDetach", longArrayOf(lpfiltername, lpvolumename, lpinstancename)).toInt()
}

public fun FilterFindClose(hfilterfind: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterFindClose", longArrayOf(hfilterfind)).toInt()
}

public fun FilterFindFirst(dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterfind: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterFindFirst", longArrayOf(dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned, lpfilterfind)).toInt()
}

public fun FilterFindNext(hfilterfind: HANDLE, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterFindNext", longArrayOf(hfilterfind, dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun FilterGetDosName(lpvolumename: PCWSTR, lpdosname: PWSTR, dwdosnamebuffersize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterGetDosName", longArrayOf(lpvolumename, lpdosname, dwdosnamebuffersize.toLong())).toInt()
}

public fun FilterGetInformation(hfilter: HFILTER, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterGetInformation", longArrayOf(hfilter, dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun FilterGetMessage(hport: HANDLE, lpmessagebuffer: Long, dwmessagebuffersize: UInt, lpoverlapped: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterGetMessage", longArrayOf(hport, lpmessagebuffer, dwmessagebuffersize.toLong(), lpoverlapped)).toInt()
}

public fun FilterInstanceClose(hinstance: HFILTER_INSTANCE): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterInstanceClose", longArrayOf(hinstance)).toInt()
}

public fun FilterInstanceCreate(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, hinstance: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterInstanceCreate", longArrayOf(lpfiltername, lpvolumename, lpinstancename, hinstance)).toInt()
}

public fun FilterInstanceFindClose(hfilterinstancefind: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterInstanceFindClose", longArrayOf(hfilterinstancefind)).toInt()
}

public fun FilterInstanceFindFirst(lpfiltername: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterinstancefind: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterInstanceFindFirst", longArrayOf(lpfiltername, dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned, lpfilterinstancefind)).toInt()
}

public fun FilterInstanceFindNext(hfilterinstancefind: HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterInstanceFindNext", longArrayOf(hfilterinstancefind, dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun FilterInstanceGetInformation(hinstance: HFILTER_INSTANCE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterInstanceGetInformation", longArrayOf(hinstance, dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun FilterLoad(lpfiltername: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterLoad", longArrayOf(lpfiltername)).toInt()
}

public fun FilterReplyMessage(hport: HANDLE, lpreplybuffer: Long, dwreplybuffersize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterReplyMessage", longArrayOf(hport, lpreplybuffer, dwreplybuffersize.toLong())).toInt()
}

public fun FilterSendMessage(hport: HANDLE, lpinbuffer: Long, dwinbuffersize: UInt, lpoutbuffer: Long, dwoutbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterSendMessage", longArrayOf(hport, lpinbuffer, dwinbuffersize.toLong(), lpoutbuffer, dwoutbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun FilterUnload(lpfiltername: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterUnload", longArrayOf(lpfiltername)).toInt()
}

public fun FilterVolumeFindClose(hvolumefind: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterVolumeFindClose", longArrayOf(hvolumefind)).toInt()
}

public fun FilterVolumeFindFirst(dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumefind: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterVolumeFindFirst", longArrayOf(dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned, lpvolumefind)).toInt()
}

public fun FilterVolumeFindNext(hvolumefind: HANDLE, dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterVolumeFindNext", longArrayOf(hvolumefind, dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun FilterVolumeInstanceFindClose(hvolumeinstancefind: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterVolumeInstanceFindClose", longArrayOf(hvolumeinstancefind)).toInt()
}

public fun FilterVolumeInstanceFindFirst(lpvolumename: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumeinstancefind: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterVolumeInstanceFindFirst", longArrayOf(lpvolumename, dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned, lpvolumeinstancefind)).toInt()
}

public fun FilterVolumeInstanceFindNext(hvolumeinstancefind: HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterVolumeInstanceFindNext", longArrayOf(hvolumeinstancefind, dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned)).toInt()
}
