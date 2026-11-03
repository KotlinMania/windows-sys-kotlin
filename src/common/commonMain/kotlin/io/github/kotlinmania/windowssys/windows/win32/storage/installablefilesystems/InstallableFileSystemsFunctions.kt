package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

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

public fun FilterFindClose(hfilterfind: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterFindClose", longArrayOf(Win32DynamicFfi.objectSlot(hfilterfind))).toInt()
}

public fun FilterFindFirst(dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterfind: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterFindFirst", longArrayOf(dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned, lpfilterfind)).toInt()
}

public fun FilterFindNext(hfilterfind: Foundation.HANDLE, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterFindNext", longArrayOf(Win32DynamicFfi.objectSlot(hfilterfind), dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun FilterGetDosName(lpvolumename: PCWSTR, lpdosname: PWSTR, dwdosnamebuffersize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterGetDosName", longArrayOf(lpvolumename, lpdosname, dwdosnamebuffersize.toLong())).toInt()
}

public fun FilterGetInformation(hfilter: HFILTER, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterGetInformation", longArrayOf(hfilter, dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun FilterGetMessage(hport: Foundation.HANDLE, lpmessagebuffer: Long, dwmessagebuffersize: UInt, lpoverlapped: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterGetMessage", longArrayOf(Win32DynamicFfi.objectSlot(hport), lpmessagebuffer, dwmessagebuffersize.toLong(), lpoverlapped)).toInt()
}

public fun FilterInstanceClose(hinstance: HFILTER_INSTANCE): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterInstanceClose", longArrayOf(hinstance)).toInt()
}

public fun FilterInstanceCreate(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, hinstance: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterInstanceCreate", longArrayOf(lpfiltername, lpvolumename, lpinstancename, hinstance)).toInt()
}

public fun FilterInstanceFindClose(hfilterinstancefind: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterInstanceFindClose", longArrayOf(Win32DynamicFfi.objectSlot(hfilterinstancefind))).toInt()
}

public fun FilterInstanceFindFirst(lpfiltername: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterinstancefind: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterInstanceFindFirst", longArrayOf(lpfiltername, dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned, lpfilterinstancefind)).toInt()
}

public fun FilterInstanceFindNext(hfilterinstancefind: Foundation.HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterInstanceFindNext", longArrayOf(Win32DynamicFfi.objectSlot(hfilterinstancefind), dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun FilterInstanceGetInformation(hinstance: HFILTER_INSTANCE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterInstanceGetInformation", longArrayOf(hinstance, dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun FilterLoad(lpfiltername: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterLoad", longArrayOf(lpfiltername)).toInt()
}

public fun FilterReplyMessage(hport: Foundation.HANDLE, lpreplybuffer: Long, dwreplybuffersize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterReplyMessage", longArrayOf(Win32DynamicFfi.objectSlot(hport), lpreplybuffer, dwreplybuffersize.toLong())).toInt()
}

public fun FilterSendMessage(hport: Foundation.HANDLE, lpinbuffer: Long, dwinbuffersize: UInt, lpoutbuffer: Long, dwoutbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterSendMessage", longArrayOf(Win32DynamicFfi.objectSlot(hport), lpinbuffer, dwinbuffersize.toLong(), lpoutbuffer, dwoutbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun FilterUnload(lpfiltername: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterUnload", longArrayOf(lpfiltername)).toInt()
}

public fun FilterVolumeFindClose(hvolumefind: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterVolumeFindClose", longArrayOf(Win32DynamicFfi.objectSlot(hvolumefind))).toInt()
}

public fun FilterVolumeFindFirst(dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumefind: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterVolumeFindFirst", longArrayOf(dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned, lpvolumefind)).toInt()
}

public fun FilterVolumeFindNext(hvolumefind: Foundation.HANDLE, dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterVolumeFindNext", longArrayOf(Win32DynamicFfi.objectSlot(hvolumefind), dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned)).toInt()
}

public fun FilterVolumeInstanceFindClose(hvolumeinstancefind: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterVolumeInstanceFindClose", longArrayOf(Win32DynamicFfi.objectSlot(hvolumeinstancefind))).toInt()
}

public fun FilterVolumeInstanceFindFirst(lpvolumename: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumeinstancefind: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterVolumeInstanceFindFirst", longArrayOf(lpvolumename, dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned, lpvolumeinstancefind)).toInt()
}

public fun FilterVolumeInstanceFindNext(hvolumeinstancefind: Foundation.HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("fltlib.dll", "FilterVolumeInstanceFindNext", longArrayOf(Win32DynamicFfi.objectSlot(hvolumeinstancefind), dwinformationclass.toLong(), lpbuffer, dwbuffersize.toLong(), lpbytesreturned)).toInt()
}
