package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public typealias AalType = Int

public typealias AddressFamily = UShort

public typealias ArpHardwareType = Int

public typealias ArpOpcode = Int

public typealias ControlChannelTriggerStatus = Int

public typealias FallbackIndex = Int

public typealias Icmp4TimeExceedCode = Int

public typealias Icmp4UnreachCode = Int

public typealias IgmpMaxRespCodeType = Int

public typealias Ipproto = Int

public typealias Ipv4OptionType = Int

public typealias Ipv6OptionType = Int

public typealias IpOptionTimestampFlags = Int

public fun interface LpblockingcallbackFn {
    public operator fun invoke(dwcontext: ULong): Bool
}

public typealias Lpblockingcallback = LpblockingcallbackFn?

public fun interface LpconditionprocFn {
    public operator fun invoke(lpcallerid: MutPtr<Wsabuf>, lpcallerdata: MutPtr<Wsabuf>, lpsqos: MutPtr<Qos>, lpgqos: MutPtr<Qos>, lpcalleeid: MutPtr<Wsabuf>, lpcalleedata: MutPtr<Wsabuf>, g: MutPtr<UInt>, dwcallbackdata: ULong): Int
}

public typealias Lpconditionproc = LpconditionprocFn?

public fun interface LpfnAcceptexFn {
    public operator fun invoke(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: MutPtr<CVoid>, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool
}

public typealias LpfnAcceptex = LpfnAcceptexFn?

public fun interface LpfnConnectexFn {
    public operator fun invoke(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int, lpsendbuffer: ConstPtr<CVoid>, dwsenddatalength: UInt, lpdwbytessent: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool
}

public typealias LpfnConnectex = LpfnConnectexFn?

public fun interface LpfnDisconnectexFn {
    public operator fun invoke(s: Socket, lpoverlapped: MutPtr<Overlapped>, dwflags: UInt, dwreserved: UInt): Bool
}

public typealias LpfnDisconnectex = LpfnDisconnectexFn?

public fun interface LpfnGetacceptexsockaddrsFn {
    public operator fun invoke(lpoutputbuffer: ConstPtr<CVoid>, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: MutPtr<MutPtr<Sockaddr>>, localsockaddrlength: MutPtr<Int>, remotesockaddr: MutPtr<MutPtr<Sockaddr>>, remotesockaddrlength: MutPtr<Int>)
}

public typealias LpfnGetacceptexsockaddrs = LpfnGetacceptexsockaddrsFn?

public fun interface LpfnNspapiFn {
    public operator fun invoke(): UInt
}

public typealias LpfnNspapi = LpfnNspapiFn?

public fun interface LpfnRioclosecompletionqueueFn {
    public operator fun invoke(cq: RioCq)
}

public typealias LpfnRioclosecompletionqueue = LpfnRioclosecompletionqueueFn?

public fun interface LpfnRiocreatecompletionqueueFn {
    public operator fun invoke(queuesize: UInt, notificationcompletion: ConstPtr<RioNotificationCompletion>): RioCq
}

public typealias LpfnRiocreatecompletionqueue = LpfnRiocreatecompletionqueueFn?

public fun interface LpfnRiocreaterequestqueueFn {
    public operator fun invoke(socket: Socket, maxoutstandingreceive: UInt, maxreceivedatabuffers: UInt, maxoutstandingsend: UInt, maxsenddatabuffers: UInt, receivecq: RioCq, sendcq: RioCq, socketcontext: ConstPtr<CVoid>): RioRq
}

public typealias LpfnRiocreaterequestqueue = LpfnRiocreaterequestqueueFn?

public fun interface LpfnRiodequeuecompletionFn {
    public operator fun invoke(cq: RioCq, array: MutPtr<Rioresult>, arraysize: UInt): UInt
}

public typealias LpfnRiodequeuecompletion = LpfnRiodequeuecompletionFn?

public fun interface LpfnRioderegisterbufferFn {
    public operator fun invoke(bufferid: RioBufferid)
}

public typealias LpfnRioderegisterbuffer = LpfnRioderegisterbufferFn?

public fun interface LpfnRionotifyFn {
    public operator fun invoke(cq: RioCq): Int
}

public typealias LpfnRionotify = LpfnRionotifyFn?

public fun interface LpfnRioreceiveFn {
    public operator fun invoke(socketqueue: RioRq, pdata: ConstPtr<RioBuf>, databuffercount: UInt, flags: UInt, requestcontext: ConstPtr<CVoid>): Bool
}

public typealias LpfnRioreceive = LpfnRioreceiveFn?

public fun interface LpfnRioreceiveexFn {
    public operator fun invoke(socketqueue: RioRq, pdata: ConstPtr<RioBuf>, databuffercount: UInt, plocaladdress: ConstPtr<RioBuf>, premoteaddress: ConstPtr<RioBuf>, pcontrolcontext: ConstPtr<RioBuf>, pflags: ConstPtr<RioBuf>, flags: UInt, requestcontext: ConstPtr<CVoid>): Int
}

public typealias LpfnRioreceiveex = LpfnRioreceiveexFn?

public fun interface LpfnRioregisterbufferFn {
    public operator fun invoke(databuffer: Pcstr, datalength: UInt): RioBufferid
}

public typealias LpfnRioregisterbuffer = LpfnRioregisterbufferFn?

public fun interface LpfnRioresizecompletionqueueFn {
    public operator fun invoke(cq: RioCq, queuesize: UInt): Bool
}

public typealias LpfnRioresizecompletionqueue = LpfnRioresizecompletionqueueFn?

public fun interface LpfnRioresizerequestqueueFn {
    public operator fun invoke(rq: RioRq, maxoutstandingreceive: UInt, maxoutstandingsend: UInt): Bool
}

public typealias LpfnRioresizerequestqueue = LpfnRioresizerequestqueueFn?

public fun interface LpfnRiosendFn {
    public operator fun invoke(socketqueue: RioRq, pdata: ConstPtr<RioBuf>, databuffercount: UInt, flags: UInt, requestcontext: ConstPtr<CVoid>): Bool
}

public typealias LpfnRiosend = LpfnRiosendFn?

public fun interface LpfnRiosendexFn {
    public operator fun invoke(socketqueue: RioRq, pdata: ConstPtr<RioBuf>, databuffercount: UInt, plocaladdress: ConstPtr<RioBuf>, premoteaddress: ConstPtr<RioBuf>, pcontrolcontext: ConstPtr<RioBuf>, pflags: ConstPtr<RioBuf>, flags: UInt, requestcontext: ConstPtr<CVoid>): Bool
}

public typealias LpfnRiosendex = LpfnRiosendexFn?

public fun interface LpfnTransmitfileFn {
    public operator fun invoke(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: MutPtr<Overlapped>, lptransmitbuffers: ConstPtr<TransmitFileBuffers>, dwreserved: UInt): Bool
}

public typealias LpfnTransmitfile = LpfnTransmitfileFn?

public fun interface LpfnTransmitpacketsFn {
    public operator fun invoke(hsocket: Socket, lppacketarray: ConstPtr<TransmitPacketsElement>, nelementcount: UInt, nsendsize: UInt, lpoverlapped: MutPtr<Overlapped>, dwflags: UInt): Bool
}

public typealias LpfnTransmitpackets = LpfnTransmitpacketsFn?

public fun interface LpfnWsapollFn {
    public operator fun invoke(fdarray: MutPtr<Wsapollfd>, nfds: UInt, timeout: Int): Int
}

public typealias LpfnWsapoll = LpfnWsapollFn?

public fun interface LpfnWsarecvmsgFn {
    public operator fun invoke(s: Socket, lpmsg: MutPtr<Wsamsg>, lpdwnumberofbytesrecvd: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int
}

public typealias LpfnWsarecvmsg = LpfnWsarecvmsgFn?

public fun interface LpfnWsasendmsgFn {
    public operator fun invoke(s: Socket, lpmsg: ConstPtr<Wsamsg>, dwflags: UInt, lpnumberofbytessent: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int
}

public typealias LpfnWsasendmsg = LpfnWsasendmsgFn?

public fun interface LplookupserviceCompletionRoutineFn {
    public operator fun invoke(dwerror: UInt, dwbytes: UInt, lpoverlapped: ConstPtr<Overlapped>)
}

public typealias LplookupserviceCompletionRoutine = LplookupserviceCompletionRoutineFn?

public fun interface LpnspcleanupFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>): Int
}

public typealias Lpnspcleanup = LpnspcleanupFn?

public fun interface LpnspgetserviceclassinfoFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, lpdwbufsize: ConstPtr<UInt>, lpserviceclassinfo: ConstPtr<Wsaserviceclassinfow>): Int
}

public typealias Lpnspgetserviceclassinfo = LpnspgetserviceclassinfoFn?

public fun interface LpnspinstallserviceclassFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, lpserviceclassinfo: ConstPtr<Wsaserviceclassinfow>): Int
}

public typealias Lpnspinstallserviceclass = LpnspinstallserviceclassFn?

public fun interface LpnspioctlFn {
    public operator fun invoke(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: ConstPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>, lpcompletion: ConstPtr<Wsacompletion>, lpthreadid: ConstPtr<Wsathreadid>): Int
}

public typealias Lpnspioctl = LpnspioctlFn?

public fun interface LpnsplookupservicebeginFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, lpqsrestrictions: ConstPtr<Wsaquerysetw>, lpserviceclassinfo: ConstPtr<Wsaserviceclassinfow>, dwcontrolflags: UInt, lphlookup: MutPtr<Handle>): Int
}

public typealias Lpnsplookupservicebegin = LpnsplookupservicebeginFn?

public fun interface LpnsplookupserviceendFn {
    public operator fun invoke(hlookup: Handle): Int
}

public typealias Lpnsplookupserviceend = LpnsplookupserviceendFn?

public fun interface LpnsplookupservicenextFn {
    public operator fun invoke(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr<UInt>, lpqsresults: MutPtr<Wsaquerysetw>): Int
}

public typealias Lpnsplookupservicenext = LpnsplookupservicenextFn?

public fun interface LpnspremoveserviceclassFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, lpserviceclassid: ConstPtr<Guid>): Int
}

public typealias Lpnspremoveserviceclass = LpnspremoveserviceclassFn?

public fun interface LpnspsetserviceFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, lpserviceclassinfo: ConstPtr<Wsaserviceclassinfow>, lpqsreginfo: ConstPtr<Wsaquerysetw>, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int
}

public typealias Lpnspsetservice = LpnspsetserviceFn?

public fun interface LpnspstartupFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, lpnsproutines: MutPtr<NspRoutine>): Int
}

public typealias Lpnspstartup = LpnspstartupFn?

public fun interface Lpnspv2cleanupFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, pvclientsessionarg: ConstPtr<CVoid>): Int
}

public typealias Lpnspv2cleanup = Lpnspv2cleanupFn?

public fun interface Lpnspv2clientsessionrundownFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, pvclientsessionarg: ConstPtr<CVoid>)
}

public typealias Lpnspv2clientsessionrundown = Lpnspv2clientsessionrundownFn?

public fun interface Lpnspv2lookupservicebeginFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, lpqsrestrictions: ConstPtr<Wsaqueryset2w>, dwcontrolflags: UInt, lpvclientsessionarg: ConstPtr<CVoid>, lphlookup: MutPtr<Handle>): Int
}

public typealias Lpnspv2lookupservicebegin = Lpnspv2lookupservicebeginFn?

public fun interface Lpnspv2lookupserviceendFn {
    public operator fun invoke(hlookup: Handle): Int
}

public typealias Lpnspv2lookupserviceend = Lpnspv2lookupserviceendFn?

public fun interface Lpnspv2lookupservicenextexFn {
    public operator fun invoke(hasynccall: Handle, hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: ConstPtr<UInt>, lpqsresults: MutPtr<Wsaqueryset2w>)
}

public typealias Lpnspv2lookupservicenextex = Lpnspv2lookupservicenextexFn?

public fun interface Lpnspv2setserviceexFn {
    public operator fun invoke(hasynccall: Handle, lpproviderid: ConstPtr<Guid>, lpqsreginfo: ConstPtr<Wsaqueryset2w>, essoperation: Wsaesetserviceop, dwcontrolflags: UInt, lpvclientsessionarg: ConstPtr<CVoid>)
}

public typealias Lpnspv2setserviceex = Lpnspv2setserviceexFn?

public fun interface Lpnspv2startupFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, ppvclientsessionarg: MutPtr<MutPtr<CVoid>>): Int
}

public typealias Lpnspv2startup = Lpnspv2startupFn?

public fun interface LpserviceCallbackProcFn {
    public operator fun invoke(lparam: Lparam, hasynctaskhandle: Handle)
}

public typealias LpserviceCallbackProc = LpserviceCallbackProcFn?

public fun interface LpwpucloseeventFn {
    public operator fun invoke(hevent: Wsaevent, lperrno: MutPtr<Int>): Bool
}

public typealias Lpwpucloseevent = LpwpucloseeventFn?

public fun interface LpwpuclosesockethandleFn {
    public operator fun invoke(s: Socket, lperrno: MutPtr<Int>): Int
}

public typealias Lpwpuclosesockethandle = LpwpuclosesockethandleFn?

public fun interface LpwpuclosethreadFn {
    public operator fun invoke(lpthreadid: ConstPtr<Wsathreadid>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwpuclosethread = LpwpuclosethreadFn?

public fun interface LpwpucompleteoverlappedrequestFn {
    public operator fun invoke(s: Socket, lpoverlapped: MutPtr<Overlapped>, dwerror: UInt, cbtransferred: UInt, lperrno: MutPtr<Int>): Int
}

public typealias Lpwpucompleteoverlappedrequest = LpwpucompleteoverlappedrequestFn?

public fun interface LpwpucreateeventFn {
    public operator fun invoke(lperrno: MutPtr<Int>): Wsaevent
}

public typealias Lpwpucreateevent = LpwpucreateeventFn?

public fun interface LpwpucreatesockethandleFn {
    public operator fun invoke(dwcatalogentryid: UInt, dwcontext: ULong, lperrno: MutPtr<Int>): Socket
}

public typealias Lpwpucreatesockethandle = LpwpucreatesockethandleFn?

public fun interface LpwpufdissetFn {
    public operator fun invoke(s: Socket, fdset: ConstPtr<FdSet>): Int
}

public typealias Lpwpufdisset = LpwpufdissetFn?

public fun interface LpwpugetproviderpathFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr<Int>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwpugetproviderpath = LpwpugetproviderpathFn?

public fun interface LpwpumodifyifshandleFn {
    public operator fun invoke(dwcatalogentryid: UInt, proposedhandle: Socket, lperrno: MutPtr<Int>): Socket
}

public typealias Lpwpumodifyifshandle = LpwpumodifyifshandleFn?

public fun interface LpwpuopencurrentthreadFn {
    public operator fun invoke(lpthreadid: MutPtr<Wsathreadid>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwpuopencurrentthread = LpwpuopencurrentthreadFn?

public fun interface LpwpupostmessageFn {
    public operator fun invoke(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool
}

public typealias Lpwpupostmessage = LpwpupostmessageFn?

public fun interface LpwpuqueryblockingcallbackFn {
    public operator fun invoke(dwcatalogentryid: UInt, lplpfncallback: MutPtr<Lpblockingcallback>, lpdwcontext: MutPtr<ULong>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwpuqueryblockingcallback = LpwpuqueryblockingcallbackFn?

public fun interface LpwpuquerysockethandlecontextFn {
    public operator fun invoke(s: Socket, lpcontext: MutPtr<ULong>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwpuquerysockethandlecontext = LpwpuquerysockethandlecontextFn?

public fun interface LpwpuqueueapcFn {
    public operator fun invoke(lpthreadid: ConstPtr<Wsathreadid>, lpfnuserapc: Lpwsauserapc, dwcontext: ULong, lperrno: MutPtr<Int>): Int
}

public typealias Lpwpuqueueapc = LpwpuqueueapcFn?

public fun interface LpwpureseteventFn {
    public operator fun invoke(hevent: Wsaevent, lperrno: MutPtr<Int>): Bool
}

public typealias Lpwpuresetevent = LpwpureseteventFn?

public fun interface LpwpuseteventFn {
    public operator fun invoke(hevent: Wsaevent, lperrno: MutPtr<Int>): Bool
}

public typealias Lpwpusetevent = LpwpuseteventFn?

public fun interface LpwsaoverlappedCompletionRoutineFn {
    public operator fun invoke(dwerror: UInt, cbtransferred: UInt, lpoverlapped: MutPtr<Overlapped>, dwflags: UInt)
}

public typealias LpwsaoverlappedCompletionRoutine = LpwsaoverlappedCompletionRoutineFn?

public fun interface LpwsauserapcFn {
    public operator fun invoke(dwcontext: ULong)
}

public typealias Lpwsauserapc = LpwsauserapcFn?

public fun interface LpwscdeinstallproviderFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwscdeinstallprovider = LpwscdeinstallproviderFn?

public fun interface LpwscenablensproviderFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, fenable: Bool): Int
}

public typealias Lpwscenablensprovider = LpwscenablensproviderFn?

public fun interface LpwscenumprotocolsFn {
    public operator fun invoke(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwscenumprotocols = LpwscenumprotocolsFn?

public fun interface LpwscgetproviderpathFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr<Int>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwscgetproviderpath = LpwscgetproviderpathFn?

public fun interface LpwscinstallnamespaceFn {
    public operator fun invoke(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>): Int
}

public typealias Lpwscinstallnamespace = LpwscinstallnamespaceFn?

public fun interface LpwscinstallproviderFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int
}

public typealias Lpwscinstallprovider = LpwscinstallproviderFn?

public fun interface LpwscuninstallnamespaceFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>): Int
}

public typealias Lpwscuninstallnamespace = LpwscuninstallnamespaceFn?

public fun interface LpwscupdateproviderFn {
    public operator fun invoke(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int
}

public typealias Lpwscupdateprovider = LpwscupdateproviderFn?

public fun interface LpwscwritenamespaceorderFn {
    public operator fun invoke(lpproviderid: MutPtr<Guid>, dwnumberofentries: UInt): Int
}

public typealias Lpwscwritenamespaceorder = LpwscwritenamespaceorderFn?

public fun interface LpwscwriteproviderorderFn {
    public operator fun invoke(lpwdcatalogentryid: MutPtr<UInt>, dwnumberofentries: UInt): Int
}

public typealias Lpwscwriteproviderorder = LpwscwriteproviderorderFn?

public fun interface LpwspacceptFn {
    public operator fun invoke(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<Int>, lpfncondition: Lpconditionproc, dwcallbackdata: ULong, lperrno: MutPtr<Int>): Socket
}

public typealias Lpwspaccept = LpwspacceptFn?

public fun interface LpwspaddresstostringFn {
    public operator fun invoke(lpsaaddress: ConstPtr<Sockaddr>, dwaddresslength: UInt, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, lpszaddressstring: Pwstr, lpdwaddressstringlength: MutPtr<UInt>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspaddresstostring = LpwspaddresstostringFn?

public fun interface LpwspasyncselectFn {
    public operator fun invoke(s: Socket, hwnd: Hwnd, wmsg: UInt, levent: Int, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspasyncselect = LpwspasyncselectFn?

public fun interface LpwspbindFn {
    public operator fun invoke(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspbind = LpwspbindFn?

public fun interface LpwspcancelblockingcallFn {
    public operator fun invoke(lperrno: MutPtr<Int>): Int
}

public typealias Lpwspcancelblockingcall = LpwspcancelblockingcallFn?

public fun interface LpwspcleanupFn {
    public operator fun invoke(lperrno: MutPtr<Int>): Int
}

public typealias Lpwspcleanup = LpwspcleanupFn?

public fun interface LpwspclosesocketFn {
    public operator fun invoke(s: Socket, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspclosesocket = LpwspclosesocketFn?

public fun interface LpwspconnectFn {
    public operator fun invoke(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int, lpcallerdata: ConstPtr<Wsabuf>, lpcalleedata: MutPtr<Wsabuf>, lpsqos: ConstPtr<Qos>, lpgqos: ConstPtr<Qos>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspconnect = LpwspconnectFn?

public fun interface LpwspduplicatesocketFn {
    public operator fun invoke(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr<WsaprotocolInfow>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspduplicatesocket = LpwspduplicatesocketFn?

public fun interface LpwspenumnetworkeventsFn {
    public operator fun invoke(s: Socket, heventobject: Handle, lpnetworkevents: MutPtr<Wsanetworkevents>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspenumnetworkevents = LpwspenumnetworkeventsFn?

public fun interface LpwspeventselectFn {
    public operator fun invoke(s: Socket, heventobject: Wsaevent, lnetworkevents: Int, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspeventselect = LpwspeventselectFn?

public fun interface LpwspgetoverlappedresultFn {
    public operator fun invoke(s: Socket, lpoverlapped: ConstPtr<Overlapped>, lpcbtransfer: MutPtr<UInt>, fwait: Bool, lpdwflags: MutPtr<UInt>, lperrno: MutPtr<Int>): Bool
}

public typealias Lpwspgetoverlappedresult = LpwspgetoverlappedresultFn?

public fun interface LpwspgetpeernameFn {
    public operator fun invoke(s: Socket, name: MutPtr<Sockaddr>, namelen: MutPtr<Int>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspgetpeername = LpwspgetpeernameFn?

public fun interface LpwspgetqosbynameFn {
    public operator fun invoke(s: Socket, lpqosname: ConstPtr<Wsabuf>, lpqos: MutPtr<Qos>, lperrno: MutPtr<Int>): Bool
}

public typealias Lpwspgetqosbyname = LpwspgetqosbynameFn?

public fun interface LpwspgetsocknameFn {
    public operator fun invoke(s: Socket, name: MutPtr<Sockaddr>, namelen: MutPtr<Int>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspgetsockname = LpwspgetsocknameFn?

public fun interface LpwspgetsockoptFn {
    public operator fun invoke(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: MutPtr<Int>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspgetsockopt = LpwspgetsockoptFn?

public fun interface LpwspioctlFn {
    public operator fun invoke(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: ConstPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: ConstPtr<Wsathreadid>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspioctl = LpwspioctlFn?

public fun interface LpwspjoinleafFn {
    public operator fun invoke(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int, lpcallerdata: ConstPtr<Wsabuf>, lpcalleedata: MutPtr<Wsabuf>, lpsqos: ConstPtr<Qos>, lpgqos: ConstPtr<Qos>, dwflags: UInt, lperrno: MutPtr<Int>): Socket
}

public typealias Lpwspjoinleaf = LpwspjoinleafFn?

public fun interface LpwsplistenFn {
    public operator fun invoke(s: Socket, backlog: Int, lperrno: MutPtr<Int>): Int
}

public typealias Lpwsplisten = LpwsplistenFn?

public fun interface LpwsprecvFn {
    public operator fun invoke(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr<UInt>, lpflags: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: ConstPtr<Wsathreadid>, lperrno: ConstPtr<Int>): Int
}

public typealias Lpwsprecv = LpwsprecvFn?

public fun interface LpwsprecvdisconnectFn {
    public operator fun invoke(s: Socket, lpinbounddisconnectdata: ConstPtr<Wsabuf>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwsprecvdisconnect = LpwsprecvdisconnectFn?

public fun interface LpwsprecvfromFn {
    public operator fun invoke(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr<UInt>, lpflags: MutPtr<UInt>, lpfrom: MutPtr<Sockaddr>, lpfromlen: MutPtr<Int>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: ConstPtr<Wsathreadid>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwsprecvfrom = LpwsprecvfromFn?

public fun interface LpwspselectFn {
    public operator fun invoke(nfds: Int, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, exceptfds: MutPtr<FdSet>, timeout: ConstPtr<Timeval>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspselect = LpwspselectFn?

public fun interface LpwspsendFn {
    public operator fun invoke(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytessent: MutPtr<UInt>, dwflags: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: ConstPtr<Wsathreadid>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspsend = LpwspsendFn?

public fun interface LpwspsenddisconnectFn {
    public operator fun invoke(s: Socket, lpoutbounddisconnectdata: ConstPtr<Wsabuf>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspsenddisconnect = LpwspsenddisconnectFn?

public fun interface LpwspsendtoFn {
    public operator fun invoke(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytessent: MutPtr<UInt>, dwflags: UInt, lpto: ConstPtr<Sockaddr>, itolen: Int, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: ConstPtr<Wsathreadid>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspsendto = LpwspsendtoFn?

public fun interface LpwspsetsockoptFn {
    public operator fun invoke(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspsetsockopt = LpwspsetsockoptFn?

public fun interface LpwspshutdownFn {
    public operator fun invoke(s: Socket, how: Int, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspshutdown = LpwspshutdownFn?

public fun interface LpwspsocketFn {
    public operator fun invoke(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, g: UInt, dwflags: UInt, lperrno: MutPtr<Int>): Socket
}

public typealias Lpwspsocket = LpwspsocketFn?

public fun interface LpwspstartupFn {
    public operator fun invoke(wversionrequested: UShort, lpwspdata: ConstPtr<Wspdata>, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, upcalltable: Wspupcalltable, lpproctable: MutPtr<WspprocTable>): Int
}

public typealias Lpwspstartup = LpwspstartupFn?

public fun interface LpwspstringtoaddressFn {
    public operator fun invoke(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, lpaddress: MutPtr<Sockaddr>, lpaddresslength: MutPtr<Int>, lperrno: MutPtr<Int>): Int
}

public typealias Lpwspstringtoaddress = LpwspstringtoaddressFn?

public typealias MldMaxRespCodeType = Int

public typealias MulticastModeType = Int

public typealias NapiProviderLevel = Int

public typealias NapiProviderType = Int

public typealias NdOptionType = Int

public typealias NlaBlobDataType = Int

public typealias NlaConnectivityType = Int

public typealias NlaInternet = Int

public typealias NlAddressType = Int

public typealias NlBandwidthFlag = Int

public typealias NlDadState = Int

public typealias NlInterfaceNetworkCategoryState = Int

public typealias NlLinkLocalAddressBehavior = Int

public typealias NlNeighborState = Int

public typealias NlNetworkCategory = Int

public typealias NlNetworkConnectivityCostHint = Int

public typealias NlNetworkConnectivityLevelHint = Int

public typealias NlPrefixOrigin = Int

public typealias NlRouterDiscoveryBehavior = Int

public typealias NlRouteOrigin = Int

public typealias NlRouteProtocol = Int

public typealias NlSuffixOrigin = Int

public typealias NpiModuleidType = Int

public typealias PmtudState = Int

public typealias Q2931IeType = Int

public typealias RcvallValue = Int

public typealias ResourceDisplayType = UInt

public typealias RioBufferid = Long

public typealias RioCq = Long

public typealias RioNotificationCompletionType = Int

public typealias RioRq = Long

public typealias ScopeLevel = Int

public typealias SendRecvFlags = Int

public typealias SetServiceOperation = UInt

public typealias Socket = ULong

public typealias SocketPriorityHint = Int

public typealias SocketSecurityProtocol = Int

public typealias SocketUsageType = Int

public typealias Tcpstate = Int

public typealias TcpIcwLevel = Int

public typealias TunnelSubType = Int

public typealias WinsockShutdownHow = Int

public typealias WinsockSocketType = Int

public typealias Wsacompletiontype = Int

public typealias Wsaecomparator = Int

public typealias Wsaesetserviceop = Int

public typealias Wsaevent = Long

public typealias WsapollEventFlags = Short

public typealias WsaCompatibilityBehaviorId = Int

public typealias WsaError = Int

public typealias WscProviderInfoType = Int

public typealias EWindowAdvanceMethod = Int

public typealias SocklenT = Int
