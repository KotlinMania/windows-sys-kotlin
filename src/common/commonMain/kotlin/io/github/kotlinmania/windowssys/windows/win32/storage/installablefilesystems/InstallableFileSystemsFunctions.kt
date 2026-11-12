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

public expect fun filterAttach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult

public expect fun filterAttachAtAltitude(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpaltitude: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult

public expect fun filterClose(hfilter: Hfilter): Hresult

public expect fun filterConnectCommunicationPort(lpportname: Pcwstr, dwoptions: UInt, lpcontext: ConstPtr<CVoid>, wsizeofcontext: UShort, lpsecurityattributes: ConstPtr<SecurityAttributes>, hport: MutPtr<Handle>): Hresult

public expect fun filterCreate(lpfiltername: Pcwstr, hfilter: MutPtr<Hfilter>): Hresult

public expect fun filterDetach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr): Hresult

public expect fun filterFindClose(hfilterfind: Handle): Hresult

public expect fun filterFindFirst(dwinformationclass: FilterInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpfilterfind: MutPtr<Handle>): Hresult

public expect fun filterFindNext(hfilterfind: Handle, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult

public expect fun filterGetDosName(lpvolumename: Pcwstr, lpdosname: Pwstr, dwdosnamebuffersize: UInt): Hresult

public expect fun filterGetInformation(hfilter: Hfilter, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult

public expect fun filterGetMessage(hport: Handle, lpmessagebuffer: MutPtr<FilterMessageHeader>, dwmessagebuffersize: UInt, lpoverlapped: MutPtr<Overlapped>): Hresult

public expect fun filterInstanceClose(hinstance: HfilterInstance): Hresult

public expect fun filterInstanceCreate(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, hinstance: MutPtr<HfilterInstance>): Hresult

public expect fun filterInstanceFindClose(hfilterinstancefind: Handle): Hresult

public expect fun filterInstanceFindFirst(lpfiltername: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpfilterinstancefind: MutPtr<Handle>): Hresult

public expect fun filterInstanceFindNext(hfilterinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult

public expect fun filterInstanceGetInformation(hinstance: HfilterInstance, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult

public expect fun filterLoad(lpfiltername: Pcwstr): Hresult

public expect fun filterReplyMessage(hport: Handle, lpreplybuffer: ConstPtr<FilterReplyHeader>, dwreplybuffersize: UInt): Hresult

public expect fun filterSendMessage(hport: Handle, lpinbuffer: ConstPtr<CVoid>, dwinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, dwoutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult

public expect fun filterUnload(lpfiltername: Pcwstr): Hresult

public expect fun filterVolumeFindClose(hvolumefind: Handle): Hresult

public expect fun filterVolumeFindFirst(dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpvolumefind: MutPtr<Handle>): Hresult

public expect fun filterVolumeFindNext(hvolumefind: Handle, dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult

public expect fun filterVolumeInstanceFindClose(hvolumeinstancefind: Handle): Hresult

public expect fun filterVolumeInstanceFindFirst(lpvolumename: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpvolumeinstancefind: MutPtr<Handle>): Hresult

public expect fun filterVolumeInstanceFindNext(hvolumeinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult
