package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun filterAttach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult

public expect fun filterAttachAtAltitude(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpaltitude: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult

public expect fun filterClose(hfilter: Hfilter): Hresult

public expect fun filterConnectCommunicationPort(lpportname: Pcwstr, dwoptions: UInt, lpcontext: ConstPtr, wsizeofcontext: UShort, lpsecurityattributes: ConstPtr, hport: MutPtr): Hresult

public expect fun filterCreate(lpfiltername: Pcwstr, hfilter: MutPtr): Hresult

public expect fun filterDetach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr): Hresult

public expect fun filterFindClose(hfilterfind: Handle): Hresult

public expect fun filterFindFirst(dwinformationclass: FilterInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr, lpfilterfind: MutPtr): Hresult

public expect fun filterFindNext(hfilterfind: Handle, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult

public expect fun filterGetDosName(lpvolumename: Pcwstr, lpdosname: Pwstr, dwdosnamebuffersize: UInt): Hresult

public expect fun filterGetInformation(hfilter: Hfilter, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult

public expect fun filterGetMessage(hport: Handle, lpmessagebuffer: MutPtr, dwmessagebuffersize: UInt, lpoverlapped: MutPtr): Hresult

public expect fun filterInstanceClose(hinstance: HfilterInstance): Hresult

public expect fun filterInstanceCreate(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, hinstance: MutPtr): Hresult

public expect fun filterInstanceFindClose(hfilterinstancefind: Handle): Hresult

public expect fun filterInstanceFindFirst(lpfiltername: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr, lpfilterinstancefind: MutPtr): Hresult

public expect fun filterInstanceFindNext(hfilterinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult

public expect fun filterInstanceGetInformation(hinstance: HfilterInstance, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult

public expect fun filterLoad(lpfiltername: Pcwstr): Hresult

public expect fun filterReplyMessage(hport: Handle, lpreplybuffer: ConstPtr, dwreplybuffersize: UInt): Hresult

public expect fun filterSendMessage(hport: Handle, lpinbuffer: ConstPtr, dwinbuffersize: UInt, lpoutbuffer: MutPtr, dwoutbuffersize: UInt, lpbytesreturned: MutPtr): Hresult

public expect fun filterUnload(lpfiltername: Pcwstr): Hresult

public expect fun filterVolumeFindClose(hvolumefind: Handle): Hresult

public expect fun filterVolumeFindFirst(dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr, lpvolumefind: MutPtr): Hresult

public expect fun filterVolumeFindNext(hvolumefind: Handle, dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult

public expect fun filterVolumeInstanceFindClose(hvolumeinstancefind: Handle): Hresult

public expect fun filterVolumeInstanceFindFirst(lpvolumename: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr, lpvolumeinstancefind: MutPtr): Hresult

public expect fun filterVolumeInstanceFindNext(hvolumeinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult
